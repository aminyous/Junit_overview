package com.luv2code.tdd;

public class MainApp {
    public static void main(String[] args) {

        // psvm + tab to create the main method

         FizzBuzz fizzBuzz = new FizzBuzz();
         for(int i = 1; i<=100; i++){
             System.out.println(fizzBuzz.compute(i));
         }
    }
}
