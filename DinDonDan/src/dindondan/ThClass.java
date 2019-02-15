/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thcampane;

/**
 *
 * @author padua_princess_joy
 */
public class ThClass extends Thread {
    public void run() {
        try {
            
            System.out.println("DING");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}
    }

}


    

