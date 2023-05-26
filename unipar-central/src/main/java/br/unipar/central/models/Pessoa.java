/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.models;

import br.unipar.central.enums.TipoPessoaEnum;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 00235565
 */
public class Pessoa {
    
    private int id;
    private String nome;
    private String documento;
    private TipoPessoaEnum tipo;
    private Date dataNascimento;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Telefone> telefones;
    
    public Pessoa(){ 
    }

    public Pessoa(int id, String nome, String documento, TipoPessoaEnum tipo, Date dataNascimento, ArrayList<Endereco> enderecos, ArrayList<Telefone> telefones) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.tipo = tipo;
        this.dataNascimento = dataNascimento;
        this.enderecos = enderecos;
        this.telefones = telefones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoPessoaEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoaEnum tipo) {
        this.tipo = tipo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", documento=" + documento + ", tipo=" + tipo + ", dataNascimento=" + dataNascimento + ", enderecos=" + enderecos + ", telefones=" + telefones + '}';
    }
    
}
