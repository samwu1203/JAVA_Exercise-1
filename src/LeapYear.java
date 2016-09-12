import java.io.*;
public class LeapYear {

	public static void main(String[] args)throws IOException
	{
		
		/*輸入一西元年，如2015。判斷此年份是否為閏年。
                       提示：每四年一閏，每百年不閏，每四百年一閏，每四千年不閏
         */
		BufferedReader input=new BufferedReader
	    (new InputStreamReader(System.in));
		int year;
		System.out.print("請輸入年份 EX:1900");
		year=Integer.parseInt(input.readLine());
		if ((year%400==0)&&(year%4000!=0) || ((year%4==0)&&(year%100!=0)))  // 判斷是否為閏年
			System.out.println(year+"是閏年");
			
	else
			System.out.println(year+"非閏年");
		} //end of main()

}// end of Class
