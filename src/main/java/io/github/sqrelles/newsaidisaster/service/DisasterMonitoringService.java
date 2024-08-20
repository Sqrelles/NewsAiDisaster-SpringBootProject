package io.github.sqrelles.newsaidisaster.service;

import lombok.Getter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisasterMonitoringService {

    private final DisasterService disasterService;

    @Getter
    private List<Object> latestDisasters = new ArrayList<>();

    public DisasterMonitoringService(DisasterService disasterService) {
        this.disasterService = disasterService;
    }

    @Scheduled(fixedRate = 60000) //
    public void monitorNewsSources() {
        latestDisasters = disasterService.disasterAnalyze();
    }

}
