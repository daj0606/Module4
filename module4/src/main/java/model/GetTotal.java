package model;

public class GetTotal {
	private double total = 0;
	private double num1;
	private double num2;

	public GetTotal(String userText1, String userText2) {
		setNum1(Double.parseDouble(userText1));
		setNum2(Double.parseDouble(userText2));
	}

	/**
	 * @param num
	 */
	public double Addition() {
		this.total = this.num1 + this.num2;
		return this.total;
	}
	
	/**
	 * @param num
	 */
	public double Subtraction() {
		this.total = this.num1 - this.num2;
		return this.total;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

}
