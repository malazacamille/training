package com.training.spring.servlet;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.training.spring.config.SpringWebConfig;

public class MyWebInitializer extends
AbstractAnnotationConfigDispatcherServletInitializer {

@Override
protected Class<?>[] getServletConfigClasses() {
return new Class[] { SpringWebConfig.class };
}

@Override
protected String[] getServletMappings() {
return new String[] { "/" };
}

@Override
protected Class<?>[] getRootConfigClasses() {
return null;
}

}
