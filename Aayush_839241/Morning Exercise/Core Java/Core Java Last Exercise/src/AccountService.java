import java.util.ArrayList;
import java.util.List;

public class AccountService {

	List<Account> accounts = new ArrayList<>();
	public void addAccount(Account a) throws AccountAlreadyException{
		for (Account account : accounts) {
			if(account.getaccountName()==a.getaccountName())
				throw new AccountAlreadyException();
		} 
		accounts.add(a);	
	}
	public void removeAccount(int num) throws AccountNotFoundException {
		Account resaccount = null;
		for (Account account : accounts) {
			if(account.getaccountNumber()==num)
				resaccount=account;
		}
		if(resaccount==null)
			throw new AccountNotFoundException();
		else {
			for (Account account : accounts) {
				if(account.getaccountNumber()==num)
					accounts.remove(account);
			}}
		
	}
	public void getAccountByNo(int num) throws AccountNotFoundException {
		Account resaccount = null;
		for (Account account : accounts) {
			if(account.getaccountNumber()==num)
				resaccount=account;
		}if(resaccount==null)
			throw new AccountNotFoundException();
		else
			System.out.println(resaccount);
	}
	public void getAllaccounts() {
		accounts.stream().forEach(item->System.out.println(item));
	}
	public void getAccountswithLowBalnce() {
		accounts.stream().forEach(item->{if(item.getbalance()<1000) System.out.println(item);});
	}
}
