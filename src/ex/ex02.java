package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入m值:");
		int m = scn.nextInt();
		System.out.print("請輸入n值:");
		int n = scn.nextInt();
		int z ;
		if(m<n){
			z=m;
			m=n;
			n=z;
		}
		int s = m - n;
		C(m,n,s);
	}
	public static void C(int m, int n, int s){
		int sum1 = 1;
		for(int i = m ; i > 0 ; i--){
			sum1 = sum1 * i;
		}
		int sum2 = 1;
		for(int i = n ; i > 0 ; i--){
			sum2 = sum2 * i;
		}
		int sum3 = 1;
		for(int i = s ; i > 0 ; i--){
			sum3 = sum3 * i;
		}
		System.out.print(sum1/(sum2*sum3));

	}
}
