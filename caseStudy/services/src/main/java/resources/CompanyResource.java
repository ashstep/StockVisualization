/**
 * Copyright 2017 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package resources;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("company")
public class CompanyResource {
    @GET
    @Path("{comp}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getResponse(@PathParam("comp") String comp) throws IOException {
        return Response.status(Response.Status.OK).entity(comp).build();
    }







    @Path("company")
    public class Example8SolutionResource {

        @GET
        @Path("{comp}")
        public int getWins(@PathParam("comp") String country) throws IOException {

            List<Event> events = FileHelper.readAllEvents("events.json");

            int numWins = 0;
            for (Event event: events) {
                if (event.getWinningCountry().name().equalsIgnoreCase(country)) {
                    ++numWins;
                }

            }
            return numWins;
        }
    }

}


