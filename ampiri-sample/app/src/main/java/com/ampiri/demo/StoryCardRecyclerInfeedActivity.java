package com.ampiri.demo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ampiri.sdk.banner.NativeAdView;
import com.ampiri.sdk.banner.StoryCardNativeAdView;

public class StoryCardRecyclerInfeedActivity extends RecyclerInfeedActivity {

    @NonNull
    public static Intent buildIntent(@NonNull final Context context) {
        return new Intent(context, StoryCardRecyclerInfeedActivity.class);
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
    }

    @NonNull
    protected NativeAdView.Builder getNativeAdViewBuilder() {
        return StoryCardNativeAdView.BUILDER;
    }
}
