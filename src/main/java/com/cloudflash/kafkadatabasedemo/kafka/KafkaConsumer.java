package com.cloudflash.kafkadatabasedemo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cloudflash.kafkadatabasedemo.entity.User;
import com.cloudflash.kafkadatabasedemo.repository.UserRepository;

@Service
public class KafkaConsumer {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    
    private UserRepository userRepository;

    public KafkaConsumer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
    
    
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s", message));
        
        User userData = new User();
        userData.setEventData(message);

        userRepository.save(userData);
        
    }

}
