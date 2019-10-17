angular.module("heroi").controller("batalhaCtrl", function ($scope, heroisService) {
    var vm = this;
    vm.service = heroisService;

    vm.adversario = {
        tipo: null,
        heroi: ""
    };

    vm.vencedor = {
        nome: null
    };


    vm.setTipoAdversario = function(tipo) {
        vm.adversario.tipo = tipo;

            if(tipo == 'M'){
                vm.adversario.heroi = '2';
            }
    }

    vm.setVencedor = function(){

        vm.service.getVencedor().success(function(nome){
            vm.vencedor.nome = nome;
        }).error(function(){
            vm.message = "Ocorreu um erro";
        });

    };



});