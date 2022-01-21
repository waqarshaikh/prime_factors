package co.incubyte;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeFactorsShould {

  @Test
  void return_empty_list_for_number_1() {
    Assertions.assertEquals(List.of(), PrimeFactors.ofNumber(1));
  }

  @Test
  void return_prime_factors_for_number_2() {
    Assertions.assertEquals(List.of(2), PrimeFactors.ofNumber(2));
  }

  @Test
  void return_prime_factors_for_number_3() {
    Assertions.assertEquals(List.of(3), PrimeFactors.ofNumber(3));
  }

  @Test
  void return_prime_factors_for_number_4() {
    Assertions.assertEquals(List.of(2, 2), PrimeFactors.ofNumber(4));
  }

  @Test
  void return_prime_factors_for_number_20() {
    Assertions.assertEquals(List.of(2, 2, 5), PrimeFactors.ofNumber(20));
  }

  @Test
  void return_prime_factors_for_number_60() {
    Assertions.assertEquals(List.of(2, 2, 3, 5), PrimeFactors.ofNumber(60));
  }
}
