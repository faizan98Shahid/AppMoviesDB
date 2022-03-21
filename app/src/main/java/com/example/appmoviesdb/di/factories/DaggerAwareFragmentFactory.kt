package com.example.appmoviesdb.di.factories

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject
import javax.inject.Provider
//
//class DaggerAwareFragmentFactory @Inject constructor(private val providers: @JvmSuppressWildcards Map<Class<out Fragment>, Provider<Fragment>>) : FragmentFactory()
//{
//    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
//        val fragmentClass = loadFragmentClass(classLoader, className)
//        val provider = providers[fragmentClass]
//        return provider?.get() ?: super.instantiate(classLoader, className)
//    }
//}