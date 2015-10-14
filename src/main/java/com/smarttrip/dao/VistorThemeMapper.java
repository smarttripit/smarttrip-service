package com.smarttrip.dao;

import com.smarttrip.domain.VistorTheme;
import java.util.List;

public interface VistorThemeMapper {
    int deleteByPrimaryKey(String id);

    int insert(VistorTheme record);

    VistorTheme selectByPrimaryKey(String id);

    List<VistorTheme> selectAll();

    int updateByPrimaryKey(VistorTheme record);
}