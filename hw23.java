package hw_ch23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//23.5
// a : T
// b : T
// c : T
// d : T
//
//23.6
//a : A thread that is blocked waiting for a monitor lock is in this state.
//b : Controlling the scheduling of a thread
//c : quantum is quantum
//d : confine thread
//e : while doing atomic operation , lock won't release until operation ends
//f : Indefinite postponement occurs when a process is blocked waiting for some statement to release lock, 
//    but will not occur in some future execution sequence
//g : Monitors basically ¡¥monitor¡¦ the access control of shared resources and objects among threads.
//h : priority of thread

public class hw23 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    ExecutorService executorService = Executors.newCachedThreadPool();
	    
	    prime prime1 = new prime(2,10000);
	    prime prime2 = new prime(10000,20000);
	    executorService.execute(prime1);
	    executorService.execute(prime2);
	    executorService.shutdown();
	    executorService.awaitTermination(1, TimeUnit.MINUTES); 
	    if(prime1.get_total_prime()>prime2.get_total_prime()) {
	    	System.out.printf("total number of primes in 2 to 10000 is more than 10000 to 20000");
	    }
	    else {
	    	System.out.printf("total number of primes in 2 to 10000 is less than 10000 to 20000");
	    }
	}

}
