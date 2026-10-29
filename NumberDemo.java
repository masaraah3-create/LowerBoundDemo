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
import java.util.List;

public class NumberDemo {


public void showNumbers(List<? super Number> numbers) {
    numbers.add(10);
    numbers.add(5.5);
    System.out.println(numbers);
}


} 
