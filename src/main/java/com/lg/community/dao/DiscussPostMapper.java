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

    /**
     *
     * @param userId @Param注解用于给参数取别名
     * @return  如果只有一个参数，并且在<if></if>里使用，则必须加别名
     */
    int selectDiscussPostRows(@Param("userId") int userId);

    /**
     * 插入（发布帖子）
     * @param discussPost
     * @return
     */
    int insertDiscussPost(DiscussPost discussPost);

    /**
     * 根据帖子id查询帖子
     * @param id
     * @return
     */
    DiscussPost selectDiscussPostById(int id);

    /**
     * 跟新帖子的评论总数
     * @param id
     * @param commentCount
     * @return
     */
    int updateCommentCount(int id, int commentCount);

}
