
public class Refund {

	public static void main(String[] args) {
/*輸入在某商店購物應付金額與實付金額。
實付金額小於應付金額，則印出”金額不足”。
實付金額等於應付金額，則印出”不必找錢”。
實付金額大於應付金額，則輸出找回金額最少的鈔票數和錢幣數。
假設幣值只有1000, 500, 100元紙鈔和50, 10, 5, 1元硬幣。
*/
		int mustpay=3233, realpay=6520;
		int Refund=realpay-mustpay;
		int a,b,c,d,e,f,g;
		 
		if (Refund<0)
			System.out.println("金額不足");
		else if(Refund==0)
			System.out.println("不必找零");
		else if (Refund>0) {
			 a=Refund/1000;
			 b=Refund%1000/500;
			 c=Refund%1000%500/100;
			 d=Refund%1000%500%100/50;
			 e=Refund%1000%500%100%50/10;
			 f=Refund%1000%500%100%50%10/5;
			 g=Refund%1000%500%100%50%10%5;
			 System.out.println("找回金額:1000元紙鈔"+a+"張"+","+"500元紙鈔"+b+"張");
			 System.out.println("100元紙鈔"+c+"張"+","+"50元硬幣"+d+"個"+","+"10元硬幣"+e+"個");
			 System.out.println("5元硬幣"+f+"個"+","+"1元硬幣"+g+"個");  
		}// end of if

	} // end of main()

} // end of Refound class
