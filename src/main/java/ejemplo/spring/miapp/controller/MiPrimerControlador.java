package ejemplo.spring.miapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplo")
public class MiPrimerControlador {

  @GetMapping("/hola-mundo")
  public String handleGetHolaMundo() {
    return "Hola mundo";
  }
}