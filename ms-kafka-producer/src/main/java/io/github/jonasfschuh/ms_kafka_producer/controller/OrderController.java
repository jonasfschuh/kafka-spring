package io.github.jonasfschuh.ms_kafka_producer.controller;

import io.github.jonasfschuh.ms_kafka_producer.data.OrderData;
import io.github.jonasfschuh.ms_kafka_producer.service.RegisterEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final RegisterEventService eventService;

    @PostMapping(path = "/api/save-order")
    public ResponseEntity<String> SaveOrder(@RequestBody OrderData order) {
        eventService.addEvent("SaveOrder", order);
        return ResponseEntity.ok("Success");
    }
}
