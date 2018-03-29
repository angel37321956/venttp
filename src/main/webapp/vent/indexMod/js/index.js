define('indexMod', function (require) {
    var contains = require('venttp.contains');
    var app = angular.module('indexApp', []);
    app.controller('indexCtrl', function ($scope, $timeout) {
        (function () {
            //方法
            $scope.fn = {};
            //注册用户信息
            $scope.userCenterInfo = {};
            //控制器
            $scope.ctrl = {};
            //数据
            $scope.data = {};
            //临时用户信息
            $scope.userInfo = {};
            //初始化聊天记录保存列表
            $scope.data.talkInfoList = [];
            //初始化常亮列表
            $scope.data.contains = contains;

            //首页文章列表
            $scope.data.commonArticlesList = [];
        })();

        /**
         * 聊天记录处理
         * @param msg
         */
        $scope.fn.handleTalkInfo = function (msg) {
            var talkInfoList = $scope.data.talkInfoList;
            var date = new Date().toLocaleTimeString();
            msg = msg.replace($scope.data.contains.TALK_LIST_FLAG, ' : ');
            var talkInfo = {
                'time' : date,
                'msg' : msg
            };
            $timeout(function () {
                //更新$scope数据/界面的代码
                talkInfoList.push(talkInfo);
            });
        }
        
        $scope.fn.regisst = function () {

        }
    });
    require('talkMod').extend(app);
    require('talkInfoMod').extend(app);
    require('findPersMod').extend(app);
    require('articlesMod').extend(app);
    require('venttp.module').extend(app);
});