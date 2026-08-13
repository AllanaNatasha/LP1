import java.util.Scanner;

public class Camelo {
    void main(){
        int qtd_camelos;
        int irmao1;
        int irmao2;
        int irmao3;
        int pagamento;
        Scanner s = new Scanner(System.in);
        IO.print("Digite a quantidade de camelos: ");
        qtd_camelos = s.nextInt();
        irmao1 = qtd_camelos/2;
        irmao2 = qtd_camelos/3;
        irmao3 = qtd_camelos/9;
        pagamento = qtd_camelos-(irmao1+irmao2+irmao3);
        IO.println("O irmão mais velho recebeu " + irmao1 +
                " camelos, o do meio " +irmao2+ " e o mais novo "
                +irmao3+ " camelos. O homem que calculava recebeu " + pagamento+
                " camelos de pagamento");


    }
}
