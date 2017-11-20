/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplinas: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 *
 * Página 160 Thomas H. Cormen 3a Ed 
 *
 * Pilha/Stack
 *
 * Atenção:
 * Vetor em java inicia em 0, os algoritmos consideram início em 1.
 * A subtração de -1 ocorre somente no local de acesso ao vetor ou matriz 
 * para manter a compatibilidade entre os algoritmos.
 *
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    //Tamanho máximo da pilha.
    static final int TAMANHOPILHA=100;    
    //Vetor que armazena os dados da pilha
    static int[] S;
    //Quantidade de elementos da pilha
    static int topo;

    /**
     * Inicializa o vetor e dados da pilha
     */
    public static void inicializacaoPilha() {        
        S = new int[TAMANHOPILHA];
        topo = 0;
    }

    /**
     * PilhaVazia ou Stack-Empty.
     *
     * Verifica se a pilha está vazia.
     *
     * @return Um valor lógico com a situação da pilha.
     */
    public static boolean pilhaVazia() {
        if (topo == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Empilhar ou Push.
     * 
     * Insere um novo elemento no topo da pilha.
     *
     * @param x valor a sem empilhado
     */
    public static void empilhar(int x) {
        topo = topo + 1;
        S[topo - 1] = x;
    }

    /**
     * Desempilhar ou Pop.
     *
     * Retorna e remove o elemento do topo da pilha.
     *
     * @return O elemento do topo da pilha.
     */
    public static int desempilhar() {
        if (pilhaVazia()) {
            System.out.println("Pilha Vazia");
        } else {
            topo = topo - 1;
        }
        return S[topo+1-1];
    }

    public static void main(String args[]) {
        
        //Inicializa o vetor utilizado na pilha    
        inicializacaoPilha();

        //Vetor de Dados          
        int A[] = {50, 70, 60, 90, 10, 30, 20, 40};

        System.out.println(">>> Pilha/Stack <<<");

        for (int i = 1; i <= A.length; i++) {
            System.out.println("Empilhando:"+A[i-1]);
            empilhar(A[i-1]);
        }

        System.out.println("\nDados na pilha");
        for (int i = 1; i <= topo; i++) {
            System.out.println((i) + "=>" + S[i-1]);
        }
        
        System.out.println("\nDesempilhando:"+desempilhar());
        System.out.println("Dados na pilha");
        for (int i = 1; i <= topo; i++) {
            System.out.println(i + "=>" + S[i-1]);
        }
        
        System.out.println("\nDesempilhando:"+desempilhar());        
        System.out.println("Dados na pilha");
        for (int i = 1; i <= topo; i++) {
            System.out.println(i + "=>" + S[i-1]);
        }        
    }
}
