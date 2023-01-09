  package interm;

public class Addition {
         int x;
		int y ;
		
		
		void add() {
			int sum;
			sum=x+y;
			System.out.println(sum);
			
		}// end of add
		int add(int a,int b,int c) {
			int sum = a+b+c;
			return sum;
			}// End  of add
		
		double add (double a, double b, double c) {
			double total=a+b+c;
			return total;
			
			
		}// end of add
		public static void main(String [] args) {
			
			Addition lutfor = new Addition();
			
			lutfor.x = 100;
			lutfor. y = 200;
			lutfor.add();
			
			int sum = lutfor.add(100,200, 100);
			System.out.println(sum);
			
			double total = lutfor.add(100.50,150.50,200.50);
			System.out.println(total);
			
			
			
		}

}
