//package com.cloudflash.kafkadatabasedemo.kafka;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//import com.cloudflash.kafkadatabasedemo.entity.User;
//import com.cloudflash.kafkadatabasedemo.model.UserData;
//import com.cloudflash.kafkadatabasedemo.repository.UserRepository;
//
//@Service
//public class JsonKafkaConsumer {
//	
//    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
//    
//    @Autowired
//    private UserRepository userRepository;
//    
//	
//
////    @KafkaListener(topics = "cloudflash", groupId = "myGroup")
////    public void consume(User userData){
//        LOGGER.info(String.format("Json message recieved -> %s", userData.toString()));
//        
//        LOGGER.info(String.format("Asad Iqbal %s"));
//        
////        User event = new User();
////        event.setEventData(userData);
//
////        userRepository.save(event);
//        
//   }	
//    
//
//
//}
