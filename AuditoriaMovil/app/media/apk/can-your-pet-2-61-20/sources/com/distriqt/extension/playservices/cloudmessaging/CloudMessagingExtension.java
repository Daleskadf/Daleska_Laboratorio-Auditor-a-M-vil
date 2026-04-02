package com.distriqt.extension.playservices.cloudmessaging;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class CloudMessagingExtension implements FREExtension {
    public static String ID = "com.distriqt.CloudMessaging";
    public static CloudMessagingContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        CloudMessagingContext cloudMessagingContext = new CloudMessagingContext();
        context = cloudMessagingContext;
        return cloudMessagingContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
