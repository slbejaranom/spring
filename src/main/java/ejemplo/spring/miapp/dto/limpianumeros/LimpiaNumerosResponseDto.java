package ejemplo.spring.miapp.dto.limpianumeros;

import java.util.List;
import java.util.Set;

public class LimpiaNumerosResponseDto {

  public List<Integer> getNumeros() {
    return numeros;
  }

  public void setNumeros(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public Set<Integer> getNumerosSinRepetir() {
    return numerosSinRepetir;
  }

  public void setNumerosSinRepetir(Set<Integer> numerosSinRepetir) {
    this.numerosSinRepetir = numerosSinRepetir;
  }

  List<Integer> numeros;
  Set<Integer> numerosSinRepetir;
}
