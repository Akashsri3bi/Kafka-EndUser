package com.enduser.enduser;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Configuration
public class KafkaConfig {
    @GetMapping("/location")
    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC , groupId=AppConstants.GROUP_ID)
    public String updatedLocation(String location){
        System.out.println(location);
        return location ;
    }
}
