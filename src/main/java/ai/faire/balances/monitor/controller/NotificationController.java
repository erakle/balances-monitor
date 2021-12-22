package ai.faire.balances.monitor.controller;

import ai.faire.balances.monitor.service.NotificationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NotificationController {
    
    @Autowired
    private NotificationService notificationService;
    
    @PostMapping("/notifications")
    public void addNotification(@RequestBody List<String> notifications){
         
        notificationService.addNotification(notifications);
    } 
}
