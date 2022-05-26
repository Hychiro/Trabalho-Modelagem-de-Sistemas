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

    private int matriculadoAluno;
    private String curso;
    private int copiasRestantes = 0;

    public Aluno(String nome, String senha, char sexo, String data, int matriculadoAluno, String curso, int copiasRestantes) {
        super(nome, senha, sexo, data);
        this.curso = curso;
        this.copiasRestantes = copiasRestantes;
        this.matriculadoAluno =  matriculadoAluno;
        
    }

    /**
     * @return the matriculadoAluno
     */
    public int getMatriculadoAluno() {
        return matriculadoAluno;
    }

    /**
     * @param matriculadoAluno the matriculadoAluno to set
     */
    public void setMatriculadoAluno(int matriculadoAluno) {
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

}
