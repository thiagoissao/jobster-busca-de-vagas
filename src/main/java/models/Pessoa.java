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
public class Pessoa extends Usuario{
    
    public Pessoa(int cpf, String nome, String email, String telefone, String senha, Endereco endereco) {
        super(nome, email, telefone, senha, endereco);
        this.cpf = cpf;
    }
    
    private int cpf;
    private FichaTecnica fichaTecnica;
    private List<Requisicao> requisicoes;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public FichaTecnica getFichaTecnica() {
        return fichaTecnica;
    }

    public void setFichaTecnica(FichaTecnica fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }
    
    
}
