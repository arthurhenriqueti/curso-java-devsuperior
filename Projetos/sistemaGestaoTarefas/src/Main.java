import entidades.Tarefa;
import enums.StatusTarefa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sistema de Gestão de Tarefas - 1.0");

        int controle = 0;
        List<Tarefa> tarefas = new ArrayList<Tarefa>();

        do{
            controle = exibirMenu();

            switch(controle) {
                case 1:
                    tarefas.add(addTarefa());
                    break;
                case 2:
                    listarTarefas(tarefas);
                    break;
                case 3:
                    atualizarTarefa(tarefas);
                    break;
                case 4:
                    removerTarefa(tarefas);
                    break;
                case 5:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Valor inválido!");
                    break;
            }
        }while(controle != 5);
    }

    public static int exibirMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Listar");
        System.out.println("3 - Atualizar");
        System.out.println("4 - Remover");
        System.out.println("5 - Sair");
        System.out.println("--------------------");

        System.out.print("Opção: ");

        return sc.nextInt();
    }

    public static Tarefa addTarefa() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Descrição: ");
        String descricao = sc.nextLine();
        LocalDate dataCriacao = LocalDate.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Data limite (dd/mm/aaaa): ");
        String dataLmt = sc.nextLine();
        LocalDate dataLimite = LocalDate.parse(dataLmt, fmt);

        System.out.print("Status: ");
        String status = sc.nextLine();

        return new Tarefa(id, titulo, descricao, dataCriacao, dataLimite, StatusTarefa.valueOf(status.toUpperCase()));
    }

    public static void listarTarefas(List<Tarefa> tarefas) {
        for(Tarefa tarefa : tarefas) {
            System.out.println(tarefas);
        }
    }

    public static void atualizarTarefa(List<Tarefa> tarefas) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        for(Tarefa tarefa : tarefas) {
            if(tarefa.getId() == id) {
                System.out.printf("Título atual: %s%n", tarefa.getTitulo());
                System.out.print("Novo título: ");
                String titulo = sc.nextLine();
                tarefa.setTitulo(titulo);

                System.out.printf("Descrição atual: %s%n", tarefa.getDescricao());
                System.out.print("Nova descrição: ");
                String descricao = sc.nextLine();
                tarefa.setDescricao(descricao);

                System.out.println("Lista de tarefas atualizada!");
            } else {
                System.out.println("ID não encontrado!");
            }
        }
    }

    public static void removerTarefa(List<Tarefa> tarefas) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Id: ");
        int id = sc.nextInt();

        tarefas.removeIf(tarefa -> tarefa.getId() == id);
        System.out.println("Lista de tarefas atualizada!");
    }
}