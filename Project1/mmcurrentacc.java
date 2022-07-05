package bankacc;

public class mmcurrentacc extends currentacc
{
	public mmcurrentacc(int accno, String accname, float accbal) {
		super(accno, accname, accbal);
		// TODO Auto-generated constructor stub
	}
	public float deliverycharges=50;
	public void gsnormalacc(int accno, String accname, float accbal, float creditlimit) {
		super(accno, accname, accbal, creditlimit);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float minbal)
	{
		System.out.println("Dear account user your currentaccount balance is" +minbal+ "with creditlimit"+creditlimit);
	}
	@Override
	public String toString() {
		return "mmcurrentacc [deliverycharges=" + deliverycharges + ", creditlimit=" + creditlimit + ", accno=" + accno
				+ ", accname=" + accname + ", accbal=" + accbal + "]";
	}

	
}