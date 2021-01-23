package com.example.ryousuke.dagger_hiltexample.module

import android.content.Context
import com.example.ryousuke.dagger_hiltexample.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton


//どのようなインジェクトを行うかをここで決定する

@Module
//ここでライフサイクルを意識して有効な範囲を決定する必要がある
@InstallIn(ActivityComponent::class)
object MainModule {

    //@Singleton→ApplicationComponentの時に有効なアノテーションであるので対応するアノテーションを覚える!
    @ActivityScoped
    @Provides
    @Named("TestString2")
    //別のインジェクトをこのメソッドに取り込む,引数にどこのcontextを使うかを渡しておく必要がある
    fun provideTestString2(
        @ApplicationContext context: Context,
    @Named("TestString1") testString: String) = "${context.getString(R.string.string_to_inject)} - ${testString}"

}