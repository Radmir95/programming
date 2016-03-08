import java.util.ArrayList;


public class First {
	static int[] a = {1,2,2,3,10,14, 14, 15};
	static int[] b = {3,5,6,11,12,14,14,17,21,29};
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String args[]) {
		int temp;
		
		int len;
		if (a.length > b.length)
			len = a.length;
		else
			len = b.length;
		
		if (a[0] >= b[0]) temp = b[0];
		else
			temp = a[0];
		
		list.add(temp);
		
		for (int i = 1; i < len; i++){
			
		}
			
				
			
		}
	
	}
