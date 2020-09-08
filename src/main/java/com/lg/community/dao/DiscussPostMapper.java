package com.lg.community.dao;

import com.lg.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    /**
     * 动态sql，userId不为0时才查询
     * @param userId
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId,int offset, int limit);

    int selectDiscussPostRows(@Param("userId") int userId);

}
