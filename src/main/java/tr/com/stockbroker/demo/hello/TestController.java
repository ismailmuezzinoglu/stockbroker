package tr.com.stockbroker.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public String index() {
		return "Selam Fatih, Yatirim Tavsiyesi Degildir.";
	}
	
}
