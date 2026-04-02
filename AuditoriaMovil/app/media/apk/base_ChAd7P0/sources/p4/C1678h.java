package p4;

import java.util.HashMap;
import java.util.Map;
/* renamed from: p4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1678h {

    /* renamed from: a  reason: collision with root package name */
    public final int f15254a;

    /* renamed from: b  reason: collision with root package name */
    public final e4.c f15255b;

    public C1678h(int i7, e4.c cVar) {
        this.f15254a = i7;
        this.f15255b = cVar;
    }

    public static C1678h a(int i7, HashMap hashMap) {
        e4.c cVar = q4.g.f15354a;
        for (Map.Entry entry : hashMap.entrySet()) {
            cVar = cVar.m((q4.h) entry.getKey(), ((z) entry.getValue()).f15310a);
        }
        return new C1678h(i7, cVar);
    }
}
