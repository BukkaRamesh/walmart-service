package com.sample.rameshpractise;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	//http://localhost:9010/users/save/raemsh?age=12
	@PostMapping("save/{name}")
	public String saveUser(@PathVariable String name,  @PathParam("age") int age ) {  //@RequestParam("age") int age
		System.out.println("name is : "+name+ "age: " +age  );
		return name;
	}
	
	

}
