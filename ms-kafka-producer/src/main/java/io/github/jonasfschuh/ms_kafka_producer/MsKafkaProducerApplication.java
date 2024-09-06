package io.github.jonasfschuh.ms_kafka_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MsKafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsKafkaProducerApplication.class, args);
	}

}
