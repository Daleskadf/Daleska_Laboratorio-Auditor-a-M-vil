package k5;

import a5.C0470a;
import com.google.android.gms.internal.mlkit_vision_barcode.zzeu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g5.C1010b;
import g5.C1011c;
import g5.InterfaceC1009a;
import java.util.concurrent.Executor;
import l5.C1423a;
/* renamed from: k5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401d extends m5.c implements InterfaceC1009a {

    /* renamed from: f0  reason: collision with root package name */
    public static final C1010b f13709f0 = new C1010b(0, null);

    /* renamed from: X  reason: collision with root package name */
    public final C1010b f13710X;

    /* renamed from: Y  reason: collision with root package name */
    public final zzxk f13711Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f13712Z;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f13713e0;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401d(C1010b c1010b, C1405h c1405h, Executor executor, zzwp zzwpVar, e5.g gVar) {
        super(c1405h, executor);
        zzxk zzd;
        zzra zzraVar;
        C1011c c1011c = c1010b.f11129b;
        if (c1011c == null) {
            zzd = null;
        } else {
            zzd = zzxk.zzd(gVar.b(), gVar.b().getPackageName());
            zzd.zzo(new C1399b(c1011c), zzeu.zza());
            float f = c1011c.f11131b;
            if (f >= 1.0f) {
                zzd.zzk(f);
            }
            zzd.zzm();
        }
        this.f13710X = c1010b;
        boolean c8 = AbstractC1398a.c();
        this.f = c8;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(AbstractC1398a.a(c1010b));
        zzrr zzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        if (c8) {
            zzraVar = zzra.TYPE_THICK;
        } else {
            zzraVar = zzra.TYPE_THIN;
        }
        zzrdVar.zze(zzraVar);
        zzrdVar.zzg(zzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.ON_DEVICE_BARCODE_CREATE);
        this.f13711Y = zzd;
    }

    @Override // com.google.android.gms.common.api.p
    public final W2.d[] a() {
        return this.f ? e5.j.f10900a : new W2.d[]{e5.j.f10901b};
    }

    public final Task b(C1423a c1423a) {
        Task forException;
        synchronized (this) {
            if (this.f14055a.get()) {
                forException = Tasks.forException(new C0470a("This detector is already closed!", 14));
            } else if (c1423a.f13860c >= 32 && c1423a.f13861d >= 32) {
                forException = this.f14056b.a(this.f14058d, new F5.b(this, c1423a), this.f14057c.getToken());
            } else {
                forException = Tasks.forException(new C0470a("InputImage width and height should be at least 32!", 3));
            }
        }
        return forException.onSuccessTask(new G1.h(this, c1423a.f13860c, c1423a.f13861d));
    }

    @Override // m5.c, java.io.Closeable, java.lang.AutoCloseable, g5.InterfaceC1009a
    public final synchronized void close() {
        try {
            zzxk zzxkVar = this.f13711Y;
            if (zzxkVar != null) {
                zzxkVar.zzn(this.f13713e0);
                this.f13711Y.zzj();
            }
            super.close();
        } catch (Throwable th) {
            throw th;
        }
    }
}
