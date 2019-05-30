package com.lovo.servlet.mybaitsTest;


import org.junit.Test;

public class TConn {
    @Test
    public void  Tests(){
        try {
           Class cl = Class.forName("com.mysql.jdbc.Driver");
            System.out.println(cl.toString());
            System.out.print("Hello Word");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
