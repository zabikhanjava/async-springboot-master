package com.async.controller;

import com.async.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String mobile) {
        notificationService.sendTextMessage(mobile);
        return "message sent successfully!!! : " + Thread.currentThread().getName();
    }
}
