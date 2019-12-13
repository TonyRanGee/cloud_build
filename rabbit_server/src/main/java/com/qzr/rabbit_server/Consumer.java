package com.qzr.rabbit_server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author ranGee
 */
@Component
@RabbitListener(queues = "hello")
public class Consumer {
    private Logger log = LoggerFactory.getLogger(this.getClass());


    public void process(String str){
       log.info("接受消息"+str);
       log.info("接受消息时间:"+new Date() );
    }
}
