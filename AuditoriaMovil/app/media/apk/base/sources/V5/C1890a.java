package v5;

import H5.b;
import L5.f;
import L5.r;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.j;
/* renamed from: v5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1890a implements b {

    /* renamed from: a  reason: collision with root package name */
    public r f16066a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [p4.P, L5.p, java.lang.Object] */
    @Override // H5.b
    public final void onAttachedToEngine(H5.a binding) {
        j.e(binding, "binding");
        f fVar = binding.f2030b;
        j.d(fVar, "binding.binaryMessenger");
        Context context = binding.f2029a;
        j.d(context, "binding.applicationContext");
        this.f16066a = new r(fVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "context.packageManager");
        Object systemService = context.getSystemService("activity");
        j.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        j.d(contentResolver, "contentResolver");
        ?? obj = new Object();
        obj.f15210a = packageManager;
        obj.f15211b = (ActivityManager) systemService;
        obj.f15212c = contentResolver;
        r rVar = this.f16066a;
        if (rVar != 0) {
            rVar.b(obj);
        } else {
            j.g("methodChannel");
            throw null;
        }
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a binding) {
        j.e(binding, "binding");
        r rVar = this.f16066a;
        if (rVar != null) {
            rVar.b(null);
        } else {
            j.g("methodChannel");
            throw null;
        }
    }
}
