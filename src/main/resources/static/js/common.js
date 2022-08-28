// TODO 後で消す
// 引数で指定されたパスでサブミットする
function screenTransition(path) {	
	// このあと入力チェックを行う
	let form = document.getElementsByTagName('form')[0];
	form.action = path;
	form.method = "post";
	form.submit();
}