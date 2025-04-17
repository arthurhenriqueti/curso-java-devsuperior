package entidades;

import enums.StatusTarefa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarefa extends Atividade{
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private StatusTarefa status;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Tarefa(Integer id, String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, StatusTarefa status) {
        super(id);
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataLimite = dataLimite;
        this.status = status;
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
        return "Id: " + super.getId() +
                " | Título: '" + titulo + '\'' +
                " | Descrição: '" + descricao + '\'' +
                " | Data de criação: " + dataCriacao.format(fmt) +
                " | Data limite: " + dataLimite.format(fmt) +
                " | Status: " + status;
    }
}
