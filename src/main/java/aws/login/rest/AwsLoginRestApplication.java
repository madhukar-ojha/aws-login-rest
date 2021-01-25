package aws.login.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2WebMvc
@SpringBootApplication
public class AwsLoginRestApplication {
	
	private static final Logger logger = LogManager.getLogger(AwsLoginRestApplication.class);
	
	public static void main(String[] args) {
		logger.info("------ aws-login-rest starting --------");
		SpringApplication.run(AwsLoginRestApplication.class, args);
		logger.info("------ aws-login-rest started --------");
	}

}
