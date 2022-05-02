package sourceCodes;

import java.io.*;

//we declare a class named GetInputFromKeyboard
public class GetInputFromKeyboard {
//declares the main method
public static void main(String[] args) {
  /*declares a variable named dataIn, with the class type
  BufferedReader*/
  BufferedReader dataIn = new BufferedReader(new
                    InputStreamReader( System.in) );
  //declares a String variable with identifier name
  String name = "";
  //outputs a String on the screen asking for the user's name
  System.out.print("Please Enter Your Name: ");
  /*the given block defines a try-catch block
  this assures that the possible exceptions that could occur in
  the statement name = dataIn.readLine() ; will be catched*/
  try {
  /*the method call, dataIn.readLine(); gets input from the
  InputStreamReader and will return a String value*/
        name = dataIn.readLine();
  /*this value will then be saved to our name variable, which we
  will use in our final statement to greet the user*/

  }catch( IOException e ){
          System.out.println("Error!");
  }
  System.out.println("Hello " + name + "!");
}
}
