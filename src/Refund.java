
public class Refund {

	public static void main(String[] args) {
/*��J�b�Y�ө��ʪ����I���B�P��I���B�C
��I���B�p�����I���B�A�h�L�X�����B�������C
��I���B�������I���B�A�h�L�X������������C
��I���B�j�����I���B�A�h��X��^���B�̤֪��r���ƩM�����ơC
���]���ȥu��1000, 500, 100���ȶr�M50, 10, 5, 1���w���C
*/
		int mustpay=3233, realpay=6520;
		int Refund=realpay-mustpay;
		int a,b,c,d,e,f,g;
		 
		if (Refund<0)
			System.out.println("���B����");
		else if(Refund==0)
			System.out.println("������s");
		else if (Refund>0) {
			 a=Refund/1000;
			 b=Refund%1000/500;
			 c=Refund%1000%500/100;
			 d=Refund%1000%500%100/50;
			 e=Refund%1000%500%100%50/10;
			 f=Refund%1000%500%100%50%10/5;
			 g=Refund%1000%500%100%50%10%5;
			 System.out.println("��^���B:1000���ȶr"+a+"�i"+","+"500���ȶr"+b+"�i");
			 System.out.println("100���ȶr"+c+"�i"+","+"50���w��"+d+"��"+","+"10���w��"+e+"��");
			 System.out.println("5���w��"+f+"��"+","+"1���w��"+g+"��");  
		}// end of if

	} // end of main()

} // end of Refound class
