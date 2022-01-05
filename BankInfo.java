package AbstraEncap;



public class BankInfo {
	public static void main(String args[])
    {
        String name, city;
        int pin;
        BankAccount bank = new BankAccount();
        bank.setName("Sample Bank");
        bank.setCity("Sample City");
        bank.setPin(100000);
        name =  bank.getName();
        city = bank.getCity();
        pin =  bank.getPin();
        System.out.println("Branch Name: "+name+"\n City: "+city+"\n Pin: "+pin);
    }

}
