package q5;

import L5.f;
import L5.o;
import L5.p;
import L5.q;
import L5.r;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import q3.k;
/* renamed from: q5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1713b implements p, H5.b {

    /* renamed from: a  reason: collision with root package name */
    public r f15390a;

    /* renamed from: b  reason: collision with root package name */
    public k f15391b;

    /* renamed from: c  reason: collision with root package name */
    public HandlerThread f15392c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f15393d;

    public static String a(C1713b c1713b, o oVar) {
        c1713b.getClass();
        k kVar = c1713b.f15391b;
        return ((String) kVar.f15331c) + "_" + ((String) ((Map) oVar.f3039b).get(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR));
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        f fVar = aVar.f2030b;
        try {
            this.f15391b = new k(aVar.f2029a, new HashMap());
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f15392c = handlerThread;
            handlerThread.start();
            this.f15393d = new Handler(this.f15392c.getLooper());
            r rVar = new r(fVar, "plugins.it_nomads.com/flutter_secure_storage");
            this.f15390a = rVar;
            rVar.b(this);
        } catch (Exception e7) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e7);
        }
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        if (this.f15390a != null) {
            this.f15392c.quitSafely();
            this.f15392c = null;
            this.f15390a.b(null);
            this.f15390a = null;
        }
        this.f15391b = null;
    }

    @Override // L5.p
    public final void onMethodCall(o oVar, q qVar) {
        this.f15393d.post(new H2.a(this, oVar, new C1712a((K5.r) qVar, 0), 11));
    }
}
