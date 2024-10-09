
public class SwitchSample {

	public static void main(String[] args) {
		int score=59;//成績

		//rankingメソッドを呼び出し、ランクを取得
		int rank = ranking(score);

		switch(rank) {
		//scoreが0～59までの場合
		case 0 :
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
			System.out.println("赤点です．．．補講を行います");
			break;

		//scoreが６０から７９までの場合
		case 6 :
		case 7 :
			System.out.println("合格です！");
			break;
		//scoreが８０から９９までの場合
		case 8 :
		case 9 :
			System.out.println("よくできました！");
			break;
		//scoreが１００の場合
		case 10 :
			System.out.println("満点です！ご褒美をあげます！");
			break;
		//scoreが０を下回るまたは１００を超えたの場合
		default:
			System.out.println("点数は0以上１００位内で代入してください。");
			break;

		}

	}

	public static int ranking(int score) {
		//引数scoreの値が０を下回る場合
		if(score<0) {
			//加減の無効な値として-1を返す
			return -1;
		//引数scoreの値が１００を超えた場合
		}else if(score>100) {
			//上限の無効な値として１１を返す
			return 11;
		}else {
			//有効な値としてランクを算出し、結果を返す
			return score /10;

		}
	}
}
