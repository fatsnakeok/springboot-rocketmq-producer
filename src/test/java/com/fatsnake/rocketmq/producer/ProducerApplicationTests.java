package com.fatsnake.rocketmq.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest(classes = ProducerApplication.class )
@Slf4j
class ProducerApplicationTests {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;


    @Test
    void contextLoads() {
    }


    @Test
    public void testSendMessage() {
        // 如果发送的是字符串 convertAndSend(topic, content)
        rocketMQTemplate.convertAndSend("springbbot-rocketmq", "Hello springboot rocketmq " + LocalDateTime.now());
        log.info("消息发送成功");
    }
 }
