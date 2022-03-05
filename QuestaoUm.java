import java.util.Arrays;

class QuestaoUm {
    public static void main(String[] args) {

        float vetor[] = {9, 2, 1, 4, 6};

        // Ordenando vetor com "Arrays.sort"
        Arrays.sort(vetor);

        // Verificando a quantidade
        int quantidadeNumeros = vetor.length;

        float mediana;

        if(Par(quantidadeNumeros) == true)
        {
            int meio = (quantidadeNumeros)/2;

            mediana = (vetor[meio] + vetor[meio-1])/2;
        }
        else{          
            int meio = (quantidadeNumeros - 1)/2;

            mediana = vetor[meio];
        }

        System.out.println("Mediana = "+mediana);
    }

    public static boolean Par(int numero) {
        if (numero % 2 == 0)
            return true;
        return false;
    }

}