package io.github.jonasfschuh.ms_kafka_producer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterEventService {

    private final KafkaTemplate<Object, Object> template;

    public <T> void addEvent(String topic, T data) {
        template.send(topic, data);
    }

}
