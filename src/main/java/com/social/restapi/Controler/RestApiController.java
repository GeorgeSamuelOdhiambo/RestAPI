package com.social.restapi.Controler;

import com.social.restapi.Services.RestApiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @Autowired
    RestApiServices restApiServices;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void home(){}
}