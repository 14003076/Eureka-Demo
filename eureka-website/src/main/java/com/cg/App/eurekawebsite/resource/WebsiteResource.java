package com.cg.App.eurekawebsite.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class WebsiteResource {

	@Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String hello() {
		return "index";
		
	}

    @RequestMapping("/hello")
    public String home(Model model) {
        String message = restTemplate.getForObject("http://first/resources",String.class);
        model.addAttribute("message", message);
        return "helloworld";
 
    }
}
