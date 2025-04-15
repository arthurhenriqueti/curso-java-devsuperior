package entidades;

import enums.StatusTarefa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarefa {
    private Integer id;
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private StatusTarefa status;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Tarefa(Integer id, String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, StatusTarefa status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataLimite = dataLimite;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                " | Título: '" + titulo + '\'' +
                " | Descrição: '" + descricao + '\'' +
                " | Data de criação: " + dataCriacao.format(fmt) +
                " | Data limite: " + dataLimite.format(fmt) +
                " | Status: " + status;
    }
}
