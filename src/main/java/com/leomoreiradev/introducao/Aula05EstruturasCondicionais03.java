package com.leomoreiradev.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Uso dacondição ternaria

        //(condição) ? verdadeiro : falso

        //Doar se salario maior que 5000;

        double salario = 6000;

        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);





    }
}
