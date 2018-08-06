package me.frank.fcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/6 11:28
 */
@RestController
public class HelloController {
    @Value("${demo.env}")
    private String env;

    @GetMapping("/config/env")
    public ResponseEntity getName(){
        return ResponseEntity.ok("It's "+env);
    }
}
