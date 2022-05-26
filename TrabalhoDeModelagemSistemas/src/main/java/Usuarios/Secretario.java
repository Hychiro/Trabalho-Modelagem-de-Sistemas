/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author Usuario
 */
public class Secretario extends Funcionario {
    private String horarioDeTrabalho;

    public Secretario(String nome, String senha, String sexo, String data, String matriculaFuncionario, String unidade, String departamento, String horarioDeTrabalho) {
        super(nome, senha, sexo, data, matriculaFuncionario, unidade, departamento);
        this.horarioDeTrabalho = horarioDeTrabalho;
    }

    /**
     * @return the horarioDeTrabalho
     */
    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }

    /**
     * @param horarioDeTrabalho the horarioDeTrabalho to set
     */
    public void setHorarioDeTrabalho(String horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }
    
}
