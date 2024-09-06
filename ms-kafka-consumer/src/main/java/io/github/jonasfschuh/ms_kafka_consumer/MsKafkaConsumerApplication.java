package io.github.jonasfschuh.ms_kafka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MsKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsKafkaConsumerApplication.class, args);
	}

}
