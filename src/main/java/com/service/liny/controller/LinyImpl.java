package com.service.liny.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-20T08:46:10.849Z")

@RestSchema(schemaId = "liny")
@RequestMapping(path = "/liny", produces = MediaType.APPLICATION_JSON)
public class LinyImpl {

    @Autowired
    private LinyDelegate userLinyDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userLinyDelegate.helloworld(name);
    }

}
