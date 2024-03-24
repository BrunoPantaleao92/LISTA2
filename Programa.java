public class Programa {

    public static void main(String[] args) {

        int numero = Prompt.lerInteiro("Digite o Numero do Exercicio:");

        switch (numero) {
            case 1:
                Exercicio1.executar();
                break;

             case 2:
                Exercicio2.executar();
                break;

            default:
                break;
        }
    }
}