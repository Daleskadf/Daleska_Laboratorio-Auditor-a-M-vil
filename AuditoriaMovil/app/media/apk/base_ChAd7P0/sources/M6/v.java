package m6;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class v extends p6.h implements w6.p {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Iterator f14086X;

    /* renamed from: b  reason: collision with root package name */
    public Object f14087b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f14088c;

    /* renamed from: d  reason: collision with root package name */
    public int f14089d;

    /* renamed from: e  reason: collision with root package name */
    public int f14090e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Iterator it, n6.d dVar) {
        super(dVar);
        this.f14086X = it;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        v vVar = new v(this.f14086X, dVar);
        vVar.f = obj;
        return vVar;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((D6.e) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c3 -> B:43:0x00c6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x012a -> B:50:0x00ef). Please submit an issue!!! */
    @Override // p6.AbstractC1698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
