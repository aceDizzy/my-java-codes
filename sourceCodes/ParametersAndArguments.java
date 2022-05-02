package sourceCodes;

public class ParametersAndArguments
{
  static void myMethod(String myName)
  {
    System.out.println(myName + " Dela Cruz");
  }

  public static void main(String[] args) {
    myMethod("Anna Clarisse");
    myMethod("Carmel Ashley");
    myMethod("Deau");
  }
}

/*

When a parameter is passed to the method, it is called an argument. So, from the example above: myName is a parameter, while Anna Clarisse, Carmel Ashley and Deau are arguments.

*/