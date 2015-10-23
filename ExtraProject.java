package chapterSixProjects;

import java.util.*;

public class ExtraProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		//int counter = reader.nextInt();
		int counter = 200;
		int kerning = counter * counter;
		int length = String.valueOf(kerning).length();
		
		
		for(int i = 1;i < counter + 1; i++){
			if (i == 1){
				System.out.print(" ");
			}
				int change = String.valueOf(i).length();
				length = length - (change - 1);
				for (int k = 0; k < length; k++){
					System.out.print(" ");
				}
				length = String.valueOf(kerning).length();
			System.out.print(i);
		}
		for(int i = 1; i < counter + 1; i++){
			System.out.print("\n" + i);
			for(int p = 1; p < counter + 1; p++){	
				int change = String.valueOf(p * i).length();
				length = length - (change - 1);
				for (int k = 0; k < length; k++){
					System.out.print(" ");
				}
				length = String.valueOf(kerning).length();
			System.out.print((p * i));
			}
		}
		
		}
	}


