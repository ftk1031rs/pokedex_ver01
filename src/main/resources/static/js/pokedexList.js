// 引数で指定されたパスでサブミットする
function buttonClick(path) {	
	// このあと入力チェックを行う
	let form = document.getElementsByTagName('form')[0];
	form.action = path;
	form.method = "post";
	form.submit();
}

// 数値項目がNULLの場合に0をデフォルトセットする
function defaultValSet(val,elementName){
	var elementObj = document.forms['pokedexSearchForm'][elementName];
	if(typeof val === "undefined" || !val){
		elementObj.setAttribute('value',0);
	}
}