package com.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class NotificationService {

    @Async
    public void sendTextMessage(String mobile) {

        // dummy logic to call 3rd party services
        System.out.println("servince sendTextMessage start");
        sleep(60);
        //System.out.println("called 3rd party to send text message : " + Thread.currentThread().getName());
        //System.out.println(10 / 0);
        System.out.println("servince sendTextMessage end");


    }


    private void sleep(int args) {
        System.out.println("sleep start");
        try {
            TimeUnit.SECONDS.sleep(args);
            System.out.println("sleep end");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
