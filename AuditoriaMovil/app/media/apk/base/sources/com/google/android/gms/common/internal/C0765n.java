package com.google.android.gms.common.internal;

import android.util.Log;
/* renamed from: com.google.android.gms.common.internal.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765n {

    /* renamed from: a  reason: collision with root package name */
    public final String f9383a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9384b;

    public C0765n(String str, String str2) {
        I.b("tag \"%s\" is longer than the %d character maximum", str.length() <= 23, str, 23);
        this.f9383a = str;
        this.f9384b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public final void a(Exception exc, String str, String str2) {
        if (Log.isLoggable(this.f9383a, 6)) {
            Log.e(str, c(str2), exc);
        }
    }

    public final void b(String str) {
        if (Log.isLoggable(this.f9383a, 4)) {
            Log.i("AutoZoom", c(str));
        }
    }

    public final String c(String str) {
        String str2 = this.f9384b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }
}
