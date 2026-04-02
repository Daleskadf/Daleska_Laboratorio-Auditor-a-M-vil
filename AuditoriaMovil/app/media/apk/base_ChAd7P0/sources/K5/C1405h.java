package k5;

import a5.C0470a;
import android.os.SystemClock;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwr;
import g5.C1010b;
import java.util.ArrayList;
import java.util.List;
import l5.C1423a;
import m5.C1439a;
/* renamed from: k5.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1405h extends M3.d {
    public static final m5.b j = m5.b.f14053b;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f13721k = true;

    /* renamed from: d  reason: collision with root package name */
    public final C1010b f13722d;

    /* renamed from: e  reason: collision with root package name */
    public final InterfaceC1406i f13723e;
    public final zzwp f;

    /* renamed from: g  reason: collision with root package name */
    public final zzwr f13724g;

    /* renamed from: h  reason: collision with root package name */
    public final C1439a f13725h = new C1439a();

    /* renamed from: i  reason: collision with root package name */
    public boolean f13726i;

    public C1405h(e5.g gVar, C1010b c1010b, InterfaceC1406i interfaceC1406i, zzwp zzwpVar) {
        I.j(gVar, "MlKitContext can not be null");
        I.j(c1010b, "BarcodeScannerOptions can not be null");
        this.f13722d = c1010b;
        this.f13723e = interfaceC1406i;
        this.f = zzwpVar;
        this.f13724g = zzwr.zza(gVar.b());
    }

    public final List i(C1423a c1423a) {
        zzrb zzrbVar;
        ArrayList e7;
        synchronized (this) {
            C1439a c1439a = this.f13725h;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c1439a.a(c1423a);
            try {
                e7 = this.f13723e.e(c1423a);
                j(zzrb.NO_ERROR, elapsedRealtime, c1423a, e7);
                f13721k = false;
            } catch (C0470a e8) {
                if (e8.f7063a == 14) {
                    zzrbVar = zzrb.MODEL_NOT_DOWNLOADED;
                } else {
                    zzrbVar = zzrb.UNKNOWN_ERROR;
                }
                j(zzrbVar, elapsedRealtime, c1423a, null);
                throw e8;
            }
        }
        return e7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r2 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(final com.google.android.gms.internal.mlkit_vision_barcode.zzrb r28, long r29, final l5.C1423a r31, java.util.List r32) {
        /*
            r27 = this;
            r8 = r27
            com.google.android.gms.internal.mlkit_vision_barcode.zzcp r9 = new com.google.android.gms.internal.mlkit_vision_barcode.zzcp
            r9.<init>()
            com.google.android.gms.internal.mlkit_vision_barcode.zzcp r10 = new com.google.android.gms.internal.mlkit_vision_barcode.zzcp
            r10.<init>()
            if (r32 == 0) goto L53
            java.util.Iterator r0 = r32.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            i5.f r1 = (i5.f) r1
            j5.a r2 = r1.f11502a
            int r2 = r2.e()
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = -1
            if (r2 > r3) goto L2c
            if (r2 != 0) goto L2d
            goto L2e
        L2c:
            r2 = r4
        L2d:
            r4 = r2
        L2e:
            android.util.SparseArray r2 = k5.AbstractC1398a.f13701a
            java.lang.Object r2 = r2.get(r4)
            com.google.android.gms.internal.mlkit_vision_barcode.zzrn r2 = (com.google.android.gms.internal.mlkit_vision_barcode.zzrn) r2
            if (r2 != 0) goto L3a
            com.google.android.gms.internal.mlkit_vision_barcode.zzrn r2 = com.google.android.gms.internal.mlkit_vision_barcode.zzrn.FORMAT_UNKNOWN
        L3a:
            r9.zzd(r2)
            j5.a r1 = r1.f11502a
            int r1 = r1.r()
            android.util.SparseArray r2 = k5.AbstractC1398a.f13702b
            java.lang.Object r1 = r2.get(r1)
            com.google.android.gms.internal.mlkit_vision_barcode.zzro r1 = (com.google.android.gms.internal.mlkit_vision_barcode.zzro) r1
            if (r1 != 0) goto L4f
            com.google.android.gms.internal.mlkit_vision_barcode.zzro r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzro.TYPE_UNKNOWN
        L4f:
            r10.zzd(r1)
            goto L12
        L53:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r18 = r0 - r29
            k5.f r11 = new k5.f
            r0 = r11
            r1 = r27
            r2 = r18
            r4 = r28
            r5 = r9
            r6 = r10
            r7 = r31
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_barcode.zzwp r0 = r8.f
            com.google.android.gms.internal.mlkit_vision_barcode.zzrc r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzrc.ON_DEVICE_BARCODE_DETECT
            r0.zzf(r11, r1)
            com.google.android.gms.internal.mlkit_vision_barcode.zzfr r0 = new com.google.android.gms.internal.mlkit_vision_barcode.zzfr
            r0.<init>()
            r1 = r28
            r0.zze(r1)
            boolean r2 = k5.C1405h.f13721k
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.zzf(r2)
            g5.b r2 = r8.f13722d
            com.google.android.gms.internal.mlkit_vision_barcode.zzvz r2 = k5.AbstractC1398a.a(r2)
            r0.zzg(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzcs r2 = r9.zzf()
            r0.zzc(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzcs r2 = r10.zzf()
            r0.zzd(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzft r14 = r0.zzh()
            k5.g r0 = new k5.g
            r0.<init>(r8)
            com.google.android.gms.internal.mlkit_vision_barcode.zzrc r13 = com.google.android.gms.internal.mlkit_vision_barcode.zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION
            e5.n r2 = e5.n.zza
            com.google.android.gms.internal.mlkit_vision_barcode.zzwn r3 = new com.google.android.gms.internal.mlkit_vision_barcode.zzwn
            com.google.android.gms.internal.mlkit_vision_barcode.zzwp r12 = r8.f
            r11 = r3
            r15 = r18
            r17 = r0
            r11.<init>()
            r2.execute(r3)
            long r25 = java.lang.System.currentTimeMillis()
            boolean r0 = r8.f13726i
            long r23 = r25 - r18
            r2 = 1
            if (r2 == r0) goto Lc6
            r0 = 24301(0x5eed, float:3.4053E-41)
        Lc3:
            r21 = r0
            goto Lc9
        Lc6:
            r0 = 24302(0x5eee, float:3.4054E-41)
            goto Lc3
        Lc9:
            int r22 = r28.zza()
            com.google.android.gms.internal.mlkit_vision_barcode.zzwr r0 = r8.f13724g
            r20 = r0
            r20.zzc(r21, r22, r23, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.C1405h.j(com.google.android.gms.internal.mlkit_vision_barcode.zzrb, long, l5.a, java.util.List):void");
    }
}
