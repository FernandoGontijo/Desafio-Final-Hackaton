angular.module("heroi").controller("batalhaCtrl", function ($scope) {
    var vm = this;

    vm.adversario = {
        tipo: null,
        heroi: ""
    };

    vm.setTipoAdversario = function(tipo) {
        vm.adversario.tipo = tipo;

            if(tipo == 'M'){
                vm.adversario.heroi = '2';
            }
    }


});