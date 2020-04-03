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
        
        int n = (int)(Math.random()*1000000);
        System.out.println(n);
        
        int i = n*3;
        System.out.println(i);
        
        int s = i/7;
        System.out.println(s);
        
        int y = s % 100000;
        System.out.println(y);
        System.out.println(sumOfDigits(y));
        System.out.println(sumOfDigits(sumOfDigits(y % 100000)));
        try {
            System.out.println("This summer I will learn " + languages[sumOfDigits(sumOfDigits(y % 100000))] + ".");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Ooops... the requested index is currently empty!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
    
    public static int sumOfDigits(int x) {
        if (x == 0) {
            return 0;
        } else {
            return x%10 + sumOfDigits(x/10);
        }
    }
    
}
