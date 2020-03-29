package com.lemon.day010;

public class Page {
    public String keyword;
    public String by;
    public String value;

    public String getKeyword() {
        return keyword;
    }

    public Page() {
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getBy() {
        return by;
    }

    @Override
    public String toString() {
        return "Page{" +
                "keyword='" + keyword + '\'' +
                ", by='" + by + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Page(String keyword, String by, String value) {
        this.keyword = keyword;
        this.by = by;
        this.value = value;
    }
}
