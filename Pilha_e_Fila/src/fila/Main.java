package fila;

public class Main {
	 public static void main(String[] args) {
	        FilaDinamica<Integer> fila = new FilaDinamica<>();

	        fila.enqueue(1);
	        fila.enqueue(2);
	        fila.enqueue(3);

	        System.out.println("Tamanho da Fila: " + fila.size());
	        System.out.println("Fila está vazia? " + fila.isEmpty());

	        System.out.print("Dados da Fila: ");
	        fila.imprimir();

	        System.out.println("Dado removido: " + fila.dequeue());

	        System.out.println("Tamanho da Fila: " + fila.size());
	        System.out.print("Dados da Fila: ");
	        fila.imprimir();
	    }
}
