define('venttp.contains', function () {
    var CONTAINS = {

        /**
         * 聊天相关
         */
        //接收标记
        RECEIVE_FLAG : 'receive',
        //接收聊天记录标记，用于分离用户名与消息
        TALK_LIST_FLAG : 'venttpFlag',
        //随机寻找用户信息用于聊天
        FIND_ONLINE_PERS_API : 'indexCtrl/findPers',

        /**
         * 文章相关
         */
        //文章展示页面路径
        ARTICL_PAGE_URL : '/html/article/article.html?articleNo=',
        //首页文章列表接口
        INDEX_ARTICLE_LIST_API : 'getAticles/getIndexArticlesInfo',
        //根据文章编码调取文章信息
        ARTICLE_NO_INFO_API : 'getAticles/getArticleInfo'
    };
    return CONTAINS;
});