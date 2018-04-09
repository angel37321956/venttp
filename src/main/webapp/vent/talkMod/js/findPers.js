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
                var nickName = $scope.fn.userInfo.nickName;
                if (_.isEmpty(nickName)) {
                    return;
                }
                var url = httpUrl.getPostUrl($scope.data.contains.FIND_ONLINE_PERS_API);
                $http.post(url, $scope.fn.userInfo).then(function (response) {
                    var data = response.data;
                    $scope.fn.userInfo = data;
                    $scope.fn.dwrInit($scope.fn.userInfo.userId);
                    if (!_.isEmpty(data.onlinePers)) {
                        //如果匹配到在线用户，则将在线用户保存
                        $scope.fn.sendPers = data.onlinePers;
                        //发送自己的nickName给匹配到的用户
                        $scope.fn.sendUserId($scope.fn.userInfo.nickName, $scope.fn.userInfo.userId);
                    }
                    $scope.ctrl.showFindPers = false;
                    $scope.ctrl.showTalkWin = true;
                })
            }
        })
    }
})