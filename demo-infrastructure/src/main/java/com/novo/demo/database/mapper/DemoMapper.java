package com.novo.demo.database.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.novo.demo.database.dataobject.DemoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fuqf1
 */
@Mapper
public interface DemoMapper extends BaseMapper<DemoDO> {

}
