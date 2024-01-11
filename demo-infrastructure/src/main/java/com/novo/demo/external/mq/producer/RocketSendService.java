package com.novo.demo.external.mq.producer;

import cn.hutool.core.util.IdUtil;
import com.novo.core.exception.NovoServiceException;
import com.novo.rocket.domain.BaseMessage;
import com.novo.rocket.template.NovoRocketMQTemplate;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.rocketmq.client.producer.SendResult;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author fuqf1
 * @date 2022/8/26 14:28
 */
@Data
@Slf4j
@Component
public class RocketSendService {

    /**
     * rocketTemplate
     */
    @Resource
    private NovoRocketMQTemplate rocketTemplate;

    /**
     * 发送带tag的消息
     * @param msg msg
     * @param tag tag
     * @param topic topic
     **/
    public <T extends BaseMessage<?>> SendResult send(T msg, String tag, String topic) {
        if (StringUtils.isBlank(topic)) {
            throw new NovoServiceException("发送方topic或者group不能为空");
        }
        msg.setMsgKey(topic).setBusinessId(IdUtil.getSnowflakeNextId()).setTId(IdUtil.randomUUID());
        // 发送消息
        SendResult result = rocketTemplate.send(topic, tag, msg);
        log.info("成功发送消息,消息内容为:{},返回值为:{}", msg, result);
        return result;
    }

}
