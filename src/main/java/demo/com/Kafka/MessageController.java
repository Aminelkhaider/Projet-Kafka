package demo.com.Kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("api/v1/messages")
public class MessageController {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	@PostMapping
	public void publish(@RequestBody MessageRequest request) {
		kafkaTemplate.send("amine-replica",request.message());
		
	}
//	send the message that you want to consumer

}
