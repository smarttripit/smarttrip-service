package com.smarttrip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smarttrip.domain.Theme;

public interface ThemeMapper {
    int deleteByPrimaryKey(String themeId);

    int insert(Theme record);

    Theme selectByPrimaryKey(String themeId);

    List<Theme> selectAll();

    int updateByPrimaryKey(Theme record);
    
    List<String> selectByThemeName(@Param("name")List<String> name);
}