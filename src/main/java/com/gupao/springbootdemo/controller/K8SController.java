package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class K8SController {


    @RequestMapping("/k8s")
    public String k8s(){
        return "hello K8s <br/>111222111111";
    }
    @RequestMapping("/k8s2")
    public String k8s2(){
        return "hello K8s2 <br/>111222111111";
    }
}
