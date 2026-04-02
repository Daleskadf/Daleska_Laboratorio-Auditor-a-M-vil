package k5;

import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;
import g5.C1010b;
import java.util.concurrent.Executor;
/* renamed from: k5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1400c {

    /* renamed from: a  reason: collision with root package name */
    public final C1402e f13706a;

    /* renamed from: b  reason: collision with root package name */
    public final e5.d f13707b;

    /* renamed from: c  reason: collision with root package name */
    public final e5.g f13708c;

    public C1400c(C1402e c1402e, e5.d dVar, e5.g gVar) {
        this.f13706a = c1402e;
        this.f13707b = dVar;
        this.f13708c = gVar;
    }

    public final C1401d a(C1010b c1010b) {
        String str;
        C1405h c1405h = (C1405h) this.f13706a.get(c1010b);
        c1010b.getClass();
        Executor executor = (Executor) this.f13707b.f10891a.get();
        if (true != AbstractC1398a.c()) {
            str = "play-services-mlkit-barcode-scanning";
        } else {
            str = "barcode-scanning";
        }
        return new C1401d(c1010b, c1405h, executor, zzxa.zzb(str), this.f13708c);
    }
}
