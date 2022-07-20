
package com.mycompany.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class deserializacao {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException { 
        Aluno aluno = new Aluno ("Juliana", "A");
        
        try (ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("serializacao/aluno.ser"))){
           Aluno aluno = (Aluno) objectInput.readObject();
           objectInput.close();
        } catch (IOException  | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
