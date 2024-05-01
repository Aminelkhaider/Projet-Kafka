package demo.com.Kafka;

import org.springframework.stereotype.Component;


@Component

public class KafkaListener {
	@org.springframework.kafka.annotation.KafkaListener(topics="amine-replica",groupId= "groupId")
	void listener(String data) {
		System.out.println("Listener received: " + data);
//		print the data that was send from producer to the topic 
		
	}

}
