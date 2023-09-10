package sampleApp;

import static org.testng.Assert.*;
import org.testng.asserts.SoftAssert;

public class Assertions {
    public static void main(String[] args) {
        System.out.println("*** test case one started ***");
        SoftAssert softAssert = new SoftAssert();
        assertFalse(false,"");
        softAssert.assertEquals(12,23,"int value not matched");
        softAssert.assertNotEquals(12,12,"int value should not match");
        softAssert.assertTrue("abc".equals("cde"),"string value not matched");
        softAssert.assertFalse("abc".contains("ab"),"string not contain substring");
        softAssert.assertAll();
    }
}
