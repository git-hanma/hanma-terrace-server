package com.terrace.controller;

import com.terrace.domain.ResultMsg;
import com.terrace.domain.TerraceVO;
import com.terrace.service.TerraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author 小妞
 * @date 2019/7/16
 */
@Controller
@RequestMapping("TerraceController")
public class TerraceController {
    @Autowired
    private TerraceService terraceService;

    @RequestMapping(value = "userListYh",method = RequestMethod.GET)
    @ResponseBody
    public List<TerraceVO> userListYh(){
        List<TerraceVO> userList = terraceService.userListYh();
        return userList;
    }
    @RequestMapping(value = "userYg",method = RequestMethod.GET)
    @ResponseBody
    public List<TerraceVO> userYg(){
        List<TerraceVO> userList = terraceService.userYg();
        return userList;
    }

    @RequestMapping(value = "LogonBy",method = RequestMethod.GET)
    @ResponseBody
    public ResultMsg LogonBy(HttpServletRequest request, String staffPhone, String staffPass){
        ResultMsg resultMsg  =  terraceService.LogonBy(staffPhone,staffPass);
        return resultMsg;
    }
}
