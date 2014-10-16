package com.sample.firstioc.infrastructure;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.sample.firstioc.implementation.MainActivityViewModel;
import com.sample.firstioc.interfaces.IMainActivityViewModel;

/**
 * Created by Darcy on 16/10/2014.
 */
public class IOCModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(IMainActivityViewModel.class).to(MainActivityViewModel.class);
    }
}
