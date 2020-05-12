package example.micronaut.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

import java.security.Principal;

@Controller("/")  // <2>
@Secured(SecurityRule.IS_AUTHENTICATED) // <1>
public class HomeController {

    @Get("/") // <3>
    public String index(Principal principal) {  // <4>
        return principal.getName();
    }
}
