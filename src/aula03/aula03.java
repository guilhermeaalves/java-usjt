package aula03;

import static javax.swing.JOptionPane.*;

public class aula03 {
    public static void main(String[] args) {
        // exercicio1 ex = new exercicio1();
        // exercicio2 ex2 = new exercicio2();
        // exercicio3 ex3 = new exercicio3();
        // exercicio4 ex4 = new exercicio4();
        // exercicio5 ex5 = new exercicio5();
        // exercicio6 ex6 = new exercicio6();
        // exercicio7 ex7 = new exercicio7();
        // Exercicio8 ex8 = new Exercicio8();
        Exercicio9 ex9 = new Exercicio9();

        // ex.executar();
        // ex2.executar();
        // ex3.executar();
        // ex4.executar();
        // ex5.executar();
        // ex6.executar();
        // ex7.executar();
        // ex8.executar();
        ex9.executar();
    }
}

class exercicio1 {
    public void executar() {
        String numero1 = null;
        numero1 = showInputDialog("Digite um número: ");
        String numero2 = null;
        numero2 = showInputDialog("Digite outro número: ");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        if (num1 == num2) {
            showMessageDialog(null, "Os números são iguais.");
        } else {
            showMessageDialog(null, "os números são diferentes.");
        }
    }
}

class exercicio2 {
    public void executar() {
        int num1 = Integer.parseInt(showInputDialog("Digite um número: "));
        int num2 = Integer.parseInt(showInputDialog("Digite outro número: "));
        int num3 = Integer.parseInt(showInputDialog("Digite outro número: "));

        if (num1 == num2 && num1 == num3) {
            showMessageDialog(null, "Os números são iguais.");
        } else {
            showMessageDialog(null, "os números são diferentes.");
        }
    }
}

class exercicio3 {
    public void executar() {
        int x = Integer.parseInt(showInputDialog("Digite um número: "));
        int y = Integer.parseInt(showInputDialog("Digite outro número: "));

        String[] Opcoes = { "+", "-", "/", "*" };
        String operacao = (String) showInputDialog(null,
                "Escolha qual operação deseja executar: ", "calculator", 3, null,
                Opcoes, Opcoes[0]);
        switch (operacao) {
            case "+":
                showMessageDialog(null, "Resultado: " + (x + y));
                break;
            case "-":
                showMessageDialog(null, "Resultado: " + (x - y));
                break;
            case "/":
                showMessageDialog(null, "Resultado: " + (x / y));
                break;
            case "*":
                showMessageDialog(null, "Resultado: " + (x * y));
                break;
            default:
                showMessageDialog(null, "Operação inválida.");
                break;
        }
    }
}

class exercicio4 {
    public void executar() {
        int num = Integer.parseInt(showInputDialog("Digite o número de um mês: "));
        switch (num) {
            case 1:
                showMessageDialog(null, "Janeiro");
                break;
            case 2:

                showMessageDialog(null, "Fevereiro");
                break;
            case 3:
                showMessageDialog(null, "Março");
                break;
            case 4:
                showMessageDialog(null, "Abril");
                break;
            case 5:
                showMessageDialog(null, "Maio");
                break;
            case 6:
                showMessageDialog(null, "Junho");
                break;
            case 7:
                showMessageDialog(null, "Julho");
                break;
            case 8:
                showMessageDialog(null, "Agosto");
                break;
            case 9:
                showMessageDialog(null, "Setembro");
                break;
            case 10:
                showMessageDialog(null, "Outubro");
                break;
            case 11:
                showMessageDialog(null, "Novembro");
                break;
            case 12:
                showMessageDialog(null, "Dezembro");
                break;
            default:
                showMessageDialog(null, "Número inválido.");
                break;
        }
    }
}

class exercicio5 {
    public void executar() {

        int num = Integer.parseInt(showInputDialog("Digite um número inteiro e positivo: "));

        showMessageDialog(null, "Primeiro múltiplo: " + num * 1 + "\n"
                + "Segundo Múltiplo: " + num * 2 + "\n"
                + " Terceiro Múltiplo: " + num * 3 + "\n"
                + " Quarto Múltiplo: " + num * 4 + "\n"
                + " Quinto Múltiplo: " + num * 5);

        while (num > 0) {
            showMessageDialog(null, "Número inválido. Tente novamente.");
        }
    }
}

class exercicio6 {
    public void executar() {
        int num = 0;

        do {
            num = Integer.parseInt(showInputDialog("Digite um número inteiro e positivo: "));

            showMessageDialog(null, "Primeiro múltiplo: " + num * 1
                    + "Segundo Múltiplo: " + num * 2 + "\n"
                    + " Terceiro Múltiplo: " + num * 3 + "\n"
                    + " Quarto Múltiplo: " + num * 4 + "\n"
                    + " Quinto Múltiplo: " + num * 5);

        } while (num > 0);
        {
            showMessageDialog(null, "Número inválido. Tente novamente.");
        }
    }
}

class exercicio7 {
    public void executar() {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                showMessageDialog(null, "Números pares: " + i);
            }
        }
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                showMessageDialog(null, "Números ímpares: " + i);
            }
        }
    }
}

class Exercicio8 {

    public void executar() {
        int num = Integer.parseInt(showInputDialog("Digite um número: "));

        for (int num1 = num; num1 > 0; num1--) {
            if (num1 % 3 == 0) {
                showMessageDialog(null, "Números ímpares: " + num1);
            }
        }
        for (int num1 = num; num1 > 0; num1--) {
            if (num1 % 2 == 0) {
                showMessageDialog(null, "Números pares: " + num1);
            }
        }
    }
}

class Exercicio9 {
    public void executar() {
        int num = Integer.parseInt(showInputDialog("Digite um número: "));

        for (int num1 = 1; num > num1; num1++) {
            int num3 = num1 * num;
            showMessageDialog(null, "Resultado: " + num3);

        }
    }
}