public class Practice06_step_02 {
	public static void main(String[] args) {
// 変数の宣言
		int num = 0;
		int odd = 0;
		int even = 0;
// Whileでの繰り返し
		while (num < 100) { //numが100未満ならtrueなら以下を実行する
			num++;
			if (num % 2 != 0) { //numが2で割り切れない数(奇数)ならodd+=numを実行する
				odd+=num;				
			}
			else if (num % 2 == 0) { //numが2で割り切れる数(偶数)ならeven+=numを実行する
				even+=num;				
			}
		}
		System.out.println("---0～100の奇数の総和---");
		System.out.println(odd);
		System.out.println("---0～100の偶数の総和---");
		System.out.println(even);
	}
}