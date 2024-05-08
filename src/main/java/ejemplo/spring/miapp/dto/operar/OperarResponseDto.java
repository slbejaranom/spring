package ejemplo.spring.miapp.dto.operar;

public class OperarResponseDto {

  public float getResultado() {
    return resultado;
  }

  public void setResultado(float resultado) {
    this.resultado = resultado;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  private float resultado;
  private String mensaje;
}
