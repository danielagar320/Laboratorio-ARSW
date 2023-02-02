/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){

        CountThread a0 = new CountThread(0, 99);
        CountThread a1 = new CountThread(99, 199);
        CountThread a2 = new CountThread(200, 299);

        //a0.start();
        //a1.start();
        //a2.start();

        a0.run();
        a1.run();
        a2.run();


    }
    
}
