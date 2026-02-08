package oops;

public class Sbi extends Bank {
	private String branchName;
	

	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public Sbi(String bankName, int bankCode) {
		super(bankName, bankCode);
		
	}
	
    
}
