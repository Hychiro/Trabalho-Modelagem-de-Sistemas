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
public class Aluno extends Usuario {
    
    public Aluno(String nome, String senha, String sexo, String data) {
        super(nome, senha, sexo, data);
    }

    /**
     * @return the matriculadoAluno
     */
    public String getMatriculadoAluno() {
        return matriculadoAluno;
    }

    /**
     * @param matriculadoAluno the matriculadoAluno to set
     */
    public void setMatriculadoAluno(String matriculadoAluno) {
        this.matriculadoAluno = matriculadoAluno;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the copiasRestantes
     */
    public int getCopiasRestantes() {
        return copiasRestantes;
    }

    /**
     * @param copiasRestantes the copiasRestantes to set
     */
    public void setCopiasRestantes(int copiasRestantes) {
        this.copiasRestantes = copiasRestantes;
    }
    
    private String matriculadoAluno;
    private String curso;
    private int copiasRestantes=0;
}
