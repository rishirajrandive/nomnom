package com.rishi.nomnom.di;

import android.app.Application;

import com.rishi.nomnom.network.WebService;
import com.rishi.nomnom.repository.RestaurantRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rishi on 10/6/17.
 */

@Module(includes = ViewModelModule.class)
public class AppModule {
    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    WebService provideWebservice() {
        RxJava2CallAdapterFactory rxAdapter = RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io());
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        // add logging as last interceptor
        builder.addInterceptor(logging);
        // add interceptor to add the cookies to request
        //builder.addInterceptor(new AddCookiesInterceptor(mApplication.getApplicationContext()));
        // add interceptor to store the cookies from response
        //builder.addInterceptor(new ReceivedCookiesInterceptor(mApplication.getApplicationContext()));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com/maps/api/place/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(rxAdapter)
                .client(builder.build())
                .build();

        return retrofit.create(WebService.class);
    }

    @Singleton @Provides
    RestaurantRepository provideTaskRepo(WebService webService){
        return new RestaurantRepository(webService);
    }
}
