package com.novo.demo.external.mq.consumer;
import com.novo.core.exception.NovoServiceException;
import com.novo.rocket.handler.AbstractNovoMessageHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.annotation.SelectorType;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

/**
 * @description 消费有序队列对象消息
 */
@Slf4j
@Service
@RocketMQMessageListener(consumerGroup = "", topic = "", selectorType = SelectorType.TAG, selectorExpression = "",
        consumeMode = ConsumeMode.ORDERLY, messageModel = MessageModel.CLUSTERING, consumeThreadNumber = 1,
        namespace = "demo")
public class DemoConsumer extends AbstractNovoMessageHandler<MessageExt> implements RocketMQListener<MessageExt> {

    @Override
    protected void handleMessage(MessageExt message) {
        // 此时这里才是最终的业务处理，代码只需要处理资源类关闭异常，其他的可以交给父类重试
        log.info("handleMessage:{}", StringUtils.toEncodedString(message.getBody(), StandardCharsets.UTF_8));
        throw new NovoServiceException("TES-TES-TEST");
    }

    @Override
    protected void handleMaxRetriesExceeded(MessageExt message) {
        // 当超过指定重试次数消息时此处方法会被调用
        // 生产中可以进行回退或其他业务操作
        log.error("handle Max Retries Exceeded，please");
    }

    /**
     * 是否执行重试机制
     */
    @Override
    protected boolean isRetry() {
        return true;
    }

    @Override
    protected boolean throwException() {
        // 是否抛出异常，false搭配retry自行处理异常
        return false;
    }

    @Override
    protected boolean filter(MessageExt messageExt) {
        // 消息过滤
        return false;
    }

    /**
     * 监听消费消息，不需要执行业务处理，委派给父类做基础操作，父类做完基础操作后会调用子类的实际处理类型
     */
    @Override
    public void onMessage(MessageExt messageExt) {
        super.processMessage(messageExt);
    }

}
