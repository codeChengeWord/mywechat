package com.hugo.www.mywechat;

import com.hugo.www.mywechat.application.user.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MywechatApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        System.err.print("用户个数是"+userMapper.getAllUser().size());
    }
    @Test
    public void condkdkds(){
        Date  dat = new Date();
        System.err.print("时间："+String.valueOf(dat.getTime()));
    }
}
