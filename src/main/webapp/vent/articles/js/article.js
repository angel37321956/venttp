define('articleMod', function (require) {
    var contains = require('venttp.contains');
    var app = angular.module('articleApp', []);
    app.config(['$locationProvider', function($locationProvider) {
        $locationProvider.html5Mode({
            enabled: true,
            requireBase: false
        });
    }]);
    app.controller('articleCtrl', ['$scope', '$location', 'httpUrl', '$http', function ($scope, $location, httpUrl, $http) {
        (function () {
            //获取url参数，并根据文章编号调取文章相关信息初始化
            $scope.articleNo = $location.search().articleNo;
            var url = httpUrl.getPostUrl(contains.ARTICLE_NO_INFO_API);
            var param = {
                'articleNo' : $scope.articleNo
            };
            $http.post(url, param).then(function (response) {
                var data = response.data;
                if (_.isEmpty(data)) {
                    return;
                }
                $scope.articleInfo = data;
            })
        })();
        console.log($scope.articleNo);
    }]);
    require('venttp.module').extend(app);
});