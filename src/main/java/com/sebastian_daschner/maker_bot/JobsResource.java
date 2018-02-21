package com.sebastian_daschner.maker_bot;

import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("jobs")
public class JobsResource {

    @Inject
    MakerBot makerBot;

    @POST
    public void createJob(JsonObject jsonObject) {
        String instrument = jsonObject.getString("instrument", null);

        if (instrument == null)
            throw new BadRequestException();

        makerBot.print(instrument);
    }

}
