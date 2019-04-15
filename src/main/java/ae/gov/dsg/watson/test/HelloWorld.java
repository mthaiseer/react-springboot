package ae.gov.dsg.watson.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/api/hello")
	public String hello() {
		return "this is the first message from Rashid updated ";
		
	}

}
