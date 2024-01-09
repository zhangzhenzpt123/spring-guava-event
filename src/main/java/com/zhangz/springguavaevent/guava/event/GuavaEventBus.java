package com.zhangz.springguavaevent.guava.event;

import com.google.common.eventbus.EventBus;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Guava 事件总线
 */
@Configuration
public class GuavaEventBus {

    @Resource
    private GuavaEventListener guavaEventListener;

    @Bean
    public EventBus initialize() {
        EventBus eventBus = new EventBus();
        // 注册监听
        eventBus.register(guavaEventListener);
        return eventBus;
    }
}