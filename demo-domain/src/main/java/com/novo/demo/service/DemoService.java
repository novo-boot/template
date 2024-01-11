package com.novo.demo.service;

import com.novo.demo.entity.Demo;

import java.util.Optional;

/**
 * @author fuqf1
 */
public interface DemoService {

    /**
     * getById
     * @param demo demo
     * @return Demo
     */
    Optional<Demo> addDemo(Demo demo);

    /**
     * deleteDemoById
     * @param demoId demoId
     * @return Demo
     */
    Optional<Demo> deleteDemoById(Integer demoId);

    /**
     * updateDemoById
     * @param demoId demoId
     * @return Demo
     */
    Optional<Demo> updateDemoById(Integer demoId);

    /**
     * getById
     * @param demoId demoId
     * @return Demo
     */
    Optional<Demo> getById(Integer demoId);

    /**
     * checkById
     * @param demoId demoId
     * @return boolean
     */
    boolean checkById(Integer demoId);

}
