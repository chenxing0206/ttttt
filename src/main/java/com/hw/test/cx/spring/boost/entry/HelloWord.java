package com.hw.test.cx.spring.boost.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  所属项目：
 *  类名称：HelloWord
 *  类作用：
 *  类作者：chenxing                                                        
 *  创建日期：2021/4/18
 *  审核人：  
 *  审核日期：            
 *  更新记录：                                        
 *  其它备注：
 *  @author:chenxing
 */
@RestController("entryHelloWord")

public class HelloWord {
    @Autowired
    private TestStr testStr;
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/helloTestStr")
    public String helloTestStr()
    {

        return testStr.getDesc()+","+testStr.getName();
    }
}
