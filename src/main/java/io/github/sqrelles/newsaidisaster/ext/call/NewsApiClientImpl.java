package io.github.sqrelles.newsaidisaster.ext.call;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.sqrelles.newsaidisaster.models.News;
import io.github.sqrelles.newsaidisaster.models.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsApiClientImpl implements NewsApiService {

        private final NewsClient newsClient;

        @Autowired
        public NewsApiClientImpl(NewsClient newsClient) {
            this.newsClient = newsClient;
        }

    public NewsResponse getAllNews() {
        return newsClient.getAllNews();
    }
}
