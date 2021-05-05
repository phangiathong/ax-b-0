/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th60;

import gui.FPTB1;
import model.PTB1;

/**
 *
 * @author ADMIN
 */
public class Th60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PTB1 ptb1 = new PTB1(10, 20);
        System.out.println(ptb1.getHsa());
        System.out.println(ptb1.getHsb());
        
        FPTB1 f = new FPTB1();
        f.setVisible(true);
        
    }
    
}
