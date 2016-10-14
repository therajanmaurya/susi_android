package org.fossasia.susi.ai.rest;

import org.fossasia.susi.ai.helper.PrefManager;
import org.fossasia.susi.ai.rest.model.SusiBaseUrls;

/**
 * Created by Rajan Maurya on 12/10/16.
 */

public class BaseUrl {

    public static final String PROTOCOL_HTTP = "http://";
    public static final String SUSI_DEFAULT_BASE_URL = "http://api.asksusi.com";
    public static final String SUSI_SERVICES_URL = "http://config.asksusi.com";

    public static void updateBaseUrl() {
        SusiBaseUrls baseUrls = PrefManager.getBaseUrls();
        int indexOfUrl = baseUrls.getSusiServices().indexOf(PrefManager.getSusiRunningBaseUrl());
        if (indexOfUrl != baseUrls.getSusiServices().size()) {
            PrefManager.setSusiRunningBaseUrl(baseUrls.getSusiServices().get(indexOfUrl + 1));
        } else {
            PrefManager.setSusiRunningBaseUrl(baseUrls.getSusiServices().get(0));
        }
    }
}
