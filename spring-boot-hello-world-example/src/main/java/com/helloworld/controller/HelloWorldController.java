package com.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "<h1> Congratulations. You have successfully deployed the sample Spring Boot Application.</h1>"
+ "<h1> Felicitaciones. Has desplegado la aplicaci&oacute;n de muestra de Spring Boot con &eacute;xito.</h1>";
}
}
