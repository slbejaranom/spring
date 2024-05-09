package ejemplo.spring.miapp.controller;

import ejemplo.spring.miapp.dto.limpianumeros.LimpiaNumerosRequestDto;
import ejemplo.spring.miapp.dto.limpianumeros.LimpiaNumerosResponseDto;
import ejemplo.spring.miapp.dto.operar.OperarRequestDto;
import ejemplo.spring.miapp.dto.operar.OperarResponseDto;
import ejemplo.spring.miapp.service.OperacionService;
import ejemplo.spring.miapp.service.impl.OperacionServiceImpl;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplo")
public class MiPrimerControlador {

  private OperacionService operacionService = new OperacionServiceImpl();

  @GetMapping("/hola-mundo")
  public String handleGetHolaMundo() {
    return "Hola mundo";
  }

  @GetMapping("/saludar")
  public String handleSaludar(@RequestParam String nombre) {
    StringBuilder stringBuilder = new StringBuilder("Hola ");
    stringBuilder.append(nombre);
    return stringBuilder.toString();
  }

  @PostMapping("/operar")
  public OperarResponseDto handleOperar(@RequestBody OperarRequestDto operarRequestDto) {
    OperarResponseDto operarResponseDto = new OperarResponseDto();
    float resultado;
    try {
      resultado = operacionService.operar(
          operarRequestDto.getNumero1(),
          operarRequestDto.getNumero2(),
          operarRequestDto.getOperando());
      operarResponseDto.setResultado(resultado);
    } catch (IllegalArgumentException ex) {
      operarResponseDto.setMensaje("Usted colocó un operando que nada qué ver!");
    } catch (ArithmeticException ex) {
      operarResponseDto.setMensaje(
          "Usted está intentando hacer una operación ilegal como dividir por 0");
    }
    return operarResponseDto;
  }

  @PostMapping("/limpia-numeros")
  public LimpiaNumerosResponseDto handleLimpiaNumeros(
      @RequestBody LimpiaNumerosRequestDto limpiaNumerosRequestDto) {
    LimpiaNumerosResponseDto limpiaNumerosResponseDto = new LimpiaNumerosResponseDto();
    limpiaNumerosResponseDto.setNumeros(limpiaNumerosRequestDto.getNumeros());
    Set<Integer> numerosSinRepetir = limpiaNumerosRequestDto
        .getNumeros()
        .stream()
        .collect(Collectors.toSet());
    limpiaNumerosResponseDto.setNumerosSinRepetir(numerosSinRepetir);
    return limpiaNumerosResponseDto;
  }
}