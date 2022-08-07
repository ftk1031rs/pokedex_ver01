// 引数で指定されたパスでサブミットする
function buttonClick(path) {	
	// このあと入力チェックを行う
	let form = document.getElementsByTagName('form')[0];
	form.action = path;
	form.method = "post";
	form.submit();
}