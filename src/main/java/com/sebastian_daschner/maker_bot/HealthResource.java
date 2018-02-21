package com.sebastian_daschner.maker_bot;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("health")
public class HealthResource {

    @GET
    public String healthCheck() {
        return "OK";
    }

}
