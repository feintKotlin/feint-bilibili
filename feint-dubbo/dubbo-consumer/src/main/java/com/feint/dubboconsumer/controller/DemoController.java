package com.feint.dubboconsumer.controller;

import com.feint.dubboservice.rpc.DemoRpc;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Reference(interfaceClass = DemoRpc.class, version = "1.0.0")
    private DemoRpc demoRpc;

    @RequestMapping("/test")
    public String test(){
        return demoRpc.add(1,2).toString();
    }
}
