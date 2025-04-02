// Checking all functions of method utils
package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void reverseTest(){
        String expected = "nayraA";

        Assert.assertEquals(expected, StringUtils.reverse("Aaryan"));
    }

    @Test
    public void isPalindrome(){
        boolean expected = false;

        Assert.assertEquals(expected, StringUtils.isPalindrome("Aaryan"));
    }

    @Test
    public void toUpperCase(){
        String expected = "AARYAN";

        Assert.assertEquals(expected, StringUtils.toUpperCase("Aaryan"));
    }
}

//if by change 3rd test case does not pass, then output will be
//org.junit.ComparisonFailure:
//Expected :AArYAN
//Actual   :AARYAN