package ejemplo.spring.miapp.service.impl;

import ejemplo.spring.miapp.service.OperacionService;

public class OperacionServiceImpl implements OperacionService {

  @Override
  public float operar(float num1, float num2, String operando) {
    switch (operando) {
      case "+":
        return num1 + num2;
      case "-":
        return num1 - num2;
      case "*":
        return num1 * num2;
      case "/":
        if(num2 == 0)
          throw new ArithmeticException();
        return num1 / num2;
      default:
        throw new IllegalArgumentException(
            "El operando no se encuentra definido, por favor vea si es +,-,* o /");
    }
  }
}
