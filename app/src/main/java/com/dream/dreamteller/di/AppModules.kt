package com.dream.dreamteller.di

import com.dream.dreamteller.di.modules.NetModule
import com.dream.dreamteller.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by joonsangyoo on 2020. 10. 28..
 */

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
//    viewModel { HomeViewModel(get(), get()) }
//    viewModel { MyPageViewModel(get()) }

}

val netModule = module {
    single { NetModule }
}
//
//val dataSourceModule = module {
//    single { GitRemoteDataSource(get()) as GitDataSource}
//}
//
//val apiModule = module {
//    single { gitApi }
//}
//
//val repositoryModule = module {
//    single { GitRepositoryImpl(get()) as GitRepository }
//}
//
//val useCaseModule = module {
//    single { GetGistsPublicUseCase(get()) }
//}
//
//val retrofit = RemoteClient.createRetrofit(true)
//private val gitApi = retrofit.create(GitApi::class.java)

val appModules = listOf(
    netModule,
//    remoteModule,
//    dataSourceModule,
    viewModelModule
//    apiModule,
//    repositoryModule,
//    useCaseModule
)