/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usd.btl.REST;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;

/**
 * REST Web Service
 *
 * @author Tyler.Jones
 */
@Path("categories")
@RequestScoped
public class CategoriesResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CategoriesResource
     */
    public CategoriesResource() {
    }

    /**
     * Retrieves representation of an instance of edu.usd.btl.REST.CategoriesResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        return "Categories";
        //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of CategoriesResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}