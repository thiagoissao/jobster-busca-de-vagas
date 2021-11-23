/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author thiago
 */
public class Vaga {

    public Vaga(String descricao, String requisitos, String faixaSalarial) {
        this.descricao = descricao;
        this.requisitos = requisitos;
        this.faixaSalarial = faixaSalarial;
    }
    
    private String descricao;
    private String requisitos;
    private String desejaveis;
    private String faixaSalarial;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getDesejaveis() {
        return desejaveis;
    }

    public void setDesejaveis(String desejaveis) {
        this.desejaveis = desejaveis;
    }

    public String getFaixaSalarial() {
        return faixaSalarial;
    }

    public void setFaixaSalarial(String faixaSalarial) {
        this.faixaSalarial = faixaSalarial;
    }
    
    
}
