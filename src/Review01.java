
public class Review01 {

	public static void main(String[] args) {
		// 商品価格を代入
		int price=1500;

		//taxメソッドを呼び出し
		int tax_amount=tax(price);

		//税込価格を計算
		int total_price = price+tax_amount;

		//結果
	System.out.println(price+"円の商品の税込価格は"+total_price+"円(消費税は"+tax_amount+"円）です。");
	}

	//消費税額を求める
    public static int tax(int price) {
		//消費税率を１０％と定義
    double tax_rate =0.1;
    //整数値にする（キャスト）
    int tax_amount=(int)(price*tax_rate);
    return tax_amount;
	}

}
