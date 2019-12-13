package com.qzr.rabbit_server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitServerApplicationTests {
    @Autowired
    Producer producer;

	@Test
    public void contextLoads() {
        producer.send();
    }


}
