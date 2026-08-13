public class Temperatura {
    void main() {
        int soma = 0;
        double media;
        String[] meses = {
                "Janeiro", "Fevereiro", "Março",
                "Abril", "Maio", "Junho", "Julho",
                "Agosto", "Setembro", "Outubro",
                "Novembro", "Dezembro"
        };
        int[] temp = {
                24, 24, 24, 22, 19, 18,
                18, 19, 20, 22, 23, 24
        };
        for (int i = 0; i < meses.length; i++) {
            if (temp[i] < 18) {
                IO.println(meses[i] + " " + temp[i] + "ºC : Frio");
            } else {
                IO.println(meses[i] + " " + temp[i] + "ºC : Temperatura agradável");
            }

            soma += temp[i];
        }

        media = soma/12;
        IO.println("Média anual: " + media + "ºC");
        if (media < 18) {
            IO.println("Em SJC a temperatura em geral é fria");
        } else {
            IO.println("Em SJC a temperatura em geral é agradável");
        }
    }
}