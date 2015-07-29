package com.bthach.kata;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void inputWith1_shouldDisplay_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.display(1)).isEqualTo("1");
    }

    @Test
    public void inputWith3_shouldDisplay_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.display(3)).isEqualTo("Fizz");
    }

    @Test
    public void inputWith5_shouldDisplay_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.display(5)).isEqualTo("Buzz");
    }

    @Test
    public void inputWithMultipleOf3_shouldDisplay_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.display(6)).isEqualTo("Fizz");
        assertThat(fizzBuzz.display(9)).isEqualTo("Fizz");
    }

    @Test
    public void inputWithMultipleOf5_shouldDisplay_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.display(10)).isEqualTo("Buzz");
        assertThat(fizzBuzz.display(20)).isEqualTo("Buzz");
    }

    @Test
    public void inputWithMultipleOf3and5_shouldDisplay_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.display(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.display(30)).isEqualTo("FizzBuzz");
    }

    @Test
    public void inputsWithMultipleNumbers_shouldRespect_FizzBuzzRules() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.display(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)).isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz");
    }



}