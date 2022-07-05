package bankacc;

public class savingacc extends bankacc {

public savingacc(int accno, String accname, float accbal) {
		super(accno, accname, accbal);
		// TODO Auto-generated constructor stub
	}

public boolean isSalaried;

	
	public void primeacc(int accno, String accname, float accbal,boolean isSalaried) {

		this.isSalaried = isSalaried;
	}

	public void withdraw(float accbal)
	{
		
	}

	@Override
	public String toString() {
		return "savingacc [isSalaried=" + isSalaried + "]";
	}

	

	
	}
	