package codewars.k8.parsing;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertStringTest {
    @Test
    public void test1(){
        assertEquals("stringToNumber(1234)", 1234 ,ConvertString.stringToNumber("1234"));
    }
    @Test
    public void test2(){
        assertEquals("stringToNumber(605)", 605 , ConvertString.stringToNumber("605"));
    }
    @Test
    public void test3(){
        assertEquals("stringToNumber(1405)", 1405 , ConvertString.stringToNumber("1405"));
    }
    @Test
    public void test4(){
        assertEquals("stringToNumber(-7)", -7 , ConvertString.stringToNumber("-7"));
    }
}
