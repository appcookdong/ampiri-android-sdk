package com.ampiri.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ampiri.sdk.banner.NativeAdView;
import com.ampiri.sdk.recyclerview.RecyclerAdAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class RecyclerInfeedActivity extends AdCallbackActivity {
    public static final int SPAN_COUNT = 2;
    @NonNull
    private static final String AD_UNIT_ID = "e5cc8e6d-d674-402a-aeca-eda7856bd7af";
    @Nullable
    private RecyclerAdAdapter adAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infeed_recycler_ad);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(getLayoutManager());
            final MainAdapter adapter = new MainAdapter(this);
            adAdapter = new RecyclerAdAdapter.Builder()
                    .setAdapter(adapter)
                    .setAdUnitId(AD_UNIT_ID)
                    .setViewBuilder(getNativeAdViewBuilder())
                    .setEventCallback(this)
                    .build(this);
            recyclerView.setAdapter(adAdapter);
            adAdapter.loadAd();
        }
    }

    protected abstract RecyclerView.LayoutManager getLayoutManager();

    @NonNull
    protected abstract NativeAdView.Builder getNativeAdViewBuilder();

    @Override
    public void onResume() {
        super.onResume();
        if (adAdapter != null) {
            adAdapter.onActivityResumed();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        if (adAdapter != null) {
            adAdapter.onActivityPaused();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (adAdapter != null) {
            adAdapter.onActivityDestroyed();
        }
    }

    private static final class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
        private static final int SIZE = 50;
        @NonNull
        private final List<String> dataSet;

        private MainAdapter(@NonNull final Context context) {
            dataSet = Collections.unmodifiableList(build(context));
        }

        @NonNull
        private static List<String> build(@NonNull final Context context) {
            final List<String> list = new ArrayList<>(SIZE);
            for (int i = 0; i < SIZE; ++i) {
                list.add(context.getString(R.string.in_feed_item, i));
            }
            return list;
        }

        @NonNull
        @Override
        public MainAdapter.ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
            final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            return new ViewHolder((TextView) inflater.inflate(android.R.layout.simple_list_item_1, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
            holder.textView.setText(dataSet.get(position));
        }

        @Override
        public int getItemCount() {
            return dataSet.size();
        }

        static class ViewHolder extends RecyclerView.ViewHolder {
            @NonNull
            private final TextView textView;

            ViewHolder(@NonNull final TextView v) {
                super(v);
                textView = v;
            }
        }
    }
}
