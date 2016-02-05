package com.aloj22.swiperefreshlibrary.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.aloj22.listenerswiperefreshlayout.ListenerSwipeRefreshLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = (TextView) findViewById(R.id.text_view);
        final ListenerSwipeRefreshLayout swipeRefreshLayout = (ListenerSwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_red_light);

        swipeRefreshLayout.setOnRefreshListener(new ListenerSwipeRefreshLayout.OnRefreshListener() {

            @Override
            public void onRefresh() {
                text.setText("Refreshing");

                text.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                }, 2000);
            }

            @Override
            public void onRefreshStarted() {
                text.setText("Refresh started");
            }

            @Override
            public void onRefreshCanceled() {
                text.setText("Refresh canceled");
            }

            @Override
            public void onRefreshFinished() {
                text.setText("Refresh finished");
            }

        });


    }
}
