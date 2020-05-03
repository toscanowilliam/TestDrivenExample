package com.company.Test;

import com.company.OtherClasses.OtherClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestOtherClass {

    @Test
    public void shouldExecute() {
        OtherClass otherClass = new OtherClass();

        assertThat(otherClass.execute(new int[]{1}), is("1"));
        assertThat(otherClass.execute(new int[]{1, 2, 3, 5, 6, 10, 15, 30}), is("1, 2, Fizz, Buzz, Fizz, Buzz, FizzBuzz, FizzBuzz"));
    }

    @Test
    public void shouldProcessNumber() {
        OtherClass otherClass = new OtherClass();
        assertThat(otherClass.processNumber(1), is("1"));
        assertThat(otherClass.processNumber(2), is("2"));
        assertThat(otherClass.processNumber(3), is("Fizz"));
        assertThat(otherClass.processNumber(5), is("Buzz"));
        assertThat(otherClass.processNumber(6), is("Fizz"));
        assertThat(otherClass.processNumber(10), is("Buzz"));
        assertThat(otherClass.processNumber(15), is("FizzBuzz"));
    }

}