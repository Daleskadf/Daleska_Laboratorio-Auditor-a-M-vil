package F5;

import G.i;
import android.content.Context;
import android.os.Trace;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import k5.C1401d;
import l5.C1423a;
/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1201a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1202b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1203c;

    public /* synthetic */ b(C1401d c1401d, C1423a c1423a) {
        this.f1202b = c1401d;
        this.f1203c = c1423a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Object obj = this.f1202b;
        Object obj2 = this.f1203c;
        switch (this.f1201a) {
            case 0:
                Context context = (Context) obj;
                d dVar = (d) obj2;
                Y5.a.b("FlutterLoader initTask");
                try {
                    dVar.getClass();
                    FlutterJNI flutterJNI = (FlutterJNI) dVar.f1210e;
                    try {
                        flutterJNI.loadLibrary(context);
                        flutterJNI.updateRefreshRate();
                        ((ExecutorService) dVar.f).execute(new C.b(this, 5));
                        File filesDir = context.getFilesDir();
                        if (filesDir == null) {
                            filesDir = new File(i.y(context), "files");
                        }
                        String path = filesDir.getPath();
                        File codeCacheDir = context.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            codeCacheDir = context.getCacheDir();
                        }
                        if (codeCacheDir == null) {
                            codeCacheDir = new File(i.y(context), "cache");
                        }
                        String path2 = codeCacheDir.getPath();
                        File dir = context.getDir("flutter", 0);
                        if (dir == null) {
                            dir = new File(i.y(context), "app_flutter");
                        }
                        dir.getPath();
                        c cVar = new c(path, path2);
                        Trace.endSection();
                        return cVar;
                    } catch (UnsatisfiedLinkError e7) {
                        if (!e7.toString().contains("couldn't find \"libflutter.so\"") && !e7.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e7;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File((String) ((D5.b) dVar.f1209d).f871e);
                        String[] list = file.list();
                        StringBuilder sb = new StringBuilder("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                        sb.append(property);
                        sb.append(", and the native libraries directory (with path ");
                        sb.append(file.getAbsolutePath());
                        sb.append(") ");
                        if (file.exists()) {
                            str = "contains the following files: " + Arrays.toString(list);
                        } else {
                            str = "does not exist.";
                        }
                        sb.append(str);
                        throw new UnsupportedOperationException(sb.toString(), e7);
                    }
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                C1423a c1423a = (C1423a) obj2;
                C1401d c1401d = (C1401d) obj;
                zzlx zze = zzlx.zze("detectorTaskWithResource#run");
                zze.zzb();
                try {
                    List i7 = c1401d.f14056b.i(c1423a);
                    zze.close();
                    return i7;
                } catch (Throwable th3) {
                    try {
                        zze.close();
                    } catch (Throwable th4) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        } catch (Exception unused) {
                        }
                    }
                    throw th3;
                }
        }
    }

    public b(d dVar, Context context) {
        this.f1203c = dVar;
        this.f1202b = context;
    }
}
