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

        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        for(int i=0;i<n;i++){
            pq.add(arr[i]);

            if(pq.size()>k){
                pq.poll();
            }
        }

        int x = pq.peek();
        System.out.println(x);
    }
}
