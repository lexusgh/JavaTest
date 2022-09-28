/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Utils {
    
        public void sum(double num1,double num2)
    {
        double sum = num1+num2;
         System.out.println("Sum of "+num1+ " and " + num2 + " is "+sum);
    }
    
     public double sumR(double num1,double num2)
    {
        double sum = num1+num2;
        return sum;
         
    }
     
     public void sumArray()
     {
         double[] numArr = {10.0,11.2,12.3};
         double sum = 0.0;
         for(double num : numArr)
         {
             sum = sum + num;         
         }
         System.out.println("SumArray = "+sum);
     }
     
     public void arrList()
     {
         List<Double> list = new ArrayList<>();
         list.add(3.5);
         list.add(12.6);
         list.add(10.0);
         double sum = 0.0;
         
         for(double num : list)
         {
             sum = sum + num;         
         }
         System.out.println("ArrList = "+sum);
     }

    public void genericArray()
    {
        List<MailTest> mailList = new ArrayList<>();
        MailTest mailTest = new MailTest();
        mailTest.setDateCreated(new Date());
        mailTest.setSubject("Java Class");
        mailTest.setMessage("Welcome To the Java Class");
        
        mailList.add(mailTest);
        
        
       // MailTest mailTest = new MailTest();
        mailTest.setDateCreated(new Date());
        mailTest.setSubject("C# Class");
        mailTest.setMessage("Welcome To the C# Class");
        mailList.add(mailTest);
        
        
         mailTest.setDateCreated(new Date());
        mailTest.setSubject("Python Class");
        mailTest.setMessage("Welcome To the Python Class");
        mailList.add(mailTest);
        
        
        
        System.out.println("Size of Array "+ mailList.size());
        
        for(MailTest mailTest1 : mailList)
        {
            
            System.out.println("Mail>> "+mailTest1.toString());
        }
        
        
        
    }
    
}
