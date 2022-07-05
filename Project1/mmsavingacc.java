package bankacc;

public class mmsavingacc extends savingacc
{
public final float minbal = 1000;
	
	public mmsavingacc(int accno, String accname, float accbal, boolean isSalaried) {
		super(accno, accname, accbal);
		
	}
	
	public void withdraw(float minbal )
	{
		System.out.println("Dear account user your saving account is" +minbal);
	}

	@Override
	public String toString() {
		return "mmsavingacc [minbal=" + minbal + ", isSalaried=" + isSalaried + ", accno=" + accno + ", accname="
				+ accname + ", accbal=" + accbal + "]";
	}

	
	
	

}