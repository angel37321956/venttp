package com.venttp.articles.controller;

import com.venttp.articles.dto.ArticleInfoDTO;
import com.venttp.articles.service.ArticleInfoService;
import com.venttp.utils.logutil.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/getAticles")
public class ArticleInfoController {

    @Autowired
    private ArticleInfoService articleInfoService;

    /**
     * 获取首页文章信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/getIndexArticlesInfo")
    public List<ArticleInfoDTO> getIndexArticlesInfoList () {
        List<ArticleInfoDTO> indexArticlesInfoList = new ArrayList<ArticleInfoDTO>();
        try {
            indexArticlesInfoList = articleInfoService.getIndexArticlesInfoList();
        } catch (Exception e) {
            LogUtils.error("获取首页文章列表失败,异常信息:" + e);
        }
        return indexArticlesInfoList;
    }

    /**
     * 获取文章内容
     * @return
     */
    @ResponseBody
    @RequestMapping("/getArticleInfo")
    public ArticleInfoDTO getArticleInfo (@RequestBody ArticleInfoDTO articleInfoDTO) {
        ArticleInfoDTO articleInfo = new ArticleInfoDTO();
        try {
            articleInfo = articleInfoService.getArticleInfo(articleInfoDTO);
        } catch (Exception e) {
            LogUtils.error("获取文章内容失败，异常信息:" + e);
        }
        return articleInfo;
    }
}
