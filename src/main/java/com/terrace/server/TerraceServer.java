package com.terrace.server;

import com.terrace.domain.ResultMsg;
import com.terrace.domain.TerraceVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 小妞 on 2019/7/16.
 */
public interface TerraceServer {
    List<TerraceVO> userListYh();

    List<TerraceVO> userYg();

    ResultMsg LogonBy(String staffPhone, String staffPass);
}
