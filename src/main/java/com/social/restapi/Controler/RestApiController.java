package com.social.restapi.Controler;

import com.social.restapi.Services.RestApiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @Autowired
    RestApiServices restApiServices;


}