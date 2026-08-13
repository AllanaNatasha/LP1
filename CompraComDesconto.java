import java.util.Scanner;

public class CompraComDesconto {
    void main(){
        double arroz, feijao, oleo, acucar, cafe, macarrao, farinha, fuba, molho, sal, soma, desconto;
        Scanner s = new Scanner(System.in);
        IO.println("Arroz tipo 1,5kg: ");
        arroz = s.nextDouble();
        IO.println("Feijão carioca 2kg: ");
        feijao = s.nextDouble();
        IO.println("Óleo de soja 900ml:");
        oleo = s.nextDouble();
        IO.println("Açúcar refinado 1kg");
        acucar = s.nextDouble();
        IO.println("Café torrado e moído 250g");
        cafe = s.nextDouble();
        IO.println("Macarrão parafuso 500g");
        macarrao = s.nextDouble();
        IO.println("Farinha de mandioca 1kg");
        farinha = s.nextDouble();
        IO.println("Fubá de milho 500g");
        fuba = s.nextDouble();
        IO.println("Extrato de tomate 300g");
        molho = s.nextDouble();
        IO.println("Sal refinado 1kg");
        sal = s.nextDouble();
        soma = (arroz + feijao + oleo + acucar + cafe + macarrao + farinha + fuba + molho + sal);
        if (soma > 100){
            desconto = (soma * 0.9);
            IO.println("A compra teve um desconto de 10%");
        }
        else desconto = soma;
        IO.println("\nNota fiscal: \n" +
                "1 - Arroz tipo 1,5kg: " + arroz+
                "\n1 - Feijão carioca 2kg: " + feijao +
                "\n1 - Óleo de soja 900ml: "+ oleo +
                "\n1 - Açúcar refinado 1kg: "+ acucar+
                "\n1 - Café torrado e moído 250g: "+cafe+
                "\n1 - Macarrão parafuso 500g" + macarrao +
                "\n1 - Farinha de mandioca 1kg" + farinha +
                "\n1 - Fubá de milho 500g" + fuba +
                "\n1 - Extrato de tomate 300g" + molho +
                "\n1 - Sal refinado 1kg" + sal+
                "\n1 - Total: "+ desconto);
    }
}
