define('talkMod', function (require, exports) {
    exports.extend = function (md) {

        md.controller('talkCtrl', function ($scope) {
            $scope.fn.send = function () {
                var msg = $scope.msg;
                if (_.isEmpty(msg)) {
                    return;
                }
                if (_.isEmpty($scope.fn.sendPers)) {
                    return;
                }
                msg = $scope.fn.userInfo.userId + $scope.data.contains.TALK_LIST_FLAG + msg;
                SendMessage.sendMsg($scope.fn.sendPers.userId, msg, $scope.data.contains.RECEIVE_FLAG);
                var talkInfo = msg.replace($scope.fn.userInfo.userId, $scope.fn.userInfo.nickName);
                $scope.fn.handleTalkInfo(talkInfo);
                $scope.msg = '';
            };
            
            $scope.fn.sendUserId = function (nickName, userId) {
                var msg = nickName + $scope.data.contains.ONLINE_USER_INFO + userId;
                SendMessage.sendMsg($scope.fn.sendPers.userId, msg, $scope.data.contains.RECEIVE_FLAG);
            }
        })
    }
});