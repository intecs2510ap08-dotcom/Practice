public class Practice06_step_01 {
	public static void main(String[] args) {
// 変数の宣言
		int num = 0;
		int sum = 0;
// Whileでの繰り返し
		while (num < 100) { //numが100未満ならtrueなら以下を実行する
			num++;
			if (num % 2 != 0) { //numが2で割り切れない数(奇数)ならsum+=numを実行する
				sum+=num;				
			}
		}
		System.out.println("---0～100の奇数の総和---");
		System.out.println(sum);
	}
}