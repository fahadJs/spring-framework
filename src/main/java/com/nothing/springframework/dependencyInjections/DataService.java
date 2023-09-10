package com.nothing.springframework.dependencyInjections;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();
}
