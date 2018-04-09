define('venttp.module', function (require, exports) {
    var contains = require('venttp.contains');
    exports.extend = function (md) {
        md.factory('dwrService', function () {
            var service = {};
            service.initDwrService = function (userId) {
                dwr.engine.setActiveReverseAjax(true);//激活反转
                dwr.engine.setNotifyServerOnPageUnload(true);
                SendMessage.onPageLoad(userId);
            };
            return service;
        });
        md.factory('httpUrl', function () {
            //本地idea启动tomcat
            var appUrl = 'http://localhost/';
            //tomcat启动,为本机IP地址,需在Connector标签加入adress="0.0.0.0"
            //以及在Host标签中加上<Context path="" docBase="venttp" debug="0" reloadable="true"/>
            // var appUrl = 'http://192.168.1.4/';
            var service = {};
            service.getPostUrl = function (url) {
                return appUrl + url;
            };
            service.openPage = function (url) {
                $('body').append($('<a href="'+service.getPostUrl(url)+'" target="_blank" id="openWin"></a>'))
                document.getElementById("openWin").click();//点击事件
                $('#openWin').remove();
            };
            return service;
        })
    }
});