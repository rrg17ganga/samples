package samples;

public class ArrayEx {

		public static void main(String[] args) {
			int[] rollno= {20,21,22,23,24,25};
			String[] names = { "saini", "Sam", "Joe" };

			//System.out.println(rollno[0]);  
			for(int i=0;i<rollno.length;i++)
			{
			System.out.println(rollno[i]);
			
			}
			for (int i=0; i<names.length-1; i++)  
			{  
			System.out.println(names[i]);  
			}  
		}
}
