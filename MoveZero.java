package Assignments2Java;

public class MoveZero {
	public static void main(String[] args) {

		int[] num = { 4, 0, 3, 0, 1, 5, 2, 0 };

		for (int i = 0; i < num.length - 1; i++) {

			for (int j = i + 1; j < num.length; j++) {
				if ((num[i]==num[j])) {
					continue;
				} else if((num[i]==0))
				{
					int temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				
				}
			}
		}
			
			
				for(int EachValue : num)
					
				{
					System.out.print(EachValue);
				}
				
			System.out.println();
					
		
				System.out.println("The Zeros are moved to right");
		}

		
	}
	

			
