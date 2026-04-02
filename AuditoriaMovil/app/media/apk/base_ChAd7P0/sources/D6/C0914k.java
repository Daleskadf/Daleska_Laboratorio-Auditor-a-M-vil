package d6;

import a6.V;
import a6.W;
/* renamed from: d6.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914k extends W {
    @Override // a6.W
    public V a(String str) {
        return new C0913j(str);
    }

    @Override // a6.W
    public boolean b() {
        return true;
    }

    @Override // a6.W
    public int c() {
        try {
            Class.forName("android.app.Application", false, C0914k.class.getClassLoader());
            return 8;
        } catch (Exception unused) {
            return 3;
        }
    }
}
