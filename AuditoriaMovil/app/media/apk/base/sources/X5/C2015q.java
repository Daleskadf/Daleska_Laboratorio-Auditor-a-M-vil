package x5;

import L5.v;
import p.C1608t;
/* renamed from: x5.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2015q implements v {

    /* renamed from: a  reason: collision with root package name */
    public final C1608t f16566a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16567b;

    public C2015q(C1608t c1608t) {
        this.f16566a = c1608t;
    }

    @Override // L5.v
    public final boolean onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.j.e(permissions, "permissions");
        kotlin.jvm.internal.j.e(grantResults, "grantResults");
        if (this.f16567b || i7 != 1926) {
            return false;
        }
        this.f16567b = true;
        int length = grantResults.length;
        C1608t c1608t = this.f16566a;
        if (length == 0 || grantResults[0] != 0) {
            c1608t.k0("MOBILE_SCANNER_CAMERA_PERMISSION_DENIED");
        } else {
            c1608t.k0(null);
        }
        return true;
    }
}
