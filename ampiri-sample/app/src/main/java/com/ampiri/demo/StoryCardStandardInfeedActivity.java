package com.ampiri.demo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.ampiri.sdk.banner.NativeAdView;
import com.ampiri.sdk.banner.StoryCardNativeAdView;

public class StoryCardStandardInfeedActivity extends StandardInfeedActivity {

    @NonNull
    public static Intent buildIntent(@NonNull final Context context) {
        return new Intent(context, StoryCardStandardInfeedActivity.class);
    }

    @NonNull
    protected NativeAdView.Builder getNativeAdViewBuilder() {
        return StoryCardNativeAdView.BUILDER;
    }
}
