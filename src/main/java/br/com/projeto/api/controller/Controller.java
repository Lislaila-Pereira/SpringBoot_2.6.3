package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //classe responsavel pelas rotas
public class Controller {
    //cada método é uma rota e tem q especificar o caminho

    @GetMapping("")
    public String mensagem(){
        return "Hello World!";
    }
}

/*@GetMapping(""): Esta é uma anotação aplicada ao método mensagem(). Ela mapeia esse método para responder a solicitações HTTP GET na raiz do aplicativo. O parâmetro vazio "" indica que este método deve responder a solicitações na raiz do aplicativo, ou seja, quando você acessa a URL principal do aplicativo, ele executará o método mensagem(). */