package com.sample.firstioc.implementation;

import com.sample.firstioc.interfaces.IMainActivityViewModel;

/**
 * Created by Darcy on 16/10/2014.
 */
public class MainActivityViewModel implements IMainActivityViewModel {
    @Override
    public String getDetails(String name) {
        if (name.equals("Jill")) {
            return "Smart";
        }
        if (name.equals("Jack")) {
            return "Silly";
        }
        return null;
    }
}
