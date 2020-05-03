package com.company.Test;

import com.company.OtherClasses.AMathClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
public class TestAMathClass
{
    @Test
    public void shouldSum()
    {
        AMathClass aMathClass = new AMathClass();

        assertThat(aMathClass.sumOf(1,1), is(2));
    }


}
