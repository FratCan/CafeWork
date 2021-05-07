
public class StarbucksManager extends BaseManager{
	
	Check check;
	 
	

	 public StarbucksManager(Check check2){
		this.check=check2;
		 
	}
	public void add(Customers customer) {
		if(check.checkPerson(customer)) {
			System.out.println("Müþteri eklendi: "+customer.getName());
		}
	 		
	}
	 
}


