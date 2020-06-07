package com.example.comercioemrede.model;

import android.provider.ContactsContract;

import com.example.comercioemrede.helper.ConfiguracaoFirebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;

public class Usuario {

    private String cod_usu;
    private String nome;
    private String email;
    private String senha;
    private String telefone;


    public Usuario() {
    }


    public Usuario(String cod_usu, String nome, String email, String senha, String telefone){
            this.cod_usu =cod_usu;
            this.nome=nome;
            this.senha=senha;
            this.email=email;
            this.telefone=telefone;

}

    @Override
    public String toString() {
        return "Usuario{" +
                "cod_usu=" + cod_usu +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public String getCod_usu() {
        return cod_usu;
    }

    public void setCod_usu(String cod_usu) {
        this.cod_usu = cod_usu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Exclude
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}