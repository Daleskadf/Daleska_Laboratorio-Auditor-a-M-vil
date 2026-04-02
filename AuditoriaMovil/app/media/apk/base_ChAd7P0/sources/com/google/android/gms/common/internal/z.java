package com.google.android.gms.common.internal;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class z implements com.google.android.gms.common.api.e {

    /* renamed from: b  reason: collision with root package name */
    public static final z f9407b = new z(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f9408a;

    public /* synthetic */ z(String str) {
        this.f9408a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        return I.m(this.f9408a, ((z) obj).f9408a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9408a});
    }
}
