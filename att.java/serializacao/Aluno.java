
package com.mycompany.serializacao;

import java.io.Serializable;


public class Aluno implements Serializable {
    private String nome;
    private String nota;
    
    public Aluno(){}
    
    public Aluno ( String nome, String password){
        this.nome = nome;
        this.nota = nota;
    }

}
