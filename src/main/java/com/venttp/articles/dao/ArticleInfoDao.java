package com.venttp.articles.dao;

import com.venttp.articles.dto.ArticleInfoDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleInfoDao {

    /**
     * 获取首页文章信息
     * @return
     */
    List<ArticleInfoDTO> getIndexArticlesInfoList () throws Exception;

    /**
     * 获取文章内容
     * @return
     */
    ArticleInfoDTO getArticleInfo(ArticleInfoDTO articleInfoDTO) throws Exception;

    /**
     * 发表文章
     * @return
     * @throws Exception
     */
    Integer publishArticle(ArticleInfoDTO articleInfoDTO) throws Exception;
}
