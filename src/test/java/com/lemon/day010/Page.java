package com.lemon.day010;

import java.util.List;

public class Page {
    private String keyword;
    private List<Locator> locatorsUnderPage;
    public Page() {
    }

    public Page(String keyword, List<Locator> locatorsUnderPage) {
        this.keyword = keyword;
        this.locatorsUnderPage = locatorsUnderPage;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<Locator> getLocatorsUnderPage() {
        return locatorsUnderPage;
    }

    public void setLocatorsUnderPage(List<Locator> locatorsUnderPage) {
        this.locatorsUnderPage = locatorsUnderPage;
    }
}
