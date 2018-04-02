define('userCenterMod', function (require) {
    var contains = require('venttp.contains');
    var app = angular.module('centerApp', []);
    app.controller('centerCtrl', function ($scope, $http, httpUrl) {
        (function () {
            $scope.fn = {};
        })();
        $scope.fn.publishArticle = function () {
            var url = contains.PUBLISH_PAGE_URL;
            httpUrl.openPage(url);
        }
    })
    require('venttp.module').extend(app);
});