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
    private String formaPagamento;

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
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the frmaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public float calculaValor(PedidoImpressao pedidoImpressao) {
        int quantidade = 0;

        for (ItemImpressao item : pedidoImpressao.getItensDeImpressao()) {

            quantidade -= item.getNumCopias();

        }

        if (pedidoImpressao.getAluno() == null) {
            quantidade += pedidoImpressao.getProfessor().getNumeroCopiasGratuitas();
        } else {
            quantidade += pedidoImpressao.getAluno().getCopiasRestantes();
        }

        if (quantidade >= 0) {
            valor = 0;
            //atualiza num de copias gratuitas pra quantidade
            if (pedidoImpressao.getAluno() == null) {
                pedidoImpressao.getProfessor().setNumeroCopiasGratuitas(quantidade);
            } else {
                pedidoImpressao.getAluno().setCopiasRestantes(quantidade);
            }
        } else {
            valor = (float) (-quantidade * 0.25);
            //atualiza num de copias gratuitas pra 0;

            if (pedidoImpressao.getAluno() == null) {
                pedidoImpressao.getProfessor().setNumeroCopiasGratuitas(0);
            } else {
                pedidoImpressao.getAluno().setCopiasRestantes(0);
            }

        }

        return valor;
    }

}
