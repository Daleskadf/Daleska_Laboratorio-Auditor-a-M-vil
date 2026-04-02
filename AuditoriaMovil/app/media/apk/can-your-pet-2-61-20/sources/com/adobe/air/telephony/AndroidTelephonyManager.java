package com.adobe.air.telephony;

import android.content.Context;
import android.telephony.TelephonyManager;
/* loaded from: classes.dex */
public class AndroidTelephonyManager {
    private static AndroidTelephonyManager sAndroidTelephonyManager;
    private Context mContext;
    private TelephonyManager mTelephonyMgr;
    private AndroidPhoneStateListener mPhoneStateListener = null;
    private boolean mListening = false;

    public static AndroidTelephonyManager CreateAndroidTelephonyManager(Context context) {
        if (sAndroidTelephonyManager == null) {
            sAndroidTelephonyManager = new AndroidTelephonyManager(context);
        }
        return sAndroidTelephonyManager;
    }

    public static AndroidTelephonyManager GetAndroidTelephonyManager() {
        return sAndroidTelephonyManager;
    }

    private AndroidTelephonyManager(Context context) {
        this.mTelephonyMgr = null;
        this.mContext = context;
        if (context != null) {
            this.mTelephonyMgr = (TelephonyManager) context.getSystemService("phone");
        }
    }

    public void listen(boolean z) {
        AndroidPhoneStateListener androidPhoneStateListener;
        TelephonyManager telephonyManager = this.mTelephonyMgr;
        if (telephonyManager == null) {
            return;
        }
        if (z) {
            try {
                if (!this.mListening) {
                    if (this.mPhoneStateListener == null) {
                        this.mPhoneStateListener = new AndroidPhoneStateListener();
                    }
                    this.mTelephonyMgr.listen(this.mPhoneStateListener, 32);
                    this.mListening = true;
                    this.mPhoneStateListener.onCallStateChanged(this.mTelephonyMgr.getCallState(), "0");
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        if (z || !this.mListening || (androidPhoneStateListener = this.mPhoneStateListener) == null) {
            return;
        }
        telephonyManager.listen(androidPhoneStateListener, 0);
        this.mPhoneStateListener = null;
        this.mListening = false;
    }
}
