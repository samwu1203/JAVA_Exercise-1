
public class Salary {
   /*輸入便利商店工讀生的工作時數，並計算其薪資。
     60小時以內，時薪120元。
     61~80小時，以時薪1.25倍計算。
     81小時以上，以時薪1.5倍計算。
            說明：薪資以累計方式計算。若工時為90小時，
            則薪資為60*120 + 20*120*1.25 + 10*120*1.5元。
*/
	public static void main(String[] args) {
double Salary;
int time=325;
if (time<=60){
	Salary=time*120;
    System.out.printf("薪資為%5.2f%n", Salary);
}
else if(time>60 && time<=80){
	Salary=60*120+(80-time)*120*1.25;
	System.out.printf("薪資為%5.2f%n", Salary);
}
else if(time>80){
	Salary=60*120+20*120*1.25+(time-80)*120*1.5;
	System.out.printf("薪資為%5.2f%n", Salary);
}


	} // end of main()

} // end of Salary class
