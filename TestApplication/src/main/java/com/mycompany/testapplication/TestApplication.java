/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testapplication;

import com.mycompany.testapplication.pojo.MailTest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class TestApplication {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
       double num1 = 10.0;
       double num2 = 20.0;
      // double sum = num1 + num2;
       
      //  System.out.println("Sum of "+num1+ " and " + num2 + " is "+sum);
      //sum(num1,num2);
      Utils test = new Utils();
      test.sum(num1, num2);
      double sweet = test.sumR(num1, num2);
        System.out.println(" Value of SUMR is "+sweet);
        
        test.sumArray();
        test.arrList();
        test.genericArray();
    }
    
    
}
