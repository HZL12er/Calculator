package com.company;

import org.junit.Test;

public class MainTest {
@Test
    public void test1(){
    String s = Main.MakeFormula();
    System.out.println(s);
}
@Test
    public void test2(){
    String s = Main.MakeFormula();
    String solve = Main.Solve(s);
    System.out.println(solve);
}

}

