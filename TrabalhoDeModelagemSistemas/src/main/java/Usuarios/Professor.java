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
    
    private Set<Disciplina> disciplinas;
    private String horarioDeAtendimento;
    private int numeroCopiasGratuitas = 200;
    
    public Professor(String nome, String senha, char sexo, String data, int matriculaFuncionario, String unidade, String departamento,Set<Disciplina> disciplinas, String horarioDeAtendimento) {
        super(nome, senha, sexo, data, matriculaFuncionario, unidade, departamento);
        this.disciplinas = disciplinas;
        this.horarioDeAtendimento = horarioDeAtendimento;
        
    }

    
    public void adicionaDisciplina (Disciplina disciplina){
        getDisciplinas().add(disciplina);
    }
    
    /**
     * @return the disciplinas
     */
    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(Set<Disciplina> disciplinas) {
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
