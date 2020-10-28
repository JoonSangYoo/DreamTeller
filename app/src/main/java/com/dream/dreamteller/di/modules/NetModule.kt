package com.dream.dreamteller.di.modules

import com.dream.dreamteller.utils.Constants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by joonsangyoo on 2020. 10. 28..
 */
object NetModule {

    fun createRetrofit(debug: Boolean): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(
                provideOkHttpClient(
                    provideLoggingInterceptor(debug)
                )
            )
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // 네트워크 통신에 사용할 클라이언트 객체를 생성
    private fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient {
        val b = OkHttpClient.Builder()
        // 이 클라이언트를 통해 오고 가는 네트워크 요청/응답을 로그로 표시
        b.addInterceptor(interceptor)
        /* // header 에 정보를 추가
         b.addInterceptor(AddHeaderInterceptor())*/
        return b.build()
    }

    // 네트워크 요청/응답을 로그에 표시하는 Interceptor 객체를 생성
    private fun provideLoggingInterceptor(debug: Boolean): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = if (debug)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
        return logging
    }

}