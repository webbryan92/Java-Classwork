public class CommissionLibrary {
	public static double computeCommission(double salesAmount) {
		double commission;  
		if(salesAmount >= 10000.01)
			commission = (5000 * 0.08) + (5000 *0.1) + ((salesAmount - 10000) * 0.12); 
		else if(salesAmount >= 5000.01)
			commission = (5000 * 0.08) + ((salesAmount - 5000) * 0.1);
		else
			commission = salesAmount * 0.08;
		return commission;
	}
}
			