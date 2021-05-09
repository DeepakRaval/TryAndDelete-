package tryExample.delete;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TrialOfJava{
	

	public static void main(String[] args) {
		
		Integer [] num = {7,7,5,9,1,2,3,4,5,5,3,1,2,3,6};
		SortingOfnum(num);
		
	}
	
	static void SortingOfnum(Integer [] numIn){
	
		List<Integer> numInt =  Arrays.asList(numIn);
		Collections.sort(numInt);
		System.out.println(numInt);
		
	}
	
	

}
