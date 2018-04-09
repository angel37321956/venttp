define('talkInfoMod', function (require, exports) {
    exports.extend = function (md) {
        md.controller('talkInfoCtrl', function ($scope, dwrService) {
            $scope.fn.dwrInit = function (userId) {
                dwrService.initDwrService(userId);
            };
            $scope.fn.receive = function (msg) {
                var userIdIndex = msg.indexOf($scope.data.contains.ONLINE_USER_INFO);
                if (userIdIndex > -1) {
                    $scope.fn.sendPers.nickName = msg.substring(0, userIdIndex);
                    $scope.fn.sendPers.userId = msg.substring(userIdIndex, msg.length)
                        .replace($scope.data.contains.ONLINE_USER_INFO, '');;
                    return;
                }
                var index = msg.indexOf($scope.data.contains.TALK_LIST_FLAG);
                var receiveId = msg.substring(0, index);
                if (_.isEqual(receiveId, $scope.fn.userInfo.userId)) {
                    return;
                }
                var talkInfo = msg.replace($scope.fn.sendPers.userId, $scope.fn.sendPers.nickName);
                $scope.fn.handleTalkInfo(talkInfo);
            };
        })
    }
});
function receive(msg) {
    var appElement = document.querySelector('[ng-controller="indexCtrl"]');
    var $scope = angular.element(appElement).scope();
    $scope.fn.receive(msg);
}