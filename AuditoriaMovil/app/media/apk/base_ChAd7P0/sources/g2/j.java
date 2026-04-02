package g2;

import f2.AbstractC0987a;
/* loaded from: classes.dex */
public final class j extends b {
    @Override // g2.c
    public final boolean b() {
        if (!super.b() || !G.i.z("MULTI_PROCESS")) {
            return false;
        }
        int i7 = AbstractC0987a.f11050a;
        if (k.f11125d.b()) {
            return m.f11127a.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
