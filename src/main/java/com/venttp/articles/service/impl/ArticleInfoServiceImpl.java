package com.venttp.articles.service.impl;

import com.venttp.articles.dao.ArticleInfoDao;
import com.venttp.articles.dto.ArticleInfoDTO;
import com.venttp.articles.service.ArticleInfoService;
import com.venttp.base.contains.VenttpContains;
import com.venttp.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ArticleInfoServiceImpl implements ArticleInfoService{


    @Autowired
    private ArticleInfoDao articleInfoDao;

    /**
     * 获取首页文章信息
     * @return
     */
    @Override
    public List<ArticleInfoDTO> getIndexArticlesInfoList() throws Exception {
        List<ArticleInfoDTO> indexArticlesInfo = articleInfoDao.getIndexArticlesInfoList();
        return indexArticlesInfo;
    }

    /**
     * 获取文章内容
     * @return
     */
    @Override
    public ArticleInfoDTO getArticleInfo(ArticleInfoDTO articleInfoDTO) throws Exception {
        ArticleInfoDTO articleInfo = articleInfoDao.getArticleInfo(articleInfoDTO);
        return articleInfo;
    }

    /**
     * 发表文章
     * @param articleInfoDTO
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, String> publishArticle(ArticleInfoDTO articleInfoDTO) throws Exception {
        articleInfoDTO.setArticleNo(RandomUtils.getUUID());
        Integer integer = articleInfoDao.publishArticle(articleInfoDTO);
        return VenttpContains.getRegistResultMap(integer, VenttpContains.PUBLISH_ARTICLE_FLAG);
    }
}
