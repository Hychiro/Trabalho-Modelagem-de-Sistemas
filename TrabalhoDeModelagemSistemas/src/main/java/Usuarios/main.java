/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ice
 */
public class main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Fulana", "123", 'f', "20/20/2002", 111111111, "Ciências da Computação");
        Set<Disciplina> disciplinas = new HashSet<Disciplina>();
        disciplinas.add(new Disciplina("Fisica 1"));
        disciplinas.add(new Disciplina("Fisica 2"));
        disciplinas.add(new Disciplina("Fisica 3"));

        Professor professor = new Professor("Fulanu", "123", 'f', "20/20/1980", 22222222, "ICE", "Departamento de Física", disciplinas, "00:00");

        Secretario secretario = new Secretario("Fulano", "123", 'f', "20/20/1980", 333333333, "ICE", "Departamento de Física", "00:00");

        ItemImpressao itemImpressao = new ItemImpressao("Arquivo1", 3);
        ItemImpressao itemImpressao2 = new ItemImpressao("Arquivo2", 50);
        List<ItemImpressao> listItem = new ArrayList<>();
        listItem.add(itemImpressao);
        listItem.add(itemImpressao2);
        float valor = 0;
        
        Pagamento pagamento =  new Pagamento();
        PedidoImpressao pedidoImpressao = new PedidoImpressao();
        pedidoImpressao.registraPedido(1, "10/02/2022", "preto e branco", "impressora 1", "pendente", "15/02/2022", secretario, listItem, aluno, null);        
        valor = pagamento.calculaValor(pedidoImpressao);
        pagamento.setFormaPagamento("pix");
        
        
        
        Pagamento pagamento2 =  new Pagamento();
        PedidoImpressao pedidoImpressao2 = new PedidoImpressao();
        pedidoImpressao2.registraPedido(2, "10/02/2022", "preto e branco", "impressora 1", "pendente", "15/02/2022", secretario, listItem, null, professor);
        valor = pagamento2.calculaValor(pedidoImpressao2);
        pagamento2.setFormaPagamento("boleto");
        
        
        
        pedidoImpressao.imprimePedido(pagamento);
        System.out.println("");
        pedidoImpressao2.imprimePedido(pagamento2);
    }

}
