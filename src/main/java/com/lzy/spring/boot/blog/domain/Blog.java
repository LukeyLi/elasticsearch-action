package com.lzy.spring.boot.blog.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = "blog", type = "blog")
@XmlRootElement // MediaType 转为 XML
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id  // 主键
    private String id; // 用户的唯一标识

    private String title;

    private String summary;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    private String content;

    protected Blog() {  // JPA 的规范要求无参构造函数；设为 protected 防止直接使用
    }

    public Blog(String title,String summary, String content) {
        this.title = title;
        this.content = content;
        this.summary = summary;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, title='%s',summary='%s content='%s']",
                id, title,summary ,content);
    }
}
