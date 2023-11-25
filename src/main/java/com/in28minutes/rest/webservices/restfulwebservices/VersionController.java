package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// VERSIONING 

@RestController
public class VersionController {

    //URI VERSIONING
    @GetMapping("person/version1")
    public PersonV1 getPersonV1() {
        return new PersonV1("Thania Vivek");
    }

    //REQUEST PARAMS VERSIONING
    @GetMapping("person/version2")
    public PersonV2 getPersonV2() {
        return new PersonV2(new Name("Thania", "Vivek"));
    }

     @GetMapping(path="/person", params="version1")
    public PersonV1 getPersonV1RequestParam() {
        return new PersonV1("Thania Vivek");
    }

    @GetMapping(path = "/person", params="version2")
    public PersonV2 getPersonV2RequestParam() {
        return new PersonV2(new Name("Thania", "Vivek"));
    }

    //HEADER VERSIONING
      @GetMapping(path="/person/header", headers="API-VERSION=1")
    public PersonV1 getPersonV1Headers() {
        return new PersonV1("Thania Vivek");
    }

    @GetMapping(path = "/person/header", headers="API-VERSION=2")
    public PersonV2 getPersonV2Headers() {
        return new PersonV2(new Name("Thania", "Vivek"));
    }
    
       //Content Negotiation Versioning
    //   @GetMapping(path="/person/accept", produces="application/vnd.company.app-v2+json")
    // public PersonV1 getPersonV1HeadersAccept() {
    //     return new PersonV1("Thania Vivek");
    // }

    // @GetMapping(path = "/person/accept", produces="application/vnd.company.app-v2+json")
    // public PersonV2 getPersonV2HeadersAccept() {
    //     return new PersonV2(new Name("Thania", "Vivek"));
    // }
}
