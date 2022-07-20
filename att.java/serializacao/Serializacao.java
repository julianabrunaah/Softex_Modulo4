
package com.mycompany.serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class Serializacao {
    
    public static void main(String[] args) throws IOException { 
        Aluno aluno = new Aluno ("Juliana", "A");
        
        try (ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("serializacao/aluno.ser"))){
        objectOutput.writeObject(aluno);
        objectOutput.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
    
}


