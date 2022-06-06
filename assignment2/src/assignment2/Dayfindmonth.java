package assignment2;
import java.util.Scanner;
public class Dayfindmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int daysinMonth=0;
         String MonthName = "Invalid";
         System.out.println("enter the month number:") ;
         int month = sc. nextInt();
         System.out.println("enter the year:");
         int year = sc.nextInt();
         switch(month)
         {
         case 1:
        	 MonthName ="January";
        	 daysinMonth =31;
        	 break;
         case 2:
        	 MonthName ="February";
        	 if ((year % 400 == 0) || ((year % 100 != 0) &&  (year % 4==0)))
        			 {
        		 break;
        			 }
        	 else
        	 {
        		 daysinMonth =28;
        		 break;
        	 }
        	 case 3:
        		 MonthName ="March";
        		 daysinMonth =31;
            	 break;
        	 case 4:
        		 MonthName ="April";
        		 daysinMonth =30;
            	 break;
        	 case 5:
        		 MonthName ="May";
        		 daysinMonth =31;
            	 break;
        	 case 6:
        		 MonthName ="June";
        		 daysinMonth =30;
            	 break;
        	 case 7:
        		 MonthName ="July";
        		 daysinMonth =31;
            	 break;

        	 case 8:
        		 MonthName ="August";
        		 daysinMonth =31;
            	 break;
        	 case 9:
        		 MonthName ="sept";
        		 daysinMonth =30;
            	 break;
        	 case 10:
        		 MonthName ="oct";
        		 daysinMonth =31;
            	 break;
        	 case 11:
        		 MonthName ="nov";
        		 daysinMonth =30;
            	 break;
        	 case 12:
        		 MonthName ="dec";
        		 daysinMonth =31;
            	 break;
         }
         System.out.println(MonthName+""+year+"has"+daysinMonth+" days\n");
	}
            	 
}           	 
            
        		 
        		 
      
