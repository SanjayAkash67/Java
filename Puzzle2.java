import java.util.Scanner;

public class Puzzle2 {
	
	
	
	boolean verticalSearch(String find,char[][] arr,int i,int j,int n,int start1,int end1,int start2,int end2,String emp,int charInd) {
		start1=0;
		start2=0;
		end1=0;
		end2=0;
		emp="";
		charInd=0;
		if( find.charAt(charInd)==arr[i][j] ) {
			start1=i;
			end1=j;
			emp+=find.charAt(charInd);//l
			charInd++;
			for(int k=i+1;k<n;k++) {
				
				if(charInd==find.length() || find.charAt(charInd)!=arr[k][j]) {
					break;
				}
				emp+=find.charAt(charInd);//ime
				charInd++;
				start2=k;
				end2=j;
			}
			if(emp.equals(find)) {
				
				break;
			}
			
		}
	}
	
	
	void verticalReverse() {
		
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//size
		char[][] arr = new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=in.next().charAt(0);//charcters
				//char input
			}
		}
		in.nextLine();
		String find = in.nextLine();//lime
		
		
		int start1=0,start2=0,end1=0,end2=0;
		
		
		int charInd = 0;
		String emp="";
		TwoDFind fi = new TwoDFind();
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				boolean isTrue= fi.verticalSearch(find,arr,i,j,n,start1,end1,start2,end2,emp,charInd) ? fi.verticalReverse();
				
				
			}
			
			if(emp.equals(find)) {
				return true;
				break;
			}
		}
		
		System.out.println("Strating index"+start1+","+end1);
		System.out.println("Ending index"+start2+","+end2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
