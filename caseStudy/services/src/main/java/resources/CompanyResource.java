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
import pojo.Stock;
import utility.InputValidator;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;


@Path("company")
public class CompanyResource {
    @GET
    @Path("/ok")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getResponse(@PathParam("company") String company, @PathParam("start") String start,
                                @PathParam("end") String end) throws IOException {
        InputValidator inputValidator = new InputValidator();
        List<Stock> stockDates = inputValidator.getStocks();
        for (Stock s : stockDates) {

        }

        return Response.status(Response.Status.OK).entity(company).build();
    }
    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String getResponse() throws IOException {
        InputValidator inputValidator = new InputValidator();
        List<Stock> stockDates = inputValidator.getStocks();
        System.out.println("hello");
        for (Stock s : stockDates) {

        }
        return "Company details";
        //return Response.status(Response.Status.OK).entity(company).build();
    }
}
