import java.util.Scanner;

public class Practice09_03 {
    public static void main(String[] args) {
// 変数の宣言
        int num;
// Scannerの用意
        Scanner scan = new Scanner(System.in);

        System.out.print("0:日本語 1:英語 を入力してください->");
        num = scan.nextInt();
        scan.nextLine(); // 改行クリア！

        String name, hobby, comment; //名前、趣味、コメントはString型

        if (num == 0) { //日本語
            System.out.print("あなたの名前を入力してください："); 
        } else if (num == 1) { //英語
            System.out.print("Please enter your name: ");
        }
        name = scan.nextLine(); // ← 入力を受け取る(Line:1行分、文字列として扱うらしい(調べた))

        if (num == 0) {
            System.out.print("あなたの趣味を入力してください：");
        } else if (num == 1) {
            System.out.print("Please enter your hobby: ");
        }
        hobby = scan.nextLine(); 

        if (num == 0) {
            System.out.print("何か一言お願いします：");
        } else if (num == 1) {
            System.out.print("Please leave a short comment: ");
        }
        comment = scan.nextLine(); 

        String prof = createIntro(num, name, hobby, comment); // createIntroという名でメソッドを用意して使用
        System.out.println("--- 自己紹介 ---"); 
        System.out.println(prof); // profに代入したcreateIntroの情報を出力
    }

 // 戻り値あり、引数ありメソッド
    public static String createIntro(int num, String name, String hobby, String comment) { //引数あり。int numで一応int型で渡したが。。？
        if (num == 0) {
            return "わたしの名前は" + name + "です\n" + "趣味は" + hobby + "です\n" + comment; // 戻り値あり
        } else if (num == 1) {
            return "My name is " + name + ".\n" + "My hobby is " + hobby + ".\n" + comment;
        } else {
        	return comment; //elseの最後は何かreturnを返さないといけないらしい."comment"は適当に入れた.(この場合、どんな戻り値にすればよいのだろう？) 
        }
        }
    }