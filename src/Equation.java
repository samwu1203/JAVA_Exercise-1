
public class Equation {
/*一元二次方程式ax2+bx+c=0。輸入a, b, c三值，並計算方程式的根。*/
	
	public static void main(String[] args) {
		double a=2, b=9, c=4,x,y;
		double j=b*b-4*a*c;
		if (j>0){
			x=(b+Math.sqrt(j))/2/a;
		    y=(Math.sqrt(j)-b)/2/a;
		    System.out.print("兩個實根:"+x+","+y);
		}
		else if (j==0){
			x=(0-b)/2/a;
		    System.out.print("一個實根:"+x);
		}
		else System.out.print("沒有實根");
	} //end of main()

}// end of Class
