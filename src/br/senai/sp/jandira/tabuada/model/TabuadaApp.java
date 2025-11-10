package br.senai.sp.jandira.tabuada.model;
import java.util.Scanner;

public class TabuadaApp {

    public int multiplicando;
    public int multiplicadorInicial;
    public int multiplicadorFinal;
    public String[] calcular;


    public void receberDados (){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual número vai ser o multiplicando?");
        multiplicando = leitor.nextInt();

        System.out.print("Bora lá, agora me fala por qual numero irá inicar a multiplicação?");
        multiplicadorInicial = leitor.nextInt();

        System.out.print("Por fim, me diga até qual número é para multiplicar?");
        multiplicadorFinal = leitor.nextInt();

        calcularDados();
    }

    public void calcularDados(){
        int apoio = 0;
        if(multiplicadorFinal < multiplicadorInicial){
            apoio = multiplicadorFinal;
            multiplicadorFinal = multiplicadorInicial;
            multiplicadorInicial = apoio;
        }


        int tamanho = multiplicadorFinal - multiplicadorInicial + 1;
        calcular = new String[tamanho];

        int i = 0;
        while(i < tamanho){
            int produto = multiplicando * multiplicadorInicial;
            calcular[i] = multiplicando + " X " + multiplicadorInicial + " = " + produto;
            multiplicadorInicial = multiplicadorInicial + 1;

            i = i + 1;
        }
        exibirTabuada();
    }


    public void exibirTabuada(){
        System.out.println("O resultado que você pediu da Tabuada !!!");

        int i = 0;
        while(i < calcular.length){
            System.out.println(calcular[i]);
            i++; // quer dizer que é i = i + 1
        }

    }

}
