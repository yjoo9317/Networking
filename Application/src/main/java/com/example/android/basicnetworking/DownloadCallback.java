package com.example.android.basicnetworking;

import android.net.NetworkInfo;

/**
 * Created by yjoo9_000 on 2017-10-01.
 */

public interface DownloadCallback<T> {
    interface Progress {
        int ERROR = -1;
        int CONNECT_SUCCESS = 0;
        int GET_INPUT_STREAM_SUCCESS = 1;
        int PROCESS_INPUT_STREAM_PROGRESS = 2;
        int PROCESS_INPUT_STREAM_SUCCESS = 3;
    }

    void updateFromDownload(T result);


    NetworkInfo getActiveNetworkInfo();

    void  onProgressUpdate(int progressCode, int percentComplete);

    void finishDownloading();
}
