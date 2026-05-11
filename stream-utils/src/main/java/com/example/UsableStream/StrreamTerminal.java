package com.example.UsableStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StrreamTerminal{

public static void main(String[] args){
    //Given a list of Integers, return only even numbers using Java Streams
    List<Integer> numbers=Arrays.asList(4,8,7,5,9,5,6,4,3,2);
    numbers.stream()
    .filter(n->n%2==0)
    .forEach(n->System.out.println(n));

    //Given a list of Integers,return the square of even numbers using Streams
    numbers.stream()
    .filter(n->n%2==0)
    .map(n->n*n)
    .forEach(n->System.out.println(n));

    // Find the frequency of characters in a string using Streams
    String str="hello world";
    str.chars().mapToObj(c->(char)c)
    .collect(Collectors.groupingBy(c->c, Collectors.counting()));

    // Find the Longest Common Prefix in a list of strings
    //Input: ["flower", "fly", "flow", "flower"]
    //Output: "fl"
// Find the first unique character in a string with/without using Streams
    //Input: "hello world"
   // Output: "h
   String input="AAichael";
   

}

}
