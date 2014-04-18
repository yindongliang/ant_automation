import java.util.Date;



public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = (new Date()).getTime();
		for(int i=0;i<2;i++){
//			System.out.println(i+" "+ (new Date()).getTime());
			new TestThread();
			
		}
		long end = (new Date()).getTime();
		long between = end - start;
		long day = between / (24 * 60 * 60 * 1000);
		long hour = (between / (60 * 60 * 1000) - day * 24);
		long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
		long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		long ms = (between - day * 24 * 60 * 60 * 1000 - hour * 60 * 60 * 1000
				- min * 60 * 1000 - s * 1000);
		System.out.println(" cost(ms) " + between);
	}

}

class TestThread extends Thread{
	
	TestThread(){
		this.start();
	}
	public void run() {
			for(int i=0;i<200000;i++){
				long start = (new Date()).getTime();
			System.out.println(i+" "+ start);
			
		}
	}
	
}