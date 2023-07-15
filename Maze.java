package stack;

public class Maze {

	public static int move(int move,int number) {
		
		switch(move) {
			case 1:{
				if(number==1) {
					return -1;
				}else {
					return 0;
				}
			}
			case 2:
				if(number==1) {
					return 0;
				}else {
					return 1;
				}
			case 3:
				if(number==1) {
					return 1;
				}else {
					return 0;
				}
			case 4:
				if(number==1) {
					return 0;
				}else {
					return -1;
				}
			default:
				return 0;
		}
	}
	
	public static void main(String[] args) {
		int maze[][] = {
				  {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			      {1, 0, 0, 0, 0, 0, 0, 0, 1, 1},
			      {1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
			      {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
			      {1, 0, 1, 0, 0, 1, 1, 0, 1, 1},
			      {1, 0, 1, 1, 1, 0, 0, 1, 1, 1},
			      {1, 0, 1, 0, 0, 0, 1, 0, 1, 1},
			      {1, 0, 0, 0, 1, 0, 0, 0, 1, 1},
			      {1, 1, 1, 1, 1, 0, 1, 0, 0, 1},
			      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
		};
		int mark[][] = new int[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				mark[i][j] = 0;
			}
		}
		mark[1][1] = 1;
		
		Stack<Integer> row = new Stack<>();
		Stack<Integer> col = new Stack<>();
		Stack<Integer> move = new Stack<>();
		
		Stack<Integer> rowPrint = new Stack<>();
		Stack<Integer> colPrint = new Stack<>();
		
		row.push(1);
		col.push(1);
		move.push(1);
		int i,j,mov,g,h;
		while(!row.isEmpty()) {
			i = row.pop();
			j = col.pop();
			mov = move.pop()+1;
			
			while(mov<=4) {
				g = i+move(mov,1);
				h = j+move(mov,2);
				
				if(g==8 && h==8) {
					row.push(i);
					col.push(j);
					System.out.println("Clear!");
					while(!row.isEmpty()) {
						rowPrint.push(row.pop());
						colPrint.push(col.pop());
					}
					while(!rowPrint.isEmpty()) {
						System.out.println("["+rowPrint.pop()+","+colPrint.pop()+"]");
					}
					System.out.println("[8,8]");
				}
				else if(maze[g][h]==0 && mark[g][h]==0) {
					
					mark[g][h] = 1;
					row.push(i);
					col.push(j);
					move.push(mov);
					i = g;
					j = h;
					mov = 0;
				}
				mov++;
			}
		}
		
		
	
	}
}
