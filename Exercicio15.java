public class Exercicio15 {
    public static void executar(){
        /*Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar um número se ele for maior que o anterior.
        Ex.: se o primeiro valor lido for 5, o próximo valor lido só poderá ser maior que 5. */

        int[] vetor = new int[5];

        vetor[0] = Prompt.lerInteiro("Digite o 1º número do vetor: ");

        for(int i = 1; i < 5; i++){
            vetor[i] = Prompt.lerInteiro("Digite um número para a sequencia: ");

            while (vetor[i] < vetor[0]){
                vetor[i] = Prompt.lerInteiro("Digite um número maior do que o primeiro número da sequencia ");           
            }
        }

        Prompt.linhaEmBranco();
        Prompt.separador();

        Prompt.imprimir("A sequência do vetor é: ");

        for(int i = 0; i < 5; i++){
            Prompt.imprimir(vetor[i]);
        }
    }
}