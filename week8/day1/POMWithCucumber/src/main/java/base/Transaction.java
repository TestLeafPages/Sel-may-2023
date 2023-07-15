package base;

public class Transaction extends LearnEncapsulation{

	public static void main(String[] args) {
		Transaction pay=new Transaction();
		int cvv = pay.getCvv();
		System.out.println(cvv);
		
		pay.setPassword(345);
		System.out.println(pay.getPassword());

	}

}
