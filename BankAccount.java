package AbstraEncap;

public class BankAccount {
	 private String branchName;
	    private String branchCity;
	    private int branchPin;
	    
	    public BankAccount() {
			// TODO Auto-generated constructor stub
		}

		public void setName(String value)
	    {
	        this.branchName = value;
	    }
	    
	    public void setCity(String value)
	    {
	        this.branchCity = value;
	    }
	    
	    public void setPin(int value)
	    {
	        this.branchPin = value;
	    }
	    
	    public String getName()
	    {
	        return branchName;
	    }
	    
	    public String getCity()
	    {
	        return branchCity;
	    }
	    
	    public int getPin()
	    {
	        return branchPin;
	    }
}
