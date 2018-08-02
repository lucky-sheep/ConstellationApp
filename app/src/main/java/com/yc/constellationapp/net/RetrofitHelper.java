package com.yc.constellationapp.net;


import com.yc.constellationapp.net.common.Constants;
import com.yc.constellationapp.net.common.IdeaApi;
public class RetrofitHelper {
    private static ApiService mIdeaApiService;

    public static ApiService getApiService() {
        if (mIdeaApiService == null)
            mIdeaApiService = IdeaApi.getApiService(ApiService.class, Constants.API_SERVER_URL);
        return mIdeaApiService;
    }
}
