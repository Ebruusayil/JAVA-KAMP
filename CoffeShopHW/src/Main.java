
public class Main {

	public static void main(String[] args) {
		ICustomerCheckService customerCheckService = new ICustomerCheckService() {
			
			@Override
			public boolean checkIfRealPerson (Customer customer) {
				
				return false;
			}
		};

		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.Save(new Customer(1, "Ebru", "sayil", 2001, "12345678910"));
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(customerCheckService);
		customerManager2.Save(new Customer(2, "Esra", "sayil", 1998, "10987654321"));
		
	}
}
