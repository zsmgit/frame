package com.mutiple_tables.model;

import java.util.List;

/**
 * 博客：一个作者
 *      多篇博文
 * 表关系：博客存作者的id.  博文存博客id,多对一
 */
public class Blog {
    private int id;
    private String tittle;
    private Author author;
    private List<Post> posts;

    public Blog() {
    }

    public Blog(int id, String tittle, Author author, List<Post> posts) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
        this.posts = posts;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Post> getPost() {
        return posts;
    }

    public void setPost(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", author=" + author +
                ", post=" + posts +
                '}';
    }
}
