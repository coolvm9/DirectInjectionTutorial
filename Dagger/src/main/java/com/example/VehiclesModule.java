package com.example;

import com.example.entities.Brand;
import com.example.entities.Engine;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class VehiclesModule {
    @Provides
    public Engine provideEngine() {
        return new Engine();
    }

    @Provides
    @Singleton
    public Brand provideBrand() {
        return new Brand("Believe");
    }
}