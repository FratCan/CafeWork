
public class main {

	public static void main(String[] args) {
	 
		Customers customer=new Customers();
		customer.setName("Fýrat");
		customer.setDateOfBirth("2001");
		customer.setId(1);
		customer.setIdenityId("11111111111");
		customer.setLastname("özdemir");
		
		BaseManager baseManager=new StarbucksManager(new CustomerCheckManager());
		baseManager.add(customer);
		
	}

}
