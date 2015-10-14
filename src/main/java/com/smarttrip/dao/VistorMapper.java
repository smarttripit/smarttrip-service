package com.smarttrip.dao;

import com.smarttrip.domain.Vistor;
import java.util.List;

public interface VistorMapper {
    int deleteByPrimaryKey(String vistorId);

    int insert(Vistor record);

    Vistor selectByPrimaryKey(String vistorId);

    List<Vistor> selectAll();

    int updateByPrimaryKey(Vistor record);
}