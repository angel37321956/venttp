define('articlesMod', function (require, exports) {
    exports.extend = function (md) {
        md.controller('articlesCtrl', function ($scope, $http, httpUrl, $filter) {
            (function () {
                /**
                 * 初始化主页文章列表
                 */
                var url = httpUrl.getPostUrl($scope.data.contains.INDEX_ARTICLE_LIST_API);
                $http.post(url).then(function (response) {
                    var data = response.data;
                    if (_.isEmpty(data)) {
                        return;
                    }
                    var newVar = $filter("date")('1522768135000', "yyyy-MM-dd HH:mm:ss");
                    console.log(newVar);
                    $scope.data.commonArticlesList = data;
                })
            })();
            /**
             * 跳转文章展示页面
             * @param articleNo
             */
            $scope.goToAriticlePage = function (articleNo) {
                var src = $scope.data.contains.ARTICL_PAGE_URL + articleNo;
                httpUrl.openPage(src);
            }
        })
    }
})