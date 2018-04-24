package com.sebastian_daschner.maker_bot.boundary;

import com.sebastian_daschner.maker_bot.control.MakerBot;

import javax.inject.Inject;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import java.util.Enumeration;

@Path("jobs")
public class JobsResource {

    @Inject
    MakerBot makerBot;

    @POST
    public void createJob(JsonObject jsonObject, @Context HttpServletRequest request) {
        logHeaders(request);
        String instrument = jsonObject.getString("instrument", null);

        if (instrument == null)
            throw new BadRequestException();

        makerBot.print(instrument);
    }

    private void logHeaders(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            System.out.println(header + ": " + request.getHeader(header));
        }
        System.out.println();
    }

}
