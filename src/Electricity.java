
public class Electricity {

	public static void main(String[] args) {
		/*��ܩʱԭz���m��-Electricity,
		   ��J��إιq�M�׼ơA�p��X��ú���q�O�C*/
		System.out.println("��J�u�~�ιq��1;�a�x�ιq��2�Υιq�׼�"); 
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
