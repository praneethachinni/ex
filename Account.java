

public class Account {
     private int accno;
     private String accname;
    
	public Account(int accno, String accname) {
		super();
		this.accno = accno;
		this.accname = accname;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public int getAccno() {
		return accno;
	}
      
}
