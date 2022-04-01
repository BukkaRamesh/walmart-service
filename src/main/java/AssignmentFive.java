import com.sample.aashish.Cashier;
import com.sample.aashish.Wallmart;

public class AssignmentFive {
public static void main(String[] args) {
	Wallmart wallmart = new Wallmart();
	Cashier cas1 = new Cashier(wallmart, "cashier1");
	Cashier cas2 = new Cashier(wallmart, "cashier1");
	Thread t1 = new Thread(cas1);
	Thread t2 = new Thread(cas2);
	t1.start();
	t2.start();
}
}
