package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0774a f9643a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9644b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f9645c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9646d;

    public f0(AbstractC0774a abstractC0774a, String str, Object[] objArr) {
        this.f9643a = abstractC0774a;
        this.f9644b = str;
        this.f9645c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9646d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 >= 55296) {
                i7 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            } else {
                this.f9646d = i7 | (charAt2 << i9);
                return;
            }
        }
    }

    public final AbstractC0774a a() {
        return this.f9643a;
    }

    public final Object[] b() {
        return this.f9645c;
    }

    public final String c() {
        return this.f9644b;
    }

    public final c0 d() {
        if ((this.f9646d & 1) == 1) {
            return c0.PROTO2;
        }
        return c0.PROTO3;
    }
}
