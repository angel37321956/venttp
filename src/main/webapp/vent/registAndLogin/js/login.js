define('loginMod', function (require) {
    var contains = require('venttp.contains');
    var app = angular.module('loginApp', []);
    app.controller('loginCtrl', function ($scope, httpUrl, $http) {
        (function () {
            $scope.loginInfo = {};
        })();
        $scope.userLogin = function () {
            var loginInfo = JSON.stringify($scope.loginInfo);
            var url = httpUrl.getPostUrl(contains.USER_LOGIN_API);
            $http.post(url, loginInfo).then(function (response) {
                var data = response.data;
                console.log(data);
            })
        }
    });
    require('venttp.module').extend(app);
});