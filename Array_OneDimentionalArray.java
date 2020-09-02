package Assignment;

public class Array_OneDimentionalArray {
	public static void main(String[] args) {
		// part a
		int array[]={0,0,0,0,0,0,0,0,0,0}; 

		// part b
		int bonus[] =new int[15];

		for(int i=0;i<15;i++){
			bonus[i]+=1;
		}

		// part c
		int bestScores[]={10,20,30,40,50};

		for (int j=0;j<5;j++){
			System.out.printf("%d\t", bestScores[j]); 
		}
	}
}
