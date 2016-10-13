/*
 * The MIT License
 *
 * Copyright 2016 Peter.Horniak.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package horizon;

import java.util.Scanner;

/*
 To do:  Allow user to choose the units of measurement
 Put the Quit functionality into a separate function
 Gracefully deal with invalid user input 
 How long it takes to land from this elevation w/wo a parachute
 How long it takes light to travel the distance
 How thin the air is at this elevation, how much more effort to breathe
 What physiological effects you feel that are unusual to ground level
 */
public class Horizon {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Your elevation (m): ");
            double userElevation = Double.parseDouble(reader.nextLine());
            double userHorizonDistance = Math.sqrt(2 * 6371000 * userElevation + userElevation * userElevation);

            System.out.println("You can see up to " + (Math.round(userHorizonDistance)/1000.0) + " kilometers away.");
            System.out.println("Assuming clear weather, perfect eyesight, no gravitational effects, and other variables that I can't be bothered to simulate.");
            
            if (userElevation > 1000) {
                System.out.println("I hope you are in an aircraft, otherwise it must be cold.");
                System.out.println("Want me to know how much colder compared to ground level? Give me your current temperature.");
                double userTemp = Double.parseDouble(reader.nextLine());
                System.out.println("The ground is " + (userTemp + (3.5 * (userElevation / 1000))) + "°C.");
            }
            
            System.out.println("To escape, type 'quit'.");
            System.out.println("To ask again, type any other character!");
            String usUserDecision = reader.nextLine();

            if (usUserDecision.equals("quit")
                    || usUserDecision.equals("Quit")
                    || usUserDecision.equals("quit.")
                    || usUserDecision.equals("Quit.")) {
                System.out.println("Bye bye!");
                break;
            }
        }
    }
}
