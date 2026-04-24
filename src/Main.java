import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PilhaAção pilha = new PilhaAção(3);
        int menu = 0;

        while (menu != 2) {
            System.out.println("\n======= MENU PRINCIPAL =======");
            System.out.println("1. Gerenciar Pilha (Ações)");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            menu = sc.nextInt();

            if (menu == 1) {
                menuPilha(sc, pilha);
            }
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }

    private static void menuPilha(Scanner sc, PilhaAção p) {
        int op = 0;

        while (op != 5) {
            System.out.println("\n--- SUBMENU PILHA (PRODUTOS) ---");
            System.out.println("1. Adicionar ação");
            System.out.println("2. Remover ação");
            System.out.println("3. Ver Topo");
            System.out.println("4. Exibir Todos");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.print("Ação: ");
                String nome = sc.next();
                p.push(new Ação(nome));

            } else if (op == 2) {
                Ação removido = p.pop();
                if (removido != null) {
                    System.out.println("Removido: " + removido);
                } else {
                    System.out.println("Pilha vazia!");
                }

            } else if (op == 3) {
                Ação topo = p.peek();
                if (topo != null) {
                    System.out.println("No topo está: " + topo);
                } else {
                    System.out.println("Pilha vazia!");
                }

            } else if (op == 4) {
                p.display();
            }
        }
    }
}