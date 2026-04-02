package androidx.lifecycle;

import java.lang.reflect.Method;
/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551c {

    /* renamed from: a  reason: collision with root package name */
    public final int f7930a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f7931b;

    public C0551c(int i7, Method method) {
        this.f7930a = i7;
        this.f7931b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0551c)) {
            return false;
        }
        C0551c c0551c = (C0551c) obj;
        if (this.f7930a == c0551c.f7930a && this.f7931b.getName().equals(c0551c.f7931b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7931b.getName().hashCode() + (this.f7930a * 31);
    }
}
