package k5;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;
import g5.C1010b;
import j3.C1367d;
/* renamed from: k5.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1402e extends e5.e {

    /* renamed from: a  reason: collision with root package name */
    public final e5.g f13714a;

    public C1402e(e5.g gVar) {
        this.f13714a = gVar;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, D5.b] */
    @Override // e5.e
    public final Object create(Object obj) {
        String str;
        C1407j c1407j;
        C1010b c1010b = (C1010b) obj;
        e5.g gVar = this.f13714a;
        Context b5 = gVar.b();
        if (true != AbstractC1398a.c()) {
            str = "play-services-mlkit-barcode-scanning";
        } else {
            str = "barcode-scanning";
        }
        zzwp zzb = zzxa.zzb(str);
        zzcs zzcsVar = C1407j.f13727Y;
        if (C1367d.a(b5, ModuleDescriptor.MODULE_ID) <= 0) {
            W2.f.f6172b.getClass();
            if (W2.f.a(b5) < 204500000) {
                ?? obj2 = new Object();
                zzah zzahVar = new zzah();
                obj2.f869c = zzahVar;
                obj2.f868b = b5;
                zzahVar.zza = c1010b.f11128a;
                obj2.f870d = zzb;
                c1407j = obj2;
                return new C1405h(gVar, c1010b, c1407j, zzb);
            }
        }
        c1407j = new C1407j(b5, c1010b, zzb);
        return new C1405h(gVar, c1010b, c1407j, zzb);
    }
}
