import java.util.Scanner;

public class Grade_Calculator {
	
	public static void main(String[] args) {
        int totalMarks=0;
        char grade;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of subjects: ");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.print("Enter marks obtained in subjects: ");
			int marks=sc.nextInt();
			totalMarks+=marks;
			
		}
		System.out.println("Total Marks=" + totalMarks);
		float avgPercentage=totalMarks/n;
		System.out.println("Percentage=" + avgPercentage + "%");
	
		
		if(avgPercentage>=90) {
			grade='A';
		}
		else if(avgPercentage>=75 && avgPercentage<90) {
			grade='B';
		}
		else if(avgPercentage>=60 && avgPercentage<75) {
			grade='C';
		}
		else if(avgPercentage>=45 && avgPercentage<60) {
			grade='D';
		}
		else if(avgPercentage>=30 && avgPercentage<45) {
			grade='E';
		}
		else {
			grade='F';
			
		}
	
		System.out.println("Grade: " + grade);
		sc.close();
	}

}
