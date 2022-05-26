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
public class Funcionario extends Usuario {

    private String matriculaFuncionario;
    private String unidade;
    private String departamento;

    public Funcionario(String nome, String senha, String sexo, String data, String matriculaFuncionario, String unidade, String departamento) {
        super(nome, senha, sexo, data);
        this.matriculaFuncionario = matriculaFuncionario;
        this.unidade =  unidade;
        this.departamento = departamento;
    }

    /**
     * @return the matriculaFuncionario
     */
    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    /**
     * @param matriculaFuncionario the matriculaFuncionario to set
     */
    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    /**
     * @return the unidade
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
