package com.example.demo;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.stereotype.Controller;

@Controller
public class HeloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String index(@RequestParam("files") List<MultipartFile> files, Model model) {
        for (MultipartFile file : files) {
            System.out.println("getOriginalFilename="+file.getOriginalFilename());
        }
        return "index";
    }
}