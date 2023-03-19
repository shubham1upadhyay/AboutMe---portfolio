package com.example.demoPortfolio.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PortfolioWeb {

	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value = "/about", method=RequestMethod.GET)
	public String about()
	{
		return "index";
	}
	
	@RequestMapping(value = "/contact", method=RequestMethod.GET)
	public String contact()
	{
		return "index";
	}
	
	@RequestMapping(value = "/work", method=RequestMethod.GET)
	public String work()
	{
		return "work";
	}
	
	@RequestMapping(value = "/certification", method=RequestMethod.GET)
	public String certification()
	{
		return "certification";
	}
	
	
	
}