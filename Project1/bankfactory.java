package bankacc;



public interface bankfactory 
  {
    public abstract savingacc getnewsavingaccount(int accno,String accname,float accbal,float isSalaried);
	public abstract currentacc getnormalaccount(int accno,String accname,float charges,float creditlimit);
	mmsavingacc getnewsavingaccount(int accno, String accname, float charges, boolean isSalaried);
}