package com.venttp.articles.dao;

import com.venttp.articles.dto.ArticleInfoDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleInfoDao {

    /**
     * 获取首页文章信息
     * @return
     */
    List<ArticleInfoDTO> getIndexArticlesInfoList ();

    /**
     * 获取文章内容
     * @return
     */
    ArticleInfoDTO getArticleInfo(ArticleInfoDTO articleInfoDTO);
}
