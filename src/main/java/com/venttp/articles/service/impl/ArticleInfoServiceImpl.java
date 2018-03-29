package com.venttp.articles.service.impl;

import com.venttp.articles.dao.ArticleInfoDao;
import com.venttp.articles.dto.ArticleInfoDTO;
import com.venttp.articles.service.ArticleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleInfoServiceImpl implements ArticleInfoService{


    @Autowired
    private ArticleInfoDao articleInfoDao;

    /**
     * 获取首页文章信息
     * @return
     */
    @Override
    public List<ArticleInfoDTO> getIndexArticlesInfoList() {
        List<ArticleInfoDTO> indexArticlesInfo = articleInfoDao.getIndexArticlesInfoList();
        return indexArticlesInfo;
    }

    /**
     * 获取文章内容
     * @return
     */
    @Override
    public ArticleInfoDTO getArticleInfo(ArticleInfoDTO articleInfoDTO) {
        ArticleInfoDTO articleInfo = articleInfoDao.getArticleInfo(articleInfoDTO);
        return articleInfo;
    }
}
