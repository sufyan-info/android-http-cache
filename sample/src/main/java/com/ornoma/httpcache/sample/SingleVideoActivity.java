package com.ornoma.httpcache.sample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.danikula.videocache.sample.R;

import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_single_video)
public class SingleVideoActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        if (state == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.containerView, VideoFragment.build(Video.ORANGE_1.url))
                    .commit();
        }
    }
}
