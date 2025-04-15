package br.senai.pokedex.api_pokemon.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemon")
public class Pokedex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(columnDefinition = "TEXT")
    private String descricao;
    @Column(nullable = false)
    private String imagemUrl;
    @Column(nullable = false)
    private String tipo;
    private String categoria;
    private String areaHabitada;
    private Double altura;
    private Double peso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAreaHabitada() {
        return areaHabitada;
    }

    public void setAreaHabitada(String areaHabitada) {
        this.areaHabitada = areaHabitada;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
