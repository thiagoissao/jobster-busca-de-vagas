/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author thiago
 */
public class FichaTecnica {
    public FichaTecnica(String profissao, String qualificacoes) {
        this.profissao = profissao;
        this.qualificacoes = qualificacoes;
    }
    
    private String profissao;
    private String qualificacoes;
    private String aspiracoes;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getQualificacoes() {
        return qualificacoes;
    }

    public void setQualificacoes(String qualificacoes) {
        this.qualificacoes = qualificacoes;
    }

    public String getAspiracoes() {
        return aspiracoes;
    }

    public void setAspiracoes(String aspiracoes) {
        this.aspiracoes = aspiracoes;
    }

    
}
