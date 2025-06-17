package com.project.task28_enum_keyword;

public enum Lab209_API_urls
{
    katalon("https://katalon.com/"),
    google("https://google.com/");


    private String url;

    Lab209_API_urls(String url)
    {
        this.url = url;
    }
    String getUrl()
    {
        return this.url;
    }
}
