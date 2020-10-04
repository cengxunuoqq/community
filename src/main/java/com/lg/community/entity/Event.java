package com.lg.community.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 事件对象
 */
public class Event {

    private String topic;//事件类型
    private int userId;//事件触发者 比如张三给李四点赞，那么触发者为张三，这里userId存张三的userId
    private int entityType;//事件发生在哪个实体类型上
    private int entityId;//事件发生在哪个实体类型的那个实体上
    private int entityUserId;//实体的作者
    private Map<String, Object> data = new HashMap<>();//其他属性

    public String getTopic() {
        return topic;
    }

    public Event setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Event setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public Event setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public Event setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityUserId() {
        return entityUserId;
    }

    public Event setEntityUserId(int entityUserId) {
        this.entityUserId = entityUserId;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public Event setData(String key,Object value) {
        this.data.put(key, value);
        return this;
    }
}
