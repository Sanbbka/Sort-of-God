import java.util.Random;

public class sss {

	 static void razd(int mas[], int i, int w){
		int u = mas[i];
		 mas[i] = mas[w];
		 mas[w] = u;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mas[] = {2,42,411111,223,1,42,5211,543252,1111, 45, 23,6666 };
		boolean b = true;
		
		while (b) {
			for (int i = 0; i < mas.length; i++) {
				for(int j = 1; j < mas.length; j++){
					if( mas[j-1] <= mas[j]){
						b = false;
					}else{
						b = true;
						break;
					}
				}
				if(!b){
					break;
				}
				int w = (int)(Math.random()*i); 
				razd(mas, i, w);
				
			}

		}
		
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]+" ");
		}
	}

}
