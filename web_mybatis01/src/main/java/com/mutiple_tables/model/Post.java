package com.mutiple_tables.model;

/**
 * 博客文章
 */
public class Post {
    private int id;
    private String tittle;
    private String content;

    public Post() {
    }

    public Post(int id, String tittle, String content) {
        this.id = id;
        this.tittle = tittle;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
