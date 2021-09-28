/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet;



/**
 *
 * @author Mad Max
 */
public class Alphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String s = "Sphinx of black quartz, judge my vow";
    System.out.println("Текст: " + s);
    System.out.println("");
    s = s.replaceAll("[^a-zA-Z]", "");
    s = s.toLowerCase();        
    s = s.replaceAll("(.)(?=.*\\1)", "");
    System.out.println(s);
    System.out.println("");
    System.out.println("текст использует " + s.length() + " букв");
    int lenth = 0;
    lenth = s.length();
    if (lenth == 26) {
        System.out.println("в тексте все буквы английского алфавита от a до z");
    }
    else
            System.out.println("текст содержит не все буквы алфавита");
}
    
}
