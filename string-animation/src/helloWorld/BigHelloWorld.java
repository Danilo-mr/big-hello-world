package helloWorld;

public class BigHelloWorld {
	public static String[][] frameByFrame;

	static {
		frameByFrame = new String[34][2];
		
		frameByFrame[0][0]   = ".........   .........  ............   ........         ........         ................";
		frameByFrame[1][0]   = ":       :   :       :  :          :   :      :         :      :         :              :";
		frameByFrame[2][0]   = ":       :   :       :  :          :   :      :         :      :         :   ........   :";
		frameByFrame[3][0]   = ":       :   :       :  :     .....:   :      :         :      :         :   :      :   :";
		frameByFrame[4][0]   = ":       :...:       :  :     :        :      :         :      :         :   :      :   :";
		frameByFrame[5][0]   = ":                   :  :     :        :      :         :      :         :   :      :   :";
		frameByFrame[6][0]   = ":                   :  :     :....    :      :         :      :         :   :      :   :";
		frameByFrame[7][0]   = ":                   :  :         :    :      :         :      :         :   :      :   :";
		frameByFrame[8][0]   = ":                   :  :         :    :      :         :      :         :   :      :   :";
		frameByFrame[9][0]   = ":                   :  :     ....:    :      :         :      :         :   :      :   :";
		frameByFrame[10][0]  = ":       .....       :  :     :        :      :         :      :         :   :      :   :";
		frameByFrame[11][0]  = ":       :   :       :  :     :        :      :         :      :         :   :      :   :";
		frameByFrame[12][0]  = ":       :   :       :  :     :......  :      :.......  :      :.......  :   :      :   :";
		frameByFrame[13][0]  = ":       :   :       :  :           :  :             :  :             :  :   :......:   :";
		frameByFrame[14][0]  = ":       :   :       :  :           :  :             :  :             :  :              :";
		frameByFrame[15][0]  = ":.......:   :.......:  :...........:  :.............:  :.............:  :..............:";	
		frameByFrame[16][0]  = "";
		frameByFrame[17][0]  = "";
		frameByFrame[18][0]  = "......              .......  ................  ............       ........         .........             ";
		frameByFrame[19][0]  = ":    :              :     :  :              :  :           :      :      :         :        :";
		frameByFrame[20][0]  = ":    :              :     :  :   ........   :  :    .....   :     :      :         :   ...   :       ";
		frameByFrame[21][0]  = ":    :              :     :  :   :      :   :  :   :     :   :    :      :         :   :  :   :";
		frameByFrame[22][0]  = ":    :              :     :  :   :      :   :  :   :     :   :    :      :         :   :   :   :";
		frameByFrame[23][0]  = ":    :              :     :  :   :      :   :  :   :     :   :    :      :         :   :    :   :";
		frameByFrame[24][0]  = ":    :              :     :  :   :      :   :  :   :     :   :    :      :         :   :    :   :";
		frameByFrame[25][0]  = ":    :      ...     :     :  :   :      :   :  :   :     :   :    :      :         :   :    :   :";
		frameByFrame[26][0]  = ":    :     :   :    :     :  :   :      :   :  :    .....    :    :      :         :   :    :   :   ";
		frameByFrame[27][0]  = ":    :    :     :   :     :  :   :      :   :  :            :     :      :         :   :    :   :  ";
		frameByFrame[28][0]  = ":    :   :   :   :  :     :  :   :      :   :  :     .    :       :      :         :   :    :   :";
		frameByFrame[29][0]  = ":     : :   : :   : :     :  :   :      :   :  :    : .    :      :      :         :   :   :   :";
		frameByFrame[30][0]  = " :     :   :   :   :     :   :   :      :   :  :    :  :    :     :      :.......  :   :  :   :";
		frameByFrame[31][0]  = "  :       :     :       :    :   :......:   :  :    :   :    :    :             :  :   :..   :   ";
		frameByFrame[32][0]  = "   :     :       :     :     :              :  :    :    :    :   :             :  :        :  ";
		frameByFrame[33][0]  = "    :....         ....:      :..............:  :....:     .....:  :.............:  :.......:                                ";
	}

	public static String helloWorld() {
		allFrameOnce();	
		return "";
	}

	private static void allFrameOnce() {
		try {

			int c = 0;
			while (frameByFrame[0][c]!=null) {
				for (int i = 0; i <= 33; i++) {
					System.out.println(frameByFrame[i][c]);
					Thread.sleep(750);
				}
				//System.out.println("\n\n\n\n\n\n");
				Thread.sleep(500);
				c++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	

	
	
	
	
	public static void main(String[] main) {
		System.out.println(helloWorld());
	}
}















