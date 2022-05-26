/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nome;
    private String senha;
    private char sexo;
    private String data;
    
    Usuario(String nome, String senha, char sexo, String data){
        this.nome = nome;
        this.senha = senha;
        this.sexo = sexo;
        this.data = data;
    }
    
    
    
    public float calculoPagamento(int copiasGratuitas, int numCopias){
        float valor ;
        int quantidade = copiasGratuitas - numCopias;
        if (quantidade>=0){
            valor = 0;
            //atualiza num de copias gratuitas pra quantidade
        }else{
            valor = (float) (-quantidade * 0.25);
            //atualiza num de copias gratuitas pra 0;
        }
        return valor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
   
    
}
