package D0;

import S.l;
import V2.d;
import androidx.lifecycle.U;
import t2.i;
/* loaded from: classes.dex */
public class c extends U {

    /* renamed from: d  reason: collision with root package name */
    public static final i f827d = new i(1);

    /* renamed from: b  reason: collision with root package name */
    public final l f828b = new l();

    /* renamed from: c  reason: collision with root package name */
    public boolean f829c = false;

    @Override // androidx.lifecycle.U
    public final void b() {
        l lVar = this.f828b;
        int i7 = lVar.f4837c;
        for (int i8 = 0; i8 < i7; i8++) {
            a aVar = (a) lVar.f4836b[i8];
            d dVar = aVar.f822l;
            dVar.a();
            dVar.f5950c = true;
            b bVar = aVar.f824n;
            if (bVar != null) {
                aVar.j(bVar);
            }
            a aVar2 = dVar.f5948a;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    dVar.f5948a = null;
                    if (bVar != null) {
                        boolean z7 = bVar.f826b;
                    }
                    dVar.f5951d = true;
                    dVar.f5949b = false;
                    dVar.f5950c = false;
                    dVar.f5952e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i9 = lVar.f4837c;
        Object[] objArr = lVar.f4836b;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        lVar.f4837c = 0;
    }
}
