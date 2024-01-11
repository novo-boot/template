package com.novo.demo.service.impl;

import com.novo.core.common.BaseResponse;
import com.novo.demo.command.DemoCommand;
import com.novo.demo.service.DemoAppService;
import com.novo.demo.service.DemoService;
import com.novo.demo.vo.DemoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fuqf1
 */
@Slf4j
@Service
public class DemoAppServiceImpl implements DemoAppService {

    /**
     * DemoService
     */
    @Resource
    private DemoService rocketSendService;

    /**
     * @param demo Demo
     * @return Demo
     */
    @Override
    public BaseResponse<DemoVO> demo(DemoCommand demo) {
        return null;
    }

}
