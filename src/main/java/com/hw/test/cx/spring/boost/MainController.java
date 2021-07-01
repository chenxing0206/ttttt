package com.hw.test.cx.spring.boost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *  所属项目：
 *  类名称：MainController
 *  类作用：
 *  类作者：chenxing                                                        
 *  创建日期：2021/4/18
 *  审核人：  
 *  审核日期：            
 *  更新记录：                                        
 *  其它备注：
 *  @author:chenxing
 */
@SpringBootApplication
public class MainController {
    public static void main(String[] args) {

        try {
            SpringApplication.run(MainController.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
