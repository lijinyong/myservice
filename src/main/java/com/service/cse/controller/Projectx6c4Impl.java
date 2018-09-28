package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-09-28T12:57:31.736Z")

@RestSchema(schemaId = "projectx6c4")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectx6c4Impl {

    @Autowired
    private Projectx6c4Delegate userProjectx6c4Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectx6c4Delegate.helloworld(name);
    }

}
