package com.novo.demo.service.impl;

import com.novo.demo.entity.Demo;
import com.novo.demo.service.DemoService;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * DemoServiceImpl
 *
 * @author fuqf1
 */
@Component
public class DemoServiceImpl implements DemoService {

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
