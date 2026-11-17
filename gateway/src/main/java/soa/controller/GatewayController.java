package soa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.services.GatewayService;

@RestController
@RequestMapping("gateway")
public class GatewayController {

	GatewayService GS;
	
	public GatewayController(GatewayService GS)
	{
		this.GS = GS;
	}
	
	@GetMapping("{serviceName}/{operation}/{a}/{b}")
	public Object getService(@PathVariable String serviceName, 
							 @PathVariable String operation,
							 @PathVariable int a,
							 @PathVariable int b)
	{
		return GS.invokeService(serviceName, operation, a, b);
	}
}
