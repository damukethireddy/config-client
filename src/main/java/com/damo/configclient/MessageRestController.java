package com.damo.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MessageRestController {

	@Value("${test.sample.msg:Boss}")
    private String msg;	
	
	@RequestMapping(value="/get")
	public String getMessage() {
		return msg;
	}
}
