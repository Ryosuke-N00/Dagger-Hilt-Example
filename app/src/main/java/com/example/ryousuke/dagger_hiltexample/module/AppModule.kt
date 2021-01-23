package com.example.ryousuke.dagger_hiltexample.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named
import javax.inject.Singleton


//どのようなインジェクトを行うかをここで決定する

@Module
//ここでライフサイクルを意識して有効な範囲を決定する必要がある
@InstallIn(ApplicationComponent::class)
object AppModule {

    //唯一無二の存在である
    @Singleton
    //この処理を提供してくれることのアノテーション
    @Provides
    //2つ以上あるときはどっちをインジェクトするかを決めるために名前を付ける
    @Named("TestString1")
    fun provideTestString1() = "TEST STRING WILL INJECT!!"

}