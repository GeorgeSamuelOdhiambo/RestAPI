package com.social.restapi.Controler;

import com.social.restapi.Services.RestApiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @Autowired
    RestApiServices restApiServices;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String home(){
        return "Home";
    }

    @RequestMapping(value = "/otp", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String otpValidation(){
        return restApiServices.SendString();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String otpUserValidation(@RequestBody String r){
        return restApiServices.loginJwt(r);
    }
}