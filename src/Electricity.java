
public class Electricity {

	public static void main(String[] args) {
		/*選擇性敘述的練習-Electricity,
		   輸入何種用電和度數，計算出需繳之電費。*/
		System.out.println("輸入工業用電為1;家庭用電為2及用電度數"); 
		int num=2;
		int deg=954;
		double fampowrate,indpowrate;
		switch(num){
		case 1: 
			indpowrate=deg*0.45;
			System.out.printf("the ind. power rate=%5.2f%n", indpowrate);break;
		case 2:
			if (deg<=240)
				fampowrate=deg*0.15;
			else if (deg>240 && deg<=540)
				fampowrate=deg*0.25;
			else
				fampowrate=deg*0.45;
			System.out.printf("the fam. power rate=%5.2f%n", fampowrate);break;
		}
	}

}
