package ejemplo.spring.miapp.dto.limpianumeros;

import java.util.List;

public class LimpiaNumerosRequestDto {

  public List<Integer> getNumeros() {
    return numeros;
  }

  public void setNumeros(List<Integer> numeros) {
    this.numeros = numeros;
  }

  List<Integer> numeros;
}
