package j$.util.concurrent;

import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    l[] f12901a;

    /* renamed from: b  reason: collision with root package name */
    l f12902b;

    /* renamed from: c  reason: collision with root package name */
    o f12903c;

    /* renamed from: d  reason: collision with root package name */
    o f12904d;

    /* renamed from: e  reason: collision with root package name */
    int f12905e;
    int f;

    /* renamed from: g  reason: collision with root package name */
    int f12906g;

    /* renamed from: h  reason: collision with root package name */
    final int f12907h;

    /* renamed from: i  reason: collision with root package name */
    int f12908i;
    final Consumer j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(g gVar, int i7, int i8, int i9, l[] lVarArr, Consumer consumer) {
        super(gVar);
        this.f12908i = i7;
        this.f = i8;
        this.f12905e = i8;
        this.f12901a = lVarArr;
        if (lVarArr == null) {
            this.f12906g = 0;
            this.f12907h = 0;
        } else if (gVar == null) {
            int length = lVarArr.length;
            this.f12906g = length;
            this.f12907h = length;
        } else {
            this.f12906g = i9;
            this.f12907h = gVar.f12907h;
        }
        this.j = consumer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        l[] lVarArr;
        int length;
        int i7;
        o oVar;
        o oVar2;
        Consumer consumer = this.j;
        if (consumer == null) {
            return;
        }
        int i8 = this.f;
        while (this.f12908i > 0) {
            int i9 = this.f12906g;
            int i10 = (i9 + i8) >>> 1;
            if (i10 <= i8) {
                break;
            }
            addToPendingCount(1);
            int i11 = this.f12908i >>> 1;
            this.f12908i = i11;
            this.f12906g = i10;
            new g(this, i11, i10, i9, this.f12901a, consumer).fork();
        }
        while (true) {
            l lVar = this.f12902b;
            if (lVar != null) {
                lVar = lVar.f12918d;
            }
            while (lVar == null) {
                if (this.f >= this.f12906g || (lVarArr = this.f12901a) == null || (length = lVarArr.length) <= (i7 = this.f12905e) || i7 < 0) {
                    this.f12902b = null;
                    lVar = null;
                    break;
                }
                l k2 = ConcurrentHashMap.k(lVarArr, i7);
                if (k2 == null || k2.f12915a >= 0) {
                    lVar = k2;
                } else if (k2 instanceof h) {
                    this.f12901a = ((h) k2).f12909e;
                    o oVar3 = this.f12904d;
                    if (oVar3 == null) {
                        oVar2 = new Object();
                    } else {
                        this.f12904d = oVar3.f12922d;
                        oVar2 = oVar3;
                    }
                    oVar2.f12921c = lVarArr;
                    oVar2.f12919a = length;
                    oVar2.f12920b = i7;
                    oVar2.f12922d = this.f12903c;
                    this.f12903c = oVar2;
                    lVar = null;
                } else {
                    lVar = k2 instanceof q ? ((q) k2).f : null;
                }
                if (this.f12903c != null) {
                    while (true) {
                        oVar = this.f12903c;
                        if (oVar == null) {
                            break;
                        }
                        int i12 = this.f12905e;
                        int i13 = oVar.f12919a;
                        int i14 = i12 + i13;
                        this.f12905e = i14;
                        if (i14 < length) {
                            break;
                        }
                        this.f12905e = oVar.f12920b;
                        this.f12901a = oVar.f12921c;
                        oVar.f12921c = null;
                        o oVar4 = oVar.f12922d;
                        oVar.f12922d = this.f12904d;
                        this.f12903c = oVar4;
                        this.f12904d = oVar;
                        length = i13;
                    }
                    if (oVar == null) {
                        int i15 = this.f12905e + this.f12907h;
                        this.f12905e = i15;
                        if (i15 >= length) {
                            int i16 = this.f + 1;
                            this.f = i16;
                            this.f12905e = i16;
                        }
                    }
                } else {
                    int i17 = i7 + this.f12907h;
                    this.f12905e = i17;
                    if (i17 >= length) {
                        int i18 = this.f + 1;
                        this.f = i18;
                        this.f12905e = i18;
                    }
                }
            }
            this.f12902b = lVar;
            if (lVar != null) {
                consumer.accept(lVar.f12917c);
            } else {
                propagateCompletion();
                return;
            }
        }
    }
}
