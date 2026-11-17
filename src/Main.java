// Versão em python
//import random
//def gerar_lista(tamanho):
//    lista = []
//    for i in range(tamanho):
//        lista.append(random.randint(1, 100))
//    return lista
//
//tamanho = int(input("Informe o tamanho da lista: "))
//numeros = gerar_lista(tamanho)
//
//for n in numeros:
//    print("Número:", n)
//    if n % 3 == 0:
//        print("  É múltiplo de 3")
//    if n % 2 == 0:
//        print("  É par")
//    else:
//        print("  É ímpar")


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer> gerarLista(int tamanho) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            lista.add(random.nextInt(100) + 1);
        }
        return lista;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho da lista: ");
        int tamanho = scanner.nextInt();

        ArrayList<Integer> numeros = gerarLista(tamanho);

        for (int n : numeros) {
            System.out.println("Número: " + n);
            if (n % 3 == 0) {
                System.out.println("  É múltiplo de 3");
            }
            if (n % 2 == 0) {
                System.out.println("  É par");
            } else {
                System.out.println("  É ímpar");
            }
        }
    }
}