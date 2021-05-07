
public class CustomerCheckManager implements Check {

	@Override
	public boolean checkPerson(Customers customer) {
		if (customer.getName() != null && customer.getDateOfBirth().length() == 4 && customer.getIdenityId().length() == 11) {
			System.out.println("Kontrol baþarýlý");
            return true;
        }else {
        	return false;
        }
		 
	}

}
