/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowerbounddemo;

/**
 *
 * @author HP
 */
import java.util.LinkedList;
import java.util.List;
public class LowerBoundDemo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Printer p = new Printer(); 
        p.show("Hello Java"); p.show(100); 
        NumberDemo n = new NumberDemo(); 
        List<Number> numbers = new LinkedList<>();
        n.showNumbers(numbers); }
    }
    

