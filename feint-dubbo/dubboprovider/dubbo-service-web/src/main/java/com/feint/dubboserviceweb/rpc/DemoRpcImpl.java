package com.feint.dubboserviceweb.rpc;

import com.feint.dubboservice.rpc.DemoRpc;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DemoRpc.class, version = "1.0.0")
public class DemoRpcImpl implements DemoRpc{
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoRpcImpl.class);
    @Override
    public Integer add(Integer a, Integer b) {
        LOGGER.info("someone invoke me ,and input "+a+", "+b);
        return a+b;
    }
}
