package demo;

public class Main {
	//Addition
	public int addition(int n1,int n2) {
		int sum = n1 + n2;
		return sum;
	}
	//Multiplication
	public int multiplication(int n1,int n2) {
		int mult = n1 * n2;
		return mult;
	}
	private boolean validateInput(int a,int b)
	{
		if(a<0 || b<0)
			return false;
		return true;
	}

}
