package com.novo.demo.database.repository.impl;

import com.novo.demo.database.converter.DemoConverter;
import com.novo.demo.database.mapper.DemoMapper;
import com.novo.demo.entity.Demo;
import com.novo.demo.repository.DemoRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * Demo
 *
 * @author fuqf1
 */
@Repository
public class DemoRepositoryImpl implements DemoRepository {

    /**
     * doConverter
     */
    @Resource
    private DemoConverter doConverter;

    /**
     * userId
     */
    @Resource
    private DemoMapper demoMapper;

    /**
     * getById
     * @param demo demo
     * @return Demo
     */
    @Override
    public Optional<Demo> addDemo(Demo demo) {
        return Optional.empty();
    }

    /**
     * deleteDemoById
     * @param demoId demoId
     * @return Demo
     */
    @Override
    public Optional<Demo> deleteDemoById(Integer demoId) {
        return Optional.empty();
    }

    /**
     * updateDemoById
     * @param demoId demoId
     * @return Demo
     */
    @Override
    public Optional<Demo> updateDemoById(Integer demoId) {
        return Optional.empty();
    }

    /**
     * getById
     * @param demoId demoId
     * @return Demo
     */
    @Override
    public Optional<Demo> getById(Integer demoId) {
        return Optional.empty();
    }

    /**
     * checkById
     * @param demoId demoId
     * @return boolean
     */
    @Override
    public boolean checkById(Integer demoId) {
        return false;
    }

}
