package com.terrace.service;

import com.terrace.domain.ResultMsg;
import com.terrace.domain.TerraceVO;

import java.util.List;

/**
 * Created by 小妞 on 2019/7/16.
 */
public interface TerraceService {
    List<TerraceVO> userListYh();

    List<TerraceVO> userYg();

    ResultMsg LogonBy(String staffPhone, String staffPass);
}
