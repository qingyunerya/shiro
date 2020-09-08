package org.lzh.shirospringboot;

import org.junit.jupiter.api.Test;
import org.lzh.shirospringboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShiroSpringbootApplicationTests {

    @Autowired
    ClientService clientService;
    @Test
    void contextLoads() {
        System.out.println(clientService.queryClientByName("caodan"));
    }

}
