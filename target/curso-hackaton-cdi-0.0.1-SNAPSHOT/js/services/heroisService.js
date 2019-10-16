angular.module("heroi").factory("heroisService", function ($http) {
	var baseUrl = 'http://localhost:8080/curso-hackaton-cdi';
	var _getHerois = function () {
		return $http.get(baseUrl + '/heroi');
	};


	var _cadastroJogador = function(user){
		return $http.post(baseUrl + '/jogador', user)
	}

	return {
		getHerois: _getHerois,
		cadastroJogador: _cadastroJogador
	};	

	

});