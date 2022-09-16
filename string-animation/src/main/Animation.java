package main;

public class Animation {
	public String[][] frameByFrame;
	
	{
		frameByFrame = new String[100][100];
		frameByFrame[0][0] =  " _________";
		frameByFrame[1][0] =  "|         |";
		frameByFrame[2][0] =  "|   i   i |";
		frameByFrame[3][0] =  "|         |";
		frameByFrame[4][0] =  "|     ´   |";
		frameByFrame[5][0] =  "|_________|";
		frameByFrame[6][0] =  "     |";
		frameByFrame[7][0] =  "     |";
		frameByFrame[8][0] =  "     |";
		frameByFrame[9][0] =  "    /|\\";
		frameByFrame[10][0] = "   / | \\";
		frameByFrame[11][0] = "  E  |  H";
		frameByFrame[12][0] = "     |";
		frameByFrame[13][0] = "    / \\";
		frameByFrame[14][0] = "   /   \\";
		frameByFrame[15][0] = "  /     \\";
		frameByFrame[16][0] = "================================================================";
	}
	
	public void walk() {
		for(int i=0; i<=16; i++) {
			System.out.println(this.frameByFrame[i][0]);
		}
	}
}
