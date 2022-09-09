import java.util.*;

public class StdDeviation {
	
/*
 	0.5497, 0.5508, 0.5535, 0.5428, 0.5452
 */

	public static void main(String[] args) {
		ArrayList<Double> data = new ArrayList<Double>();

		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		String[] inputArrayListStr = inputStr.split(", ");
		
		for(int i=0; i<inputArrayListStr.length; i++) {
			data.add( Double.parseDouble(inputArrayListStr[i]) );
			System.out.println(data.get(i));
		}
		
		int n = data.size();
		double sum = 0;
		double avg = 0;
		
		for(int i=0; i<n; i++) {
			sum += data.get(i);
		}
		avg = sum/n;
		System.out.println("avg: "+avg);
		
		double s = 0;
		for(int i=0; i<n; i++) {
			s += (data.get(i)-avg)*(data.get(i)-avg);
		}
		s /= (n-1);
		s = Math.sqrt(s);
		
		System.out.println("s: "+s);
		
		
	}
}


