package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.in28minutes.rest.webservices.restfulwebservices.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping(path="/hello-world")
	public String helloWord() {
		
		return "Hello Anand" ;
	}
	
	@GetMapping(path="/hello-world-bean")
	public  HelloWorldBean helloWordBean() {
		
		return new HelloWorldBean("Hello Anand");
		
	}
	
	@PostMapping(path="/hello-world/path-variable")
	public HelloWorldBean helloWorldPathVarible(@RequestBody InputRequestBody request) {
		
		Helloworldservice helloworldservice=new Helloworldservice();
		
		
		return helloworldservice.sortArray(request.getNumbers());
		
	}
	
	public static  void main(int arr[]) {
		
	}
}


