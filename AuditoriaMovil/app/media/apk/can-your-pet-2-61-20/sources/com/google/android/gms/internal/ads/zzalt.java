package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzalt implements zzalh {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzalm zzg;
    private final zzall zzh;
    private final zzals zzi;
    private Bitmap zzj;

    public zzalt(List list) {
        zzfo zzfoVar = new zzfo((byte[]) list.get(0));
        int zzq = zzfoVar.zzq();
        int zzq2 = zzfoVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzalm(719, 575, 0, 719, 0, 575);
        this.zzh = new zzall(0, zzg(), zzh(), zzi());
        this.zzi = new zzals(zzq, zzq2);
    }

    private static int zzb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static zzall zzc(zzfn zzfnVar, int i) {
        int zzd;
        int i2;
        int zzd2;
        int zzd3;
        int i3 = 8;
        int zzd4 = zzfnVar.zzd(8);
        zzfnVar.zzm(8);
        int[] zzg = zzg();
        int[] zzh = zzh();
        int[] zzi = zzi();
        int i4 = i - 2;
        while (i4 > 0) {
            int zzd5 = zzfnVar.zzd(i3);
            int zzd6 = zzfnVar.zzd(i3);
            int i5 = i4 - 2;
            int[] iArr = (zzd6 & 128) != 0 ? zzg : (zzd6 & 64) != 0 ? zzh : zzi;
            if ((zzd6 & 1) != 0) {
                zzd2 = zzfnVar.zzd(i3);
                zzd3 = zzfnVar.zzd(i3);
                zzd = zzfnVar.zzd(i3);
                i2 = zzfnVar.zzd(i3);
                i4 = i5 - 4;
            } else {
                int zzd7 = zzfnVar.zzd(2) << 6;
                i4 = i5 - 2;
                zzd = zzfnVar.zzd(4) << 4;
                i2 = zzd7;
                zzd2 = zzfnVar.zzd(6) << 2;
                zzd3 = zzfnVar.zzd(4) << 4;
            }
            if (zzd2 == 0) {
                i2 = 255;
            }
            if (zzd2 == 0) {
                zzd = 0;
            }
            if (zzd2 == 0) {
                zzd3 = 0;
            }
            double d = zzd2;
            double d2 = zzd3 - 128;
            double d3 = zzd - 128;
            iArr[zzd5] = zzb((byte) (255 - (i2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            zzd4 = zzd4;
            i3 = 8;
        }
        return new zzall(zzd4, zzg, zzh, zzi);
    }

    private static zzaln zzd(zzfn zzfnVar) {
        int zzd = zzfnVar.zzd(16);
        zzfnVar.zzm(4);
        int zzd2 = zzfnVar.zzd(2);
        boolean zzo = zzfnVar.zzo();
        zzfnVar.zzm(1);
        byte[] bArr = zzfx.zzf;
        byte[] bArr2 = zzfx.zzf;
        if (zzd2 == 1) {
            zzfnVar.zzm(zzfnVar.zzd(8) * 16);
        } else if (zzd2 == 0) {
            int zzd3 = zzfnVar.zzd(16);
            int zzd4 = zzfnVar.zzd(16);
            if (zzd3 > 0) {
                bArr = new byte[zzd3];
                zzfnVar.zzh(bArr, 0, zzd3);
            }
            if (zzd4 > 0) {
                bArr2 = new byte[zzd4];
                zzfnVar.zzh(bArr2, 0, zzd4);
            } else {
                bArr2 = bArr;
            }
        }
        return new zzaln(zzd, zzo, bArr, bArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0224 A[LOOP:3: B:88:0x016c->B:118:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148 A[LOOP:2: B:40:0x00ac->B:75:0x0148, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017b  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zze(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i, int i2, zzfn zzfnVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzfnVar.zzd(i2);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzb(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                int i5 = WorkQueueKt.MASK;
                int i6 = 1 != i4 ? 0 : WorkQueueKt.MASK;
                int i7 = i3 != 0 ? WorkQueueKt.MASK : 0;
                if (i2 == 0) {
                    i5 = 0;
                }
                iArr[i] = zzb(255, i6, i7, i5);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzb(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzb(WorkQueueKt.MASK, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 43) + WorkQueueKt.MASK + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + WorkQueueKt.MASK + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + WorkQueueKt.MASK + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zza(byte[] bArr, int i, int i2, zzalg zzalgVar, zzep zzepVar) {
        zzakz zzakzVar;
        int i3;
        SparseArray sparseArray;
        int i4;
        SparseArray sparseArray2;
        int[] iArr;
        zzalq zzalqVar;
        int i5;
        int zzd;
        int zzd2;
        int i6;
        int i7;
        int i8;
        int i9;
        zzfn zzfnVar = new zzfn(bArr, i + i2);
        zzfnVar.zzk(i);
        while (zzfnVar.zza() >= 48 && zzfnVar.zzd(8) == 15) {
            zzals zzalsVar = this.zzi;
            int zzd3 = zzfnVar.zzd(8);
            int zzd4 = zzfnVar.zzd(16);
            int zzd5 = zzfnVar.zzd(16);
            int zzb2 = zzfnVar.zzb() + zzd5;
            if (zzd5 * 8 > zzfnVar.zza()) {
                zzfe.zzf("DvbParser", "Data field length exceeds limit");
                zzfnVar.zzm(zzfnVar.zza());
            } else {
                switch (zzd3) {
                    case 16:
                        if (zzd4 == zzalsVar.zza) {
                            zzalo zzaloVar = zzalsVar.zzi;
                            int zzd6 = zzfnVar.zzd(8);
                            int zzd7 = zzfnVar.zzd(4);
                            int zzd8 = zzfnVar.zzd(2);
                            zzfnVar.zzm(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i10 = zzd5 - 2; i10 > 0; i10 -= 6) {
                                int zzd9 = zzfnVar.zzd(8);
                                zzfnVar.zzm(8);
                                sparseArray3.put(zzd9, new zzalp(zzfnVar.zzd(16), zzfnVar.zzd(16)));
                            }
                            zzalo zzaloVar2 = new zzalo(zzd6, zzd7, zzd8, sparseArray3);
                            if (zzaloVar2.zzb != 0) {
                                zzalsVar.zzi = zzaloVar2;
                                zzalsVar.zzc.clear();
                                zzalsVar.zzd.clear();
                                zzalsVar.zze.clear();
                                break;
                            } else if (zzaloVar != null) {
                                if (zzaloVar.zza != zzaloVar2.zza) {
                                    zzalsVar.zzi = zzaloVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzalo zzaloVar3 = zzalsVar.zzi;
                        if (zzd4 == zzalsVar.zza && zzaloVar3 != null) {
                            int zzd10 = zzfnVar.zzd(8);
                            zzfnVar.zzm(4);
                            boolean zzo = zzfnVar.zzo();
                            zzfnVar.zzm(3);
                            int zzd11 = zzfnVar.zzd(16);
                            int zzd12 = zzfnVar.zzd(16);
                            int zzd13 = zzfnVar.zzd(3);
                            int zzd14 = zzfnVar.zzd(3);
                            zzfnVar.zzm(2);
                            int zzd15 = zzfnVar.zzd(8);
                            int zzd16 = zzfnVar.zzd(8);
                            int zzd17 = zzfnVar.zzd(4);
                            int zzd18 = zzfnVar.zzd(2);
                            zzfnVar.zzm(2);
                            int i11 = zzd5 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i11 > 0) {
                                int zzd19 = zzfnVar.zzd(16);
                                int zzd20 = zzfnVar.zzd(2);
                                int zzd21 = zzfnVar.zzd(2);
                                int zzd22 = zzfnVar.zzd(12);
                                zzfnVar.zzm(4);
                                int zzd23 = zzfnVar.zzd(12);
                                i11 -= 6;
                                if (zzd20 != 1) {
                                    if (zzd20 == 2) {
                                        zzd20 = 2;
                                    } else {
                                        i5 = zzd20;
                                        zzd = 0;
                                        zzd2 = 0;
                                        sparseArray4.put(zzd19, new zzalr(i5, zzd21, zzd22, zzd23, zzd, zzd2));
                                    }
                                }
                                i11 -= 2;
                                i5 = zzd20;
                                zzd = zzfnVar.zzd(8);
                                zzd2 = zzfnVar.zzd(8);
                                sparseArray4.put(zzd19, new zzalr(i5, zzd21, zzd22, zzd23, zzd, zzd2));
                            }
                            zzalq zzalqVar2 = new zzalq(zzd10, zzo, zzd11, zzd12, zzd13, zzd14, zzd15, zzd16, zzd17, zzd18, sparseArray4);
                            if (zzaloVar3.zzb == 0 && (zzalqVar = (zzalq) zzalsVar.zzc.get(zzalqVar2.zza)) != null) {
                                int i12 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = zzalqVar.zzj;
                                    if (i12 < sparseArray5.size()) {
                                        zzalqVar2.zzj.put(sparseArray5.keyAt(i12), (zzalr) sparseArray5.valueAt(i12));
                                        i12++;
                                    }
                                }
                            }
                            zzalsVar.zzc.put(zzalqVar2.zza, zzalqVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (zzd4 == zzalsVar.zza) {
                            zzall zzc2 = zzc(zzfnVar, zzd5);
                            zzalsVar.zzd.put(zzc2.zza, zzc2);
                            break;
                        } else if (zzd4 == zzalsVar.zzb) {
                            zzall zzc3 = zzc(zzfnVar, zzd5);
                            zzalsVar.zzf.put(zzc3.zza, zzc3);
                            break;
                        }
                        break;
                    case 19:
                        if (zzd4 == zzalsVar.zza) {
                            zzaln zzd24 = zzd(zzfnVar);
                            zzalsVar.zze.put(zzd24.zza, zzd24);
                            break;
                        } else if (zzd4 == zzalsVar.zzb) {
                            zzaln zzd25 = zzd(zzfnVar);
                            zzalsVar.zzg.put(zzd25.zza, zzd25);
                            break;
                        }
                        break;
                    case 20:
                        if (zzd4 == zzalsVar.zza) {
                            zzfnVar.zzm(4);
                            boolean zzo2 = zzfnVar.zzo();
                            zzfnVar.zzm(3);
                            int zzd26 = zzfnVar.zzd(16);
                            int zzd27 = zzfnVar.zzd(16);
                            if (zzo2) {
                                int zzd28 = zzfnVar.zzd(16);
                                i6 = zzfnVar.zzd(16);
                                i9 = zzfnVar.zzd(16);
                                i7 = zzfnVar.zzd(16);
                                i8 = zzd28;
                            } else {
                                i6 = zzd26;
                                i7 = zzd27;
                                i8 = 0;
                                i9 = 0;
                            }
                            zzalsVar.zzh = new zzalm(zzd26, zzd27, i8, i6, i9, i7);
                            break;
                        }
                        break;
                }
                zzfnVar.zzn(zzb2 - zzfnVar.zzb());
            }
        }
        zzals zzalsVar2 = this.zzi;
        zzalo zzaloVar4 = zzalsVar2.zzi;
        if (zzaloVar4 == null) {
            zzakzVar = new zzakz(zzfzn.zzm(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzalm zzalmVar = zzalsVar2.zzh;
            if (zzalmVar == null) {
                zzalmVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzalmVar.zza + 1 != bitmap.getWidth() || zzalmVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzalmVar.zza + 1, zzalmVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = zzaloVar4.zzc;
            int i13 = 0;
            while (i13 < sparseArray6.size()) {
                this.zzf.save();
                zzalp zzalpVar = (zzalp) sparseArray6.valueAt(i13);
                zzalq zzalqVar3 = (zzalq) this.zzi.zzc.get(sparseArray6.keyAt(i13));
                int i14 = zzalpVar.zza + zzalmVar.zzc;
                int i15 = zzalpVar.zzb + zzalmVar.zze;
                this.zzf.clipRect(i14, i15, Math.min(zzalqVar3.zzc + i14, zzalmVar.zzd), Math.min(zzalqVar3.zzd + i15, zzalmVar.zzf));
                zzall zzallVar = (zzall) this.zzi.zzd.get(zzalqVar3.zzf);
                if (zzallVar == null) {
                    zzallVar = (zzall) this.zzi.zzf.get(zzalqVar3.zzf);
                    if (zzallVar == null) {
                        zzallVar = this.zzh;
                    }
                }
                SparseArray sparseArray7 = zzalqVar3.zzj;
                int i16 = 0;
                while (i16 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i16);
                    zzalr zzalrVar = (zzalr) sparseArray7.valueAt(i16);
                    zzaln zzalnVar = (zzaln) this.zzi.zze.get(keyAt);
                    if (zzalnVar == null) {
                        zzalnVar = (zzaln) this.zzi.zzg.get(keyAt);
                    }
                    if (zzalnVar != null) {
                        Paint paint = zzalnVar.zzb ? null : this.zzd;
                        int i17 = zzalqVar3.zze;
                        int i18 = zzalrVar.zza + i14;
                        int i19 = zzalrVar.zzb + i15;
                        sparseArray = sparseArray6;
                        Canvas canvas = this.zzf;
                        sparseArray2 = sparseArray7;
                        if (i17 == 3) {
                            iArr = zzallVar.zzd;
                        } else if (i17 == 2) {
                            iArr = zzallVar.zzc;
                        } else {
                            iArr = zzallVar.zzb;
                        }
                        i4 = i13;
                        int[] iArr2 = iArr;
                        Paint paint2 = paint;
                        zze(zzalnVar.zzc, iArr2, i17, i18, i19, paint2, canvas);
                        zze(zzalnVar.zzd, iArr2, i17, i18, i19 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray6;
                        i4 = i13;
                        sparseArray2 = sparseArray7;
                    }
                    i16++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    i13 = i4;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i20 = i13;
                float f = i15;
                float f2 = i14;
                if (zzalqVar3.zzb) {
                    int i21 = zzalqVar3.zze;
                    if (i21 == 3) {
                        i3 = zzallVar.zzd[zzalqVar3.zzg];
                    } else if (i21 == 2) {
                        i3 = zzallVar.zzc[zzalqVar3.zzh];
                    } else {
                        i3 = zzallVar.zzb[zzalqVar3.zzi];
                    }
                    this.zze.setColor(i3);
                    this.zzf.drawRect(f2, f, zzalqVar3.zzc + i14, zzalqVar3.zzd + i15, this.zze);
                }
                zzea zzeaVar = new zzea();
                zzeaVar.zzc(Bitmap.createBitmap(this.zzj, i14, i15, zzalqVar3.zzc, zzalqVar3.zzd));
                zzeaVar.zzh(f2 / zzalmVar.zza);
                zzeaVar.zzi(0);
                zzeaVar.zze(f / zzalmVar.zzb, 0);
                zzeaVar.zzf(0);
                zzeaVar.zzk(zzalqVar3.zzc / zzalmVar.zza);
                zzeaVar.zzd(zzalqVar3.zzd / zzalmVar.zzb);
                arrayList.add(zzeaVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i13 = i20 + 1;
                sparseArray6 = sparseArray8;
            }
            zzakzVar = new zzakz(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzepVar.zza(zzakzVar);
    }
}
