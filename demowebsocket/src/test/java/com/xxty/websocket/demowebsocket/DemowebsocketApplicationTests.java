package com.xxty.websocket.demowebsocket;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
public class DemowebsocketApplicationTests {
//    private SomeService someService;

    @Test
    public void contextLoads() {
        System.out.println("123");
    }

}
