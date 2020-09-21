
package com.mykh.infix;

public class Runner {

    public static void main(String[] args) {
        String str = "10/5+5*(2+3)";
        PostfixConverter pc = new PostfixConverter();
        System.out.println(pc.changeInfixToPostfix(str));

    }


}


