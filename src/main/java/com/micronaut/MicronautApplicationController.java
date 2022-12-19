package com.micronaut;

import io.micronaut.http.annotation.*;

@Controller("/micronautApplication")
public class MicronautApplicationController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}