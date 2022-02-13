package emlakburada.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class EmailConfig {
	
	private String smtpServer;
	private String smtpPort;
	private String username;
	private String password;
	private String from;
	private String subject;

}
