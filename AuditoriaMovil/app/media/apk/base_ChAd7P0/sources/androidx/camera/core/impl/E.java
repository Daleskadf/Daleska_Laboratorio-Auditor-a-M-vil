package androidx.camera.core.impl;

import android.util.Range;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class E {

    /* renamed from: h  reason: collision with root package name */
    public static final C0501c f7533h = new C0501c("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* renamed from: i  reason: collision with root package name */
    public static final C0501c f7534i = new C0501c("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final C0501c j = new C0501c("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7535a;

    /* renamed from: b  reason: collision with root package name */
    public final Z f7536b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7537c;

    /* renamed from: d  reason: collision with root package name */
    public final List f7538d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7539e;
    public final u0 f;

    /* renamed from: g  reason: collision with root package name */
    public final InterfaceC0515q f7540g;

    public E(ArrayList arrayList, Z z7, int i7, ArrayList arrayList2, boolean z8, u0 u0Var, InterfaceC0515q interfaceC0515q) {
        this.f7535a = arrayList;
        this.f7536b = z7;
        this.f7537c = i7;
        this.f7538d = DesugarCollections.unmodifiableList(arrayList2);
        this.f7539e = z8;
        this.f = u0Var;
        this.f7540g = interfaceC0515q;
    }

    public final int a() {
        int i7 = 0;
        try {
            i7 = this.f7536b.G(y0.f7692R);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) i7;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int b() {
        int i7 = 0;
        try {
            i7 = this.f7536b.G(y0.f7693S);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) i7;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
