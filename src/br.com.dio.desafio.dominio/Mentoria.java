package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria{
    private String titulo;
    private String descrição;
    private LocalDate data;

    public Mentoria() {
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descrição='" + descrição + '\'' +
                ", data=" + data +
                '}';
    }
}