var splitBySlash = "/";
var getURL = function(){
	var url = window.location.href;
	return url.split(splitBySlash)[0]+url.split(splitBySlash)[1];
};
var indexApp = angular.module('indexApp', []);
indexApp.controller('IndexController',function IndexController($scope, $http){
	$http.get(getURL()+'/api/rooms').then(function(response){
		$scope.rooms = response.data;
	});
});
