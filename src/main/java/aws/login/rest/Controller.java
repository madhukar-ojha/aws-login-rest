package aws.login.rest;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	private static final Logger logger = LogManager.getLogger(Controller.class);

	@GetMapping(value = "/login")
	public String login(@RequestParam String msg) {
		logger.info("Controller :: login :: start");
		String res = msg + " received at " + LocalDateTime.now().toString();
		logger.info("Controller :: login :: end");
		return res;
	}
	
	@GetMapping(value = "/login/{msg}")
	public String login1(@PathVariable String msg) {
		logger.info("Controller :: login1 :: start");
		String res = "Hi..." + msg + " Direct message from login rest";
		logger.info("Controller :: login1 :: end");
		return res;
	}
	
	@GetMapping(value = "/go")
	public String go() {
		logger.info("Controller :: go :: start");
		String res = "fuck u hard madhu..............";
		logger.info("Controller :: go :: end");
		return res;
	}
}
