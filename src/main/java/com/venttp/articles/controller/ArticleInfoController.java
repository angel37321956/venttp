package com.venttp.articles.controller;

import com.venttp.articles.dto.ArticleInfoDTO;
import com.venttp.articles.service.ArticleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return articleInfoService.getIndexArticlesInfoList();
    }

    /**
     * 获取文章内容
     * @return
     */
    @ResponseBody
    @RequestMapping("/getArticleInfo")
    public ArticleInfoDTO getArticleInfo (@RequestBody ArticleInfoDTO articleInfoDTO) {
        return articleInfoService.getArticleInfo(articleInfoDTO);
    }
}
