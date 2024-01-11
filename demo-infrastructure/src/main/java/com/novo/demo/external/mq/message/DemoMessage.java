package com.novo.demo.external.mq.message;

import com.novo.rocket.domain.BaseMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author fuqf1
 * @description
 * @date 2023/9/6 14:49
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class DemoMessage extends BaseMessage<DemoMessage> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * LocalDateTime test
     */
    private LocalDateTime localDateTime;

}
