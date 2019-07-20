package com.terrace.mapper;

import com.terrace.domain.TerraceVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;
import java.util.List;

/**
 * Created by 小妞 on 2019/7/16.
 */
@Mapper
public interface TerraceMapper {
    List<TerraceVO> userListYh();

    List<TerraceVO> userYg();

    TerraceVO LogonBy(String staffPhone);
}
