package aula02;
import javax.swing.JOptionPane;

public class Aula02 {

    public static void main(String[] args) {
//        
//        String Nome = null;
//        Nome = JOptionPane.showInputDialog("Digite o seu nome completo:");
//        System.out.println(Nome);
//        
//        String Curso = null;
//        Curso = JOptionPane.showInputDialog("Digite o seu curso:");
//        System.out.println(Nome.concat(", ").concat("estuda").concat(" ") + Curso);
//       
//        String Num1 = null;
//        Num1 = JOptionPane.showInputDialog("Digite um número: ");
//
//        int X = Integer.parseInt(Num1);
//
//        String Num2 = null;
//        Num2 = JOptionPane.showInputDialog("Digite um número: ");
//
//        int Y = Integer.parseInt(Num2);
//
//        JOptionPane.showMessageDialog(null, "Soma = " + (X + Y) + "\n" + "Subtração = " + (X - Y) + "\n"
//        + "Multiplicação = " + (X * Y) + "\n" + "Divisão = " + (X / Y));
        
        String inteiro = null;
        inteiro = JOptionPane.showInputDialog("Digite um número: ");
        
        int multiplos = Integer.parseInt(inteiro);
        JOptionPane.showMessageDialog(null,"Primeiro multiplo: " + (multiplos * 1) + "\n" +
        "Segundo multiplo: " + (multiplos * 2) + "\n" + "Terceiro multiplo: " + (multiplos * 3)
        );
        
        
    }

}
