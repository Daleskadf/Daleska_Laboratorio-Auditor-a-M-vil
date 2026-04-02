package com.google.android.recaptcha.internal;

import G.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import m6.AbstractC1446g;
import m6.AbstractC1449j;
import m6.p;
/* loaded from: classes.dex */
public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        boolean z7 = obj instanceof byte[];
        p pVar = p.f14074a;
        int i7 = 0;
        if (z7) {
            byte[] bArr = (byte[]) obj;
            j.e(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    ArrayList arrayList = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i7 < length2) {
                        arrayList.add(Byte.valueOf(bArr[i7]));
                        i7++;
                    }
                    return arrayList;
                }
                return i.A(Byte.valueOf(bArr[0]));
            }
            return pVar;
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            j.e(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    ArrayList arrayList2 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i7 < length4) {
                        arrayList2.add(Short.valueOf(sArr[i7]));
                        i7++;
                    }
                    return arrayList2;
                }
                return i.A(Short.valueOf(sArr[0]));
            }
            return pVar;
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            j.e(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    ArrayList arrayList3 = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i7 < length6) {
                        arrayList3.add(Integer.valueOf(iArr[i7]));
                        i7++;
                    }
                    return arrayList3;
                }
                return i.A(Integer.valueOf(iArr[0]));
            }
            return pVar;
        } else if (obj instanceof long[]) {
            return AbstractC1446g.Q((long[]) obj);
        } else {
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                j.e(fArr, "<this>");
                int length7 = fArr.length;
                if (length7 != 0) {
                    if (length7 != 1) {
                        ArrayList arrayList4 = new ArrayList(fArr.length);
                        int length8 = fArr.length;
                        while (i7 < length8) {
                            arrayList4.add(Float.valueOf(fArr[i7]));
                            i7++;
                        }
                        return arrayList4;
                    }
                    return i.A(Float.valueOf(fArr[0]));
                }
                return pVar;
            } else if (!(obj instanceof double[])) {
                return null;
            } else {
                double[] dArr = (double[]) obj;
                j.e(dArr, "<this>");
                int length9 = dArr.length;
                if (length9 != 0) {
                    if (length9 != 1) {
                        ArrayList arrayList5 = new ArrayList(dArr.length);
                        int length10 = dArr.length;
                        while (i7 < length10) {
                            arrayList5.add(Double.valueOf(dArr[i7]));
                            i7++;
                        }
                        return arrayList5;
                    }
                    return i.A(Double.valueOf(dArr[0]));
                }
                return pVar;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzueVarArr.length == 2) {
            Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
                if (true != (zza3 instanceof Object)) {
                    zza3 = null;
                }
                if (zza3 != null) {
                    zzgdVar.zzc().zze(i7, zzb(zza2, zza3));
                    return;
                }
                throw new zzce(4, 5, null);
            }
            throw new zzce(4, 5, null);
        }
        throw new zzce(4, 3, null);
    }

    public final Object zzb(Object obj, Object obj2) {
        List<Number> zzc = zzc(obj);
        List<Number> zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(AbstractC1449j.M(zzc2));
                for (Number number : zzc2) {
                    arrayList.add(Double.valueOf(Math.pow(number.doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(AbstractC1449j.M(zzc));
            for (Number number2 : zzc) {
                arrayList2.add(Double.valueOf(Math.pow(number2.doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        } else if (zzc != null && zzc2 != null) {
            zzgw.zza(this, zzc.size(), zzc2.size());
            int size = zzc.size();
            Double[] dArr = new Double[size];
            for (int i7 = 0; i7 < size; i7++) {
                dArr[i7] = Double.valueOf(Math.pow(((Number) zzc.get(i7)).doubleValue(), ((Number) zzc2.get(i7)).doubleValue()));
            }
            return dArr;
        } else {
            throw new zzce(4, 5, null);
        }
    }
}
