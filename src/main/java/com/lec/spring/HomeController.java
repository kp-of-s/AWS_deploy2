package com.lec.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @GetMapping("/aws/v2")
    public String hello(@RequestParam(defaultValue = "1") Integer num) {

        if(num == 1)
            log.info("[" + activeProfile + "]" + 1);
        else if(num == -1)
            log.error("[" + activeProfile + "]" + 1);
        else if(num == 0)
            log.warn("[" + activeProfile + "]" + 1);

        return "<h1>HELL 2</h1>";
    }
}
