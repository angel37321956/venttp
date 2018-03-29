package com.venttp.articles.dto;

import com.venttp.base.dto.Venttpuid;

import java.util.Date;

public class ArticleInfoDTO extends Venttpuid{

    //文章编码
    private String articleNo;

    //文章标题
    private String articleTitle;

    //作者编码
    private String articleAuthorCode;

    //作者名称
    private String articleAuthorName;

    //发表日期
    private Date publishTime;

    //文章内容
    private String articleContent;

    public String getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(String articleNo) {
        this.articleNo = articleNo;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleAuthorCode() {
        return articleAuthorCode;
    }

    public void setArticleAuthorCode(String articleAuthorNo) {
        this.articleAuthorCode = articleAuthorNo;
    }

    public String getArticleAuthorName() {
        return articleAuthorName;
    }

    public void setArticleAuthorName(String articleAuthorName) {
        this.articleAuthorName = articleAuthorName;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}
