// Java Program to Demonstrate ByteArrayInputStream Class
// Via mark(), read(), skip(), available(),
// markSupported(), close(), reset() Method

// Importing required classes
import java.io.*;

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args) throws Exception
    {

        // Declaring and initializing byte array
        byte[] buffer = { 71, 69, 69, 75, 83 };
        ByteArrayInputStream geek = null;

        // Try block to check for exceptions
        try {
            geek = new ByteArrayInputStream(buffer);

            // Telling the no. of bytes to be read
            // using available() method
            int number = geek.available();
            System.out.println(
                    "Use of available() method : " + number);

            // Reading and printing Characters one by one
            // using read() method
            System.out.println("\nChar : "
                    + (char)geek.read());
            System.out.println("Char : "
                    + (char)geek.read());
            System.out.println("Char : "
                    + (char)geek.read());

            // Usage of mark() method
            geek.mark(0);

            // Skipping 'k' from "GEEKS"
            // using skip() method
            geek.skip(1);
            System.out.println(
                    "skip() method comes to play");
            System.out.println(
                    "mark() method comes to play");
            System.out.println("Char : "
                    + (char)geek.read());

            // Usage of markSupported() method
            boolean check = geek.markSupported();
            System.out.println("\nmarkSupported() : "
                    + check);

            if (geek.markSupported()) {

                // Repositioning the stream to marked
                // positions using reset() method
                geek.reset();

                System.out.println("\nreset() invoked");
                System.out.println("Char : "
                        + (char)geek.read());
                System.out.println("Char : "
                        + (char)geek.read());
            }
            else {
                System.out.println(
                        "reset() method not supported.");
            }

            System.out.println(
                    "geek.markSupported() supported reset() : "
                            + check);
        }

        // Catch block to handle the exceptions
        catch (Exception except) {

            // Displaying the exception along with line
            // number using printStackTrace() method
            except.printStackTrace();
        }

        // finally block that execute for sure
        finally {

            // Releasing the resources back to GC when
            // closes
            if (geek != null) {

                // Closing the file and releasing resources
                // using close() method
                geek.close();
            }
        }
    }
}
