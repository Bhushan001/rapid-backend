package com.app.rapid.config;

import com.app.rapid.interfaces.PageService;
import com.app.rapid.services.PageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: in708bhugad
 * Date: 07-02-2020
 * Time: 15:22
 * inside the package - com.app.rapid.config
 * To change this template use File | Settings | File and Code Templates.
 */
@Configuration
public class RapidConfig {

    @Bean
    public PageService pageService() {
        return new PageServiceImpl();
    }
}
