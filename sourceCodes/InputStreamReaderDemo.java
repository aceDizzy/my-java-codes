package sourceCodes;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class InputStreamReaderDemo
{
  public static void main(String[] args)
  {
    try
    {
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader buffer = new BufferedReader(input);
      System.out.print("Kindly enter your name: ");
      System.out.println("Hello " +buffer.readLine());
    }
    catch(IOException e)
    {
      System.out.println("Input-Output Exception occurred");
    }
  }
}
