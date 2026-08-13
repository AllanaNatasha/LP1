import java.util.Scanner;

public class Login {
    void main(){
        int senha = 1234;
        int entrada;
        Scanner s = new Scanner(System.in);
        IO.println("Digite a senha");
        entrada = s.nextInt();
        if (senha == entrada) {
            IO.println("Acesso permitido");
        }
        else IO.println("Acesso negado");

    }
}
