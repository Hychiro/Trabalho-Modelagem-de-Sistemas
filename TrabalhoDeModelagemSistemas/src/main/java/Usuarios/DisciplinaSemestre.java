/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Usuarios.Professor;

/**
 *
 * @author ice
 */
public class DisciplinaSemestre {
    
    private int AnoSemestre;
    private Disciplina disciplina;
    private Professor professor;

    public DisciplinaSemestre(int AnoSemestre, Disciplina disciplina, Professor professor) {
        this.AnoSemestre = AnoSemestre;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public int getAnoSemestre() {
        return AnoSemestre;
    }

    public void setAnoSemestre(int AnoSemestre) {
        this.AnoSemestre = AnoSemestre;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
}
