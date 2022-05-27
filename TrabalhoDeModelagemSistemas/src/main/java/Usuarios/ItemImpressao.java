/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author ice
 */
public class ItemImpressao {
    
    private String arquivo;
    private int numCopias;

    public ItemImpressao(String arquivo, int numCopias) {
        this.arquivo = arquivo;
        this.numCopias = numCopias;
    }
    
    /**
     * @return the arquivo
     */
    public String getArquivo() {
        return arquivo;
    }

    /**
     * @param arquivo the arquivo to set
     */
    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    /**
     * @return the numCopias
     */
    public int getNumCopias() {
        return numCopias;
    }

    /**
     * @param numCopias the numCopias to set
     */
    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
}
