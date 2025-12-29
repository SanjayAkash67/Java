import java.util.Scanner;

public class Puzzle2 {
	
	
	
	boolean verticalSearch(String find, char[][] arr, int i, int j, int n, int[] start, int[] end) {
		StringBuilder emp = new StringBuilder();
		int charInd = 0;
		if (find.charAt(charInd) == arr[i][j]) {
			start[0] = i;
			start[1] = j;
			emp.append(find.charAt(charInd));
			charInd++;
			int k;
			for (k = i + 1; k < n && charInd < find.length(); k++) {
				if (find.charAt(charInd) != arr[k][j]) {
					break;
				}
				emp.append(find.charAt(charInd));
				charInd++;
			}
			if (emp.toString().equals(find)) {
				end[0] = k - 1;
				end[1] = j;
				return true;
			}
		}
		return false;
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
		
		
		int[] start = new int[2];
		int[] end = new int[2];
		boolean found = false;

		Puzzle2 puzzle = new Puzzle2();
		for (int i = 0; i < n && !found; i++) {
			for (int j = 0; j < n && !found; j++) {
				if (puzzle.verticalSearch(find, arr, i, j, n, start, end)) {
					found = true;
				}
			}
		}

		if (found) {
			System.out.println("Starting index: " + start[0] + "," + start[1]);
			System.out.println("Ending index: " + end[0] + "," + end[1]);
		} else {
			System.out.println("Not found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
