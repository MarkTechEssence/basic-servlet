/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techessence;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author markthebault
 */
@Path("test")
public class MavenTestResource {
    @GET
    public String show(){
        return " Bla Bla";
    }
}
