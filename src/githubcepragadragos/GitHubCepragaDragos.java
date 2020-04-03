/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubcepragadragos;

/**
 *
 * @author Dragos
 */
public class GitHubCepragaDragos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello, World!");
        String world = "Hello, World!";
        System.out.format("%s", world);
        System.out.println();
        
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        for(String string : languages) {
            System.out.print(string + ", ");
        }
        System.out.println();
        
        int n = (int)(Math.random()*1_000_000);
        System.out.println(n);
        
        int i = n*3;
        System.out.println("Multiplied by 3: " + i);
        
        int s = i/7;
        System.out.println("Divided by 7: " + s);
        
        int y = s % 100_000;
        System.out.println("Last 5 digits: " + y);
        
        int result = sumOfDigits(y);
        System.out.println(result);
        
        while(result > 9) {
          System.out.println(result);
          result = sumOfDigits(result);
          System.out.println(result);
        }
        
        System.out.println("Willy-nilly, this summer I will learn " + languages[result] + ".");
    }
    
    public static int sumOfDigits(int x) {
        if (x == 0) {
            return 0;
        } else {
            return x%10 + sumOfDigits(x/10);
        }
    }
    
}
