
public class Salary {
   /*��J�K�Q�ө��uŪ�ͪ��u�@�ɼơA�íp����~��C
     60�p�ɥH���A���~120���C
     61~80�p�ɡA�H���~1.25���p��C
     81�p�ɥH�W�A�H���~1.5���p��C
            �����G�~��H�֭p�覡�p��C�Y�u�ɬ�90�p�ɡA
            �h�~�ꬰ60*120 + 20*120*1.25 + 10*120*1.5���C
*/
	public static void main(String[] args) {
double Salary;
int time=325;
if (time<=60){
	Salary=time*120;
    System.out.printf("�~�ꬰ%5.2f%n", Salary);
}
else if(time>60 && time<=80){
	Salary=60*120+(80-time)*120*1.25;
	System.out.printf("�~�ꬰ%5.2f%n", Salary);
}
else if(time>80){
	Salary=60*120+20*120*1.25+(time-80)*120*1.5;
	System.out.printf("�~�ꬰ%5.2f%n", Salary);
}


	} // end of main()

} // end of Salary class
