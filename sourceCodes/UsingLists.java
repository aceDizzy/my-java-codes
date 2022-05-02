package sourceCodes;

import java.util.List;
public class UsingLists {
  public static void main(String[] args) {
    //declaring string items
    List <String> items = List.of("1", "a", "2", "a", "3", "a");
    //if statement
    items.forEach(item -> {
      if (item.equals("a")) {
        System.out.println("A");
      } else {
        System.out.println("Not A");
      }
    });
  }
}