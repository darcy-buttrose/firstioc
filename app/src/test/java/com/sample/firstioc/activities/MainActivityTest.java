package com.sample.firstioc.activities;

import android.app.Activity;

import com.sample.firstioc.R;
import com.sample.firstioc.interfaces.IMainActivityViewModel;
import com.sample.firstioc.activities.MainActivity;

import com.google.inject.AbstractModule;
import com.google.inject.util.Modules;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import roboguice.RoboGuice;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Darcy on 17/10/2014.
 */

@Config(manifest = "./src/main/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private IMainActivityViewModel mainActivityViewModelMock = mock(IMainActivityViewModel.class);

        @Before
        public void SetUp() {
            RoboGuice.setBaseApplicationInjector(
                    Robolectric.application,
                    RoboGuice.DEFAULT_STAGE,
                    Modules.override(
                            RoboGuice.newDefaultRoboModule(Robolectric.application)
                    ).with(new TestModule())
            );
        }

    @Test
    public void Go() {
        assertTrue(true);
    }

    @Test
    public void JackClickShouldGetDetailsAboutJack() throws InterruptedException {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        Assert.assertFalse(activity.equals(null));

        activity.findViewById(R.id.jackButton).performClick();

        verify(mainActivityViewModelMock).getDetails("Jack");
    }


    @After
    public void TearDown() {
        RoboGuice.util.reset();
    }

    public class TestModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(IMainActivityViewModel.class).toInstance(mainActivityViewModelMock);
        }
    }
}
