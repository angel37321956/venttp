define('publishArticleMod', function (require) {
    var contains = require('venttp.contains');
    var app = angular.module('publishArticleApp', []);
    app.controller('publishArticleCtrl', function ($scope, $http, httpUrl) {
        (function () {
            $scope.articleInfo = {};
        })();
        $scope.publishArticle = function () {
            var url = contains.PUBLISH_PAGE_URL;
            console.log(13123);
        }
    })
    require('venttp.module').extend(app);
})