package hw;
/*	Topic:�г]�p�@�Ө��fun(v1, type)�A���ϥΪ̿�J�@�ӷū׭Ȥέp��覡
 *		  type��1�ɵؤ�->���Ftype��2�����->�ؤ�
 *		     ��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G
 *	Date: 2016/10/31
 * 	Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�ū�:");
		float t = scn.nextFloat();
		System.out.print("�п�J�Ҧ�:");
		float type = scn.nextInt();
		System.out.print("�ഫ�᪺�ū׬�:" + fun(t,type));

	}
	public static float fun(float t,float type){
		if(type == 1){
			t=(t-32f)*(5f/9f);
		}else if(type == 2){
			t=(t*(9f/5f))+32f;
		}else if(type != 1 && type != 2){
			System.out.println("�L���Ҧ�");
			t = 0f;
			System.out.print("�ҥH");
		}
		
		return t;
		
	}

}
