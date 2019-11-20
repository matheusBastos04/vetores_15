import java.util.*;
public class exer5 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);	
		
		int i, n;
		int a[] = new int[2];
		
		for(i=0; i<2; i++) {
			System.out.println("Insira os valores ");
			a[i] = in.nextInt();
		}
		
			for (i=0; i<2; i++) {
				for (n=1; n<=a[i]; n++) {
					if ((a[i] % n) == 0) {
						if (n == a[i]) {
							System.out.println(a[i]+" é divisivel por: "+n);
		    	  }else {
		    		  System.out.println(a[i]+" é divisivel por: "+n);
		    	  }
			}     
		}
	}
		
		
		
		

	}

}
