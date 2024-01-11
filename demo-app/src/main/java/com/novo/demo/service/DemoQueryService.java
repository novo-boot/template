package com.novo.demo.service;

import com.novo.core.common.BaseResponse;
import com.novo.demo.vo.DemoVO;

/**
 * @author fuqf1
 */
public interface DemoQueryService {

    /**
     * @param demo Demo
     * @return Demo
     */
    BaseResponse<DemoVO> queryPending(String demo);

}
