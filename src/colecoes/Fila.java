package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Tanto add quanto offer adicionam elementos na fila
        fila.add("Ana"); //add Retorna erro se não conseguir adicionar na fila
        fila.offer("Bia"); //offer Retorna false se não conseguir adicionar na fila
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //Tanto peek quanto element obtem o próximo elemento da fila (sem removê-lo)
        System.out.println(fila.peek()); //peek retorna null quando a fila está vazia
        System.out.println(fila.peek());
        System.out.println(fila.element()); // element retorna erro quando a fila está vazia
        System.out.println(fila.element());

        //Outros métodos:
        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains();
        //fila.poll(); Obtem o próximo elmento da fila e o remove. Retorna null se a fila estiver vazia
        //fila.remove(); Obtem o próximo elmento da fila e o remove. Retorna erro se a fila estiver vazia

    }
}