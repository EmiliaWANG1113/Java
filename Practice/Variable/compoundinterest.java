package codegym;

public class compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PV（Present Value）：本⾦
		int pv = 100000;
		//i（interest）：週期內固定利率或固定回報率
		double i = 0.02;
		//n ：累進週期
		int n = 10;
		//FV（Future Value）：未來的財富價值
		double fv = pv * Math.pow((1+i), n);
		
		System.out.println(fv);

	}

}
