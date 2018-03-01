/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.app.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author kawabata
 */
@javax.ws.rs.ApplicationPath("/api")
public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        ObjectMapper mapper = new ObjectMapper();

        this.packages(ApplicationConfig.class.getPackage().getName())
                //Jakson用のクラスを登録
                .register((new JacksonJaxbJsonProvider(mapper,
                        JacksonJaxbJsonProvider.DEFAULT_ANNOTATIONS)))
                //JSON用のクラスを登録
                .register(org.glassfish.jersey.jackson.JacksonFeature.class)
                .register(org.glassfish.jersey.media.multipart.MultiPartFeature.class);

    }

}
