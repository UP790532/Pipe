/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipe;

/**
 *
 * @author Jack
 */
public class Pipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PipeType1 pipe1 = new PipeType1(6,3,2,0,1,false,false,true);
        pipe1.calculatePrice();
        pipe1.printOut();
        
        PipeType2 pipe2 = new PipeType2(4,2,3,1,1,false,false,true);
        pipe2.calculatePrice();
        pipe2.printOut();
    }
    
}
