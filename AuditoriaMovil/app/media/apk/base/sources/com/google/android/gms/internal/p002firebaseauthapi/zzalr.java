package com.google.android.gms.internal.p002firebaseauthapi;

import H4.e1;
import H4.p1;
import com.google.android.gms.common.api.f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.pathprovider.b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.XMLReaderUtils;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalr  reason: invalid package */
/* loaded from: classes.dex */
public final class zzalr<T> implements zzamc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzana.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzaln zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzalv zzn;
    private final zzakx zzo;
    private final zzamv<?, ?> zzp;
    private final zzajx<?> zzq;
    private final zzalg zzr;

    private zzalr(int[] iArr, Object[] objArr, int i7, int i8, zzaln zzalnVar, boolean z7, int[] iArr2, int i9, int i10, zzalv zzalvVar, zzakx zzakxVar, zzamv<?, ?> zzamvVar, zzajx<?> zzajxVar, zzalg zzalgVar) {
        boolean z8;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzi = zzalnVar instanceof zzakg;
        if (zzajxVar != null && zzajxVar.zza(zzalnVar)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.zzh = z8;
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i9;
        this.zzm = i10;
        this.zzn = zzalvVar;
        this.zzo = zzakxVar;
        this.zzp = zzamvVar;
        this.zzq = zzajxVar;
        this.zzg = zzalnVar;
        this.zzr = zzalgVar;
    }

    private static <T> double zza(T t7, long j) {
        return ((Double) zzana.zze(t7, j)).doubleValue();
    }

    private static <T> float zzb(T t7, long j) {
        return ((Float) zzana.zze(t7, j)).floatValue();
    }

    private static <T> int zzc(T t7, long j) {
        return ((Integer) zzana.zze(t7, j)).intValue();
    }

    private static <T> long zzd(T t7, long j) {
        return ((Long) zzana.zze(t7, j)).longValue();
    }

    private final zzamc zze(int i7) {
        int i8 = (i7 / 3) << 1;
        zzamc zzamcVar = (zzamc) this.zzd[i8];
        if (zzamcVar != null) {
            return zzamcVar;
        }
        zzamc<T> zza2 = zzaly.zza().zza((Class) ((Class) this.zzd[i8 + 1]));
        this.zzd[i8] = zza2;
        return zza2;
    }

    private final Object zzf(int i7) {
        return this.zzd[(i7 / 3) << 1];
    }

    private static boolean zzg(int i7) {
        return (i7 & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i7, int i8, zzanh zzanhVar, Class<?> cls, zzaiv zzaivVar) {
        switch (zzalq.zza[zzanhVar.ordinal()]) {
            case 1:
                int zzd = zzais.zzd(bArr, i7, zzaivVar);
                zzaivVar.zzc = Boolean.valueOf(zzaivVar.zzb != 0);
                return zzd;
            case 2:
                return zzais.zza(bArr, i7, zzaivVar);
            case 3:
                zzaivVar.zzc = Double.valueOf(zzais.zza(bArr, i7));
                return i7 + 8;
            case 4:
            case 5:
                zzaivVar.zzc = Integer.valueOf(zzais.zzc(bArr, i7));
                return i7 + 4;
            case 6:
            case 7:
                zzaivVar.zzc = Long.valueOf(zzais.zzd(bArr, i7));
                return i7 + 8;
            case 8:
                zzaivVar.zzc = Float.valueOf(zzais.zzb(bArr, i7));
                return i7 + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzais.zzc(bArr, i7, zzaivVar);
                zzaivVar.zzc = Integer.valueOf(zzaivVar.zza);
                return zzc;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
                int zzd2 = zzais.zzd(bArr, i7, zzaivVar);
                zzaivVar.zzc = Long.valueOf(zzaivVar.zzb);
                return zzd2;
            case 14:
                return zzais.zza(zzaly.zza().zza((Class) cls), bArr, i7, i8, zzaivVar);
            case 15:
                int zzc2 = zzais.zzc(bArr, i7, zzaivVar);
                zzaivVar.zzc = Integer.valueOf(zzaji.zza(zzaivVar.zza));
                return zzc2;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                int zzd3 = zzais.zzd(bArr, i7, zzaivVar);
                zzaivVar.zzc = Long.valueOf(zzaji.zza(zzaivVar.zzb));
                return zzd3;
            case 17:
                return zzais.zzb(bArr, i7, zzaivVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i7) {
        return this.zzc[i7 + 1];
    }

    private final zzakk zzd(int i7) {
        return (zzakk) this.zzd[((i7 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzakg) {
            return ((zzakg) obj).zzw();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final int zzb(T t7) {
        int i7;
        int zza2;
        int i8;
        int zzc;
        int length = this.zzc.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzc2 = zzc(i10);
            int i11 = this.zzc[i10];
            long j = 1048575 & zzc2;
            int i12 = 37;
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    i7 = i9 * 53;
                    zza2 = zzaki.zza(Double.doubleToLongBits(zzana.zza(t7, j)));
                    i9 = zza2 + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    zza2 = Float.floatToIntBits(zzana.zzb(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    zza2 = zzaki.zza(zzana.zzd(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    zza2 = zzaki.zza(zzana.zzd(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 4:
                    i8 = i9 * 53;
                    zzc = zzana.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case 5:
                    i7 = i9 * 53;
                    zza2 = zzaki.zza(zzana.zzd(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 6:
                    i8 = i9 * 53;
                    zzc = zzana.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case 7:
                    i7 = i9 * 53;
                    zza2 = zzaki.zza(zzana.zzh(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 8:
                    i7 = i9 * 53;
                    zza2 = ((String) zzana.zze(t7, j)).hashCode();
                    i9 = zza2 + i7;
                    break;
                case 9:
                    Object zze = zzana.zze(t7, j);
                    if (zze != null) {
                        i12 = zze.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 10:
                    i7 = i9 * 53;
                    zza2 = zzana.zze(t7, j).hashCode();
                    i9 = zza2 + i7;
                    break;
                case 11:
                    i8 = i9 * 53;
                    zzc = zzana.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i8 = i9 * 53;
                    zzc = zzana.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case 13:
                    i8 = i9 * 53;
                    zzc = zzana.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case 14:
                    i7 = i9 * 53;
                    zza2 = zzaki.zza(zzana.zzd(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 15:
                    i8 = i9 * 53;
                    zzc = zzana.zzc(t7, j);
                    i9 = i8 + zzc;
                    break;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    i7 = i9 * 53;
                    zza2 = zzaki.zza(zzana.zzd(t7, j));
                    i9 = zza2 + i7;
                    break;
                case 17:
                    Object zze2 = zzana.zze(t7, j);
                    if (zze2 != null) {
                        i12 = zze2.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
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
                case RecognitionOptions.EAN_13 /* 32 */:
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
                case 48:
                case 49:
                    i7 = i9 * 53;
                    zza2 = zzana.zze(t7, j).hashCode();
                    i9 = zza2 + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    zza2 = zzana.zze(t7, j).hashCode();
                    i9 = zza2 + i7;
                    break;
                case 51:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzaki.zza(Double.doubleToLongBits(zza(t7, j)));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = Float.floatToIntBits(zzb(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzaki.zza(zzd(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzaki.zza(zzd(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzaki.zza(zzd(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzaki.zza(zze(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = ((String) zzana.zze(t7, j)).hashCode();
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzana.zze(t7, j).hashCode();
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzana.zze(t7, j).hashCode();
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzaki.zza(zzd(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzc(t7, j);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzaki.zza(zzd(t7, j));
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzalr<T>) t7, i11, i10)) {
                        i7 = i9 * 53;
                        zza2 = zzana.zze(t7, j).hashCode();
                        i9 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzp.zzd(t7).hashCode() + (i9 * 53);
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t7).hashCode() : hashCode;
    }

    public static zzamy zzc(Object obj) {
        zzakg zzakgVar = (zzakg) obj;
        zzamy zzamyVar = zzakgVar.zzb;
        if (zzamyVar == zzamy.zzc()) {
            zzamy zzd = zzamy.zzd();
            zzakgVar.zzb = zzd;
            return zzd;
        }
        return zzamyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zzd(T t7) {
        if (zzg(t7)) {
            if (t7 instanceof zzakg) {
                zzakg zzakgVar = (zzakg) t7;
                zzakgVar.zzb(f.API_PRIORITY_OTHER);
                zzakgVar.zza = 0;
                zzakgVar.zzu();
            }
            int length = this.zzc.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int zzc = zzc(i7);
                long j = 1048575 & zzc;
                int i8 = (zzc & 267386880) >>> 20;
                if (i8 != 9) {
                    if (i8 != 60 && i8 != 68) {
                        switch (i8) {
                            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            case 19:
                            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
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
                            case RecognitionOptions.EAN_13 /* 32 */:
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
                            case 48:
                            case 49:
                                this.zzo.zzb(t7, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t7, j);
                                if (object != null) {
                                    unsafe.putObject(t7, j, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzalr<T>) t7, this.zzc[i7], i7)) {
                        zze(i7).zzd(zzb.getObject(t7, j));
                    }
                }
                if (zzc((zzalr<T>) t7, i7)) {
                    zze(i7).zzd(zzb.getObject(t7, j));
                }
            }
            this.zzp.zzf(t7);
            if (this.zzh) {
                this.zzq.zzc(t7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzamc] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzamc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final boolean zze(T t7) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.zzl) {
            int i12 = this.zzk[i11];
            int i13 = this.zzc[i12];
            int zzc = zzc(i12);
            int i14 = this.zzc[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = zzb.getInt(t7, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & zzc) != 0 && !zza((zzalr<T>) t7, i12, i7, i8, i16)) {
                return false;
            }
            int i17 = (267386880 & zzc) >>> 20;
            if (i17 != 9 && i17 != 17) {
                if (i17 != 27) {
                    if (i17 == 60 || i17 == 68) {
                        if (zzc((zzalr<T>) t7, i13, i12) && !zza((Object) t7, zzc, zze(i12))) {
                            return false;
                        }
                    } else if (i17 != 49) {
                        if (i17 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzr.zzd(zzana.zze(t7, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (this.zzr.zza(zzf(i12)).zzc.zzb() == zzank.MESSAGE) {
                                zzamc<T> zzamcVar = 0;
                                for (Object obj : zzd.values()) {
                                    if (zzamcVar == null) {
                                        zzamcVar = zzaly.zza().zza((Class) obj.getClass());
                                    }
                                    boolean zze = zzamcVar.zze(obj);
                                    zzamcVar = zzamcVar;
                                    if (!zze) {
                                        return false;
                                    }
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzana.zze(t7, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze2 = zze(i12);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!zze2.zze(list.get(i18))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zza((zzalr<T>) t7, i12, i7, i8, i16) && !zza((Object) t7, zzc, zze(i12))) {
                return false;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return !this.zzh || this.zzq.zza(t7).zzg();
    }

    private final boolean zzc(T t7, T t8, int i7) {
        return zzc((zzalr<T>) t7, i7) == zzc((zzalr<T>) t8, i7);
    }

    private final boolean zzc(T t7, int i7) {
        int zzb2 = zzb(i7);
        long j = zzb2 & 1048575;
        if (j != 1048575) {
            return (zzana.zzc(t7, j) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i7);
        long j8 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzana.zza(t7, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzana.zzb(t7, j8)) != 0;
            case 2:
                return zzana.zzd(t7, j8) != 0;
            case 3:
                return zzana.zzd(t7, j8) != 0;
            case 4:
                return zzana.zzc(t7, j8) != 0;
            case 5:
                return zzana.zzd(t7, j8) != 0;
            case 6:
                return zzana.zzc(t7, j8) != 0;
            case 7:
                return zzana.zzh(t7, j8);
            case 8:
                Object zze = zzana.zze(t7, j8);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                } else if (zze instanceof zzaiw) {
                    return !zzaiw.zza.equals(zze);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzana.zze(t7, j8) != null;
            case 10:
                return !zzaiw.zza.equals(zzana.zze(t7, j8));
            case 11:
                return zzana.zzc(t7, j8) != 0;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return zzana.zzc(t7, j8) != 0;
            case 13:
                return zzana.zzc(t7, j8) != 0;
            case 14:
                return zzana.zzd(t7, j8) != 0;
            case 15:
                return zzana.zzc(t7, j8) != 0;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return zzana.zzd(t7, j8) != 0;
            case 17:
                return zzana.zze(t7, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final int zza(T t7) {
        int i7;
        int i8;
        int i9;
        int zza2;
        int zza3;
        int zza4;
        int zzd;
        boolean z7;
        int zzc;
        int zzd2;
        int zzg;
        int zzh;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.zzc.length) {
            int zzc2 = zzc(i13);
            int i15 = (267386880 & zzc2) >>> 20;
            int[] iArr = this.zzc;
            int i16 = iArr[i13];
            int i17 = iArr[i13 + 2];
            int i18 = i17 & i10;
            if (i15 <= 17) {
                if (i18 != i11) {
                    i12 = i18 == i10 ? 0 : unsafe.getInt(t7, i18);
                    i11 = i18;
                }
                i7 = i11;
                i8 = i12;
                i9 = 1 << (i17 >>> 20);
            } else {
                i7 = i11;
                i8 = i12;
                i9 = 0;
            }
            long j = zzc2 & i10;
            if (i15 >= zzakd.zza.zza()) {
                zzakd.zzb.zza();
            }
            switch (i15) {
                case 0:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajo.zza(i16, 0.0d);
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajo.zza(i16, 0.0f);
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajo.zzb(i16, unsafe.getLong(t7, j));
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajo.zze(i16, unsafe.getLong(t7, j));
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajo.zzc(i16, unsafe.getInt(t7, j));
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajo.zza(i16, 0L);
                        i14 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza2 = zzajo.zzb(i16, 0);
                        i14 += zza2;
                        break;
                    }
                    break;
                case 7:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajo.zza(i16, true);
                        i14 += zza3;
                    }
                    break;
                case 8:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        Object object = unsafe.getObject(t7, j);
                        if (object instanceof zzaiw) {
                            zza3 = zzajo.zza(i16, (zzaiw) object);
                        } else {
                            zza3 = zzajo.zza(i16, (String) object);
                        }
                        i14 += zza3;
                    }
                    break;
                case 9:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza4 = zzame.zza(i16, unsafe.getObject(t7, j), zze(i13));
                        i14 += zza4;
                    }
                    break;
                case 10:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajo.zza(i16, (zzaiw) unsafe.getObject(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 11:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajo.zzf(i16, unsafe.getInt(t7, j));
                        i14 += zza3;
                    }
                    break;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajo.zza(i16, unsafe.getInt(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 13:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zzd = zzajo.zzd(i16, 0);
                        i14 += zzd;
                    }
                    break;
                case 14:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajo.zzc(i16, 0L);
                        i14 += zza3;
                    }
                    break;
                case 15:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajo.zze(i16, unsafe.getInt(t7, j));
                        i14 += zza3;
                    }
                    break;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajo.zzd(i16, unsafe.getLong(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 17:
                    if (zza((zzalr<T>) t7, i13, i7, i8, i9)) {
                        zza3 = zzajo.zza(i16, (zzaln) unsafe.getObject(t7, j), zze(i13));
                        i14 += zza3;
                    }
                    break;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    zza4 = zzame.zzd(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zza4;
                    break;
                case 19:
                    z7 = false;
                    zzc = zzame.zzc(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    z7 = false;
                    zzc = zzame.zzf(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 21:
                    z7 = false;
                    zzc = zzame.zzj(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 22:
                    z7 = false;
                    zzc = zzame.zze(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 23:
                    z7 = false;
                    zzc = zzame.zzd(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 24:
                    z7 = false;
                    zzc = zzame.zzc(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 25:
                    z7 = false;
                    zzc = zzame.zza(i16, (List<?>) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 26:
                    zza4 = zzame.zzb(i16, (List) unsafe.getObject(t7, j));
                    i14 += zza4;
                    break;
                case 27:
                    zza4 = zzame.zzb(i16, (List) unsafe.getObject(t7, j), zze(i13));
                    i14 += zza4;
                    break;
                case 28:
                    zza4 = zzame.zza(i16, (List) unsafe.getObject(t7, j));
                    i14 += zza4;
                    break;
                case 29:
                    zza4 = zzame.zzi(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zza4;
                    break;
                case 30:
                    z7 = false;
                    zzc = zzame.zzb(i16, (List<Integer>) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 31:
                    z7 = false;
                    zzc = zzame.zzc(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case RecognitionOptions.EAN_13 /* 32 */:
                    z7 = false;
                    zzc = zzame.zzd(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 33:
                    z7 = false;
                    zzc = zzame.zzg(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 34:
                    z7 = false;
                    zzc = zzame.zzh(i16, (List) unsafe.getObject(t7, j), false);
                    i14 += zzc;
                    break;
                case 35:
                    zzd2 = zzame.zzd((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 36:
                    zzd2 = zzame.zzc((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 37:
                    zzd2 = zzame.zzf((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 38:
                    zzd2 = zzame.zzj((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 39:
                    zzd2 = zzame.zze((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 40:
                    zzd2 = zzame.zzd((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 41:
                    zzd2 = zzame.zzc((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 42:
                    zzd2 = zzame.zza((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 43:
                    zzd2 = zzame.zzi((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 44:
                    zzd2 = zzame.zzb((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 45:
                    zzd2 = zzame.zzc((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 46:
                    zzd2 = zzame.zzd((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 47:
                    zzd2 = zzame.zzg((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 48:
                    zzd2 = zzame.zzh((List) unsafe.getObject(t7, j));
                    if (zzd2 > 0) {
                        zzg = zzajo.zzg(i16);
                        zzh = zzajo.zzh(zzd2);
                        i14 += zzh + zzg + zzd2;
                    }
                    break;
                case 49:
                    zza4 = zzame.zza(i16, (List<zzaln>) unsafe.getObject(t7, j), (zzamc<?>) zze(i13));
                    i14 += zza4;
                    break;
                case 50:
                    zza4 = this.zzr.zza(i16, unsafe.getObject(t7, j), zzf(i13));
                    i14 += zza4;
                    break;
                case 51:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zza(i16, 0.0d);
                        i14 += zza3;
                    }
                    break;
                case 52:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zza(i16, 0.0f);
                        i14 += zza3;
                    }
                    break;
                case 53:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zzb(i16, zzd(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 54:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zze(i16, zzd(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 55:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zzc(i16, zzc(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 56:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zza(i16, 0L);
                        i14 += zza3;
                    }
                    break;
                case 57:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zzd = zzajo.zzb(i16, 0);
                        i14 += zzd;
                    }
                    break;
                case 58:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zza(i16, true);
                        i14 += zza3;
                    }
                    break;
                case 59:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        Object object2 = unsafe.getObject(t7, j);
                        if (object2 instanceof zzaiw) {
                            zza3 = zzajo.zza(i16, (zzaiw) object2);
                        } else {
                            zza3 = zzajo.zza(i16, (String) object2);
                        }
                        i14 += zza3;
                    }
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza4 = zzame.zza(i16, unsafe.getObject(t7, j), zze(i13));
                        i14 += zza4;
                    }
                    break;
                case 61:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zza(i16, (zzaiw) unsafe.getObject(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 62:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zzf(i16, zzc(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 63:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zza(i16, zzc(t7, j));
                        i14 += zza3;
                    }
                    break;
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zzd = zzajo.zzd(i16, 0);
                        i14 += zzd;
                    }
                    break;
                case 65:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zzc(i16, 0L);
                        i14 += zza3;
                    }
                    break;
                case 66:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zze(i16, zzc(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 67:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zzd(i16, zzd(t7, j));
                        i14 += zza3;
                    }
                    break;
                case 68:
                    if (zzc((zzalr<T>) t7, i16, i13)) {
                        zza3 = zzajo.zza(i16, (zzaln) unsafe.getObject(t7, j), zze(i13));
                        i14 += zza3;
                    }
                    break;
            }
            i13 += 3;
            i11 = i7;
            i12 = i8;
            i10 = 1048575;
        }
        int i19 = 0;
        zzamv<?, ?> zzamvVar = this.zzp;
        int zza5 = i14 + zzamvVar.zza((zzamv<?, ?>) zzamvVar.zzd(t7));
        if (this.zzh) {
            zzajy<?> zza6 = this.zzq.zza(t7);
            int zzb2 = zza6.zza.zzb();
            for (int i20 = 0; i20 < zzb2; i20++) {
                Map.Entry<?, Object> zza7 = zza6.zza.zza(i20);
                i19 += zzajy.zza((zzaka) zza7.getKey(), zza7.getValue());
            }
            for (Map.Entry<?, Object> entry : zza6.zza.zzc()) {
                i19 += zzajy.zza((zzaka) entry.getKey(), entry.getValue());
            }
            return zza5 + i19;
        }
        return zza5;
    }

    private static <T> boolean zze(T t7, long j) {
        return ((Boolean) zzana.zze(t7, j)).booleanValue();
    }

    private final boolean zzc(T t7, int i7, int i8) {
        return zzana.zzc(t7, (long) (zzb(i8) & 1048575)) == i7;
    }

    private final int zzb(int i7) {
        return this.zzc[i7 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t7, T t8, int i7) {
        int i8 = this.zzc[i7];
        if (zzc((zzalr<T>) t8, i8, i7)) {
            long zzc = zzc(i7) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t8, zzc);
            if (object != null) {
                zzamc zze = zze(i7);
                if (!zzc((zzalr<T>) t7, i8, i7)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t7, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t7, zzc, zza2);
                    }
                    zzb((zzalr<T>) t7, i8, i7);
                    return;
                }
                Object object2 = unsafe.getObject(t7, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t7, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + String.valueOf(t8));
        }
    }

    private final void zzb(T t7, int i7) {
        int zzb2 = zzb(i7);
        long j = 1048575 & zzb2;
        if (j == 1048575) {
            return;
        }
        zzana.zza((Object) t7, j, (1 << (zzb2 >>> 20)) | zzana.zzc(t7, j));
    }

    private final void zzb(T t7, int i7, int i8) {
        zzana.zza((Object) t7, zzb(i8) & 1048575, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzana.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzana.zza(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzame.zza(com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzame.zza(com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzame.zza(com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzame.zza(com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzame.zza(com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzh(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzh(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0176, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018a, code lost:
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzana.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzana.zzb(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalr.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:437:0x0a7c, code lost:
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakm.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0d79, code lost:
        if (r13 == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0d7b, code lost:
        r28.putInt(r15, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0d81, code lost:
        r6 = r11.zzl;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0d88, code lost:
        if (r6 >= r11.zzm) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0d8a, code lost:
        r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzamy) zza((java.lang.Object) r33, r11.zzk[r6], (int) r3, (com.google.android.gms.internal.p002firebaseauthapi.zzamv<UT, int>) r11.zzp, (java.lang.Object) r33);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0da0, code lost:
        if (r3 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0da2, code lost:
        r11.zzp.zzb((java.lang.Object) r15, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0da7, code lost:
        if (r9 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0dab, code lost:
        if (r7 != r36) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0db2, code lost:
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakm.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0db5, code lost:
        if (r7 > r36) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0db7, code lost:
        if (r10 != r9) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0db9, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0dbe, code lost:
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakm.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0696  */
    /* JADX WARN: Type inference failed for: r1v60, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x059b -> B:187:0x059c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:219:0x0640 -> B:220:0x0641). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:241:0x0693 -> B:242:0x0694). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.p002firebaseauthapi.zzaiv r38) {
        /*
            Method dump skipped, instructions count: 3668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalr.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaiv):int");
    }

    private final int zza(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zza(i7, 0);
    }

    private final int zza(int i7, int i8) {
        int length = (this.zzc.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.zzc[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0399  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.android.gms.internal.p002firebaseauthapi.zzalr<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.p002firebaseauthapi.zzall r33, com.google.android.gms.internal.p002firebaseauthapi.zzalv r34, com.google.android.gms.internal.p002firebaseauthapi.zzakx r35, com.google.android.gms.internal.p002firebaseauthapi.zzamv<?, ?> r36, com.google.android.gms.internal.p002firebaseauthapi.zzajx<?> r37, com.google.android.gms.internal.p002firebaseauthapi.zzalg r38) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalr.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzall, com.google.android.gms.internal.firebase-auth-api.zzalv, com.google.android.gms.internal.firebase-auth-api.zzakx, com.google.android.gms.internal.firebase-auth-api.zzamv, com.google.android.gms.internal.firebase-auth-api.zzajx, com.google.android.gms.internal.firebase-auth-api.zzalg):com.google.android.gms.internal.firebase-auth-api.zzalr");
    }

    private final <UT, UB> UB zza(Object obj, int i7, UB ub, zzamv<UT, UB> zzamvVar, Object obj2) {
        zzakk zzd;
        int i8 = this.zzc[i7];
        Object zze = zzana.zze(obj, zzc(i7) & 1048575);
        return (zze == null || (zzd = zzd(i7)) == null) ? ub : (UB) zza(i7, i8, this.zzr.zze(zze), zzd, (zzakk) ub, (zzamv<UT, zzakk>) zzamvVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i7, int i8, Map<K, V> map, zzakk zzakkVar, UB ub, zzamv<UT, UB> zzamvVar, Object obj) {
        zzale<?, ?> zza2 = this.zzr.zza(zzf(i7));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzakkVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzamvVar.zzc(obj);
                }
                zzajf zzc = zzaiw.zzc(zzalf.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzalf.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzamvVar.zza((zzamv<UT, UB>) ub, i8, zzc.zza());
                    it.remove();
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t7, int i7) {
        zzamc zze = zze(i7);
        long zzc = zzc(i7) & 1048575;
        if (!zzc((zzalr<T>) t7, i7)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t7, zzc);
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
    private final Object zza(T t7, int i7, int i8) {
        zzamc zze = zze(i8);
        if (!zzc((zzalr<T>) t7, i7, i8)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t7, zzc(i8) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
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
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder l8 = b.l("Field ", str, " for ", name, " not found. Known fields are ");
            l8.append(arrays);
            throw new RuntimeException(l8.toString());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(T t7, T t8) {
        zzf(t7);
        t8.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzc = zzc(i7);
            long j = 1048575 & zzc;
            int i8 = this.zzc[i7];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza(t7, j, zzana.zza(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzb(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzd(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzd(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzc(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzd(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzc(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zzc(t7, j, zzana.zzh(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza(t7, j, zzana.zze(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t7, t8, i7);
                    break;
                case 10:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza(t7, j, zzana.zze(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzc(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzc(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzc(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzd(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzc(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (zzc((zzalr<T>) t8, i7)) {
                        zzana.zza((Object) t7, j, zzana.zzd(t8, j));
                        zzb((zzalr<T>) t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t7, t8, i7);
                    break;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
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
                case RecognitionOptions.EAN_13 /* 32 */:
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
                case 48:
                case 49:
                    this.zzo.zza(t7, t8, j);
                    break;
                case 50:
                    zzame.zza(this.zzr, t7, t8, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzalr<T>) t8, i8, i7)) {
                        zzana.zza(t7, j, zzana.zze(t8, j));
                        zzb((zzalr<T>) t7, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    zzb(t7, t8, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case RecognitionOptions.EAN_8 /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzalr<T>) t8, i8, i7)) {
                        zzana.zza(t7, j, zzana.zze(t8, j));
                        zzb((zzalr<T>) t7, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t7, t8, i7);
                    break;
            }
        }
        zzame.zza(this.zzp, t7, t8);
        if (this.zzh) {
            zzame.zza(this.zzq, t7, t8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0630 A[Catch: all -> 0x00cb, TryCatch #7 {all -> 0x00cb, blocks: (B:49:0x00c5, B:54:0x00d3, B:166:0x062b, B:168:0x0630, B:169:0x0635, B:65:0x00ff, B:67:0x0114, B:68:0x0125, B:69:0x0136, B:70:0x0147, B:71:0x0158, B:73:0x0162, B:76:0x0169, B:77:0x016e, B:78:0x017b, B:79:0x018c, B:80:0x019a, B:81:0x01ac, B:82:0x01b4, B:83:0x01c6, B:84:0x01d8, B:85:0x01ea, B:86:0x01fc, B:87:0x020e, B:88:0x0220, B:89:0x0232, B:90:0x0244, B:92:0x0254, B:96:0x0275, B:93:0x025e, B:95:0x0266, B:97:0x0286, B:98:0x0298, B:99:0x02a6, B:100:0x02b4, B:101:0x02c2), top: B:188:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0665 A[LOOP:2: B:181:0x0661->B:183:0x0665, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x063b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzamd] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r18, com.google.android.gms.internal.p002firebaseauthapi.zzamd r19, com.google.android.gms.internal.p002firebaseauthapi.zzajv r20) {
        /*
            Method dump skipped, instructions count: 1804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalr.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzamd, com.google.android.gms.internal.firebase-auth-api.zzajv):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(T t7, byte[] bArr, int i7, int i8, zzaiv zzaivVar) {
        zza((zzalr<T>) t7, bArr, i7, i8, 0, zzaivVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t7, T t8, int i7) {
        if (zzc((zzalr<T>) t8, i7)) {
            long zzc = zzc(i7) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t8, zzc);
            if (object != null) {
                zzamc zze = zze(i7);
                if (!zzc((zzalr<T>) t7, i7)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t7, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t7, zzc, zza2);
                    }
                    zzb((zzalr<T>) t7, i7);
                    return;
                }
                Object object2 = unsafe.getObject(t7, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t7, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + String.valueOf(t8));
        }
    }

    private final void zza(Object obj, int i7, zzamd zzamdVar) {
        if (zzg(i7)) {
            zzana.zza(obj, i7 & 1048575, zzamdVar.zzr());
        } else if (this.zzi) {
            zzana.zza(obj, i7 & 1048575, zzamdVar.zzq());
        } else {
            zzana.zza(obj, i7 & 1048575, zzamdVar.zzp());
        }
    }

    private final void zza(T t7, int i7, Object obj) {
        zzb.putObject(t7, zzc(i7) & 1048575, obj);
        zzb((zzalr<T>) t7, i7);
    }

    private final void zza(T t7, int i7, int i8, Object obj) {
        zzb.putObject(t7, zzc(i8) & 1048575, obj);
        zzb((zzalr<T>) t7, i7, i8);
    }

    private final <K, V> void zza(zzanm zzanmVar, int i7, Object obj, int i8) {
        if (obj != null) {
            zzanmVar.zza(i7, this.zzr.zza(zzf(i8)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i7, Object obj, zzanm zzanmVar) {
        if (obj instanceof String) {
            zzanmVar.zza(i7, (String) obj);
        } else {
            zzanmVar.zza(i7, (zzaiw) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0b90  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r24, com.google.android.gms.internal.p002firebaseauthapi.zzanm r25) {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalr.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanm):void");
    }

    private static <UT, UB> void zza(zzamv<UT, UB> zzamvVar, T t7, zzanm zzanmVar) {
        zzamvVar.zzb((zzamv<UT, UB>) zzamvVar.zzd(t7), zzanmVar);
    }

    private final boolean zza(T t7, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzc((zzalr<T>) t7, i7);
        }
        return (i9 & i10) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i7, zzamc zzamcVar) {
        return zzamcVar.zze(zzana.zze(obj, i7 & 1048575));
    }
}
