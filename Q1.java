/*
 * Que - Reverse a string
 */
package Java_Practice_Questions;

public class Q1 
{ 
    public static void main(String[] args) 
    {
        String str = "shreyash";
        String rev_str = "";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            rev_str = ch + rev_str;
        }
        System.out.println(rev_str);
    }
}
