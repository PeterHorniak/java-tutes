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
 Gracefully deal with invalid user input 
 How long it takes to land from this elevation w/wo a parachute
 How long it takes light to travel the distance
 How thin the air is at this elevation, how much more effort to breathe
 What physiological effects you feel that are unusual to ground level
 */
public class Horizon {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double userElevation;
        double userHorizonDistance;
        String usUserDecision;

        while (true) {
            System.out.print("Your elevation (m): ");
            userElevation = Double.parseDouble(reader.nextLine());
            userHorizonDistance = Math.sqrt(2 * 6371000 * userElevation + userElevation * userElevation);

            System.out.println("You can see up to " + userHorizonDistance / 1000 + " kilometers away.");
            System.out.println("Assuming clear weather, perfect eyesight, no gravitational effects, and other variables that I can't be bothered to simulate.");
            System.out.println("To escape, type 'quit'.");
            System.out.println("To ask again, type any other character!");
            usUserDecision = reader.nextLine();

            if (usUserDecision.equals("quit")
                    || usUserDecision.equals("Quit")
                    || usUserDecision.equals("quit.")
                    || usUserDecision.equals("Quit.")) {
                System.out.println("Bye bye");
                break;
            }
        }
    }
}
