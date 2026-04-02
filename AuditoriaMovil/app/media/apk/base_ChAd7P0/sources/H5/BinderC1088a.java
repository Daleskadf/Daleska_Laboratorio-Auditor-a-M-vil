package h5;

import H4.e1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzam;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i3.InterfaceC1109a;
import io.flutter.plugins.pathprovider.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n5.C1534a;
import n5.e;
import n5.f;
import n5.g;
import n5.i;
import n5.j;
import n5.k;
import n5.l;
import n5.n;
import n5.o;
import n5.p;
import n5.q;
import n5.r;
import n5.t;
import x3.C1987a;
import x3.C1988b;
import x3.C1989c;
import x3.C1990d;
import x3.C1991e;
import x3.C1992f;
import x3.C1993g;
import x3.C1994h;
import x3.C1995i;
import x3.C1996j;
/* renamed from: h5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1088a extends zzbm {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f11339d = {5, 7, 7, 7, 5, 5};

    /* renamed from: e  reason: collision with root package name */
    public static final double[][] f11340e = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: a  reason: collision with root package name */
    public final Context f11341a;

    /* renamed from: b  reason: collision with root package name */
    public final zzba f11342b;

    /* renamed from: c  reason: collision with root package name */
    public BarhopperV3 f11343c;

    public BinderC1088a(Context context, zzba zzbaVar) {
        this.f11341a = context;
        this.f11342b = zzbaVar;
    }

    public static zzan b(n nVar, String str, String str2) {
        String str3 = null;
        if (nVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int d7 = nVar.d();
        int zzd = nVar.zzd();
        int a7 = nVar.a();
        int b5 = nVar.b();
        int zzc = nVar.zzc();
        int c8 = nVar.c();
        boolean f = nVar.f();
        if (matcher.find()) {
            str3 = matcher.group(1);
        }
        return new zzan(d7, zzd, a7, b5, zzc, c8, f, str3);
    }

    public final C1534a c(ByteBuffer byteBuffer, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = this.f11343c;
        I.i(barhopperV3);
        I.i(byteBuffer);
        if (byteBuffer.isDirect()) {
            return barhopperV3.recognize(zzccVar.zzd(), zzccVar.zza(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.recognize(zzccVar.zzd(), zzccVar.zza(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.recognize(zzccVar.zzd(), zzccVar.zza(), bArr, recognitionOptions);
    }

    public final ArrayList e(InterfaceC1109a interfaceC1109a, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        C1534a recognize;
        Matrix matrix;
        int i7;
        zzar zzarVar;
        zzau zzauVar;
        zzav zzavVar;
        zzax zzaxVar;
        zzaw zzawVar;
        zzas zzasVar;
        zzao zzaoVar;
        int i8;
        zzap zzapVar;
        zzaq zzaqVar;
        int i9;
        int i10;
        String str;
        Point[] pointArr;
        int i11;
        int i12;
        zzat zzatVar;
        zzau[] zzauVarArr;
        zzar[] zzarVarArr;
        zzam[] zzamVarArr;
        String str2;
        String str3;
        int zzb = zzccVar.zzb();
        int i13 = -1;
        int i14 = 0;
        if (zzb != -1) {
            if (zzb != 17) {
                if (zzb != 35) {
                    if (zzb != 842094169) {
                        throw new IllegalArgumentException(b.e(zzccVar.zzb(), "Unsupported image format: "));
                    }
                } else {
                    Image image = (Image) i3.b.c(interfaceC1109a);
                    I.i(image);
                    recognize = c(image.getPlanes()[0].getBuffer(), zzccVar, recognitionOptions);
                }
            }
            recognize = c((ByteBuffer) i3.b.c(interfaceC1109a), zzccVar, recognitionOptions);
        } else {
            BarhopperV3 barhopperV3 = this.f11343c;
            I.i(barhopperV3);
            recognize = barhopperV3.recognize((Bitmap) i3.b.c(interfaceC1109a), recognitionOptions);
        }
        ArrayList arrayList = new ArrayList();
        m5.b bVar = m5.b.f14053b;
        int zzd = zzccVar.zzd();
        int zza = zzccVar.zza();
        int zzc = zzccVar.zzc();
        bVar.getClass();
        if (zzc == 0) {
            matrix = null;
        } else {
            matrix = new Matrix();
            matrix.postTranslate((-zzd) / 2.0f, (-zza) / 2.0f);
            matrix.postRotate(zzc * 90);
            int i15 = zzc % 2;
            if (i15 != 0) {
                i7 = zza;
            } else {
                i7 = zzd;
            }
            if (i15 == 0) {
                zzd = zza;
            }
            matrix.postTranslate(i7 / 2.0f, zzd / 2.0f);
        }
        for (l lVar : recognize.b()) {
            if (lVar.b() > 0 && matrix != null) {
                float[] fArr = new float[8];
                zzeo m7 = lVar.m();
                int b5 = lVar.b();
                for (int i16 = i14; i16 < b5; i16++) {
                    int i17 = i16 + i16;
                    fArr[i17] = ((f) m7.get(i16)).a();
                    fArr[i17 + 1] = ((f) m7.get(i16)).b();
                }
                matrix.mapPoints(fArr);
                int zzc2 = zzccVar.zzc();
                for (int i18 = i14; i18 < b5; i18++) {
                    k kVar = (k) lVar.zzH();
                    int i19 = i18 + i18;
                    e c8 = f.c();
                    c8.a((int) fArr[i19]);
                    c8.b((int) fArr[i19 + 1]);
                    kVar.a((i18 + zzc2) % b5, (f) c8.zzj());
                    lVar = (l) kVar.zzj();
                }
            }
            if (lVar.r()) {
                r f = lVar.f();
                zzarVar = new zzar(f.b() + i13, f.zzc(), f.zze(), f.zzd());
            } else {
                zzarVar = null;
            }
            if (lVar.t()) {
                zzco zzb2 = lVar.zzb();
                zzauVar = new zzau(zzb2.zzd() + i13, zzb2.zzc());
            } else {
                zzauVar = null;
            }
            if (lVar.u()) {
                g h8 = lVar.h();
                zzavVar = new zzav(h8.zzc(), h8.zzd());
            } else {
                zzavVar = null;
            }
            if (lVar.w()) {
                j j = lVar.j();
                zzaxVar = new zzax(j.zzd(), j.zzc(), j.b() + i13);
            } else {
                zzaxVar = null;
            }
            if (lVar.v()) {
                i i20 = lVar.i();
                zzawVar = new zzaw(i20.zzc(), i20.zzd());
            } else {
                zzawVar = null;
            }
            if (lVar.s()) {
                t g3 = lVar.g();
                zzasVar = new zzas(g3.a(), g3.b());
            } else {
                zzasVar = null;
            }
            if (lVar.o()) {
                o c9 = lVar.c();
                String zzj = c9.zzj();
                String zze = c9.zze();
                String zzf = c9.zzf();
                String zzh = c9.zzh();
                String zzi = c9.zzi();
                n b7 = c9.b();
                if (lVar.k().zzn()) {
                    str2 = lVar.k().zzt();
                } else {
                    str2 = null;
                }
                zzan b8 = b(b7, str2, "DTSTART:([0-9TZ]*)");
                n a7 = c9.a();
                if (lVar.k().zzn()) {
                    str3 = lVar.k().zzt();
                } else {
                    str3 = null;
                }
                zzaoVar = new zzao(zzj, zze, zzf, zzh, zzi, b8, b(a7, str3, "DTEND:([0-9TZ]*)"));
            } else {
                zzaoVar = null;
            }
            if (lVar.p()) {
                p d7 = lVar.d();
                zzck zza2 = d7.zza();
                if (zza2 != null) {
                    zzatVar = new zzat(zza2.zzd(), zza2.zzi(), zza2.zzh(), zza2.zzc(), zza2.zzf(), zza2.zze(), zza2.zzj());
                } else {
                    zzatVar = null;
                }
                String zzd2 = d7.zzd();
                String zze2 = d7.zze();
                zzeo d8 = d7.d();
                if (d8.isEmpty()) {
                    zzauVarArr = null;
                } else {
                    zzau[] zzauVarArr2 = new zzau[d8.size()];
                    for (int i21 = i14; i21 < d8.size(); i21++) {
                        zzauVarArr2[i21] = new zzau(((zzco) d8.get(i21)).zzd() + i13, ((zzco) d8.get(i21)).zzc());
                    }
                    zzauVarArr = zzauVarArr2;
                }
                zzeo c10 = d7.c();
                if (c10.isEmpty()) {
                    zzarVarArr = null;
                } else {
                    zzar[] zzarVarArr2 = new zzar[c10.size()];
                    int i22 = i14;
                    while (i22 < c10.size()) {
                        zzarVarArr2[i22] = new zzar(((r) c10.get(i22)).b() + i13, ((r) c10.get(i22)).zzc(), ((r) c10.get(i22)).zze(), ((r) c10.get(i22)).zzd());
                        i22++;
                        i13 = -1;
                    }
                    zzarVarArr = zzarVarArr2;
                }
                String[] strArr = (String[]) d7.e().toArray(new String[0]);
                zzeo b9 = d7.b();
                if (b9.isEmpty()) {
                    i8 = 0;
                    zzamVarArr = null;
                } else {
                    zzam[] zzamVarArr2 = new zzam[b9.size()];
                    for (int i23 = 0; i23 < b9.size(); i23++) {
                        zzamVarArr2[i23] = new zzam(((zzci) b9.get(i23)).zzc() - 1, (String[]) ((zzci) b9.get(i23)).zzb().toArray(new String[0]));
                    }
                    i8 = 0;
                    zzamVarArr = zzamVarArr2;
                }
                zzapVar = new zzap(zzatVar, zzd2, zze2, zzauVarArr, zzarVarArr, strArr, zzamVarArr);
            } else {
                i8 = i14;
                zzapVar = null;
            }
            if (lVar.q()) {
                q e7 = lVar.e();
                zzaqVar = new zzaq(e7.zzi(), e7.b(), e7.h(), e7.f(), e7.c(), e7.zze(), e7.zzc(), e7.zzd(), e7.zzf(), e7.g(), e7.d(), e7.zzj(), e7.zzh(), e7.e());
            } else {
                zzaqVar = null;
            }
            switch (lVar.x() - 1) {
                case 0:
                    i9 = i8;
                    break;
                case 1:
                    i9 = 1;
                    break;
                case 2:
                    i9 = 2;
                    break;
                case 3:
                    i9 = 4;
                    break;
                case 4:
                    i9 = 8;
                    break;
                case 5:
                    i10 = 16;
                    i9 = i10;
                    break;
                case 6:
                    i10 = 32;
                    i9 = i10;
                    break;
                case 7:
                    i10 = 64;
                    i9 = i10;
                    break;
                case 8:
                    i10 = RecognitionOptions.ITF;
                    i9 = i10;
                    break;
                case 9:
                    i10 = RecognitionOptions.QR_CODE;
                    i9 = i10;
                    break;
                case 10:
                    i10 = RecognitionOptions.UPC_A;
                    i9 = i10;
                    break;
                case 11:
                    i10 = RecognitionOptions.UPC_E;
                    i9 = i10;
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i10 = RecognitionOptions.PDF417;
                    i9 = i10;
                    break;
                case 13:
                    i10 = RecognitionOptions.AZTEC;
                    i9 = i10;
                    break;
                default:
                    i9 = -1;
                    break;
            }
            String l8 = lVar.l();
            if (lVar.k().zzn()) {
                str = lVar.k().zzt();
            } else {
                str = null;
            }
            byte[] zzw = lVar.k().zzw();
            zzeo m8 = lVar.m();
            if (m8.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[m8.size()];
                for (int i24 = i8; i24 < m8.size(); i24++) {
                    pointArr2[i24] = new Point(((f) m8.get(i24)).a(), ((f) m8.get(i24)).b());
                }
                pointArr = pointArr2;
            }
            switch (lVar.a() - 1) {
                case 1:
                    i11 = 1;
                    continue;
                    arrayList.add(new zzay(i9, l8, str, zzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
                    i13 = -1;
                    i14 = i8;
                case 2:
                    i11 = 2;
                    continue;
                    arrayList.add(new zzay(i9, l8, str, zzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
                    i13 = -1;
                    i14 = i8;
                case 3:
                    i12 = 3;
                    break;
                case 4:
                    i11 = 4;
                    continue;
                    arrayList.add(new zzay(i9, l8, str, zzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
                    i13 = -1;
                    i14 = i8;
                case 5:
                    i12 = 5;
                    break;
                case 6:
                    i12 = 6;
                    break;
                case 7:
                    i12 = 7;
                    break;
                case 8:
                    i11 = 8;
                    continue;
                    arrayList.add(new zzay(i9, l8, str, zzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
                    i13 = -1;
                    i14 = i8;
                case 9:
                    i12 = 9;
                    break;
                case 10:
                    i12 = 10;
                    break;
                case 11:
                    i12 = 11;
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i12 = 12;
                    break;
                default:
                    i11 = i8;
                    continue;
                    arrayList.add(new zzay(i9, l8, str, zzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
                    i13 = -1;
                    i14 = i8;
            }
            i11 = i12;
            arrayList.add(new zzay(i9, l8, str, zzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
            i13 = -1;
            i14 = i8;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzb(InterfaceC1109a interfaceC1109a, zzcc zzccVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        zzba zzbaVar = this.f11342b;
        recognitionOptions.setBarcodeFormats(zzbaVar.zza());
        recognitionOptions.setOutputUnrecognizedBarcodes(zzbaVar.zzb());
        recognitionOptions.setEnableQrAlignmentGrid(true);
        recognitionOptions.setEnableUseKeypointAsFinderPattern(true);
        return e(interfaceC1109a, zzccVar, recognitionOptions);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzc(InterfaceC1109a interfaceC1109a, zzcc zzccVar, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        zzba zzbaVar = this.f11342b;
        recognitionOptions.setBarcodeFormats(zzbaVar.zza());
        recognitionOptions.setOutputUnrecognizedBarcodes(zzbaVar.zzb());
        recognitionOptions.setEnableQrAlignmentGrid(true);
        recognitionOptions.setEnableUseKeypointAsFinderPattern(true);
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.setExtraScales(zzbcVar.zza().zzc());
        multiScaleDecodingOptions.setMinimumDetectedDimension(zzbcVar.zza().zza());
        multiScaleDecodingOptions.setSkipProcessingIfBarcodeFound(zzbcVar.zza().zzb());
        recognitionOptions.setMultiScaleDecodingOptions(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.setExtraScales(zzbcVar.zza().zzc());
        recognitionOptions.setMultiScaleDetectionOptions(multiScaleDetectionOptions);
        recognitionOptions.setQrEnableFourthCornerApproximation(zzbcVar.zzb());
        return e(interfaceC1109a, zzccVar, recognitionOptions);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzd() {
        Context context = this.f11341a;
        if (this.f11343c == null) {
            this.f11343c = new BarhopperV3();
            C1994h a7 = C1995i.a();
            C1992f a8 = C1993g.a();
            int i7 = 16;
            int i8 = 0;
            for (int i9 = 0; i9 < 6; i9++) {
                C1990d a9 = C1991e.a();
                a9.c(i7);
                a9.d(i7);
                for (int i10 = 0; i10 < f11339d[i9]; i10++) {
                    double[] dArr = f11340e[i8];
                    float sqrt = (float) Math.sqrt(dArr[1]);
                    float f = (float) (dArr[0] * 320.0d);
                    a9.a(f / sqrt);
                    a9.b(f * sqrt);
                    i8++;
                }
                i7 += i7;
                a8.a(a9);
            }
            a7.a(a8);
            try {
                InputStream open = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
                InputStream open2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                InputStream open3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                try {
                    BarhopperV3 barhopperV3 = this.f11343c;
                    I.i(barhopperV3);
                    C1996j a10 = C1987a.a();
                    a7.b(zzdf.zzs(open));
                    a10.a(a7);
                    C1988b a11 = C1989c.a();
                    a11.a(zzdf.zzs(open2));
                    a11.b(zzdf.zzs(open3));
                    a10.b(a11);
                    barhopperV3.create((C1987a) a10.zzj());
                    if (open3 != null) {
                        open3.close();
                    }
                    if (open2 != null) {
                        open2.close();
                    }
                    if (open != null) {
                        open.close();
                    }
                } catch (Throwable th) {
                    if (open3 != null) {
                        try {
                            open3.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e7) {
                throw new IllegalStateException("Failed to open Barcode models", e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzf() {
        BarhopperV3 barhopperV3 = this.f11343c;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f11343c = null;
        }
    }
}
