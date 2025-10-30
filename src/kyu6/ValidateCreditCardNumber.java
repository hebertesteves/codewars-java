package kyu6;

import java.util.List;
import java.util.ArrayList;

public class ValidateCreditCardNumber{
  public static boolean validate(String n){
    String[] array = n.split("");
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      if (array.length % 2 == 0) {
        if (i % 2 == 0) {
           numbers.add(Integer.parseInt(array[i]) * 2);
        }
      } else {
        if (i % 2 != 0) {
          numbers.add(Integer.parseInt(array[i]) * 2);
        }
      }
    }
      
    for (int num : numbers) {
        if (num > 9) num -= 9;
    }
        
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    
      return sum % 10 == 0 ? true : false;
    }
}