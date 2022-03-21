package com.example.appmoviesdb.di.modules
//
//import androidx.fragment.app.FragmentFactory
//import androidx.lifecycle.ViewModelProvider
//import com.example.appmoviesdb.di.factories.DaggerAwareFragmentFactory
//import com.example.appmoviesdb.di.factories.DaggerAwareViewModelFactory
//import com.example.appmoviesdb.di.scopes.FeatureScope
//import dagger.Binds
//import dagger.Module
//
//@Module
//internal abstract class UIModule
//{
//    @Binds
//    abstract fun bindViewModelFactory(factory: DaggerAwareViewModelFactory): ViewModelProvider.Factory
//
//    @Binds
//    abstract fun bindFragmentFactory(factory: DaggerAwareFragmentFactory): FragmentFactory
//
//
//
////    @Binds
////    @IntoMap
////    @FragmentKey(TransferFragment::class)
////    abstract fun bindTransferFragment(fragment: TransferFragment): Fragment
//
////    @Binds
////    @IntoMap
////    @ViewModelKey(TransactionResultViewModel::class)
////    abstract fun bindTransactionResultViewModel(viewModel: TransactionResultViewModel): ViewModel
//}