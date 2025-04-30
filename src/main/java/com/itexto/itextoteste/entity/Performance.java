package com.itexto.itextoteste.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document
public class Performance implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int postId;

    private long clicks;

    public Performance(){}

    public Performance(int postId, long clicks) {
        this.postId = postId;
        this.clicks = clicks;
    }

    public long getClicks() {
        return clicks;
    }

    public void setClicks(long clicks) {
        this.clicks = clicks;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Performance that = (Performance) o;
        return postId == that.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(postId);
    }
}
