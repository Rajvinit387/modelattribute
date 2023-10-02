package com.example.demomodelattribute;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/getd")
    public ResponseEntity<String> getde(@RequestParam(name = "x") String xuuu,
                                        @RequestParam(name = "y", required = false) String y)
    {
        return ResponseEntity.ok(xuuu);

    }
}
