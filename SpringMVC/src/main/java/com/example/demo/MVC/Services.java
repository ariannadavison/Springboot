package com.example.demo.MVC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Services {
@RequestMapping("/first")
public String first() {
	return "Wow, first web app";
}
@RequestMapping("/again")
public String again(){
return "Wow, it happend again";
}
}
