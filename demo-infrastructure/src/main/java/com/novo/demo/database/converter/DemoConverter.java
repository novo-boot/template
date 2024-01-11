package com.novo.demo.database.converter;

import com.novo.demo.database.dataobject.DemoDO;
import com.novo.demo.entity.Demo;
import org.mapstruct.Mapper;

/**
 * Domain Obj to Data Obj Data Obj to Domain Obj
 *
 * @author fuqf1
 * @version 1$
 */
@Mapper(componentModel = "spring")
public interface DemoConverter {

    /**
     * convertToDO
     * @param demo Demo
     * @return DemoDO
     */
    DemoDO toDO(Demo demo);

    /**
     * convertToEntity
     * @param demoDO DemoDO
     * @return Demo
     */
    Demo toEntity(DemoDO demoDO);

}
