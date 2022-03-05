import java.lang.Math; // importando essa biblioteca para usar o Math.abs() para calcular o valor absoluto da diferença

public class QuestaoDois {
    public static void main(String[] args) {
    
        int n[] = {1, 5, 3, 4, 2};
        int x = 2;

        var quantidadeDiferenca = 0;

        for(int i = 0; i <= n.length - 1; i ++)
        {
            for(int j = i+1; j <= n.length - 1; j ++)
            {
                if(Math.abs(n[i] - n[j]) == x){
                    quantidadeDiferenca = quantidadeDiferenca + 1;
                }
            }
        }


        System.out.println("Quantidade de pares de diferença = "+quantidadeDiferenca);
    }
}
