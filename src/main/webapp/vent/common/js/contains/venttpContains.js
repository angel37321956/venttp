define('venttp.contains', function () {
    var CONTAINS = {

        /**
         * 标志常量定义
         */
        //接收标记
        RECEIVE_FLAG : 'receive',
        //接收聊天记录标记，用于分离用户名与消息
        TALK_LIST_FLAG : 'venttpFlag',
        //请求返回成功标志常量
        RESPONSE_SUCCESS_CODE : '1',
        //请求返回失败标志常量
        RESPONSE_FAILED_CODE : '0',

        /**
         * 接口
         */
        //随机寻找用户信息用于聊天
        FIND_ONLINE_PERS_API : 'indexCtrl/findPers',
        //首页文章列表接口
        INDEX_ARTICLE_LIST_API : 'getAticles/getIndexArticlesInfo',
        //根据文章编码调取文章信息
        ARTICLE_NO_INFO_API : 'getAticles/getArticleInfo',
        //注册用户信息接口
        USER_REGIST_API : 'registLogin/registUser',
        //用户登录接口
        USER_LOGIN_API : 'registLogin/userLogin',

        /**
         * 页面跳转路径
         */
        //文章展示页面路径
        ARTICL_PAGE_URL : '/html/article/article.html?articleNo=',
        //注册页面路径
        REGIST_OAGE_URL : '/html/registAndLogin/regist.html',
        //登录页面路径
        USER_LOGIN_URL : 'html/registAndLogin/login.html',
        //登录成功跳转个人中心页面路径s
        USER_CENTER_PAGE_URL : 'html/userCenter/centerIndex.html',
        //发表文章页面路径
        PUBLISH_PAGE_URL : 'html/userCenter/publishArticle.html'
    };
    return CONTAINS;
});