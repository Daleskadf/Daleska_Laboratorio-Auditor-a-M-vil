package u0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
/* renamed from: u0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1846b extends e5.b {
    @Override // e5.b
    public final Signature[] s(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
