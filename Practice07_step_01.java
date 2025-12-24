public class Practice07_step_01 {
	public static void main(String[] args) {
// 	2次元配列の初期化
		int[][] array = new int [9][9];
		for (int i = 1; i <= 9; i++) { //iを1から9まで1づつ加算
			for (int j = 1; j <= 9; j++) { //jを1から9まで1づつ加算
// 配列にデータを代入
				array[i-1][j-1] = i * j; // 配列番号は"0"からなので"-1"とし、i*jの結果を格納
				System.out.print(array[i-1][j-1] + " "); // 配列から九九表を取り出し、結果を表示
			}
			System.out.println(); //改行してint iのfor文に戻る(i=9まで)	
		}
	}
}





