angular.module("heroi").factory("heroisService", function ($http) {
	var baseUrl = 'http://localhost:8080/curso-hackaton-cdi';

	var _getHerois = function () {
		return $http.get(baseUrl + '/heroi');
	};


	var _cadastroJogador = function(user){
		return $http.post(baseUrl + '/jogador', user);
	}

	var _getVencedor = function(){
		return $http.get(baseUrl + '/vencedor');
	}
	
	var _login = function (usuario) {
        return $http.post(baseUrl + '/login', usuario);
    };

	return {
		getHerois: _getHerois,
		cadastroJogador: _cadastroJogador,
		getVencedor: _getVencedor,
		login: _login
	};	

	

});