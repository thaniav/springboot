package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
    
    //Static filtering - hiding value2 in class SomeBean using the @JsonIgnore annotation
    @GetMapping("/filtering")
    public SomeBean filtering(){
        return new SomeBean("value1","value2","value3");
    }


     //Static filtering - value2 still won't be displayed in list
    @GetMapping("/filtering-list")
    public List<SomeBean> filteringList(){
        return Arrays.asList(new SomeBean("value1","value2","value3"), new SomeBean("value5","value6","value9"));
    }
}
