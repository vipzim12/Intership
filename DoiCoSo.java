/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoai Tran
 */
//Doi Co So
import java.util.Scanner;
public class DoiCoSo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a[] = new int[10];
        int n;
        int i=0;
                System.out.println("Nhap vao n:");
                n=scan.nextInt();
                while(n>=1)
                {
                  
                   a[i] = n%2;
                   i++;
                   n=n/2;
                }
                while(i>0)
                {
                i--;
                    System.out.print(a[i]);
                }
    }
}
