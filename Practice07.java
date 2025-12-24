public class Practice07 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) { //iを1から9まで1づつ加算
			for (int j = 1; j <= 9; j++) { //jを1から9まで1づつ加算
				System.out.print(i * j + " "); // i(1)*j(1-9)を繰り返し実行し結果を表示
			}
			System.out.println(); //改行してint iのfor文に戻る(i=9まで)	
		}
	}
}
