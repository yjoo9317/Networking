package com.example.android.basicnetworking;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;

/**
 * Created by yjoo9_000 on 2017-10-01.
 */

public class NetworkFragment extends Fragment {

    public static final String TAG = "NetworkFrament";

    private static final String URL_KEY = "UrlKey";

    private DownloadCallback mCallback;


    private class DownloadTask extends AsyncTask<String, Void, DownloadTask.Result>{

        private DownloadCallback<String> mCallback;

        @Override
        protected DownloadTask.Result doInBackground(String... urls) {
            Result result = null;
            return result;
        }

        static class Result{
            public Exception mException;
            public Result(Exception exception){
                mException = exception;
            }
        }
    }
}
