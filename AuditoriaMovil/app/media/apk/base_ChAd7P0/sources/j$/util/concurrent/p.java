package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    l[] f12923a;

    /* renamed from: b  reason: collision with root package name */
    l f12924b = null;

    /* renamed from: c  reason: collision with root package name */
    o f12925c;

    /* renamed from: d  reason: collision with root package name */
    o f12926d;

    /* renamed from: e  reason: collision with root package name */
    int f12927e;
    int f;

    /* renamed from: g  reason: collision with root package name */
    int f12928g;

    /* renamed from: h  reason: collision with root package name */
    final int f12929h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(l[] lVarArr, int i7, int i8, int i9) {
        this.f12923a = lVarArr;
        this.f12929h = i7;
        this.f12927e = i8;
        this.f = i8;
        this.f12928g = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final l a() {
        l[] lVarArr;
        int length;
        int i7;
        o oVar;
        o oVar2;
        l lVar = this.f12924b;
        if (lVar != null) {
            lVar = lVar.f12918d;
        }
        while (lVar == null) {
            if (this.f >= this.f12928g || (lVarArr = this.f12923a) == null || (length = lVarArr.length) <= (i7 = this.f12927e) || i7 < 0) {
                this.f12924b = null;
                return null;
            }
            l k2 = ConcurrentHashMap.k(lVarArr, i7);
            if (k2 == null || k2.f12915a >= 0) {
                lVar = k2;
            } else if (k2 instanceof h) {
                this.f12923a = ((h) k2).f12909e;
                o oVar3 = this.f12926d;
                if (oVar3 == null) {
                    oVar2 = new Object();
                } else {
                    this.f12926d = oVar3.f12922d;
                    oVar2 = oVar3;
                }
                oVar2.f12921c = lVarArr;
                oVar2.f12919a = length;
                oVar2.f12920b = i7;
                oVar2.f12922d = this.f12925c;
                this.f12925c = oVar2;
                lVar = null;
            } else {
                lVar = k2 instanceof q ? ((q) k2).f : null;
            }
            if (this.f12925c != null) {
                while (true) {
                    oVar = this.f12925c;
                    if (oVar == null) {
                        break;
                    }
                    int i8 = this.f12927e;
                    int i9 = oVar.f12919a;
                    int i10 = i8 + i9;
                    this.f12927e = i10;
                    if (i10 < length) {
                        break;
                    }
                    this.f12927e = oVar.f12920b;
                    this.f12923a = oVar.f12921c;
                    oVar.f12921c = null;
                    o oVar4 = oVar.f12922d;
                    oVar.f12922d = this.f12926d;
                    this.f12925c = oVar4;
                    this.f12926d = oVar;
                    length = i9;
                }
                if (oVar == null) {
                    int i11 = this.f12927e + this.f12929h;
                    this.f12927e = i11;
                    if (i11 >= length) {
                        int i12 = this.f + 1;
                        this.f = i12;
                        this.f12927e = i12;
                    }
                }
            } else {
                int i13 = i7 + this.f12929h;
                this.f12927e = i13;
                if (i13 >= length) {
                    int i14 = this.f + 1;
                    this.f = i14;
                    this.f12927e = i14;
                }
            }
        }
        this.f12924b = lVar;
        return lVar;
    }
}
