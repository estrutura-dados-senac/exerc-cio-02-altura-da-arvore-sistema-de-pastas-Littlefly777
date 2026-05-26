public class Ex02ProfundidadeDoNo {
    static class Node {
        int id;
        Node left, right;

        Node(int id) {
            this.id = id;
        }
    }

    public static int profundidade(Node atual, int alvo, int nivel) {

        if (atual == null) {
            return -1;
        }

        if (atual.id == alvo) {
            return nivel;
        }

        int esquerda = profundidade(atual.left, alvo, nivel + 1);

        if (esquerda != -1) {
            return esquerda;
        }

        return profundidade(atual.right, alvo, nivel + 1);
    }

    public static void main(String[] args) {

        Node raiz = new Node(10);

        raiz.left = new Node(5);
        raiz.right = new Node(20);

        raiz.left.left = new Node(3);
        raiz.left.right = new Node(7);

        System.out.println(profundidade(raiz, 10, 0)); 
        System.out.println(profundidade(raiz, 7, 0)); 
        System.out.println(profundidade(raiz, 99, 0)); 
    }
}
