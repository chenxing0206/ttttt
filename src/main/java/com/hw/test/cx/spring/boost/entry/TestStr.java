package com.hw.test.cx.spring.boost.entry;

import org.springframework.stereotype.Component;

/**
 *  所属项目：
 *  类名称：TestStr
 *  类作用：
 *  类作者：chenxing                                                        
 *  创建日期：2021/4/18
 *  审核人：  
 *  审核日期：            
 *  更新记录：                                        
 *  其它备注：
 *  @author:chenxing
 */
@Component
public class TestStr {

    private String name="111";
    private String desc="This is a test.";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
