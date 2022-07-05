package bankacc;

public class mmbankfactory implements bankfactory {

	

	public void getcurrentaccount(int accno, String accname, float accbal, float isSalaried) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public savingacc getnewsavingaccount(int accno, String accname, float accbal, float isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public currentacc getnormalaccount(int accno, String accname, float charges, float creditlimit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mmsavingacc getnewsavingaccount(int accno, String accname, float charges, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}