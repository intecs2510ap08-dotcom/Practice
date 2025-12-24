public class Practice06 {
	public static void main(String[] args) {
// 変数の宣言
		int num = 0;
		int sum = 0;
// Whileでの繰り返し
		while (num < 100) { //numが100未満ならtrueとしnum++,sum+=numを実行する
			num++;
			sum+=num;
		}
		System.out.println("---0～100の総和---");
		System.out.println(sum);
	}
}
