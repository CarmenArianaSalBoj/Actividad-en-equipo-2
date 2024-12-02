/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exampleSecurity.SecuritySpring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 *
 * @author Ariana
 */
@Configuration
public class MvConfig implements WebMvcConfigurer{
    
    /**
     *
     * @param registry
     */
    @SuppressWarnings("null")
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/Home").setViewName("Home");
 registry.addViewController("/").setViewName("Home");
 registry.addViewController("/Hola").setViewName("Hola");
 registry.addViewController("/Login").setViewName("Login");
}
}