package bankacc;

public class currentacc extends bankacc {
	
public currentacc(int accno, String accname, float accbal) {
		super(accno, accname, accbal);
		// TODO Auto-generated constructor stub
	}

public float creditlimit ;

	
	public void normalacc(int accno, String accname, float accbal, float creditlimit) {
		
	}
	
	public void withdraw(float accbal)
	{
		
	}

	@Override
	public String toString() {
		return "currentacc [creditlimit=" + creditlimit + ", accno=" + accno + ", accname=" + accname + ", accbal="
				+ accbal + "]";
	}

	
	
}