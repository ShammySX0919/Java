
public class Pow {
	public double myPow(double x, int n) {
		if(n == 0)
            return 1;
		if(n == Integer.MIN_VALUE){ // check for overflow
	        x = x * x;
	        n = n/2;
	    }
        if(n < 0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pow obj = new Pow();
    	System.out.println(obj.myPow(34.00515,
    			-3));
	}

}
