angular.module("heroi").factory("heroisService", function ($http) {
	var baseUrl = 'http://localhost:8080/curso-hackaton-cdi';
	var _getHerois = function () {
		return $http.get(baseUrl + '/heroi');
	};


	var cadastroHeroi = function(){
		return $http.post(baseUrl + '/jogador')
	}

	return {
		getHerois: _getHerois
	};	

	

});