package AravindCalc.AravindCalc;

public class App {
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static double div(double x, double y) throws Exception
    {
    	if (y==0) {
    		throw new Exception("Number can't be devided by 0!");
    	}
        double result = x/y;
        return result;
    }

}

