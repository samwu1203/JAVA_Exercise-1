
public class Equation {
/*�@���G����{��ax2+bx+c=0�C��Ja, b, c�T�ȡA�íp���{�����ڡC*/
	
	public static void main(String[] args) {
		double a=2, b=9, c=4,x,y;
		double j=b*b-4*a*c;
		if (j>0){
			x=(b+Math.sqrt(j))/2/a;
		    y=(Math.sqrt(j)-b)/2/a;
		    System.out.print("��ӹ��:"+x+","+y);
		}
		else if (j==0){
			x=(0-b)/2/a;
		    System.out.print("�@�ӹ��:"+x);
		}
		else System.out.print("�S�����");
	} //end of main()

}// end of Class
