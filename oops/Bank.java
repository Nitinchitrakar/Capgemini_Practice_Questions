package oops;

public class Bank {
    private String bankName;
    private int bankCode;
    
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
		
	}
	public Bank(String bankName, int bankCode) {
		super();
		this.bankName = bankName;
		this.bankCode = bankCode;
	}
    
}
