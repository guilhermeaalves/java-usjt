package aula01;

public class aula01 {
    
    public static void main(String[] args) {
        Exercicio ex = new Exercicio();
        Exercicio2 ex2 = new Exercicio2();
        
        /**comparando print e println*/
        
        System.out.print(ex.nome.concat(" ") + ex.sobreNome);
        System.out.println(ex.nome.concat(" ") + ex.sobreNome);
        
        /**exibindo variaveis*/
        
        System.out.println(ex.idade);
        System.out.println(ex.genero);
        System.out.println(ex.bomProfessor);
        
        /** soma, subtração, divisão e multiplicação**/
        
        System.out.println(ex2.x + ex2.y);
        System.out.println(ex2.x - ex2.y);
        System.out.println(ex2.x * ex2.y);
        System.out.println(ex2.x / ex2.y);
    }
    
}

class Exercicio {
    
    /**criando variaveis*/
    
    String nome = "Edgard";
    String sobreNome= "Valderramas";
    int idade = 30;
    char genero = 'm';
    boolean bomProfessor = true;
}

class Exercicio2 {
    /**criando variaveis x e y**/
    
    int x = 7;
    int y = 9;
}
