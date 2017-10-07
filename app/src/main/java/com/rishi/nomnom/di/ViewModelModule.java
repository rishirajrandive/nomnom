package com.rishi.nomnom.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.rishi.nomnom.viewmodel.AppViewModelFactory;
import com.rishi.nomnom.viewmodel.RestaurantViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by rishi on 10/6/17.
 */

@Module
public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(RestaurantViewModel.class)
    abstract ViewModel bindRestaurantViewModel(RestaurantViewModel restaurantViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(AppViewModelFactory factory);
}
