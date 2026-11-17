package soa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.services.ArithmeticService;

@RestController
@RequestMapping("api")
public class ArithmeticController {

	ArithmeticService AS;
	
	public ArithmeticController(ArithmeticService AS)
	{
		this.AS = AS;
	}
	
	@GetMapping("add/{a}/{b}")
	public Object add(@PathVariable int a,@PathVariable int b)
	{
		return "From Service3: " + AS.add(a, b);
	}
	
	@GetMapping("sub/{a}/{b}")
	public Object sub(@PathVariable int a, @PathVariable int b)
	{
		return "From Service3: " + AS.sub(a, b);
	}
	
	@GetMapping("mul/{a}/{b}")
	public Object mul(@PathVariable int a, @PathVariable int b)
	{
		return "From Service3: " + AS.mul(a, b);
	}
}
