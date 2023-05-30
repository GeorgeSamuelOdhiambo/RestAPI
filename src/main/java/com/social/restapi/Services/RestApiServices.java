package com.social.restapi.Services;

import com.google.gson.*;
import com.social.restapi.Payload.Login;
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

    public String loginJwt(String r){
        Gson gson = new Gson();
        Login result = gson.fromJson(r, Login.class);
        try{
            return result.getPassword();
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
