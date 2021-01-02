package org.myapp.controller;

import org.myapp.model.HelloModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    private final AtomicLong aLong = new AtomicLong();

    @GetMapping("/hello")
    public HelloModel hello(@RequestParam(value = "name", defaultValue = "World") String s) {
        return new HelloModel(aLong.incrementAndGet(), s);
    }
}
