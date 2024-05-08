package ejemplo.spring.miapp.dto.operar;

public class OperarRequestDto {

  public float getNumero1() {
    return numero1;
  }

  public float getNumero2() {
    return numero2;
  }

  public String getOperando() {
    return operando;
  }

  public void setNumero1(float numero1) {
    this.numero1 = numero1;
  }

  public void setNumero2(float numero2) {
    this.numero2 = numero2;
  }

  public void setOperando(String operando) {
    this.operando = operando;
  }

  private float numero1;
  private float numero2;
  private String operando;
}
