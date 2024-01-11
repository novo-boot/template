package com.novo.demo.service;

import com.novo.core.common.BaseResponse;
import com.novo.demo.command.DemoCommand;
import com.novo.demo.vo.DemoVO;

/**
 * @author fuqf1
 */
public interface DemoAppService {

    /**
     * @param demo
     * @return
     */
    BaseResponse<DemoVO> demo(DemoCommand demo);

}
