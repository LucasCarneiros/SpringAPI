package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Pessoa;

@RestController //Para avisar que essa clase é responsavel pelo controle
public class Controle {
    
    //Criando a rota

    //Cada metodo é uma rota e devemos especificar se queremos cadastrar, alterar ou excluir

    //Criando a rota com a notação @GetMapping()

    @GetMapping("")
    public String mensagem(){
        return "Hello World!";
    }

    @GetMapping("/rotaBoasVindas/{nome}") // {nome} pega a informacao da url e passa como uma variavel
    public String boasVindas(@PathVariable String nome){   // temos que passar essa variavel dentro do metodo usando @PathVariable
        return "Boas Vindas "+ nome;
    }

    //Vinculando a classe pessoa com a classe controle

    //Criando uma rota que retorne um nome e uma idade que sao caracteristicas presentes no Modelo pessoa, então ele retorna o modelo

    @PostMapping("/pessoa") //Usamos @PostMapping porque o @GetMapping nao tem suporte ao @RequestBody
    public Pessoa pessoa(@RequestBody Pessoa p){ 
        return p;
    }

}
