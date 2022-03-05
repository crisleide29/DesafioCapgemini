import java.lang.Math; // importando essa biblioteca para calcular raiz quadra

public class QuestaoTres {
    public static void main(String[] args) {
        String texto = "tenha um bom dia"; // "ola mundo"

        // Retirando o espaço da String
        String textoSemEspaco = texto.replaceAll("\\s+", "");

        // Verificando quantidade
        int quantidadeCaracteres = textoSemEspaco.length();

        // Calcular Raiz
        double Raiz = Math.sqrt(quantidadeCaracteres);

        // Arredando para cima e informando que o resultado será inteiro
        int x = (int) Math.ceil(Raiz);

        // criando uma Matriz para ser a grid
        String[][] grid = new String[x][x];

        // posicao na String sem espaço
        int n = 0;

        for (int i = 0; i <= x - 1; i++) {
            for (int j = 0; j <= x - 1; j++) {
                if (n <= quantidadeCaracteres - 1) {
                    grid[i][j] = textoSemEspaco.substring(n, n + 1);
                    n = n + 1;
                }
                else{
                    grid[i][j] = "";
                }
            }
        }

        // Criptografar
        String textoCriptografado = "";

        for (int j = 0; j <= x - 1; j++) {

            for (int i = 0; i <= x - 1; i++) {
                textoCriptografado = textoCriptografado + grid[i][j];
            }
            textoCriptografado = textoCriptografado + " ";
        }

        System.out.println("Texto Criptografado: "+textoCriptografado);
    }
}
