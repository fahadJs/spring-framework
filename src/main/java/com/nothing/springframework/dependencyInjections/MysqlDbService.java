package com.nothing.springframework.dependencyInjections;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MysqlDbService implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[] {
                89,7834,29,90
        };
    }
}
