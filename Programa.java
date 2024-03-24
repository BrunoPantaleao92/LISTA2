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

            case 3:
                Exercicio3.executar();
                break;

            case 4:
                Exercicio4.executar();
                break;

            case 5:
                Exercicio5.executar();
                break;

            case 6:
                Exercicio6.executar();
                break;

            case 7:
                Exercicio7.executar();
                break;

            default:
                break;
        }
    }
}