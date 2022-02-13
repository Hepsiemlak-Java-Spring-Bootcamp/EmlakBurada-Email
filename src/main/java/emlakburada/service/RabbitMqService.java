package emlakburada.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqService {

	@Autowired
	private EmailService emailService;

	@RabbitListener(queues = "emlakburada.queue")
	public void receiveMessage(EmailMessage message) {
		emailService.send(message.getEmail());
		System.out.println("email gönderildi! " + message.getEmail());
	}

}
