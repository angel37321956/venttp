define('talkInfoMod', function (require, exports) {
    exports.extend = function (md) {
        md.controller('talkInfoCtrl', function ($scope, dwrService) {
            $scope.fn.dwrInit = function (userId) {
                dwrService.initDwrSerbice(userId);
            };
            $scope.fn.receive = function (msg) {
                var index = msg.indexOf($scope.data.contains.TALK_LIST_FLAG);
                var receiveName = msg.substring(0, index);
                if (_.isEqual(receiveName, $scope.userInfo.nickName)) {
                    return;
                }
                if (_.isEmpty($scope.fn.sendPers)) {
                    $scope.fn.sendPers = receiveName;
                }
                $scope.fn.handleTalkInfo(msg);
            };
        })
    }
});
function receive(msg) {
    var appElement = document.querySelector('[ng-controller="indexCtrl"]');
    var $scope = angular.element(appElement).scope();
    $scope.fn.receive(msg);
}