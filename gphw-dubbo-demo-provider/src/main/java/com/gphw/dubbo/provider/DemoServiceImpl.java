package com.gphw.dubbo.provider;

import com.gphw.dubbo.api.DemoService;

/**
 * @Author: Jiang
 * @Date: 2019/7/21 21:52
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String hello(String name) {
        return "Hello World!"+name;
    }
}
