package com.nothing.springframework.dependencyInjections;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbService implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[] {
                23,89,67,6475,234
        };
    }
}
