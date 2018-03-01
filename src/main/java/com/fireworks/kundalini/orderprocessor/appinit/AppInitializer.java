package com.fireworks.kundalini.orderprocessor.appinit;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.fireworks.kundalini.orderprocessor.conf.rest.RestConfiguration;
import com.fireworks.kundalini.orderprocessor.conf.service.ServiceConfiguration;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ServiceConfiguration.class, RestConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/rs/"};
    }

}