define('venttp.module', function (require, exports) {
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
            var appUrl = 'http://localhost:8080/';
            var service = {};
            service.getPostUrl = function (url) {
                return appUrl + url;
            }
            return service;
        })
    }
})