package aula02;

import static javax.swing.JOptionPane.*;

public class aula02 {
    public static void main(String[] args) {
        // Exercicio1 ex = new Exercicio1();
        // Exercicio2 ex2 = new Exercicio2();
        // Exercicio3 ex3 = new Exercicio3();
        // Exercicio4 ex4 = new Exercicio4();
        // Exercicio5 ex5 = new Exercicio5();
        // Exercicio6 ex6 = new Exercicio6();
        // Exercicio7 ex7 = new Exercicio7();
        Exercicio8 ex8 = new Exercicio8();

        // ex.executar();
        // ex2.executar();
        // ex3.executar();
        // ex4.executar();
        // ex5.executar();
        // ex6.executar();
        // ex7.executar();
        ex8.executar();
    }
}

class Exercicio1 {
    public void executar() {
        String Nome = null;
        Nome = showInputDialog("Digite o seu nome completo:");
        System.out.println(Nome);
    }
}

class Exercicio2 {
    public void executar() {
        String nome = showInputDialog("Digite o seu nome completo: ");
        String curso = showInputDialog("Digite o seu curso:");

        System.out.println(nome + " estuda" + curso);
    }
}

class Exercicio3 {
    public void executar() {

        String Num1 = null;
        Num1 = showInputDialog("Digite um número: ");

        int X = Integer.parseInt(Num1);

        String Num2 = null;
        Num2 = showInputDialog("Digite um número: ");

        int Y = Integer.parseInt(Num2);

        showMessageDialog(null, "Soma = " + (X + Y) + "\n" + "Subtração = " + (X - Y) + "\n"
                + "Multiplicação = " + (X * Y) + "\n" + "Divisão = " + (X / Y));

    }
}

class Exercicio4 {
    public void executar() {
        String inteiro = null;
        inteiro = showInputDialog("Digite um número: ");

        int multiplos = Integer.parseInt(inteiro);

        showMessageDialog(null, "Primeiro multiplo: " + (multiplos * 1) + "\n" +
                "Segundo multiplo: " + (multiplos * 2) + "\n" + "Terceiro multiplo: " + (multiplos * 3));
    }
}

class Exercicio5 {
    public void executar() {
        String num1 = showInputDialog("Insira um número: ");
        String num2 = showInputDialog("Insira um número: ");
        String num3 = showInputDialog("Insira um número: ");

        int media1 = Integer.parseInt(num1);
        int media2 = Integer.parseInt(num2);
        int media3 = Integer.parseInt(num3);

        showMessageDialog(null, "A média dos números é: " + (media1 + media2 + media3) / 3);
    }
}

class Exercicio6 {
    public void executar() {
        String nome = showInputDialog("Digite o seu nome completo: ");
        String input = showInputDialog("Insira a nota da prova: ");
        String input2 = showInputDialog("Insira a nota da atividade: ");

        int prova = Integer.parseInt(input);
        int atividade = Integer.parseInt(input2);

        showMessageDialog(null,
                nome + " ficou com média " + (prova + atividade) / 2);
    }
}

class Exercicio7 {
    public void executar() {
        String nomeFuncionario = showInputDialog("Digite o seu nome completo: ");
        String input = showInputDialog("Insira o seu salário bruto: ");
        int salarioBruto = Integer.parseInt(input);
        double salarioLiquido = 0;

        if (salarioBruto <= 1518) {
            salarioLiquido = salarioBruto - (salarioBruto * 0.075);

        } else if (salarioBruto <= 2826.65) {
            salarioLiquido = salarioBruto - (salarioBruto * 0.09);

        } else if (salarioBruto <= 3751.05) {
            salarioLiquido = salarioBruto - (salarioBruto * 0.12);

        } else if (salarioBruto <= 4664.68) {
            salarioLiquido = salarioBruto - (salarioBruto * 0.14);

        } else {
            salarioLiquido = salarioBruto - (salarioBruto * 0.14);
        }

        showMessageDialog(null, nomeFuncionario + " o seu salário líquido é: " + salarioLiquido);
    }
}

class Exercicio8 {
    public void executar() {

        String[] Opcoes = { "Celsius", "Fahrenheit", "Kelvin" };
        String unidadeTemp = (String) showInputDialog(null,
                "Escolha a unidade de temperatura da qual deseja converter: ", "Conversor de temperatura", 3, null,
                Opcoes, Opcoes[0]);

        String input = showInputDialog("Insira o valor da temperatura: ");
        double valorTemp = Double.parseDouble(input);

        String[] Opcoes2 = { "Celsius", "Fahrenheit", "Kelvin" };
        String unidadeTemp2 = (String) showInputDialog(null,
                "Escolha a unidade de temperatura para qual deseja converter: ", "Conversor de temperatura", 3, null,
                Opcoes2, Opcoes2[0]);

        while (!unidadeTemp.isEmpty() && !unidadeTemp2.isEmpty()) {

            switch (unidadeTemp) {
                case "Celsius":
                    if (unidadeTemp2.equals("Fahrenheit")) {
                        valorTemp = (valorTemp * 9 / 5) + 32;

                    } else if (unidadeTemp2.equals("Kelvin")) {
                        valorTemp = valorTemp + 273.15;

                    }
                    break;
                case "Fahrenheit":
                    if (unidadeTemp2.equals("Celsius")) {
                        valorTemp = (valorTemp - 32) * 5 / 9;

                    } else if (unidadeTemp2.equals("Kelvin")) {
                        valorTemp = (valorTemp - 32) * 5 / 9 + 273.15;

                    }
                    break;
                case "Kelvin":
                    if (unidadeTemp2.equals("Celsius")) {
                        valorTemp = valorTemp - 273.15;

                    } else if (unidadeTemp2.equals("Fahrenheit")) {
                        valorTemp = (valorTemp * 9 / 5) + 32;

                    }
                    break;
            }

            showMessageDialog(null, "O valor da temperatura convertida é: " + valorTemp);
        }
    }
}