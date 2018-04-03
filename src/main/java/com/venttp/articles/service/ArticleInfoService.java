package com.venttp.articles.service;

import com.venttp.articles.dto.ArticleInfoDTO;
import java.util.List;

public interface ArticleInfoService {

    /**
     * 获取首页文章信息
     * @return
     */
    List<ArticleInfoDTO> getIndexArticlesInfoList () throws Exception;

    /**
     * 获取文章内容
     * @return
     */
    ArticleInfoDTO getArticleInfo (ArticleInfoDTO articleInfoDTO) throws Exception;
}