package com.lg.community.event;

import com.alibaba.fastjson.JSONObject;
import com.lg.community.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 处理事件
     * @param event
     */
    public void fireEvent(Event event) {
        //将事件发布到制定的主题(这里直接将主题转化为json字符串，然后再事件的接受处理方法中再次转换我Event对象)
        kafkaTemplate.send(event.getTopic(), JSONObject.toJSONString(event));
    }

}
