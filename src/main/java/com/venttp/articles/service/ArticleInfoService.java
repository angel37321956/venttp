package com.venttp.articles.service;

import com.venttp.articles.dto.ArticleInfoDTO;
import java.util.List;
import java.util.Map;

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

    /**
     * 发表文章
     * @param articleInfoDTO
     * @return
     * @throws Exception
     */
    Map<String, String> publishArticle (ArticleInfoDTO articleInfoDTO) throws Exception;
}