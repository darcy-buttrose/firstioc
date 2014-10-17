package com.sample.firstioc.activities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

/**
 * Created by Darcy on 17/10/2014.
 */

@Config(manifest = "./src/main/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    @Test
    public void Go() {
        assertTrue(true);
    }
}
