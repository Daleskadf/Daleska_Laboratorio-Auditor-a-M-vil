package k5;

import a1.C0415A;
import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g5.C1010b;
import j3.C1367d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: k5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1398a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray f13701a;

    /* renamed from: b  reason: collision with root package name */
    public static final SparseArray f13702b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference f13703c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f13704d;

    static {
        SparseArray sparseArray = new SparseArray();
        f13701a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f13702b = sparseArray2;
        f13703c = new AtomicReference();
        sparseArray.put(-1, zzrn.FORMAT_UNKNOWN);
        sparseArray.put(1, zzrn.FORMAT_CODE_128);
        sparseArray.put(2, zzrn.FORMAT_CODE_39);
        sparseArray.put(4, zzrn.FORMAT_CODE_93);
        sparseArray.put(8, zzrn.FORMAT_CODABAR);
        sparseArray.put(16, zzrn.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzrn.FORMAT_EAN_13);
        sparseArray.put(64, zzrn.FORMAT_EAN_8);
        sparseArray.put(RecognitionOptions.ITF, zzrn.FORMAT_ITF);
        sparseArray.put(RecognitionOptions.QR_CODE, zzrn.FORMAT_QR_CODE);
        sparseArray.put(RecognitionOptions.UPC_A, zzrn.FORMAT_UPC_A);
        sparseArray.put(RecognitionOptions.UPC_E, zzrn.FORMAT_UPC_E);
        sparseArray.put(RecognitionOptions.PDF417, zzrn.FORMAT_PDF417);
        sparseArray.put(RecognitionOptions.AZTEC, zzrn.FORMAT_AZTEC);
        sparseArray2.put(0, zzro.TYPE_UNKNOWN);
        sparseArray2.put(1, zzro.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzro.TYPE_EMAIL);
        sparseArray2.put(3, zzro.TYPE_ISBN);
        sparseArray2.put(4, zzro.TYPE_PHONE);
        sparseArray2.put(5, zzro.TYPE_PRODUCT);
        sparseArray2.put(6, zzro.TYPE_SMS);
        sparseArray2.put(7, zzro.TYPE_TEXT);
        sparseArray2.put(8, zzro.TYPE_URL);
        sparseArray2.put(9, zzro.TYPE_WIFI);
        sparseArray2.put(10, zzro.TYPE_GEO);
        sparseArray2.put(11, zzro.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzro.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f13704d = hashMap;
        hashMap.put(1, zzvw.CODE_128);
        hashMap.put(2, zzvw.CODE_39);
        hashMap.put(4, zzvw.CODE_93);
        hashMap.put(8, zzvw.CODABAR);
        hashMap.put(16, zzvw.DATA_MATRIX);
        hashMap.put(32, zzvw.EAN_13);
        hashMap.put(64, zzvw.EAN_8);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.ITF), zzvw.ITF);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.QR_CODE), zzvw.QR_CODE);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.UPC_A), zzvw.UPC_A);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.UPC_E), zzvw.UPC_E);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.PDF417), zzvw.PDF417);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.AZTEC), zzvw.AZTEC);
    }

    public static zzvz a(C1010b c1010b) {
        int i7 = c1010b.f11128a;
        zzcp zzcpVar = new zzcp();
        HashMap hashMap = f13704d;
        if (i7 == 0) {
            zzcpVar.zze(hashMap.values());
        } else {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & i7) != 0) {
                    zzcpVar.zzd((zzvw) entry.getValue());
                }
            }
        }
        zzvx zzvxVar = new zzvx();
        zzvxVar.zzb(zzcpVar.zzf());
        return zzvxVar.zzc();
    }

    public static void b(zzwp zzwpVar, zzrb zzrbVar) {
        zzwpVar.zzf(new C0415A(zzrbVar), zzrc.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean c() {
        boolean z7;
        AtomicReference atomicReference = f13703c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context b5 = e5.g.c().b();
        zzcs zzcsVar = C1407j.f13727Y;
        if (C1367d.a(b5, ModuleDescriptor.MODULE_ID) > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        atomicReference.set(Boolean.valueOf(z7));
        return z7;
    }
}
