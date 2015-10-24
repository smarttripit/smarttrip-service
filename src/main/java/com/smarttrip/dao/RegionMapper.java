package com.smarttrip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smarttrip.domain.Region;

public interface RegionMapper {
    int deleteByPrimaryKey(String regionId);

    int insert(Region record);

    Region selectByPrimaryKey(String regionId);

    List<Region> selectAll();

    int updateByPrimaryKey(Region record);
    
    List<Region> selectByFirstRegion(String firstRegion);
    
    Region selectBySecondRegion(String secondRegion);
    
    List<String> selectRegionId(@Param("firstRegion")String firstRegion, @Param("secondRegion")List<String> secondRegion);
}