package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WecomeController {
	@GetMapping("/helloworld")
	public String welcome() {
		return "welcome";
	}

}
