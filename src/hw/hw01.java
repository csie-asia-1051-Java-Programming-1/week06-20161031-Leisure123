package hw;
/*	Topic:請設計一個函數fun(v1, type)，讓使用者輸入一個溫度值及計算方式
 *		  type為1時華氏->攝氏；type為2時攝氏->華氏
 *		     函數算出結果後要回傳至主程式再印出結果
 *	Date: 2016/10/31
 * 	Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入溫度:");
		float t = scn.nextFloat();
		System.out.print("請輸入模式:");
		float type = scn.nextInt();
		System.out.print("轉換後的溫度為:" + fun(t,type));

	}
	public static float fun(float t,float type){
		if(type == 1){
			t=(t-32f)*(5f/9f);
		}else if(type == 2){
			t=(t*(9f/5f))+32f;
		}else if(type != 1 && type != 2){
			System.out.println("無此模式");
			t = 0f;
			System.out.print("所以");
		}
		
		return t;
		
	}

}
