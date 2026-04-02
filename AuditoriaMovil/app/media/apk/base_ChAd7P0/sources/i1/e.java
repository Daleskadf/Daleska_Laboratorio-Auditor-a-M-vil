package i1;

import K0.x;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public int f11392c;

    /* renamed from: d  reason: collision with root package name */
    public int f11393d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11390a = true;

    /* renamed from: b  reason: collision with root package name */
    public final int f11391b = 65536;

    /* renamed from: e  reason: collision with root package name */
    public int f11394e = 0;
    public C1100a[] f = new C1100a[100];

    public final synchronized void a(int i7) {
        boolean z7;
        if (i7 < this.f11392c) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f11392c = i7;
        if (z7) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, x.g(this.f11392c, this.f11391b) - this.f11393d);
        int i7 = this.f11394e;
        if (max >= i7) {
            return;
        }
        Arrays.fill(this.f, max, i7, (Object) null);
        this.f11394e = max;
    }
}
