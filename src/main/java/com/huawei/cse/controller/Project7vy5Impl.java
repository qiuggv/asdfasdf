package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-11-12T03:14:18.392Z")

@RestSchema(schemaId = "project7vy5")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Project7vy5Impl {

    @Autowired
    private Project7vy5Delegate userProject7vy5Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject7vy5Delegate.helloworld(name);
    }

}
