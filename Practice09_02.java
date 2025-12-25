public class Practice09_02 {
	public static void main(String[] args) {
        String name = profile1();
        String hobby = profile2();
        String comment = profile3();
        System.out.println("わたしの名前は" +  name + "です");
        System.out.println("趣味は" +  hobby + "です");
        System.out.println(comment);

	}
		
// 戻り値あり、引数なしメソッド
    public static String profile1() {
        String name = "Owen Frost";
        return name;
    }
    public static String profile2() {
        String hobby = "ジョギング";
        return hobby;
    }
    public static String profile3() {
        String comment = "よろしくお願いいたします";
        return comment;
    }
}
