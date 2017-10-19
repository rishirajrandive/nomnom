package com.rishi.nomnom.di;

import com.rishi.nomnom.MainActivity;
import com.rishi.nomnom.RestaurantDetailActivity;
import com.rishi.nomnom.ui.MapTabFragment;
import com.rishi.nomnom.ui.ListTabFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by rishi on 10/6/17.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
    void inject(ListTabFragment listTabFragment);
    void inject(MapTabFragment mapTabFragment);
    void inject(RestaurantDetailActivity restaurantDetailActivity);
}

