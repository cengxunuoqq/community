package com.lg.community;

import com.lg.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TransactionTest {

    @Autowired
    private AlphaService alphaService;

    @Test
    public void testSave1(){
        Object o = alphaService.save1();
        System.out.println(o);
    }

    @Test
    public void testSave2(){
        Object o = alphaService.save1();
        System.out.println(o);
    }
}
