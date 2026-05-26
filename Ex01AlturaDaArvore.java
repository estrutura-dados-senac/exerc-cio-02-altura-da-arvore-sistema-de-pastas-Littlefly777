public class Ex01AlturaDaArvore {
static class Node {
        String nome;
        Node left;
        Node right;

        Node(String nome) {
            this.nome = nome;
        }
    }

    public static int profundidade(Node raiz, String alvo) {

        if (alvo == null) {
            return -1;
        }

        return auxiliar(raiz, alvo, 0);
    }

    private static int auxiliar(Node atual, String alvo, int nivel) {

        if (atual == null) {
            return -1;
        }

        if (alvo.equals(atual.nome)) {
            return nivel;
        }

        int resultadoEsquerda =
                auxiliar(atual.left, alvo, nivel + 1);

        if (resultadoEsquerda != -1) {
            return resultadoEsquerda;
        }

        return auxiliar(atual.right, alvo, nivel + 1);
    }
}
