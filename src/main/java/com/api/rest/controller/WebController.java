package com.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.api.rest.model.SampleResponce;

@RestController
public class WebController {
    @RequestMapping(value = "/sample", method = RequestMethod.POST)
    public SampleResponce Sample(@RequestParam(value = "name",
            defaultValue = "Robot") String name) {
        SampleResponce response = new SampleResponce();
        response.setId(1);
        response.setMessage("Your name is "+name);
        return response;

    }
}
