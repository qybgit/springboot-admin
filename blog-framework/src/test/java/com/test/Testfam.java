package com.test;

import com.framework.BlogFramework;
import com.framework.service.TagService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = BlogFramework.class)
public class Testfam {
    @Resource
    TagService tagService;
    @Test
    public void teat(){
        System.out.println("aer");
    }
}
