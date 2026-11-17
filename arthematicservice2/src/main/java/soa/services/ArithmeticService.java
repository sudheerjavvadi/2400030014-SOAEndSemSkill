package soa.services;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {

	public Object add(int a, int b)
	{
		return a+b;
	}
	
	public Object sub(int a, int b)
	{
		return a-b;
	}
	
	public Object mul(int a, int b)
	{
		return a*b;
	}
}
