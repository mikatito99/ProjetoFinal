package br.com.Vainaweb.escolat1.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.extern.java.Log;

@Controller
public class AuthController {

	
	
	
    @PostMapping("/login")
    public String login(@RequestBody  Log login ) {
        return "login";
    }
}
