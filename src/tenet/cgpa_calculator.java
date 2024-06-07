package tenet;

import java.util.ArrayList;

public class cgpa_calculator {
	static double cgpa(ArrayList<Double> sgpa,ArrayList<Integer> credits) {
		if(sgpa.size()!=credits.size()) {
			return -1;
		}
		double total=0,totalcredit=0;

		for(int i=0;i<sgpa.size();i++)
		{
			total=total+sgpa.get(i)*credits.get(i);
			
		}
		for(int i=0;i<sgpa.size();i++)
		{
			totalcredit=totalcredit+credits.get(i);
			
		}
		double cgpa=(double)total/(double)totalcredit;
		
		return cgpa;

}
}