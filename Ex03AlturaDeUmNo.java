public class Ex03AlturaDeUmNo {
    static class Node {
        int id;
        Node left, right;

        Node(int id) {
            this.id = id;
        }
    }

    
    public static Node buscarNo(Node raiz, int alvo) {

        if (raiz == null) {
            return null;
        }

        if (raiz.id == alvo) {
            return raiz;
        }

        Node esquerda = buscarNo(raiz.left, alvo);

        if (esquerda != null) {
            return esquerda;
        }

        return buscarNo(raiz.right, alvo);
    }

    
    public static int alturaSubarvore(Node raiz) {

        if (raiz == null) {
            return 0;
        }

        int esquerda = alturaSubarvore(raiz.left);
        int direita = alturaSubarvore(raiz.right);

        return 1 + Math.max(esquerda, direita);
    }

    
    public static int alturaDoNo(Node raiz, int alvo) {

        Node noAlvo = buscarNo(raiz, alvo);

        if (noAlvo == null) {
            return -1;
        }

        return alturaSubarvore(noAlvo);
    }

    public static void main(String[] args) {

        Node raiz = new Node(10);

        raiz.left = new Node(5);
        raiz.right = new Node(20);

        raiz.left.left = new Node(3);
        raiz.left.right = new Node(7);

        System.out.println(alturaDoNo(raiz, 10)); 
        System.out.println(alturaDoNo(raiz, 5));  
        System.out.println(alturaDoNo(raiz, 99)); 
    }

}
