class Coustomer
{
	String bnknm;
	String branch;
	long ifsc;
	long accno;
	double bal;
}

class Ex1
{
	public static void main(String[]args){
	Coustomer c1=new Coustomer();
	Coustomer c2=new Coustomer();
	c1.bnknm="HDFC";
	c1.branch="chenai";
	c1.ifsc=180032569845l;
	c1.accno=320012546987l;
	c1.bal=20000;
	c2.bnknm="HDFC";
	c2.branch="hyderabad";
	c2.ifsc=1800325566885l;
	c2.accno=32001254654789l;
	c2.bal=205000;
	System.out.println("BANK NAME:\t"+c1.bnknm);
	System.out.println("BRANCH NAME:\t"+c1.branch);
	System.out.println("IFSC NO:\t"+c1.ifsc);
	System.out.println("BANK ACCOUT NO:\t"+c1.accno);
	System.out.println("BANK BALANCE:\t"+c1.bal);
	System.out.println("BANK NAME:\t"+c2.bnknm);
	System.out.println("BRANCH NAME:\t"+c2.branch);
	System.out.println("IFSC NO:\t"+c2.ifsc);
	System.out.println("BANK ACCOUT NO:\t"+c2.accno);
	System.out.println("BANK BALANCE:\t"+c2.bal);
	
	}
}