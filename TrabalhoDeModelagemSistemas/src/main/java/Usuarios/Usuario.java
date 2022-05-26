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
    private String sexo;
    private String data;
    private int idade;
    
    Usuario(String nome, String senha, String sexo, String data){
        this.nome = nome;
        this.senha = senha;
        this.sexo = sexo;
        this.data = data;
        this.idade = calculoIdade(this.data);
    }
    
    public int getTempo(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(data, dateTimeFormatter);
        return (int) ChronoUnit.DAYS.between( LocalDate.now(); , this.dataVencimento);
    }
    
    protected void DataDeNascimento(){
        Scanner teclado = new Scanner(System.in);
        String novaData = teclado.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = LocalDate.parse(novaData, dateTimeFormatter);
              
    }
    public float calculoPagamento(int copiasGratuitas, int numCopias){
        float valor ;
        int quantidade = copiasGratuitas - numCopias;
        if (quantidade>=0){
            valor = 0;
            //atualiza num de copias gratuitas pra quantidade
        }else{
            valor = (float) (quantidade * 0.25);
            //atualiza num de copias gratuitas pra 0;
        }
        return valor;
    }
    public int calculoIdade(int data[]){
        
        return 0;
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
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the data
     */
    public int[] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int[] data) {
        this.data = data;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
}
