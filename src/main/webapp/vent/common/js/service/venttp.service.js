define('venttp.module', function (require, exports) {
    var contains = require('venttp.contains');
    exports.extend = function (md) {
        md.factory('dwrService', function () {
            var service = {};
            service.initDwrSerbice = function (userId) {
                dwr.engine.setActiveReverseAjax(true);//激活反转
                dwr.engine.setNotifyServerOnPageUnload(true);
                SendMessage.onPageLoad(userId);
            };
            return service;
        });
        md.factory('httpUrl', function () {
            //本地idea启动
            var appUrl = 'http://localhost:80/';
            //部署tomcat启动
            // var appUrl = 'http://192.168.131.24/';
            var service = {};
            service.getPostUrl = function (url) {
                return appUrl + url;
            };
            service.openPage = function (url) {
                window.open(service.getPostUrl(url));
            };
            return service;
        })
    }
});