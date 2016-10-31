package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n值:");
		int n = scn.nextInt();
		System.out.print("請輸入字元:");
		char c = scn.next().charAt(0);
		square(n,c);
	}
	public static void square(int n , char c){
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				System.out.print(c + " ");
			}
			System.out.print("\n");
		}
		
    }
}