/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.List;

/**
 *
 * @author thiago
 */
public class Empresa extends Usuario{
    
    public Empresa(String cnpj, String nome, String email, String telefone, String senha, Endereco endereco) {
        super(nome, email, telefone, senha, endereco);
        this.cnpj = cnpj;
    }
    
    private String cnpj;
    private List<Integer> vagas;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Integer> getVagas() {
        return vagas;
    }

    public void setVagas(List<Integer> vagas) {
        this.vagas = vagas;
    }
    
    
}
