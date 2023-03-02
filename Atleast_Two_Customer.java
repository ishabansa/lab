package Lab;

public class Atleast_Two_Customer {
		public static void main(String[] args) {
			Customer c = new Customer();
			c.setAccountNumber1(95435845);
			c.setAccountName1("Isha");
			c.setAccountBalance1(5000);
			c.setWithdrawAmount(1000);
			System.out.println("Account number1:"+c.getAccountNumber1());
			System.out.println("Account name1:"+c.getAccountName1());
			System.out.println("Account Balance1:"+c.getAccountBalance1());
			System.out.println("withdraw successfully"+c.getWithdrawAmount());
			c.setAccountNumber2(45697852);
			c.setAccountName2("Yashi");
			c.setAccountBalance2(8000);
			System.out.println("Account number2:"+c.getAccountNumber2());
			System.out.println("Account name2:"+c.getAccountName2());
			System.out.println("Account Balance2:"+c.getAccountBalance2());

		}
		}
