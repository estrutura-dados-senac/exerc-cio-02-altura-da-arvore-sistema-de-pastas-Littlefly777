import java.util.ArrayList;

public class Ex05PreOrdem {
    static class Node {
        String etapa;
        Node left, right;

        Node(String etapa) {
            this.etapa = etapa;
        }
    }

    public static void preOrdem(Node atual, ArrayList<String> lista) {

        if (atual == null) {
            return;
        }

        lista.add(atual.etapa);

        preOrdem(atual.left, lista);
        preOrdem(atual.right, lista);
    }

    public static void main(String[] args) {

        Node raiz = new Node("Deploy");

        raiz.left = new Node("Backend");
        raiz.right = new Node("Frontend");

        raiz.left.left = new Node("Banco");

        ArrayList<String> lista = new ArrayList<>();

        preOrdem(raiz, lista);

        System.out.println(lista);
    }

}

//ver se deu certo
