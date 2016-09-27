/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Carson Schultz
 */
public class StartUp {
   public static void main(String[] args) {
        MessageOutputService output = new ConsoleWriter();
        MessageInputService input = new KeyboardInput();

        MessageInputOutputManager message = new MessageInputOutputManager(input, output);

        message.getOutput();

    }
}
