package p0;

import java.io.Serializable;
import java.util.Iterator;
/* renamed from: p0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1644l extends p6.i implements w6.l {

    /* renamed from: X  reason: collision with root package name */
    public int f15027X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ N f15028Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E.e f15029Z;

    /* renamed from: a  reason: collision with root package name */
    public Object f15030a;

    /* renamed from: b  reason: collision with root package name */
    public Serializable f15031b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15032c;

    /* renamed from: d  reason: collision with root package name */
    public Object f15033d;

    /* renamed from: e  reason: collision with root package name */
    public Iterator f15034e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1644l(N n7, E.e eVar, n6.d dVar) {
        super(1, dVar);
        this.f15028Y = n7;
        this.f15029Z = eVar;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(n6.d dVar) {
        return new C1644l(this.f15028Y, this.f15029Z, dVar);
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        return ((C1644l) create((n6.d) obj)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.r] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.internal.r] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlin.jvm.internal.r] */
    @Override // p6.AbstractC1698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1644l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
