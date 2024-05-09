package ejemplo.spring.miapp.dto.superstream;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class SuperStreamResponseDto {

  public List<Integer> getNumeros() {
    return numeros;
  }

  public void setNumeros(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumerosParesAlCuadrado() {
    return numerosParesAlCuadrado;
  }

  public void setNumerosParesAlCuadrado(List<Integer> numerosParesAlCuadrado) {
    this.numerosParesAlCuadrado = numerosParesAlCuadrado;
  }

  public List<Integer> getNumerosImparesAlCuadrado() {
    return numerosImparesAlCuadrado;
  }

  public void setNumerosImparesAlCuadrado(List<Integer> numerosImparesAlCuadrado) {
    this.numerosImparesAlCuadrado = numerosImparesAlCuadrado;
  }

  List<Integer> numeros;
  @JsonProperty("paresCuadrados")
  List<Integer> numerosParesAlCuadrado;
  @JsonProperty("imparesCuadrados")
  List<Integer> numerosImparesAlCuadrado;
}
