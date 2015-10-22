package com.smarttrip.dao;

import com.smarttrip.domain.Theme;
import java.util.List;

public interface ThemeMapper {
    int deleteByPrimaryKey(String themeId);

    int insert(Theme record);

    Theme selectByPrimaryKey(String themeId);

    List<Theme> selectAll();

    int updateByPrimaryKey(Theme record);
    
    Theme selectByThemeName(String name);
}