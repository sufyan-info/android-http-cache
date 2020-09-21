package com.ornoma.httpcache.sample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.danikula.videocache.sample.R;

import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_multiple_videos)
public class SharedCacheActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        if (state == null) {
            addVideoFragment(Video.ORANGE_1, R.id.videoContainer0);
            addVideoFragment(Video.ORANGE_1, R.id.videoContainer1);
            addVideoFragment(Video.ORANGE_1, R.id.videoContainer2);
            addVideoFragment(Video.ORANGE_1, R.id.videoContainer3);
        }
    }

    private void addVideoFragment(Video video, int containerViewId) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(containerViewId, VideoFragment.build(video.url))
                .commit();
    }
}
