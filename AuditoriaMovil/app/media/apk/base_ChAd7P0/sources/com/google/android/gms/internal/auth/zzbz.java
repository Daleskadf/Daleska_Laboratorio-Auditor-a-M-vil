package com.google.android.gms.internal.auth;

import android.util.Log;
import d3.AbstractC0898c;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public abstract class zzbz extends AbstractC0898c {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e7) {
            Log.e("AUTH", "Error serializing object.", e7);
            return null;
        }
    }
}
