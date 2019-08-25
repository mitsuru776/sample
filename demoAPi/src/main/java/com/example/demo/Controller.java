package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    //WebAPIの機能を追加するアノテーション
public class Controller {
     
    @RequestMapping(value = "/test")    //URL「〜/test」にアクセスされたときのアノテーション
    public String test() {
        return "Hello World!";
    }
}