import java.util.Scanner;
public class twoDarray2 {
    twoDarray2() {
    
        
    }
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
		System.out.print("Enter the Rows : ");
        int rows=sc.nextInt();
		System.out.print("Enter the Columns : ");
        int cols=sc.nextInt();
		
        int [][]numbers=new int[rows][cols];
        //input
        //rows
        for(int i =0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
				System.out.print("Enter the Row : "+i+" Column : "+j+" element : ");
                numbers [i][j]=sc.nextInt();
            }
        }
        //output
		System.out.println("\nEnter Elemets are : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers [i][j]+"\t");
            }
            System.out.println();
 		}
        sc.close();
	}
}