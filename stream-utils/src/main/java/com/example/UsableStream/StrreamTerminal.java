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

    //DeDuplicate and sort
        List<Integer> duplicateList= Arrays.asList(17,28,14,17,62,28);
        List<Integer> distinctSorted=duplicateList.stream().distinct()
                .sorted().collect(Collectors.toList());
        System.out.println(distinctSorted);

        //return square of only even number
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        List<Integer> squareDouble = numbers.stream().filter(n->n%2==0).
                map(n->n*n).
                collect(Collectors.toList());

        //Find second highest number in the list
        List<Integer> secondNum=Arrays.asList(4,2,1,6,5);
        int secondHigh=secondNum.stream().distinct().sorted(Comparator.reverseOrder()).skip(1)
                .findFirst().orElseThrow();

        //Count Frequency of each element in a  list
        List<Integer> multipleFrequency=Arrays.asList(1,1,2,2,3,3,4,4,5,6);
        Map<Integer, Long> Frequency=multipleFrequency.
                stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));


        //Find the first number greater than 10 from the list
        List<Integer> numList=List.of(8,4,11,12,15,17);
        int num=numList.stream().filter(n->n>10).findFirst().orElseThrow();
        System.out.println(num);

        //Count how many numbers are greater than 5 in the list
        long num2=numList.stream().filter(n->n>5).count();
        System.out.println(num2);

        //find the sum of all numbers in the list
        List<Integer> numList2=List.of(2,5,4,3,6,8,9);
        Integer sum=numList2.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);

        //find the product of all numbers in the list
        List<Integer> numList3=List.of(6,5,4,3,2,8);
        Integer product=numList3.stream().reduce(1,(a,b)->a*b);

        //find the maximum number in the list
        Optional<Integer> max=numList3.stream().reduce(Integer::max);
        System.out.println(max.get());

        //sum of squares of even numbers in the list
        Integer summing=numList3.stream().filter(n->n%2==0).reduce(0,(a,b)->a+b);
        System.out.println(summing);

    
   

}

}
