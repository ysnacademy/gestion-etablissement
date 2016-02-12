package com.ysnacademy.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class MyApplication extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
    public MyApplication() {
        register(PersonneView.class);
        register(DiplomeView.class);
      }
}