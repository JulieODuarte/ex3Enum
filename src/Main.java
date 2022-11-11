import java.util.Scanner;
public class Main {
    /*Faça um programa, que solicite ao usuário que informe o mês e o
    sistema deve imprimir o valor gasto do mês.
        ->Considerações:
        Utilizar enum
        Criar um valor para cada mês*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mesInformado;
        System.out.println("Informe o mês desejado:");
        mesInformado = scan.nextLine();

        mesInformado = mesInformado.toUpperCase();

        valorDoMes(mesInformado);
    }

    private static void valorDoMes(String mesInformado) {
        switch (mesInformado){
            case "JANEIRO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.JANEIRO.getValor());
                return;
            case "FEVEREIRO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.FEVEREIRO.getValor());
                return;
            case "MARCO":
            case "MARÇO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.MARCO.getValor());
                return;
            case "ABRIL":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.ABRIL.getValor());
                return;
            case "MAIO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.MAIO.getValor());
                return;
            case "JUNHO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.JUNHO.getValor());
                return;
            case "JULHO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.JULHO.getValor());
                return;
            case "AGOSTO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.AGOSTO.getValor());
                return;
            case "SETEMBRO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.SETEMBRO.getValor());
                return;
            case "OUTUBRO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.OUTUBRO.getValor());
                return;
            case "NOVEMBRO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.NOVEMBRO.getValor());
                return;
            case "DEZEMBRO":
                System.out.printf("\nO valor gasto foi de: R$%.2f\n", Mes.DEZEMBRO.getValor());
                return;
            default:
                System.out.println("\nMês Inválido!");
        }
    }
}