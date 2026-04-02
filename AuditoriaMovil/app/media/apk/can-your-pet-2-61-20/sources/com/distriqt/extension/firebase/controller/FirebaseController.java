package com.distriqt.extension.firebase.controller;

import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.firebase.analytics.FirebaseAnalyticsController;
import com.distriqt.extension.firebase.utils.Logger;
import com.google.firebase.BuildConfig;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
/* loaded from: classes.dex */
public class FirebaseController {
    public static final String TAG = "FirebaseController";
    private FirebaseAnalyticsController _analytics;
    private IExtensionContext _extContext;

    public String version() {
        return BuildConfig.VERSION_NAME;
    }

    public FirebaseController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public void dispose() {
        FirebaseAnalyticsController firebaseAnalyticsController = this._analytics;
        if (firebaseAnalyticsController != null) {
            firebaseAnalyticsController.dispose();
            this._analytics = null;
        }
    }

    public boolean initialiseApp(FirebaseOptions firebaseOptions) {
        String str = TAG;
        Logger.d(str, "initialiseApp()", new Object[0]);
        if (FirebaseApp.getApps(this._extContext.getActivity().getApplicationContext()).size() > 0) {
            Logger.d(str, "initialiseApp(): Already initialised", new Object[0]);
            Logger.d(str, "initialiseApp(): %s = %s", "apiKey", FirebaseApp.getInstance().getOptions().getApiKey());
            Logger.d(str, "initialiseApp(): %s = %s", "googleAppID", FirebaseApp.getInstance().getOptions().getApplicationId());
            Logger.d(str, "initialiseApp(): %s = %s", "databaseURL", FirebaseApp.getInstance().getOptions().getDatabaseUrl());
            Logger.d(str, "initialiseApp(): %s = %s", "gcmSenderID", FirebaseApp.getInstance().getOptions().getGcmSenderId());
            Logger.d(str, "initialiseApp(): %s = %s", "storageBucket", FirebaseApp.getInstance().getOptions().getStorageBucket());
            Logger.d(str, "initialiseApp(): %s = %s", "projectId", FirebaseApp.getInstance().getOptions().getProjectId());
            return true;
        }
        if (firebaseOptions != null) {
            Logger.d(str, "initialiseApp(): Using supplied options", new Object[0]);
            Logger.d(str, "initialiseApp(): %s = %s", "apiKey", firebaseOptions.apiKey);
            Logger.d(str, "initialiseApp(): %s = %s", "googleAppID", firebaseOptions.googleAppID);
            Logger.d(str, "initialiseApp(): %s = %s", "databaseURL", firebaseOptions.databaseURL);
            Logger.d(str, "initialiseApp(): %s = %s", "gcmSenderID", firebaseOptions.gcmSenderID);
            Logger.d(str, "initialiseApp(): %s = %s", "storageBucket", firebaseOptions.storageBucket);
            FirebaseOptions.Builder storageBucket = new FirebaseOptions.Builder().setApiKey(firebaseOptions.apiKey).setApplicationId(firebaseOptions.googleAppID).setDatabaseUrl(firebaseOptions.databaseURL).setGcmSenderId(firebaseOptions.gcmSenderID).setStorageBucket(firebaseOptions.storageBucket);
            storageBucket.build();
            FirebaseApp.initializeApp(this._extContext.getActivity(), storageBucket.build(), FirebaseApp.DEFAULT_APP_NAME);
        } else {
            Logger.d(str, "initialiseApp(): Init default", new Object[0]);
            FirebaseApp.initializeApp(this._extContext.getActivity().getApplicationContext());
        }
        return FirebaseApp.getApps(this._extContext.getActivity().getApplicationContext()).size() > 0;
    }

    public FirebaseOptions getOptions() {
        String str = TAG;
        Logger.d(str, "getOptions()", new Object[0]);
        if (FirebaseApp.getApps(this._extContext.getActivity().getApplicationContext()).size() > 0) {
            Logger.d(str, "initialiseApp(): %s = %s", "apiKey", FirebaseApp.getInstance().getOptions().getApiKey());
            Logger.d(str, "initialiseApp(): %s = %s", "googleAppID", FirebaseApp.getInstance().getOptions().getApplicationId());
            Logger.d(str, "initialiseApp(): %s = %s", "databaseURL", FirebaseApp.getInstance().getOptions().getDatabaseUrl());
            Logger.d(str, "initialiseApp(): %s = %s", "gcmSenderID", FirebaseApp.getInstance().getOptions().getGcmSenderId());
            Logger.d(str, "initialiseApp(): %s = %s", "storageBucket", FirebaseApp.getInstance().getOptions().getStorageBucket());
            Logger.d(str, "initialiseApp(): %s = %s", "projectId", FirebaseApp.getInstance().getOptions().getProjectId());
            com.google.firebase.FirebaseOptions options = FirebaseApp.getInstance().getOptions();
            FirebaseOptions firebaseOptions = new FirebaseOptions();
            firebaseOptions.apiKey = options.getApiKey();
            firebaseOptions.googleAppID = options.getApplicationId();
            firebaseOptions.databaseURL = options.getDatabaseUrl();
            firebaseOptions.gcmSenderID = options.getGcmSenderId();
            firebaseOptions.storageBucket = options.getStorageBucket();
            firebaseOptions.projectId = options.getProjectId();
            return firebaseOptions;
        }
        return null;
    }

    public FirebaseAnalyticsController analytics() {
        if (this._analytics == null) {
            this._analytics = new FirebaseAnalyticsController(this._extContext);
        }
        return this._analytics;
    }
}
