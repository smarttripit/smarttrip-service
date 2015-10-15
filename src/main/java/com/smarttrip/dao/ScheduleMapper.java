package com.smarttrip.dao;

import com.smarttrip.domain.Schedule;
import java.util.List;

public interface ScheduleMapper {
    int deleteByPrimaryKey(String scheduleId);

    int insert(Schedule record);

    Schedule selectByPrimaryKey(String scheduleId);

    int updateByPrimaryKey(Schedule record);
}