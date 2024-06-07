package tenet;

import java.util.ArrayList;

public class sgpa_calculator {
			
	static double sgpa(ArrayList<Integer> marks,ArrayList<Integer> credits) {
		if(marks.size()!=credits.size()) {
			return -1;
		}
		int total=0,totalcredit=0;
		for(int i=0;i<marks.size();i++)
	{
		if(marks.get(i)>=90)
		{
			total=total+(10*credits.get(i));
		}
		else if(marks.get(i)<90 && marks.get(i)>=80)
		{
			total=total+(9*credits.get(i));
		}
		else if(marks.get(i)<80 && marks.get(i)>=70)
		{
			total=total+(8*credits.get(i));
		}
		else if(marks.get(i)<70 && marks.get(i)>=60)
		{
			total=total+(7*credits.get(i));
		}
		else if(marks.get(i)<60 &&marks.get(i)>=50)
		{
			total=total+(6*credits.get(i));
		}
		else if(marks.get(i)<50 &&marks.get(i)>=45)
		{
			total=total+(5*credits.get(i));
		}
		else if(marks.get(i)<45 && marks.get(i)>=40)
		{
			total=total+(4*credits.get(i));
		}
		else
		{
			total=total+(0*credits.get(i));
		}
		
	}
	
	for(int i=0;i<marks.size();i++)
	{
		totalcredit=totalcredit+credits.get(i);
		
	}
	double sgpa=(double)total/(double)totalcredit;
		
		return sgpa;
	}
	
}
