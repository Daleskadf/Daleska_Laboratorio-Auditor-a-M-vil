package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;
/* renamed from: androidx.camera.core.impl.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501c {

    /* renamed from: a  reason: collision with root package name */
    public final String f7606a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f7607b;

    /* renamed from: c  reason: collision with root package name */
    public final CaptureRequest.Key f7608c;

    public C0501c(String str, Class cls, CaptureRequest.Key key) {
        if (str != null) {
            this.f7606a = str;
            if (cls != null) {
                this.f7607b = cls;
                this.f7608c = key;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0501c)) {
            return false;
        }
        C0501c c0501c = (C0501c) obj;
        if (this.f7606a.equals(c0501c.f7606a) && this.f7607b.equals(c0501c.f7607b)) {
            CaptureRequest.Key key = c0501c.f7608c;
            CaptureRequest.Key key2 = this.f7608c;
            if (key2 == null) {
                if (key == null) {
                    return true;
                }
            } else if (key2.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f7606a.hashCode() ^ 1000003) * 1000003) ^ this.f7607b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.f7608c;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "Option{id=" + this.f7606a + ", valueClass=" + this.f7607b + ", token=" + this.f7608c + "}";
    }
}
