package com.smarttrip.dao;

import com.smarttrip.domain.VisitorTheme;
import java.util.List;

public interface VisitorThemeMapper {
    int deleteByPrimaryKey(String id);

    int insert(VisitorTheme record);

    VisitorTheme selectByPrimaryKey(String id);

    List<VisitorTheme> selectAll();

    int updateByPrimaryKey(VisitorTheme record);
}