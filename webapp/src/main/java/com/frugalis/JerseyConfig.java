package com.frugalis;


import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/reconservices")
public class JerseyConfig extends ResourceConfig {

    @Inject
    public JerseyConfig()
    {
    //register(CustomerServiceRest.class);
    	
        packages("com.frugalis.rest");

    }

}
