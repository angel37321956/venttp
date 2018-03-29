define('talkMod', function (require, exports) {
    exports.extend = function (md) {

        md.controller('talkCtrl', function ($scope, dwrService) {
            $scope.fn.dwrSendInit = function (userId) {
                dwrService.initDwrSerbice(userId);
            }
            $scope.fn.send = function () {
                var msg = $scope.msg;
                if (_.isEmpty(msg)) {
                    return;
                }
                if (_.isEmpty($scope.fn.sendPers)) {
                    return;
                }
                msg = $scope.userInfo.nickName + $scope.data.contains.TALK_LIST_FLAG + msg;
                SendMessage.sendMsg($scope.fn.sendPers, msg, $scope.data.contains.RECEIVE_FLAG);
                $scope.fn.handleTalkInfo(msg);
                $scope.msg = '';
            };
        })
    }
})