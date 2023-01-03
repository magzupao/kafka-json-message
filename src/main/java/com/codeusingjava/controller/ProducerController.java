package com.codeusingjava.controller;

import com.codeusingjava.util.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeusingjava.model.Person;
import com.codeusingjava.service.ProducerService;

@RestController
@RequestMapping(value = "/kafka/")
public class ProducerController {

    private static final Logger logger = LoggerFactory.getLogger(ProducerController.class);
    @Autowired
    ProducerService kafkaProducer;
    @PostMapping(value = "/producer")
    public String sendMessage(@RequestBody Person user)
    {
        kafkaProducer.send(user);
        return "Message sent Successfully to the topic";
    }

/*    @KafkaListener(topics = AppConstants.TOPIC, groupId=AppConstants.GROUP_ID)
    public void listen(Person user) {
        logger.info("Received info--> : ", user);
        logger.info("Received info *** --> : ", user.getName() );
    }*/
}
