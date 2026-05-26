public class Ex04BuscaEmABB {
    static class Node {
        int codigo;
        Node left, right;

        Node(int codigo) {
            this.codigo = codigo;
        }
    }

    
    public static Node inserir(Node raiz, int codigo) {

        if (raiz == null) {
            return new Node(codigo);
        }

        if (codigo < raiz.codigo) {
            raiz.left = inserir(raiz.left, codigo);
        } else {
            raiz.right = inserir(raiz.right, codigo);
        }

        return raiz;
    }

    
    public static boolean buscar(Node raiz, int codigo) {

        Node atual = raiz;

        while (atual != null) {

            if (codigo == atual.codigo) {
                return true;
            }

            if (codigo < atual.codigo) {
                atual = atual.left;
            } else {
                atual = atual.right;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node raiz = null;

        raiz = inserir(raiz, 50);
        raiz = inserir(raiz, 30);
        raiz = inserir(raiz, 70);
        raiz = inserir(raiz, 20);
        raiz = inserir(raiz, 40);

        System.out.println(buscar(raiz, 40)); // true
        System.out.println(buscar(raiz, 99)); // false
    }

}
