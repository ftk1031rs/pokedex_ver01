// 引数で指定されたパスでサブミットする
function openLoginWindow() {	
    window.open('toppage/loginWindow.html', 'child', 'width=500,height=250')
}

// 引数で指定されたパスでサブミットする
function login(path) {	
	// このあと入力チェックを行う
	let form = document.getElementsByTagName('form')[0];
	form.action = path;
	form.method = "post";
	form.submit();
}


// TODO 後で消す
// 引数で指定されたパスでサブミットする
function buttonClick(path) {	
	// このあと入力チェックを行う
	let form = document.getElementsByTagName('form')[0];
	form.action = path;
	form.method = "post";
	form.submit();
}