package com.google.android.gms.common.api.internal;
/* renamed from: com.google.android.gms.common.api.internal.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0751z {

    /* renamed from: a  reason: collision with root package name */
    public final W2.d[] f9280a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9281b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9282c;

    public AbstractC0751z(W2.d[] dVarArr, boolean z7, int i7) {
        this.f9280a = dVarArr;
        boolean z8 = false;
        if (dVarArr != null && z7) {
            z8 = true;
        }
        this.f9281b = z8;
        this.f9282c = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, B5.M] */
    public static B5.M a() {
        ?? obj = new Object();
        obj.f328a = true;
        obj.f329b = 0;
        return obj;
    }
}
