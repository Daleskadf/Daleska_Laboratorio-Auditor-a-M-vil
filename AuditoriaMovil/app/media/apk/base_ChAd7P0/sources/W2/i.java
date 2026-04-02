package W2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6176b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f6177c = false;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f6179e = 0;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f6175a = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f6178d = new AtomicBoolean();

    public static void a(Context context, int i7) {
        f fVar = f.f6172b;
        int d7 = fVar.d(context, i7);
        if (d7 != 0) {
            Intent b5 = fVar.b(d7, context, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + d7);
            if (b5 == null) {
                throw new g(d7);
            }
            throw new h(b5, d7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.i.b(android.content.Context, int):int");
    }

    public static boolean c(Context context) {
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
