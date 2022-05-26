/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author ice
 */
public class Pagamento {
    
    private float valor;
    private String frmaPagamento;

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the frmaPagamento
     */
    public String getFrmaPagamento() {
        return frmaPagamento;
    }

    /**
     * @param frmaPagamento the frmaPagamento to set
     */
    public void setFrmaPagamento(String frmaPagamento) {
        this.frmaPagamento = frmaPagamento;
    }
    
    private float calculaValor() {
        return 0;
    }
}
