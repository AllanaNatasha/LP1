import java.util.Scanner;

public class CalculadoraViagem {
    void main(){
        double dist;
        double combustivel;
        double consumo;
        double total;
        Scanner s = new Scanner(System.in);
        IO.print("Digite a distância em km: ");
        dist = s.nextDouble();
        IO.print("Digite o preço do combustível: ");
        combustivel = s.nextDouble();
        consumo = dist / 12;
        IO.println("Você vai precisar de "+ String.format("%.2f", consumo)+"l de gasoline");
        if (dist > 500) {
            total = (combustivel*consumo)*0.95;
            IO.println("Total com 5% de desconto: R$"+ String.format("%.2f", total));
        }
        else {
            total = (combustivel*consumo);
            IO.println("Total: R$"+String.format("%.2f", total));
        }
    }
}
