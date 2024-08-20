package io.github.sqrelles.newsaidisaster.ext.call;

import io.github.sqrelles.newsaidisaster.models.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsApiService {

        private final NewsClient newsClient;

        @Autowired
        public NewsApiService(NewsClient newsClient) {
            this.newsClient = newsClient;
        }

    public NewsResponse getAllNews() {
        return newsClient.getAllNews();
    }
}
