package com.lakshayswani.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("Admin Controller")
public class HelloController {

	@ApiOperation(value="Hello", notes = "Hello from controller")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello()
	{
		return "hello";
	}
	
}
