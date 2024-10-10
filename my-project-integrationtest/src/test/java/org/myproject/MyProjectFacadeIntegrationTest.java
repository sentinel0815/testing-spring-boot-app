package org.myproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = org.myproject.MyProjectApplication.class)
class MyProjectFacadeIntegrationTest {

    @Test
    void contextLoads() {
        // expect no exception while starting the spring boot application
        Assertions.assertTrue(true);
    }
}

