/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.varyfai.example.demoviryfay;

import javax.websocket.server.ServerEndpoint;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ADMIN
 */
    @Service
public class Restsrevice {
   
    private final RestTemplate restTemplate;

    public Restsrevice(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    public Callv getPostsPlainJSON(String number) {
        String url = "http://apilayer.net/api/validate?access_key=02a6e36cce2792b255ea1a6ac342b51f&number="+number;
        
        
        return this.restTemplate.getForObject(url, Callv.class);
    }
    }

