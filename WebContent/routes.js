angular.module("heroi").config(Config);

Config.$inject = ["$routeProvider"];


function Config($routeProvider) {
	
    $routeProvider
    
        .when("/", {
        	
            templateUrl: "app/index.html"
            	
        })
            
        .when("#/batalha", {
        	
            templateUrl: "app/battle.html"
            	
        })
        
        .otherwise({
        	
            redirectTo: "/"
            	
        });
    
}