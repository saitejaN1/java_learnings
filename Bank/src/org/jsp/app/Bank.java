package org.jsp.app;

public class Bank 
{
	private String bankName;
	private String location;
	private Account account;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", location=" + location + ", account=" + account + "]";
	}
	
	
	

}
