define('publishArticleMod', function (require) {
    var contains = require('venttp.contains');
    var app = angular.module('publishArticleApp', []);
    app.controller('publishArticleCtrl', function ($scope, $http, httpUrl) {
        (function () {
            $scope.articleInfo = {};
        })();
        $scope.publishArticle = function () {
            var url = contains.PUBLISH_ARTICLE_API;
            var articleInfo = JSON.stringify($scope.articleInfo);
            $http.post(url, articleInfo).then(function (response) {
                var data = response.data;
                console.log(data);
            })
        }
    })
    require('venttp.module').extend(app);
});