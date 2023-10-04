package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //classe responsavel pelas rotas
public class Controller {
    //cada método é uma rota e tem q especificar o caminho

    @GetMapping("")
    public String mensagem(){
        return "Hello World!";
    }

    @GetMapping("/principal") //coloca o nome da rota
    public String msgBoasVindas(){
        return "Seja bem vindo(a)!!";
    }

    @GetMapping("/principal/{nome}")//o que digitar na url aparece na tela
    public String msgBoasVindas(@PathVariable String nome){
        return "Seja bem vindo(a) " + nome + "!!";
    }

}