/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Professor extends Funcionario {
    
    private Set<String> disciplinas;
    private String horarioDeAtendimento;
    private int numeroCopiasGratuitas;
    
    public Professor(String nome, String senha, String sexo, String data, String matriculaFuncionario, String unidade, String departamento) {
        super(nome, senha, sexo, data, matriculaFuncionario, unidade, departamento);
    }

    /**
     * @return the disciplinas
     */
    public Set<String> getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(Set<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    /**
     * @return the horarioDeAtendimento
     */
    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    /**
     * @param horarioDeAtendimento the horarioDeAtendimento to set
     */
    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    /**
     * @return the numeroCopiasGratuitas
     */
    public int getNumeroCopiasGratuitas() {
        return numeroCopiasGratuitas;
    }

    /**
     * @param numeroCopiasGratuitas the numeroCopiasGratuitas to set
     */
    public void setNumeroCopiasGratuitas(int numeroCopiasGratuitas) {
        this.numeroCopiasGratuitas = numeroCopiasGratuitas;
    }
    
}
