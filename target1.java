package com.studyopedia;
import java.util.Scanner;
public class target1 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int sum=a.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=a.nextInt();
        }
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println("sum of indices"+i+","+j);
                }
            }
    }
}
