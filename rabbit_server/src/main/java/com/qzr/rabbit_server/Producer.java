package com.qzr.rabbit_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * @author ranGee
 */
@Component

public class Producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 给hello队列发送信息
     */
    public void send(){
        for(int i =0;i<10;i++){
            String msg = "当前发送第"+i+"条！";
            System.out.println("Producer,"+msg);
            Date date = new Date();
            log.info("消息发送时间"+date);
            rabbitTemplate.convertAndSend("hello",msg);
        }
    }

}
