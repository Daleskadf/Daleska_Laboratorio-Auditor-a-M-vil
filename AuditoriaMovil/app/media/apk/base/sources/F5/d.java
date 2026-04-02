package F5;

import D.AbstractC0059i;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.firestore.Z;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public long f1206a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1207b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1208c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1209d;

    /* renamed from: e  reason: collision with root package name */
    public Object f1210e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public Future f1211g;

    public void a(Context context, String[] strArr) {
        int i7;
        boolean z7;
        String str;
        ActivityManager.MemoryInfo memoryInfo;
        if (this.f1207b) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (((Z) this.f1208c) != null) {
                try {
                    Y5.a.b("FlutterLoader#ensureInitializationComplete");
                    c cVar = (c) this.f1211g.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    StringBuilder sb = new StringBuilder("--icu-native-lib-path=");
                    sb.append((String) ((D5.b) this.f1209d).f871e);
                    String str2 = File.separator;
                    sb.append(str2);
                    sb.append("libflutter.so");
                    arrayList.add(sb.toString());
                    if (strArr != null) {
                        Collections.addAll(arrayList, strArr);
                    }
                    arrayList.add("--aot-shared-library-name=".concat((String) ((D5.b) this.f1209d).f868b));
                    arrayList.add("--aot-shared-library-name=" + ((String) ((D5.b) this.f1209d).f871e) + str2 + ((String) ((D5.b) this.f1209d).f868b));
                    StringBuilder sb2 = new StringBuilder("--cache-dir-path=");
                    sb2.append(cVar.f1205b);
                    arrayList.add(sb2.toString());
                    arrayList.add("--domain-network-policy=".concat((String) ((D5.b) this.f1209d).f870d));
                    ((Z) this.f1208c).getClass();
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF).metaData;
                    if (bundle != null) {
                        i7 = bundle.getInt("io.flutter.embedding.android.OldGenHeapSize");
                    } else {
                        i7 = 0;
                    }
                    if (i7 == 0) {
                        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                        i7 = (int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d);
                    }
                    arrayList.add("--old-gen-heap-size=" + i7);
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                    arrayList.add("--prefetched-default-font-manager");
                    if (bundle != null) {
                        if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                                arrayList.add("--enable-impeller=true");
                            } else {
                                arrayList.add("--enable-impeller=false");
                            }
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                            arrayList.add("--enable-vulkan-validation");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                            arrayList.add("--enable-opengl-gpu-tracing");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                            arrayList.add("--enable-vulkan-gpu-tracing");
                        }
                        if (bundle.containsKey("io.flutter.embedding.android.DisableMergedPlatformUIThread") && bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread")) {
                            arrayList.add("--no-enable-merged-platform-ui-thread");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                            arrayList.add("--enable-surface-control");
                        }
                        String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                        if (string != null) {
                            arrayList.add("--impeller-backend=".concat(string));
                        }
                    }
                    if (bundle == null) {
                        z7 = true;
                    } else {
                        z7 = bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
                    }
                    if (z7) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    arrayList.add("--leak-vm=".concat(str));
                    ((FlutterJNI) this.f1210e).init(context, (String[]) arrayList.toArray(new String[0]), null, cVar.f1204a, cVar.f1205b, SystemClock.uptimeMillis() - this.f1206a);
                    this.f1207b = true;
                    Trace.endSection();
                    return;
                } catch (Exception e7) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e7);
                    throw new RuntimeException(e7);
                }
            }
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
    }

    public String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) ((D5.b) this.f1209d).f869c);
        return AbstractC0059i.D(sb, File.separator, str);
    }

    public void c(Context context) {
        Z z7 = new Z(4);
        if (((Z) this.f1208c) == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Y5.a.b("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f1208c = z7;
                    this.f1206a = SystemClock.uptimeMillis();
                    this.f1209d = a.a(applicationContext);
                    w a7 = w.a((DisplayManager) applicationContext.getSystemService("display"), (FlutterJNI) this.f1210e);
                    a7.f12531b.setAsyncWaitForVsyncDelegate(a7.f12533d);
                    this.f1211g = ((ExecutorService) this.f).submit(new b(this, applicationContext));
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
    }
}
