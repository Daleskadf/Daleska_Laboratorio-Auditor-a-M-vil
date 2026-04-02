package com.umeng.message.proguard;

import android.graphics.Bitmap;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class dk {

    /* renamed from: a  reason: collision with root package name */
    final ck f11920a;

    /* renamed from: b  reason: collision with root package name */
    final Bitmap f11921b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11922c;

    public dk(ck ckVar, Bitmap bitmap) {
        this.f11920a = ckVar;
        this.f11922c = ckVar.c();
        this.f11921b = bitmap;
    }

    public final boolean a() {
        if (bs.a(this.f11920a.a()) == bs.f11666a) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dk)) {
            return false;
        }
        dk dkVar = (dk) obj;
        if (hashCode() != dkVar.hashCode()) {
            return false;
        }
        return TextUtils.equals(this.f11922c, dkVar.f11922c);
    }

    public final int hashCode() {
        String str = this.f11922c;
        if (str != null) {
            return str.hashCode();
        }
        return super.hashCode();
    }
}
