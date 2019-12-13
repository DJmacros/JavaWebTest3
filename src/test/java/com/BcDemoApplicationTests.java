package com;

import com.entity.User;
import com.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BcDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private UserRepository repository;

    @Test
    public void test(){
        User u = repository.getOne(1L);
        Assert.assertEquals("成功的测试用例", "赵一", u.getName());
    }
}
