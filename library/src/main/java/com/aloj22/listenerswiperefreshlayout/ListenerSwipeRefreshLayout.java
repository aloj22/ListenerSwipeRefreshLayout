package com.aloj22.listenerswiperefreshlayout;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class ListenerSwipeRefreshLayout extends SwipeRefreshLayout {

    private static final int DEFAULT_CIRCLE_TARGET = 64;
    private static final float DRAG_RATE = .5f;

    private float mCurrentTargetOffsetTop;
    private OnRefreshListener mListener;

    public ListenerSwipeRefreshLayout(Context context) {
        super(context);
    }

    public ListenerSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public void setOnRefreshListener(OnRefreshListener listener){

        super.setOnRefreshListener(listener);

        this.mListener = listener;

        mCurrentTargetOffsetTop = DEFAULT_CIRCLE_TARGET * getResources().getDisplayMetrics().density;

        this.setOnTouchListener(new OnTouchListener() {

            private float starterY = -1;


            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_MOVE) {

                    if(mListener != null)
                        mListener.onRefreshStarted();

                    if (starterY == -1)
                        starterY = event.getY();

                } else if (event.getAction() == MotionEvent.ACTION_UP && ((event.getY() - starterY) * DRAG_RATE) < mCurrentTargetOffsetTop) {

                    if(mListener != null)
                        mListener.onRefreshCanceled();

                    starterY = -1;

                }

                return false;
            }
        });

    }

    public void setRefreshing(boolean refreshing) {

        if(!refreshing && mListener != null)
            mListener.onRefreshFinished();

        super.setRefreshing(refreshing);
    }



    public interface OnRefreshListener extends SwipeRefreshLayout.OnRefreshListener {
        void onRefreshStarted();
        void onRefreshCanceled();
        void onRefreshFinished();
    }
}
