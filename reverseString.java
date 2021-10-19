import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char ch[] = str.toCharArray();

        int i = 0;
        int j = ch.length-1;

        while(i<=j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        System.out.println(String.valueOf(ch));
    }
}
