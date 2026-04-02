package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class P {

    /* renamed from: e  reason: collision with root package name */
    public static final Uri f9328e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f9329a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9330b;

    /* renamed from: c  reason: collision with root package name */
    public final ComponentName f9331c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9332d;

    public P(ComponentName componentName) {
        this.f9329a = null;
        this.f9330b = null;
        I.i(componentName);
        this.f9331c = componentName;
        this.f9332d = false;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f9329a;
        if (str != null) {
            Intent intent = null;
            if (this.f9332d) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", str);
                try {
                    bundle = context.getContentResolver().call(f9328e, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e7) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e7.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
                }
            }
            if (intent == null) {
                return new Intent(str).setPackage(this.f9330b);
            }
            return intent;
        }
        return new Intent().setComponent(this.f9331c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p7 = (P) obj;
        if (I.m(this.f9329a, p7.f9329a) && I.m(this.f9330b, p7.f9330b) && I.m(this.f9331c, p7.f9331c) && this.f9332d == p7.f9332d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9329a, this.f9330b, this.f9331c, 4225, Boolean.valueOf(this.f9332d)});
    }

    public final String toString() {
        String str = this.f9329a;
        if (str == null) {
            ComponentName componentName = this.f9331c;
            I.i(componentName);
            return componentName.flattenToString();
        }
        return str;
    }

    public P(String str, String str2, boolean z7) {
        I.e(str);
        this.f9329a = str;
        I.e(str2);
        this.f9330b = str2;
        this.f9331c = null;
        this.f9332d = z7;
    }
}
