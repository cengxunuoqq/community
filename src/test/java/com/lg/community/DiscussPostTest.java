package com.lg.community;

import com.lg.community.dao.DiscussPostMapper;
import com.lg.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class DiscussPostTest {
    @Autowired
    DiscussPostMapper discussPostMapper;

    @Test
    public void testSelect(){
        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
        List<DiscussPost> lists = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for (DiscussPost list : lists) {
            System.out.println(list);
        }

    }
}
