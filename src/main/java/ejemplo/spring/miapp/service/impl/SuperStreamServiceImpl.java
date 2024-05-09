package ejemplo.spring.miapp.service.impl;

import ejemplo.spring.miapp.service.SuperStreamService;

public class SuperStreamServiceImpl implements SuperStreamService {

  @Override
  public Integer elevarAlCuadrado(Integer numero, boolean debeElevarPares) {
    if ((debeElevarPares && numero % 2 == 0) || (!debeElevarPares && numero % 2 == 1)) {
      return numero * numero;
    }
    return numero;
  }
}
