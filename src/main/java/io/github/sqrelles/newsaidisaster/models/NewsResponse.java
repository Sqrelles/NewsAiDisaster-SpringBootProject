package io.github.sqrelles.newsaidisaster.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter


public class NewsResponse {
    private long totalCount;
    private List<News> news;
}
