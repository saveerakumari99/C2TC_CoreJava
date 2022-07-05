package bankacc;



public class client {

	public static void main(String[] args) {
		//step a
				mmbankfactory mmmfactory=new mmbankfactory();
				mmmfactory.getnewsavingaccount(101,"xyz", 500,true);
				
				mmmfactory.getcurrentaccount(102, "abc", 576579, 100);
				
				//step b
				mmsavingacc mmsaving=new mmsavingacc(102, "abc", 576579,true);
				
				//step c
				mmcurrentacc mmcurrent=new mmcurrentacc(101,"xyz", 500);
		 
				
				//step d
				mmcurrent.withdraw(10000);
				mmsaving.withdraw(5000);
				
				//step e
				mmcurrent.toString();
				mmsaving.toString();
			}

	}
