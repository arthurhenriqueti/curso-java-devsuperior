import entidades.Tarefa;
import enums.StatusTarefa;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
            System.out.println("--------------------");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");
            System.out.println("--------------------");

            System.out.print("Opção: ");
            controle = sc.nextInt();

            switch(controle) {
                case 1:
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

                    tarefas.add(new Tarefa(id, titulo, descricao, dataCriacao, dataLimite, StatusTarefa.valueOf(status.toUpperCase())));
                    break;
                case 2:
                    for(Tarefa tarefa : tarefas) {
                        System.out.println(tarefas);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("Id: ");
                    id = sc.nextInt();

                    tarefas.removeIf(tarefa -> tarefa.getId() == id);
                    System.out.println("Lista de tarefas atualizada!");
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
}