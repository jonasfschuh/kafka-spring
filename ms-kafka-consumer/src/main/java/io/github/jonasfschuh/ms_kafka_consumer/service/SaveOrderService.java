package io.github.jonasfschuh.ms_kafka_consumer.service;

import io.github.jonasfschuh.ms_kafka_consumer.data.OrderData;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SaveOrderService {

    @KafkaListener(topics = "SaveOrder", groupId = "MicroServiceSaveOrder")
    private void perform(ConsumerRecord<String, String> record) {

        log.info("Key = {}", record.key());
        log.info("Header = {}", record.headers());
        log.info("Partition = {}", record.partition());

        String Data = record.value();

        ObjectMapper mapper = new ObjectMapper();
        OrderData order;

        try {
            order = mapper.readValue(Data, OrderData.class);
        } catch (JsonProcessingException ex) {
            log.error("Fail on convert event [dado={}}]", Data, ex);
            return;
        }

        log.info("Event Received = {}", order);

        // Save on database
        // Answer to queue that order was saved
    }

    private void save(OrderData oder) {
        // Save on database
    }

}
