package fila;

import java.util.EmptyStackException;

public class FilaDinamica<T> {

    private Nodo<T> frente;
    private Nodo<T> tras;
    private int tamanho;

    // Construtor
    public FilaDinamica() {
        this.frente = null;
        this.tras = null;
        this.tamanho = 0;
    }

    // Método para inserir dado na Fila
    public void enqueue(T dado) {
        Nodo<T> novoNodo = new Nodo<>(dado);
        if (isEmpty()) {
            frente = novoNodo;
        } else {
            tras.setProximo(novoNodo);
        }
        tras = novoNodo;
        tamanho++;
    }

    // Método para remover dado na Fila
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T dadoRemovido = frente.getDado();
        frente = frente.getProximo();
        tamanho--;
        if (isEmpty()) {
            tras = null;
        }
        return dadoRemovido;
    }

    // Método para retornar o tamanho da Fila
    public int size() {
        return tamanho;
    }

    // Método para verificar se a Fila está vazia
    public boolean isEmpty() {
        return frente == null;
    }

    // Método para imprimir os dados da Fila
    public void imprimir() {
        Nodo<T> atual = frente;
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
