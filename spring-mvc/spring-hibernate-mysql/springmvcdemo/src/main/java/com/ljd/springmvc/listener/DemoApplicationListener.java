package com.ljd.springmvc.listener;

import com.ljd.springmvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DemoApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    DemoService demoService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("DemoApplicationListener: init after load spring beans");
        if (contextRefreshedEvent.getApplicationContext().getParent() == null)
        {
            System.out.println("spring init finished");
            demoService.getEmployee(100);
        }
    }
}
