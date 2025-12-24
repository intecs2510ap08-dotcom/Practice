import java.util.Scanner;
public class Practice06_step_03 {
	public static void main(String[] args) {
// 変数の宣言
		int num = 0;
		int sum =0;
		int odd = 0;
		int even = 0;
		int start = 0;
		int end = 0;
//Scannerの用意
	Scanner scan = new Scanner(System.in);
	System.out.println("開始の数->");
	start = scan.nextInt(); // 開始の数 ex)"23"
	System.out.println("終了の数->");
	end = scan.nextInt(); // 終了の数字 ex)"81"
	num = start;
// Whileでの繰り返し
		while (num <= end) { //numがend以下ならtrueならsum+=num以降を実行する
			sum+=num; //開始の数から終了の数に達するまで加算する
			if (num % 2 != 0) { //numが2で割り切れない数(奇数)ならodd+=numを実行する
				odd+=num;				
			}
			else if (num % 2 == 0) { //numが2で割り切れる数(偶数)ならeven+=numを実行する
				even+=num;				
			}			
			num++;
		}
		System.out.println("---" + start + "～" + end + "の総和---");
		System.out.println(sum);
		System.out.println("---" + start + "～" + end + "の奇数の総和---");
		System.out.println(odd);
		System.out.println("---" + start + "～" + end + "の偶数の総和---");
		System.out.println(even);
	}
}


