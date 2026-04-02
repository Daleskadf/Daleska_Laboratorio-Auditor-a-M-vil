package com.google.android.gms.common.api.internal;

import java.util.Arrays;
/* renamed from: com.google.android.gms.common.api.internal.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728b {

    /* renamed from: a  reason: collision with root package name */
    public final int f9225a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.common.api.i f9226b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.gms.common.api.e f9227c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9228d;

    public C0728b(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.e eVar, String str) {
        this.f9226b = iVar;
        this.f9227c = eVar;
        this.f9228d = str;
        this.f9225a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0728b)) {
            return false;
        }
        C0728b c0728b = (C0728b) obj;
        if (!com.google.android.gms.common.internal.I.m(this.f9226b, c0728b.f9226b) || !com.google.android.gms.common.internal.I.m(this.f9227c, c0728b.f9227c) || !com.google.android.gms.common.internal.I.m(this.f9228d, c0728b.f9228d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9225a;
    }
}
