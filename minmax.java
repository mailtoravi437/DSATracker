import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Pair pair = new Pair();
        pair.min = arr[0];
        pair.max = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]<pair.min){
                pair.min = arr[i];
            }

            else if(arr[i]>pair.max){
                pair.max = arr[i];
            }
        }

        System.out.println(pair.min+" "+pair.max);

    }
}

class Pair{
    int min;
    int max;

    Pair(){
        this.min = min;
        this.max = max;
    }
}
