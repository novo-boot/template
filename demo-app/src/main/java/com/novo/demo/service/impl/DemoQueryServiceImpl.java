package com.novo.demo.service.impl;

import com.novo.core.common.BaseResponse;
import com.novo.demo.service.DemoQueryService;
import com.novo.demo.vo.DemoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author fuqf1
 */
@Slf4j
@Service
public class DemoQueryServiceImpl implements DemoQueryService {

    /**
     * @param demo Demo
     * @return Demo
     */
    @Override
    public BaseResponse<DemoVO> queryPending(String demo) {
        return null;
    }

}
