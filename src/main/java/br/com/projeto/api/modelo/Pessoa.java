package br.com.projeto.api.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Espifica a criacao da tabela do BD, nesse caso a tabela sera pessoa

@Table(name = "pessoas") //Usamos essa anotacao apenas quando queremos que o nome da tabela seja diferente do nome da classe

public class Pessoa {
    
    @Id //Cria a chave primaria nesse caso sera o atributo abaixo codigo
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Vai gerar valores de maneira crescente para a chave primaria iniciando no valor 1
    private int codigo; //Responsavel pela chave primaria
    private String nome;
    private int idade;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
