
public class main {

	public static void main(String[] args) {
	 
		Customers customer=new Customers();
		customer.setName("F�rat");
		customer.setDateOfBirth("2001");
		customer.setId(1);
		customer.setIdenityId("11111111111");
		customer.setLastname("�zdemir");
		
		BaseManager baseManager=new StarbucksManager(new CustomerCheckManager());
		baseManager.add(customer);
		
	}

}
