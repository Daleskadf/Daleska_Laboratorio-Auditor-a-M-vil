package com.google.protobuf;
/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0828a f9989a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9990b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f9991c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9992d;

    public B0(AbstractC0828a abstractC0828a, String str, Object[] objArr) {
        this.f9989a = abstractC0828a;
        this.f9990b = str;
        this.f9991c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9992d = charAt;
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
                this.f9992d = i7 | (charAt2 << i9);
                return;
            }
        }
    }

    public final AbstractC0828a a() {
        return this.f9989a;
    }

    public final Object[] b() {
        return this.f9991c;
    }

    public final String c() {
        return this.f9990b;
    }

    public final EnumC0876y0 d() {
        int i7 = this.f9992d;
        if ((i7 & 1) != 0) {
            return EnumC0876y0.PROTO2;
        }
        if ((i7 & 4) == 4) {
            return EnumC0876y0.EDITIONS;
        }
        return EnumC0876y0.PROTO3;
    }
}
