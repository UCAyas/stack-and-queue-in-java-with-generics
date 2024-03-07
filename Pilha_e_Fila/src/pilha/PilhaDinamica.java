package pilha;

import java.util.EmptyStackException;

public class PilhaDinamica<T> {

    private Nodo<T> topo;
    private int tamanho;

    public PilhaDinamica() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(T dado) {
        Nodo<T> novoNodo = new Nodo<>(dado);
        novoNodo.setProximo(topo);
        topo = novoNodo;
        tamanho++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T dadoRemovido = topo.getDado();
        topo = topo.getProximo();
        tamanho--;
        return dadoRemovido;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void imprimir() {
        Nodo<T> atual = topo;
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
   }
}
