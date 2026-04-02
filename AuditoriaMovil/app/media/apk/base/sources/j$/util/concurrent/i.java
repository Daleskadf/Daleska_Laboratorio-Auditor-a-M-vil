package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i extends AbstractC1209a implements Iterator, Enumeration {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f12910k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l[] lVarArr, int i7, int i8, ConcurrentHashMap concurrentHashMap, int i9) {
        super(lVarArr, i7, i8, concurrentHashMap);
        this.f12910k = i9;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12910k) {
            case 0:
                l lVar = this.f12924b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                this.j = lVar;
                a();
                return lVar.f12916b;
            default:
                l lVar2 = this.f12924b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar2.f12917c;
                this.j = lVar2;
                a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f12910k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
