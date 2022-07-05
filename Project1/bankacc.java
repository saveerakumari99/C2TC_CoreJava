package bankacc;

public class bankacc {

	public int accno;
	public String accname;
	public float accbal;
	
	public bankacc(int accno,String accname,float accbal)
	{
		super();
		this.accno = accno;
		this.accname = accname;
		this.accbal = accbal;
	}
	public void withdraw()
	{
		
	}
	public void deposite()
	{
		
	}
	@Override
	public String toString() {
		return "bankacc [accno=" + accno + ", accname=" + accname + ", accbal=" + accbal + "]";
	}
	
}