package tryExample.delete;

public class TrialOfJava <T> {
	
	T obj1;
	T obj2;
	
	public TrialOfJava(T obj1, T obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public static void main(String[] args) {
		
		TrialOfJava<Integer> toi = new TrialOfJava<Integer>(18, 90);
		TrialOfJava<String> toi1 = new TrialOfJava<String>("A","A");
		TrialOfJava<Double> toi2 = new TrialOfJava<Double>(1.8, 9.60);
		
		display(toi.obj1,toi.obj2);
		display(toi1.obj1,toi1.obj2);
		display(toi2.obj1,toi2.obj1);
		
		
	}
	
	static <T> void display(T obj1,T obj2){
		System.out.println("***************Display Method****************");
		System.out.println("Object 1 = "+ obj1);
		System.out.println("Object 2 = "+ obj2);
		System.out.println("*********************************************");
	}
	
	

}
