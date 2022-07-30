// 引数で指定されたパスでサブミットする
function buttonClick(path) {
	// ポケモンID
	defaultValSet(document.getElementById('pokemonId').value,'pokemonId');
	// ポケモン日本語名
	var pokemonJpName = document.getElementById('pokemonJpName').value;
	// ポケモン英語名
	var pokemonEnName = document.getElementById('pokemonEnName').value;
	// タイプ
	defaultValSet(document.getElementById('typeId').value,'typeId');
	// 高さ
	defaultValSet(document.getElementById('height').value,'height');
	// 重さ
	defaultValSet(document.getElementById('weight').value,'weight');
	
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