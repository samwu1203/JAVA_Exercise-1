import java.io.*;
public class LeapYear {

	public static void main(String[] args)throws IOException
	{
		
		/*��J�@�褸�~�A�p2015�C�P�_���~���O�_���|�~�C
                       ���ܡG�C�|�~�@�|�A�C�ʦ~���|�A�C�|�ʦ~�@�|�A�C�|�d�~���|
         */
		BufferedReader input=new BufferedReader
	    (new InputStreamReader(System.in));
		int year;
		System.out.print("�п�J�~�� EX:1900");
		year=Integer.parseInt(input.readLine());
		if ((year%400==0)&&(year%4000!=0) || ((year%4==0)&&(year%100!=0)))  // �P�_�O�_���|�~
			System.out.println(year+"�O�|�~");
			
	else
			System.out.println(year+"�D�|�~");
		} //end of main()

}// end of Class
