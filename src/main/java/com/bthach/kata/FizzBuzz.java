package com.bthach.kata;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzz {

    public String display(int... numbers) {
        Stream<FizzBuzzNumber> fizzBuzzNumberStream = Arrays.stream(numbers).mapToObj(FizzBuzzNumber::new);
        Stream<String> fizzBuzzStream = fizzBuzzNumberStream.map(FizzBuzzNumber::getFizzBuzz);
        String fizzBuzz = fizzBuzzStream.collect(Collectors.joining(" "));
        return fizzBuzz;
    }

    class FizzBuzzNumber {

        final int value;
        final boolean isFizz;
        final boolean isBuzz;

        public FizzBuzzNumber(int value) {
            this.value = value;
            this.isFizz = isMultipleOf3(value);
            this.isBuzz = isMultipleOf5(value);
        }

        public String getFizzBuzz() {
            if(isFizz & isBuzz) {
                return "FizzBuzz";
            }
            if(isFizz) {
                return "Fizz";
            }
            if(isBuzz) {
                return "Buzz";
            }
            return String.valueOf(value);
        }

        private boolean isMultipleOf3(int value) {
            return value%3 == 0;
        }

        private boolean isMultipleOf5(int value) {
            return value%5 == 0;
        }

    }


}
