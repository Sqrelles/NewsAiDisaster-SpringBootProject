package io.github.sqrelles.newsaidisaster.ext.call;

import io.github.sqrelles.newsaidisaster.models.NewsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "${feign-client.news-api.name}", url = "${feign-client.news-api.url}")
public interface NewsClient {

    @GetMapping
    NewsResponse getAllNews();
}
