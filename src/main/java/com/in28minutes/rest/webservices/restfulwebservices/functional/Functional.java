package com.in28minutes.rest.webservices.restfulwebservices.functional;

import java.util.ArrayList;
import java.util.List;

 class Functional {
    public static void print(int number){
        System.out.println(number);
    }

    public static void main(String[] args) {
        
        List<Integer> list = List.of(1,2,3,4);
        List<String> courses = List.of("AWS","Spring","Java","Docker","Python", "Spring Boot");
        //odd numbers
        list.stream().filter(number->number%2!=0).forEach(System.out::println);
        //courses containing Spring
        courses.stream().filter(s->s.contains("Spring")).forEach(System.out::println);
        //courses with atleast 4 letters
        courses.stream().filter(s->s.length()>3).forEach(System.out::println);

        //print squares of numbers 
        list.stream().map(number->number*number).forEach(System.out::println);

        //cubes of only odd numbers
        list.stream().filter(number->number%2!=0).map(number->number*number).forEach(System.out::println);

        //print no of characters in course name
        courses.stream().map(course->course.length()).forEach(System.out::println);
   

    }
}

