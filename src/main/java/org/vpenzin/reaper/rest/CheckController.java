package org.vpenzin.reaper.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping(value = "/biba")
    public String checkGet() {
        return "The check is working!";
    }
}
