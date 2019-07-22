package com.gphw.dubbo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @Author: Jiang
 * @Date: 2019/7/22 14:09
 */
@Path("/demo")
public interface DemoService {

    @GET
    @Path("/hello/{name}")
    String hello(@PathParam("name") String name);
}
