package hw;
/*	Topic:���ϥΪ̿�J�ʧO�P�����A�z�L��ƩI�s�A�̾ڨk�k���P, ���o(�L)�p��ÿ�X��з��魫
 *			((1)�k�G(����-170)0.6+62 , (2)�k�G(����-158)0.5+52)�C
 *			��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C
 *	Date: 2016/10/31
 * 	Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�ʧO:");
		float g = scn.nextFloat();
		System.out.print("�п�J����:");
		float h = scn.nextFloat();
		System.out.print("�z���зǨ�����:" + fun(g,h));
		
	}
	public static float fun(float g , float h){
		if(g == 1){
			h=(h-170f)*0.6f+62f;
		}else if(g == 2){
			h=(h-158f)*0.5f+52f;
		}else if(g != 1 && g != 2){
			System.out.println("�ثe�����Ѩ�L�ʧO-�s-");
			h = 0f;
			System.out.print("�ҥH");
		}
		
		return h;
	}

}
