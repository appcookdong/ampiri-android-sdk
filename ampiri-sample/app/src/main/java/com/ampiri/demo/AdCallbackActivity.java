package com.ampiri.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.widget.Toast;

import com.ampiri.insights.AmpiriInsights;
import com.ampiri.sdk.listeners.AdEventCallback;
import com.ampiri.sdk.mediation.ResponseStatus;

public abstract class AdCallbackActivity extends Activity implements AdEventCallback {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AmpiriInsights.appStarted(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AmpiriInsights.appClosed(this);
    }

    @Override
    public void onAdLoaded() {
        showMsg(R.string.ad_loaded);
    }

    @Override
    public void onAdFailed(ResponseStatus responseStatus) {
        showMsg(R.string.ad_error, responseStatus.name());
    }

    @Override
    public void onAdOpened() {
        showMsg(R.string.ad_showed);
    }

    @Override
    public void onAdClicked() {
        showMsg(R.string.ad_clicked);
    }

    @Override
    public void onAdClosed() {
        showMsg(R.string.ad_closed);
    }

    @Override
    public void onAdCompleted() {
        showMsg(R.string.ad_completed);
    }

    private void showMsg(@StringRes final int resId, @Nullable final Object... formatArgs) {
        Toast.makeText(getApplicationContext(), getString(resId, formatArgs), Toast.LENGTH_LONG).show();
    }
}