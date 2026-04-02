package c4;

import H4.W;
import Y1.y;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* renamed from: c4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632a {

    /* renamed from: a  reason: collision with root package name */
    public final String f8375a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f8376b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f8377c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8378d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8379e;
    public final InterfaceC0635d f;

    /* renamed from: g  reason: collision with root package name */
    public final Set f8380g;

    public C0632a(String str, Set set, Set set2, int i7, int i8, InterfaceC0635d interfaceC0635d, Set set3) {
        this.f8375a = str;
        this.f8376b = DesugarCollections.unmodifiableSet(set);
        this.f8377c = DesugarCollections.unmodifiableSet(set2);
        this.f8378d = i7;
        this.f8379e = i8;
        this.f = interfaceC0635d;
        this.f8380g = DesugarCollections.unmodifiableSet(set3);
    }

    public static y a(r rVar) {
        return new y(rVar, new r[0]);
    }

    public static y b(Class cls) {
        return new y(cls, new Class[0]);
    }

    public static C0632a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            W.f(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new C0632a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new P0.c(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f8376b.toArray()) + ">{" + this.f8378d + ", type=" + this.f8379e + ", deps=" + Arrays.toString(this.f8377c.toArray()) + "}";
    }
}
