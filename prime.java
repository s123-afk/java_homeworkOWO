package hw_ch23;
public class prime implements Runnable {
	private final int left_bound;
	private final int right_bound;
	private int total_prime=0;
	prime(int left,int right){
		this.left_bound=left;
		this.right_bound=right;
	}
	
	@Override
	public void run() {
		try {
			for(int j=left_bound;j<=right_bound;j++) {
				if(is_prime(j)==0) {
					total_prime++;
				}
			}
		}
		catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		System.out.printf("%d %d ended\n" ,left_bound,right_bound);
	}
	public int get_total_prime() {
		return total_prime;
	}
	
	
	public static int is_prime(int number_in) throws InterruptedException{
		double number= (double) number_in;
		int sqrt_number =(int) Math.sqrt(number);
		for(int i=2; i<=sqrt_number ;i++) {
			if(number_in % i == 0) {
				return number_in;
			}
		}
	
		return 0;
	
	}
	
	
}


