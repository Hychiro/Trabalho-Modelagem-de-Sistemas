/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import java.util.List;

/**
 *
 * @author ice
 */
public class PedidoImpressao {

    private int NumeroPedido;
    private String DataPedido;
    private String CorImpressao;
    private String Impressora;
    private String Status;
    private String DataEntrega;
    private List<ItemImpressao> itensDeImpressao;
    private Secretario secretario;
    private Aluno aluno;
    private Professor professor;

    public void registraPedido(int NumeroPedido, String DataPedido, String CorImpressao, String Impressora, String Status, String DataEntrega, Secretario secretario, List<ItemImpressao> itensDeImpressaos, Aluno aluno, Professor professor) {
        this.NumeroPedido = NumeroPedido;
        this.DataPedido = DataPedido;
        this.CorImpressao = CorImpressao;
        this.Impressora = Impressora;
        this.Status = Status;
        this.DataEntrega = DataEntrega;
        this.secretario = secretario;
        this.itensDeImpressao = itensDeImpressaos;
        this.aluno = aluno;
        this.professor = professor;

    }

    public void imprimePedido(Pagamento pagamento) {
        if (this.aluno == null) {
            System.out.println("Nome do solicitante " + this.professor.getNome());
            System.out.println("Matricula do solicitante " + this.professor.getMatriculaFuncionario());

        } else {
            System.out.println("Nome do solicitante " + this.aluno.getNome());
            System.out.println("Matricula do solicitante " + this.aluno.getMatriculadoAluno());

        }

        System.out.println("Nome do secretario " + this.secretario.getNome());
        System.out.println("Matricula do secretario " + this.secretario.getMatriculaFuncionario());

        System.out.println("Numero do Pedido " + NumeroPedido);
        System.out.println("DataPedido " + DataPedido);
        System.out.println("Cor da Impressao " + CorImpressao);
        System.out.println("Impressora " + Impressora);
        System.out.println("Status " + Status);
        System.out.println("Forma de Pagamento " + pagamento.getFormaPagamento());
        System.out.println("Valor " + pagamento.getValor());

    }

    public void adicionarItem(ItemImpressao itemImpressao) {

        this.itensDeImpressao.add(itemImpressao);

    }

    public int getNumeroPedido() {
        return NumeroPedido;
    }

    public void setNumeroPedido(int NumeroPedido) {
        this.NumeroPedido = NumeroPedido;
    }

    public String getDataPedido() {
        return DataPedido;
    }

    public void setDataPedido(String DataPedido) {
        this.DataPedido = DataPedido;
    }

    public String getCorImpressao() {
        return CorImpressao;
    }

    public void setCorImpressao(String CorImpressao) {
        this.CorImpressao = CorImpressao;
    }

    public String getImpressora() {
        return Impressora;
    }

    public void setImpressora(String Impressora) {
        this.Impressora = Impressora;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDataEntrega() {
        return DataEntrega;
    }

    public void setDataEntrega(String DataEntrega) {
        this.DataEntrega = DataEntrega;
    }

    public List<ItemImpressao> getItensDeImpressao() {
        return itensDeImpressao;
    }

    public void setItensDeImpressao(List<ItemImpressao> itensDeImpressao) {
        this.itensDeImpressao = itensDeImpressao;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
