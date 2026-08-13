import java.util.Scanner;

public class AluguelCarro {
    void main(){
        int qtd_dias;
        double km;
        double total;
        double excedente;
        double aluguel = 67.50;
        Scanner s = new Scanner(System.in);
        IO.print("Digite a quantidade de dias que foi alugado: ");
        qtd_dias = s.nextInt();
        IO.print("Digite a quilometragem percorrida: ");
        km = s.nextDouble();
        if (km > 200) {
            excedente = (km - 200) * 0.5;
            total = (aluguel * qtd_dias) + excedente;
            IO.println("O total do seu aluguel ficou em R$" + String.format("%.2f", total));
        }
        else {
            total = aluguel * qtd_dias;
            IO.println("O total do seu aluguel ficou em R$" + String.format("%.2f", total));
        }


    }
}
