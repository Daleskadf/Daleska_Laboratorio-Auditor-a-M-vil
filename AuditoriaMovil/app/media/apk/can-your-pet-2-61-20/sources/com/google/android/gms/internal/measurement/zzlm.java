package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzlm<T> implements zzma<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznb.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzli zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final zzlt zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzlq zzo;
    private final zzkn zzp;
    private final zzmv<?, ?> zzq;
    private final zzjk<?> zzr;
    private final zzlb zzs;

    private static <T> double zza(T t, long j) {
        return ((Double) zznb.zze(t, j)).doubleValue();
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zznb.zze(t, j)).floatValue();
    }

    private static int zza(byte[] bArr, int i, int i2, zzni zzniVar, Class<?> cls, zzih zzihVar) throws IOException {
        switch (zzll.zza[zzniVar.ordinal()]) {
            case 1:
                int zzd = zzie.zzd(bArr, i, zzihVar);
                zzihVar.zzc = Boolean.valueOf(zzihVar.zzb != 0);
                return zzd;
            case 2:
                return zzie.zza(bArr, i, zzihVar);
            case 3:
                zzihVar.zzc = Double.valueOf(zzie.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzihVar.zzc = Integer.valueOf(zzie.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzihVar.zzc = Long.valueOf(zzie.zzd(bArr, i));
                return i + 8;
            case 8:
                zzihVar.zzc = Float.valueOf(zzie.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzie.zzc(bArr, i, zzihVar);
                zzihVar.zzc = Integer.valueOf(zzihVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzie.zzd(bArr, i, zzihVar);
                zzihVar.zzc = Long.valueOf(zzihVar.zzb);
                return zzd2;
            case 14:
                return zzie.zza(zzlw.zza().zza((Class) cls), bArr, i, i2, zzihVar);
            case 15:
                int zzc2 = zzie.zzc(bArr, i, zzihVar);
                zzihVar.zzc = Integer.valueOf(zziw.zza(zzihVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzie.zzd(bArr, i, zzihVar);
                zzihVar.zzc = Long.valueOf(zziw.zza(zzihVar.zzb));
                return zzd3;
            case 17:
                return zzie.zzb(bArr, i, zzihVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    @Override // com.google.android.gms.internal.measurement.zzma
    public final int zza(T t) {
        int i;
        int i2;
        int i3;
        int zza2;
        int zza3;
        int zzd;
        int zzd2;
        int zzf;
        int zzg;
        Unsafe unsafe = zzb;
        ?? r9 = 0;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.zzc.length) {
            int zzc = zzc(i7);
            int i9 = (267386880 & zzc) >>> 20;
            int[] iArr = this.zzc;
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i4;
            if (i9 <= 17) {
                if (i12 != i5) {
                    i6 = i12 == i4 ? 0 : unsafe.getInt(t, i12);
                    i5 = i12;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = zzc & i4;
            if (i9 >= zzjq.DOUBLE_LIST_PACKED.zza()) {
                zzjq.SINT64_LIST_PACKED.zza();
            }
            int i13 = i3;
            switch (i9) {
                case 0:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza2 = zzjc.zza(i10, 0.0d);
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza2 = zzjc.zza(i10, 0.0f);
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza2 = zzjc.zzb(i10, unsafe.getLong(t, j));
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza2 = zzjc.zze(i10, unsafe.getLong(t, j));
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza2 = zzjc.zzc(i10, unsafe.getInt(t, j));
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza2 = zzjc.zza(i10, 0L);
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza2 = zzjc.zzb(i10, 0);
                        i8 += zza2;
                        break;
                    }
                    break;
                case 7:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza3 = zzjc.zza(i10, true);
                        i8 += zza3;
                    }
                    break;
                case 8:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzii) {
                            zza3 = zzjc.zza(i10, (zzii) object);
                        } else {
                            zza3 = zzjc.zza(i10, (String) object);
                        }
                        i8 += zza3;
                    }
                    break;
                case 9:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza3 = zzmc.zza(i10, unsafe.getObject(t, j), zze(i7));
                        i8 += zza3;
                    }
                    break;
                case 10:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza3 = zzjc.zza(i10, (zzii) unsafe.getObject(t, j));
                        i8 += zza3;
                    }
                    break;
                case 11:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza3 = zzjc.zzf(i10, unsafe.getInt(t, j));
                        i8 += zza3;
                    }
                    break;
                case 12:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza3 = zzjc.zza(i10, unsafe.getInt(t, j));
                        i8 += zza3;
                    }
                    break;
                case 13:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zzd = zzjc.zzd(i10, 0);
                        i8 += zzd;
                    }
                    break;
                case 14:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza3 = zzjc.zzc(i10, 0L);
                        i8 += zza3;
                    }
                    break;
                case 15:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza3 = zzjc.zze(i10, unsafe.getInt(t, j));
                        i8 += zza3;
                    }
                    break;
                case 16:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza3 = zzjc.zzd(i10, unsafe.getLong(t, j));
                        i8 += zza3;
                    }
                    break;
                case 17:
                    if (zza((zzlm<T>) t, i7, i, i2, i13)) {
                        zza3 = zzjc.zza(i10, (zzli) unsafe.getObject(t, j), zze(i7));
                        i8 += zza3;
                    }
                    break;
                case 18:
                    zza3 = zzmc.zzd(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 19:
                    zza3 = zzmc.zzc(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 20:
                    zza3 = zzmc.zzf(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 21:
                    zza3 = zzmc.zzj(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 22:
                    zza3 = zzmc.zze(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 23:
                    zza3 = zzmc.zzd(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 24:
                    zza3 = zzmc.zzc(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 25:
                    zza3 = zzmc.zza(i10, (List) unsafe.getObject(t, j), (boolean) r9);
                    i8 += zza3;
                    break;
                case 26:
                    zza3 = zzmc.zzb(i10, (List) unsafe.getObject(t, j));
                    i8 += zza3;
                    break;
                case 27:
                    zza3 = zzmc.zzb(i10, (List) unsafe.getObject(t, j), zze(i7));
                    i8 += zza3;
                    break;
                case 28:
                    zza3 = zzmc.zza(i10, (List) unsafe.getObject(t, j));
                    i8 += zza3;
                    break;
                case 29:
                    zza3 = zzmc.zzi(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 30:
                    zza3 = zzmc.zzb(i10, (List) unsafe.getObject(t, j), (boolean) r9);
                    i8 += zza3;
                    break;
                case 31:
                    zza3 = zzmc.zzc(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 32:
                    zza3 = zzmc.zzd(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 33:
                    zza3 = zzmc.zzg(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 34:
                    zza3 = zzmc.zzh(i10, (List) unsafe.getObject(t, j), r9);
                    i8 += zza3;
                    break;
                case 35:
                    zzd2 = zzmc.zzd((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 36:
                    zzd2 = zzmc.zzc((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 37:
                    zzd2 = zzmc.zzf((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 38:
                    zzd2 = zzmc.zzj((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 39:
                    zzd2 = zzmc.zze((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 40:
                    zzd2 = zzmc.zzd((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 41:
                    zzd2 = zzmc.zzc((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 42:
                    zzd2 = zzmc.zza((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 43:
                    zzd2 = zzmc.zzi((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 44:
                    zzd2 = zzmc.zzb((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 45:
                    zzd2 = zzmc.zzc((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 46:
                    zzd2 = zzmc.zzd((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 47:
                    zzd2 = zzmc.zzg((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzd2 = zzmc.zzh((List) unsafe.getObject(t, j));
                    if (zzd2 > 0) {
                        zzf = zzjc.zzf(i10);
                        zzg = zzjc.zzg(zzd2);
                        zzd = zzf + zzg + zzd2;
                        i8 += zzd;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zza3 = zzmc.zza(i10, (List<zzli>) unsafe.getObject(t, j), zze(i7));
                    i8 += zza3;
                    break;
                case 50:
                    zza3 = this.zzs.zza(i10, unsafe.getObject(t, j), zzf(i7));
                    i8 += zza3;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zza(i10, 0.0d);
                        i8 += zza3;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zza(i10, 0.0f);
                        i8 += zza3;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zzb(i10, zzd(t, j));
                        i8 += zza3;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zze(i10, zzd(t, j));
                        i8 += zza3;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zzc(i10, zzc(t, j));
                        i8 += zza3;
                    }
                    break;
                case 56:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zza(i10, 0L);
                        i8 += zza3;
                    }
                    break;
                case 57:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zzb(i10, (int) r9);
                        i8 += zza3;
                    }
                    break;
                case 58:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zza(i10, true);
                        i8 += zza3;
                    }
                    break;
                case 59:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzii) {
                            zza3 = zzjc.zza(i10, (zzii) object2);
                        } else {
                            zza3 = zzjc.zza(i10, (String) object2);
                        }
                        i8 += zza3;
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzmc.zza(i10, unsafe.getObject(t, j), zze(i7));
                        i8 += zza3;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zza(i10, (zzii) unsafe.getObject(t, j));
                        i8 += zza3;
                    }
                    break;
                case 62:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zzf(i10, zzc(t, j));
                        i8 += zza3;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zza(i10, zzc(t, j));
                        i8 += zza3;
                    }
                    break;
                case 64:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zzd(i10, (int) r9);
                        i8 += zza3;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zzc(i10, 0L);
                        i8 += zza3;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zze(i10, zzc(t, j));
                        i8 += zza3;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zzd(i10, zzd(t, j));
                        i8 += zza3;
                    }
                    break;
                case 68:
                    if (zzc((zzlm<T>) t, i10, i7)) {
                        zza3 = zzjc.zza(i10, (zzli) unsafe.getObject(t, j), zze(i7));
                        i8 += zza3;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            r9 = 0;
            i4 = 1048575;
        }
        int i14 = 0;
        zzmv<?, ?> zzmvVar = this.zzq;
        int zza4 = i8 + zzmvVar.zza((zzmv<?, ?>) zzmvVar.zzd(t));
        if (this.zzh) {
            zzjl<?> zza5 = this.zzr.zza(t);
            for (int i15 = 0; i15 < zza5.zza.zza(); i15++) {
                Map.Entry<?, Object> zzb2 = zza5.zza.zzb(i15);
                i14 += zzjl.zza((zzjn) zzb2.getKey(), zzb2.getValue());
            }
            for (Map.Entry<?, Object> entry : zza5.zza.zzb()) {
                i14 += zzjl.zza((zzjn) entry.getKey(), entry.getValue());
            }
            return zza4 + i14;
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final int zzb(T t) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzc = zzc(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzc;
            int i5 = 37;
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzjy.zza(Double.doubleToLongBits(zznb.zza(t, j)));
                    i2 = i + zza2;
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zznb.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzjy.zza(zznb.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzjy.zza(zznb.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zznb.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzjy.zza(zznb.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zznb.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzjy.zza(zznb.zzh(t, j));
                    i2 = i + zza2;
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zznb.zze(t, j)).hashCode();
                    i2 = i + zza2;
                    break;
                case 9:
                    Object zze = zznb.zze(t, j);
                    if (zze != null) {
                        i5 = zze.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza2 = zznb.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zznb.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zznb.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zznb.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzjy.zza(zznb.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zznb.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzjy.zza(zznb.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 17:
                    Object zze2 = zznb.zze(t, j);
                    if (zze2 != null) {
                        i5 = zze2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i2 * 53;
                    zza2 = zznb.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 50:
                    i = i2 * 53;
                    zza2 = zznb.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjy.zza(Double.doubleToLongBits(zza(t, j)));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzb(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjy.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjy.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjy.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjy.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zznb.zze(t, j)).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zznb.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zznb.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjy.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjy.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zznb.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzq.zzd(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzr.zza(t).hashCode() : hashCode;
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zznb.zze(t, j)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x09dc, code lost:
        throw com.google.android.gms.internal.measurement.zzkd.zzh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0cea, code lost:
        if (r14 == r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0cec, code lost:
        r28.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0cf2, code lost:
        r10 = r9.zzm;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0cf9, code lost:
        if (r10 >= r9.zzn) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0cfb, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzmy) zza((java.lang.Object) r32, r9.zzl[r10], (int) r3, (com.google.android.gms.internal.measurement.zzmv<UT, int>) r9.zzq, (java.lang.Object) r32);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0d11, code lost:
        if (r3 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0d13, code lost:
        r9.zzq.zzb((java.lang.Object) r7, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0d18, code lost:
        if (r6 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0d1c, code lost:
        if (r8 != r35) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0d23, code lost:
        throw com.google.android.gms.internal.measurement.zzkd.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0d26, code lost:
        if (r8 > r35) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0d28, code lost:
        if (r11 != r6) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0d2a, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0d2f, code lost:
        throw com.google.android.gms.internal.measurement.zzkd.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x08c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:622:0x08b3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v133, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x057d -> B:195:0x057e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x060c -> B:227:0x060d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:246:0x065a -> B:247:0x065b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.measurement.zzih r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzih):int");
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    private final int zza(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zznb.zze(t, j)).longValue();
    }

    private final zzjz zzd(int i) {
        return (zzjz) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.android.gms.internal.measurement.zzlm<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.measurement.zzlg r33, com.google.android.gms.internal.measurement.zzlq r34, com.google.android.gms.internal.measurement.zzkn r35, com.google.android.gms.internal.measurement.zzmv<?, ?> r36, com.google.android.gms.internal.measurement.zzjk<?> r37, com.google.android.gms.internal.measurement.zzlb r38) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zza(java.lang.Class, com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlq, com.google.android.gms.internal.measurement.zzkn, com.google.android.gms.internal.measurement.zzmv, com.google.android.gms.internal.measurement.zzjk, com.google.android.gms.internal.measurement.zzlb):com.google.android.gms.internal.measurement.zzlm");
    }

    private final zzma zze(int i) {
        int i2 = (i / 3) << 1;
        zzma zzmaVar = (zzma) this.zzd[i2];
        if (zzmaVar != null) {
            return zzmaVar;
        }
        zzma<T> zza2 = zzlw.zza().zza((Class) ((Class) this.zzd[i2 + 1]));
        this.zzd[i2] = zza2;
        return zza2;
    }

    private static zzmy zze(Object obj) {
        zzjv zzjvVar = (zzjv) obj;
        zzmy zzmyVar = zzjvVar.zzb;
        if (zzmyVar == zzmy.zzc()) {
            zzmy zzd = zzmy.zzd();
            zzjvVar.zzb = zzd;
            return zzd;
        }
        return zzmyVar;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzmv<UT, UB> zzmvVar, Object obj2) {
        zzjz zzd;
        int i2 = this.zzc[i];
        Object zze = zznb.zze(obj, zzc(i) & 1048575);
        return (zze == null || (zzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzs.zze(zze), zzd, (zzjz) ub, (zzmv<UT, zzjz>) zzmvVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzjz zzjzVar, UB ub, zzmv<UT, UB> zzmvVar, Object obj) {
        zzkz<?, ?> zza2 = this.zzs.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjzVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmvVar.zzc(obj);
                }
                zzir zzc = zzii.zzc(zzla.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzla.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzmvVar.zza((zzmv<UT, UB>) ub, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzma zze = zze(i);
        long zzc = zzc(i) & 1048575;
        if (!zzc((zzlm<T>) t, i)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i, int i2) {
        zzma zze = zze(i2);
        if (!zzc((zzlm<T>) t, i, i2)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private zzlm(int[] iArr, Object[] objArr, int i, int i2, zzli zzliVar, zzlt zzltVar, boolean z, int[] iArr2, int i3, int i4, zzlq zzlqVar, zzkn zzknVar, zzmv<?, ?> zzmvVar, zzjk<?> zzjkVar, zzlb zzlbVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzliVar instanceof zzjv;
        this.zzj = zzltVar;
        this.zzh = zzjkVar != null && zzjkVar.zza(zzliVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzlqVar;
        this.zzp = zzknVar;
        this.zzq = zzmvVar;
        this.zzr = zzjkVar;
        this.zzg = zzliVar;
        this.zzs = zzlbVar;
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        throw new IllegalArgumentException("Mutating immutable message: " + valueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzma
    public final void zzc(T t) {
        if (zzg(t)) {
            if (t instanceof zzjv) {
                zzjv zzjvVar = (zzjv) t;
                zzjvVar.zzc(Integer.MAX_VALUE);
                zzjvVar.zza = 0;
                zzjvVar.zzci();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzc = zzc(i);
                long j = 1048575 & zzc;
                int i2 = (zzc & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 == 60 || i2 == 68) {
                        if (zzc((zzlm<T>) t, this.zzc[i], i)) {
                            zze(i).zzc(zzb.getObject(t, j));
                        }
                    } else {
                        switch (i2) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                this.zzp.zzb(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.zzs.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (zzc((zzlm<T>) t, i)) {
                    zze(i).zzc(zzb.getObject(t, j));
                }
            }
            this.zzq.zzf(t);
            if (this.zzh) {
                this.zzr.zzc(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final void zza(T t, T t2) {
        zzf(t);
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzc = zzc(i);
            long j = 1048575 & zzc;
            int i2 = this.zzc[i];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza(t, j, zznb.zza(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzb(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzd(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzd(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzd(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zzc(t, j, zznb.zzh(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza(t, j, zznb.zze(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza(t, j, zznb.zze(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzd(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzd(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.zzp.zza(t, t2, j);
                    break;
                case 50:
                    zzmc.zza(this.zzs, t, t2, j);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzlm<T>) t2, i2, i)) {
                        zznb.zza(t, j, zznb.zze(t2, j));
                        zzb((zzlm<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzb(t, t2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzc((zzlm<T>) t2, i2, i)) {
                        zznb.zza(t, j, zznb.zze(t2, j));
                        zzb((zzlm<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzmc.zza(this.zzq, t, t2);
        if (this.zzh) {
            zzmc.zza(this.zzr, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0620 A[Catch: all -> 0x0295, TryCatch #1 {all -> 0x0295, blocks: (B:153:0x05f4, B:163:0x061b, B:165:0x0620, B:166:0x0625, B:49:0x00c9, B:50:0x00db, B:51:0x00ed, B:52:0x00ff, B:53:0x0110, B:54:0x0121, B:56:0x012b, B:59:0x0132, B:60:0x0139, B:61:0x0146, B:62:0x0157, B:63:0x0164, B:64:0x0175, B:66:0x0180, B:67:0x0191, B:68:0x01a2, B:69:0x01b3, B:70:0x01c4, B:71:0x01d5, B:72:0x01e6, B:73:0x01f7, B:74:0x0209, B:76:0x0219, B:80:0x023a, B:77:0x0223, B:79:0x022b, B:81:0x024b, B:82:0x025d, B:83:0x026b, B:84:0x0279, B:85:0x0287), top: B:189:0x05f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0657 A[LOOP:2: B:181:0x0653->B:183:0x0657, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x062b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.measurement.zzlx] */
    @Override // com.google.android.gms.internal.measurement.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r18, com.google.android.gms.internal.measurement.zzlx r19, com.google.android.gms.internal.measurement.zzji r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlx, com.google.android.gms.internal.measurement.zzji):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final void zza(T t, byte[] bArr, int i, int i2, zzih zzihVar) throws IOException {
        zza((zzlm<T>) t, bArr, i, i2, 0, zzihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzlm<T>) t2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzma zze = zze(i);
            if (!zzc((zzlm<T>) t, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, zzc, object);
                } else {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                }
                zzb((zzlm<T>) t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzlm<T>) t2, i2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzma zze = zze(i);
            if (!zzc((zzlm<T>) t, i2, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, zzc, object);
                } else {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                }
                zzb((zzlm<T>) t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final void zza(Object obj, int i, zzlx zzlxVar) throws IOException {
        if (zzg(i)) {
            zznb.zza(obj, i & 1048575, zzlxVar.zzr());
        } else if (this.zzi) {
            zznb.zza(obj, i & 1048575, zzlxVar.zzq());
        } else {
            zznb.zza(obj, i & 1048575, zzlxVar.zzp());
        }
    }

    private final void zzb(T t, int i) {
        int zzb2 = zzb(i);
        long j = 1048575 & zzb2;
        if (j == 1048575) {
            return;
        }
        zznb.zza((Object) t, j, (1 << (zzb2 >>> 20)) | zznb.zzc(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zznb.zza((Object) t, zzb(i2) & 1048575, i);
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzlm<T>) t, i);
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzlm<T>) t, i, i2);
    }

    private final <K, V> void zza(zznv zznvVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zznvVar.zza(i, this.zzs.zza(zzf(i2)), this.zzs.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zznv zznvVar) throws IOException {
        if (obj instanceof String) {
            zznvVar.zza(i, (String) obj);
        } else {
            zznvVar.zza(i, (zzii) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0b90  */
    @Override // com.google.android.gms.internal.measurement.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r24, com.google.android.gms.internal.measurement.zznv r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zza(java.lang.Object, com.google.android.gms.internal.measurement.zznv):void");
    }

    private static <UT, UB> void zza(zzmv<UT, UB> zzmvVar, T t, zznv zznvVar) throws IOException {
        zzmvVar.zzb((zzmv<UT, UB>) zzmvVar.zzd(t), zznvVar);
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzlm<T>) t, i) == zzc((zzlm<T>) t2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zznb.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zznb.zza(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.zzmc.zza(com.google.android.gms.internal.measurement.zznb.zze(r10, r6), com.google.android.gms.internal.measurement.zznb.zze(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.zzmc.zza(com.google.android.gms.internal.measurement.zznb.zze(r10, r6), com.google.android.gms.internal.measurement.zznb.zze(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzd(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzd(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzc(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzd(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzd(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzc(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzc(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzc(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.zzmc.zza(com.google.android.gms.internal.measurement.zznb.zze(r10, r6), com.google.android.gms.internal.measurement.zznb.zze(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.zzmc.zza(com.google.android.gms.internal.measurement.zznb.zze(r10, r6), com.google.android.gms.internal.measurement.zznb.zze(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.zzmc.zza(com.google.android.gms.internal.measurement.zznb.zze(r10, r6), com.google.android.gms.internal.measurement.zznb.zze(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzh(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzh(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzc(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzd(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzd(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzc(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzd(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzd(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.zznb.zzd(r10, r6) == com.google.android.gms.internal.measurement.zznb.zzd(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zznb.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zznb.zzb(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.measurement.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    private final boolean zzc(T t, int i) {
        int zzb2 = zzb(i);
        long j = zzb2 & 1048575;
        if (j != 1048575) {
            return (zznb.zzc(t, j) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i);
        long j2 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zznb.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznb.zzb(t, j2)) != 0;
            case 2:
                return zznb.zzd(t, j2) != 0;
            case 3:
                return zznb.zzd(t, j2) != 0;
            case 4:
                return zznb.zzc(t, j2) != 0;
            case 5:
                return zznb.zzd(t, j2) != 0;
            case 6:
                return zznb.zzc(t, j2) != 0;
            case 7:
                return zznb.zzh(t, j2);
            case 8:
                Object zze = zznb.zze(t, j2);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                } else if (zze instanceof zzii) {
                    return !zzii.zza.equals(zze);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zznb.zze(t, j2) != null;
            case 10:
                return !zzii.zza.equals(zznb.zze(t, j2));
            case 11:
                return zznb.zzc(t, j2) != 0;
            case 12:
                return zznb.zzc(t, j2) != 0;
            case 13:
                return zznb.zzc(t, j2) != 0;
            case 14:
                return zznb.zzd(t, j2) != 0;
            case 15:
                return zznb.zzc(t, j2) != 0;
            case 16:
                return zznb.zzd(t, j2) != 0;
            case 17:
                return zznb.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc((zzlm<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.measurement.zzma] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.zzma] */
    @Override // com.google.android.gms.internal.measurement.zzma
    public final boolean zzd(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.zzm) {
                return !this.zzh || this.zzr.zza(t).zzg();
            }
            int i6 = this.zzl[i5];
            int i7 = this.zzc[i6];
            int zzc = zzc(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if (((268435456 & zzc) != 0) && !zza((zzlm<T>) t, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & zzc) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zza((zzlm<T>) t, i6, i, i2, i10) && !zza((Object) t, zzc, zze(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zzc((zzlm<T>) t, i7, i6) && !zza((Object) t, zzc, zze(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzs.zzd(zznb.zze(t, zzc & 1048575));
                            if (!zzd.isEmpty()) {
                                if (this.zzs.zza(zzf(i6)).zzc.zzb() == zzns.MESSAGE) {
                                    Iterator<?> it = zzd.values().iterator();
                                    zzma<T> zzmaVar = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzmaVar == null) {
                                            zzmaVar = zzlw.zza().zza((Class) next.getClass());
                                        }
                                        boolean zzd2 = zzmaVar.zzd(next);
                                        zzmaVar = zzmaVar;
                                        if (!zzd2) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zznb.zze(t, zzc & 1048575);
                if (!list.isEmpty()) {
                    ?? zze = zze(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!zze.zzd(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzma zzmaVar) {
        return zzmaVar.zzd(zznb.zze(obj, i & 1048575));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjv) {
            return ((zzjv) obj).zzcj();
        }
        return true;
    }

    private final boolean zzc(T t, int i, int i2) {
        return zznb.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zznb.zze(t, j)).booleanValue();
    }
}
