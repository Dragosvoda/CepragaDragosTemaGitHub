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
        String world = "Hello World!";
        System.out.format("%s", world);
        System.out.println();
        
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        for(String string : languages) {
            System.out.print(string + ", ");
        }
        System.out.println();
        
        int n = (int)(Math.random()*1000000);
        System.out.println(n);
        System.out.println(n % 100000);
        System.out.println(sumOfDigits(n % 100000));
        System.out.println(sumOfDigits(sumOfDigits(n % 100000)));
        System.out.println("This summer I will learn " + languages[sumOfDigits(sumOfDigits(n % 100000))] + ".");
        
        int i = n*3;
        System.out.println(i);
        System.out.println(i % 100000);
        System.out.println(sumOfDigits(i % 100000));
        System.out.println(sumOfDigits(sumOfDigits(i % 100000)));
        System.out.println("This summer I will learn " + languages[sumOfDigits(sumOfDigits(i % 100000))] + ".");
        
        int e = n/7;
        System.out.println(e);
        System.out.println(e % 100000);
        System.out.println(sumOfDigits(e % 100000));
        System.out.println(sumOfDigits(sumOfDigits(e % 100000)));
        System.out.println("This summer I will learn " + languages[sumOfDigits(sumOfDigits(e % 100000))] + ".");
    }
    
    public static int sumOfDigits(int x) {
        if (x == 0) {
            return 0;
        } else {
            return x%10 + sumOfDigits(x/10);
        }
    }
    
}
