package study;

public class Study15main {

	 public static void main(String[] args) {
		
		 Study15 parkBank = new Study15("박찬호");
		 parkBank.saveMoney(100);
		 
		 Study15 leeBank = new Study15("이승엽");
		 leeBank.saveMoney(300);
		 
		 leeBank.getBankInfo();
		 
		 parkBank.spendMoney(400);
		 
		 leeBank.getBankInfo();
		 
		 
	}
}
