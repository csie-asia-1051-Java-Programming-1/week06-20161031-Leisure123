package hw;
/*	Topic:讓使用者輸入性別與身高，透過函數呼叫，依據男女不同, 幫她(他)計算並輸出其標準體重
 *			((1)男：(身高-170)0.6+62 , (2)女：(身高-158)0.5+52)。
 *			函數算出結果後要回傳至主程式再印出結果。
 *	Date: 2016/10/31
 * 	Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入性別:");
		float g = scn.nextFloat();
		System.out.print("請輸入身高:");
		float h = scn.nextFloat();
		System.out.print("您的標準身高為:" + fun(g,h));
		
	}
	public static float fun(float g , float h){
		if(g == 1){
			h=(h-170f)*0.6f+62f;
		}else if(g == 2){
			h=(h-158f)*0.5f+52f;
		}else if(g != 1 && g != 2){
			System.out.println("目前不提供其他性別-ω-");
			h = 0f;
			System.out.print("所以");
		}
		
		return h;
	}

}
