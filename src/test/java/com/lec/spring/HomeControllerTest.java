package com.lec.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

//임의 포트의 서버 진입 테스트
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    void hello(){
        ResponseEntity<String> response = restTemplate.getForEntity("/aws/v2", String.class);

        //두 매개변수가 동일하다면 테스트 통과
        assertEquals("<h1>HELL 2</h1>", response.getBody());
    }
}