package me.niccorder.shop.app.di;

import dagger.Module;
import dagger.Provides;
import java.io.IOException;
import javax.inject.Singleton;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

@Module
public class DataModule {

  String mBaseUrl;
  boolean mIsDebuggable;

  public DataModule(String baseUrl, boolean isDebuggable) {
    mBaseUrl = baseUrl;
    mIsDebuggable = isDebuggable;
  }

  @Provides
  @Singleton
  OkHttpClient provideOkhttp() {
    return new OkHttpClient.Builder().addInterceptor(new Interceptor() {
      @Override public Response intercept(Chain chain) throws IOException {
        return chain.proceed(chain.request());
      }
    }).build();
  }
}
