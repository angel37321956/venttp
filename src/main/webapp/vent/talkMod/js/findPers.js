define('findPersMod', function (require, exports) {
    exports.extend = function (md) {
        md.controller('findPersCtrl', function ($scope, $http, httpUrl) {
            (function () {
                //初始化显示输入昵称
                $scope.ctrl.showFindPers = true;
                $scope.ctrl.showTalkWin = false;
            })();

            /**
             * 随机寻找寻找在线聊天
             */
            $scope.fn.findPers = function () {
                var nickName = $scope.userInfo.nickName;
                if (_.isEmpty(nickName)) {
                    return;
                }
                var url = httpUrl.getPostUrl($scope.data.contains.FIND_ONLINE_PERS_API);
                $http.post(url, $scope.userInfo).then(function (response) {
                    var data = response.data;
                    $scope.userInfo = data;
                    if (_.isEmpty($scope.fn.sendPers) && !_.isEmpty(data.onlinePers)) {
                        $scope.fn.sendPers = data.onlinePers.nickName;
                    }
                    $scope.fn.dwrInit(nickName);
                    $scope.ctrl.showFindPers = false;
                    $scope.ctrl.showTalkWin = true;
                })
            }
        })
    }
})