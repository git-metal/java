package com.ljd.springmvc.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

public class DemoPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
        System.out.println("DemoPropertyPlaceholderConfigurer test");
        String version = props.getProperty("version");
        System.out.println("version=" + version);

        super.processProperties(beanFactoryToProcess, props);
    }
}
