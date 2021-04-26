package com.ktyoung.chickenstock.generated.callback;
public final class OnItemClickListener implements android.widget.AdapterView.OnItemClickListener {
    final Listener mListener;
    final int mSourceId;
    public OnItemClickListener(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void onItemClick(android.widget.AdapterView callbackArg_0, android.view.View callbackArg_1, int callbackArg_2, long callbackArg_3) {
        mListener._internalCallbackOnItemClick(mSourceId , callbackArg_0, callbackArg_1, callbackArg_2, callbackArg_3);
    }
    public interface Listener {
        void _internalCallbackOnItemClick(int sourceId , android.widget.AdapterView callbackArg_0, android.view.View callbackArg_1, int callbackArg_2, long callbackArg_3);
    }
}