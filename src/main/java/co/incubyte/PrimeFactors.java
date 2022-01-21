package co.incubyte;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

  public static List<Integer> ofNumber(int number) {
    List<Integer> primeFactors = new ArrayList<>(List.of());
    if (number > 1) {
      for (int i = 2; number > 1; ) {
        if (number % i == 0) {
          number /= i;
          primeFactors.add(i);
        } else {
          i++;
        }
      }
    }
    return primeFactors;
  }
}
