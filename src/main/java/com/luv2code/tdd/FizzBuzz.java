package com.luv2code.tdd;

public class FizzBuzz {
    String compute(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0){
            result.append("Fizz");
        }

        if (number % 5 == 0){
            result.append("Buzz");
        }

        if (result.isEmpty()){
            result.append(number);
        }

        return result.toString();
    }


    /* String compute(int number){
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
      // return number+"";
        return Integer.toString(number);
    } */
}
