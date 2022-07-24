// 引数で指定されたパスでサブミットする
function buttonClick(path) {
	// ポケモンID
	var pokemonId = document.getElementById('pokemonId').value;
	// ポケモン日本語名
	var pokemonJpName = document.getElementById('pokemonJpName').value;
	// ポケモン英語名
	var pokemonEnName = document.getElementById('pokemonEnName').value;
	// タイプ
	var typeId = document.getElementById('typeId').value;
	// 高さ
	var height = document.getElementById('height').value;
	// 重さ
	var weight = document.getElementById('weight').value;
	// このあと入力チェックを行う
	let form = document.getElementsByTagName('form')[0];
	form.action = path;
	form.method = "post";
	form.submit();
}