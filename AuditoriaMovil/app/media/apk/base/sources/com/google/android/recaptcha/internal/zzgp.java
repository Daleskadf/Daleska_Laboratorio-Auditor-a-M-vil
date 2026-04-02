package com.google.android.recaptcha.internal;

import E6.a;
import java.util.Collection;
import kotlin.jvm.internal.j;
import m6.AbstractC1446g;
import m6.AbstractC1447h;
/* loaded from: classes.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        String R7;
        String str;
        if (zzueVarArr.length == 1) {
            int i8 = 0;
            Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof int[]) {
                    int[] iArr = (int[]) zza2;
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int length = iArr.length;
                    int i9 = 0;
                    while (i8 < length) {
                        int i10 = iArr[i8];
                        i9++;
                        if (i9 > 1) {
                            sb.append((CharSequence) ",");
                        }
                        sb.append((CharSequence) String.valueOf(i10));
                        i8++;
                    }
                    sb.append((CharSequence) "]");
                    R7 = sb.toString();
                    j.d(R7, "toString(...)");
                } else {
                    if (zza2 instanceof byte[]) {
                        str = new String((byte[]) zza2, a.f1074a);
                    } else if (zza2 instanceof long[]) {
                        long[] jArr = (long[]) zza2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((CharSequence) "[");
                        int length2 = jArr.length;
                        int i11 = 0;
                        while (i8 < length2) {
                            long j = jArr[i8];
                            i11++;
                            if (i11 > 1) {
                                sb2.append((CharSequence) ",");
                            }
                            sb2.append((CharSequence) String.valueOf(j));
                            i8++;
                        }
                        sb2.append((CharSequence) "]");
                        R7 = sb2.toString();
                        j.d(R7, "toString(...)");
                    } else if (zza2 instanceof short[]) {
                        short[] sArr = (short[]) zza2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append((CharSequence) "[");
                        int length3 = sArr.length;
                        int i12 = 0;
                        while (i8 < length3) {
                            short s7 = sArr[i8];
                            i12++;
                            if (i12 > 1) {
                                sb3.append((CharSequence) ",");
                            }
                            sb3.append((CharSequence) String.valueOf((int) s7));
                            i8++;
                        }
                        sb3.append((CharSequence) "]");
                        R7 = sb3.toString();
                        j.d(R7, "toString(...)");
                    } else if (zza2 instanceof float[]) {
                        float[] fArr = (float[]) zza2;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append((CharSequence) "[");
                        int length4 = fArr.length;
                        int i13 = 0;
                        while (i8 < length4) {
                            float f = fArr[i8];
                            i13++;
                            if (i13 > 1) {
                                sb4.append((CharSequence) ",");
                            }
                            sb4.append((CharSequence) String.valueOf(f));
                            i8++;
                        }
                        sb4.append((CharSequence) "]");
                        R7 = sb4.toString();
                        j.d(R7, "toString(...)");
                    } else if (zza2 instanceof double[]) {
                        double[] dArr = (double[]) zza2;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append((CharSequence) "[");
                        int length5 = dArr.length;
                        int i14 = 0;
                        while (i8 < length5) {
                            double d7 = dArr[i8];
                            i14++;
                            if (i14 > 1) {
                                sb5.append((CharSequence) ",");
                            }
                            sb5.append((CharSequence) String.valueOf(d7));
                            i8++;
                        }
                        sb5.append((CharSequence) "]");
                        R7 = sb5.toString();
                        j.d(R7, "toString(...)");
                    } else if (zza2 instanceof char[]) {
                        str = new String((char[]) zza2);
                    } else if (zza2 instanceof Object[]) {
                        R7 = AbstractC1446g.P((Object[]) zza2);
                    } else if (zza2 instanceof Collection) {
                        R7 = AbstractC1447h.R((Iterable) zza2, ",", "[", "]", null, 56);
                    } else {
                        throw new zzce(4, 5, null);
                    }
                    R7 = str;
                }
                zzgdVar.zzc().zze(i7, R7);
                return;
            }
            throw new zzce(4, 5, null);
        }
        throw new zzce(4, 3, null);
    }
}
