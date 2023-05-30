package com.social.restapi.Services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RestApiServices {
    public void SendText(){

    }

    public String SendString(){
        Random random = new Random();
        int otp = random.nextInt(900000) + 100000;
        return String.valueOf(otp);
    }
}
