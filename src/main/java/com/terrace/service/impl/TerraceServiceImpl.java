package com.terrace.service.impl;

import com.terrace.domain.RedisUtil;
import com.terrace.domain.ResultMsg;
import com.terrace.domain.TerraceVO;
import com.terrace.mapper.TerraceMapper;
import com.terrace.service.TerraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author 小妞
 * @date 2019/7/16
 */
@Service
public class TerraceServiceImpl implements TerraceService {
    @Autowired
    private TerraceMapper terraceMapper;

    @Override
    public List<TerraceVO> userListYh() {
        return terraceMapper.userListYh();
    }

    @Override
    public List<TerraceVO> userYg() {
        return terraceMapper.userYg();
    }

    @Override
    public ResultMsg LogonBy(String staffPhone, String staffPass) {
        ResultMsg resultMsg = new ResultMsg();
        RedisUtil redisUtil = new RedisUtil();
        //根据账号查询员工对象是否存在
        TerraceVO terrace=terraceMapper.LogonBy(staffPhone);
        //判断对象是否存在
        if(terrace==null){//不存在的时候
            resultMsg.setCode(500);
            resultMsg.setMsg("账号不存在");
            return resultMsg;
        }else{
            //判断密码是否一致
            if(!staffPass.equals(terrace.getStaffPass())){
                resultMsg.setCode(500);
                resultMsg.setMsg("密码错误");
                return resultMsg;
            }else if(terrace.getStaffYn()==1){//状态等于1
                resultMsg.setCode(1);
                resultMsg.setMsg("成功");
                //存在redis缓存中
                redisUtil.set("redisUtil",terrace);
                return resultMsg;
            }else if(terrace.getStaffYn()==2){//管理员登陆
                resultMsg.setCode(2);
                resultMsg.setMsg("管理员登陆成功");
                //存在redis缓存中
                redisUtil.set("redisUtil",terrace);
                return resultMsg;
            }
        }
         return resultMsg;
    }
}
