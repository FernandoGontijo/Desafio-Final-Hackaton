angular.module("heroi").controller("heroiCtrl", function ($scope, heroisService, $location ) {
	var vm = this;
	vm.app = "Heróis";
	vm.service = heroisService;
	vm.herois = [];
	
	vm.usuario = {
			nickname: null,
			senha:null
	}

	vm.init = function(){
		vm.login = true;
		vm.carregarHerois();
	}

	vm.carregarHerois = function () {
		vm.service.getHerois().success(function (data) {
			vm.herois = data;
		}).error(function (data, status) {
			vm.message = "Aconteceu um problema: " + data;
		});
	};

	vm.irCadastrar = function () {
		vm.cadastrar = true;
		vm.login = false;
	}

	vm.cadastroJogador= function(){ //função para cadastrar jogador
		vm.service.cadastroJogador(vm.user).success(function(data){

		}).error(function(data, status){
			vm.message = "Aconteceu um problema: " + data;
		});
		
		vm.irLogin();
	}

	vm.irLogin = function () {
		vm.login = true;
		vm.cadastrar = false;
	}
	

	vm.Login = function(){
		
		vm.service.login(vm.usuario).success(function(data){
			   
		$location.path("/batalha");
			   
			   
		}).error(function(data, status){
			vm.message = data;
		});
		
	}
});