package com.sasi;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping(value="/test")
	public ResponseEntity<Map<String,String>> test(){
		return ResponseEntity.ok().body(Map.of("hi","sasi"));
	}

}
