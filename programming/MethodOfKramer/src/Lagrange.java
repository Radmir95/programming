import java.util.ArrayList;
import java.util.List;

public class Lagrange {
	
	public static double uxx = 1;
    public static double uyy = 0;
    public static double uzz = 0;
    public static double uxy = 1;
    public static double uxz = 0;
    public static double uyz = 0;
	
	public static void main(String args[]){
		List<Date> result = new ArrayList<Date>();
		List<Date> mainList = new ArrayList<Date>();
		List<Date> forTime = new ArrayList<Date>();
		
		Date d;
		if (uxx != 0){
			d = new Date();
			d.setKoef(uxx);
			d.setName("2x");
			d.setStatus(0);
			mainList.add(d);
		}
		
		if (uyy != 0){
			d = new Date();
			d.setKoef(uyy);
			d.setName("2y");
			d.setStatus(0);
			mainList.add(d);
		}
		
		if (uzz != 0){
			d = new Date();
			d.setKoef(uzz);
			d.setName("2z");
			d.setStatus(0);
			mainList.add(d);
		}
		
		if (uxy != 0){
			d = new Date();
			d.setKoef(uxy);
			d.setName("xy");
			d.setStatus(0);
			mainList.add(d);
		}
		
		if (uxz != 0){
			d = new Date();
			d.setKoef(uxz);
			d.setName("xz");
			d.setStatus(0);
			mainList.add(d);
		}
		
		if (uyz != 0){
			d = new Date();
			d.setKoef(uyz);
			d.setName("yz");
			d.setStatus(0);
			mainList.add(d);
		}
		
		if (uxx != 0){
			for (int i = 0; i < mainList.size(); i++){
			 	Date k = mainList.get(i);
			 	String s = k.getName();
			 	if (s.contains("x")){
			 		forTime.add(k);
			 	}
			}
			
			//Количество слагаемых с х = 2
			
			if (forTime.size() == 2){
				Date date = forTime.get(0);
				if (date.getName().contains("2x")){
					Date m = new Date();
					m.setKoef(Math.sqrt(date.getKoef()));
					m.setName("2x");
					m.setStatus(1);
					result.add(m);
					
					m = new Date();
					m.setKoef(forTime.get(1).getKoef()* Math.sqrt(date.getKoef()/2));
					if (forTime.get(1).getName() == "xy")
					m.setName("2y");
					else
						m.setName("2z");
					m.setStatus(1);
					result.add(m);
					mainList.remove(forTime.get(0));
					mainList.remove(forTime.get(1));
					
					m = new Date();
					if ())
					
				}
				
			}
			
			
			// Количество слагаемых с х = 3
			if (forTime.size() == 3){
				
				
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
