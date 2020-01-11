package fr.lq.lab.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.lq.lab.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationContoller {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(),
				configuration.getMinimum());
	}

}
