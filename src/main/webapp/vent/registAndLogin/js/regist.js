define('registMod', function (require) {
    var contains = require('venttp.contains');
    var app = angular.module('registApp', []);
    app.controller('registCtrl', function ($scope, $http, httpUrl) {
        (function () {
            $scope.registInfo = {};
        })();
        $scope.regist = function () {
            // var registInfo = {
            //     'userAccount' : 'angel123456'
            // }
            var registInfo = JSON.stringify($scope.registInfo);
            var url = httpUrl.getPostUrl(contains.USER_REGIST_API);
            $http.post(url, registInfo).then(function (response) {
                var data = response.data;
                console.log(data);
            })
        }
    });
    require('venttp.module').extend(app);
});