
public class WhileSample {

	public static void main(String[] args) {
		int num = 1024;//初期値設定

		//繰り返しの条件（numが１０２４より小さい間）
		while(num<1024) {
			//2の累乗を計算
			num = num*2;

			//結果を出力
			System.out.println(num);
		}

	}

}
