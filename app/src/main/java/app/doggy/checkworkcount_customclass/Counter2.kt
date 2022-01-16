package app.doggy.checkworkcount_customclass

// 手順2
//// プライマリコンストラクタの引数でプロパティを初期化する
//class Counter2 constructor(count: Int) {
//    var count: Int = count
//
//    // countプロパティの値を1増やすメソッド
//    fun incr() {
//        count += 1
//    }
//}

//// constructorのキーワードは省略できる
//class Counter2(count: Int) {
//    var count: Int = count
//
//    fun incr() {
//        count += 1
//    }
//}

// プライマリコンストラクタの引数をそのままプロパティにする場合、さらに簡潔に書ける
class Counter2(var count: Int) {
    fun incr() {
        count += 1
    }
}

//// プライマリコンストラクタではデフォルト引数を使用できる。
//// 例えば、インスタンス化する時にcountの引数を指定しない場合、countの初期値をデフォルトで0にすることができる
//class Counter2(var count: Int = 0) {
//    fun incr() {
//        count += 1
//    }
//}