package com.google.android.recaptcha.internal;

import B6.e;
import B6.f;
import E6.a;
import java.util.ArrayList;
import java.util.Iterator;
import m6.AbstractC1447h;
import m6.AbstractC1449j;
/* loaded from: classes.dex */
public final class zzht implements zzgx {
    public static final zzht zza = new zzht();

    private zzht() {
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
        boolean z7 = obj instanceof Byte;
        if (z7 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z8 = obj instanceof Short;
        if (z8 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z9 = obj instanceof Integer;
        if (z9 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z10 = obj instanceof Long;
        if (z10 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i7 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.f1074a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i7 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i7] ^ ((Number) obj2).byteValue())));
                    i7++;
                }
                return AbstractC1447h.V(arrayList);
            } else if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i7 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i7] ^ ((Number) obj2).intValue()));
                    i7++;
                }
                return AbstractC1447h.X(arrayList2);
            }
        }
        if (z7 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b5 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b5 ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        } else if (z8 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s7 : sArr) {
                arrayList4.add(Short.valueOf((short) (s7 ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        } else if (z9 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i8 : iArr) {
                arrayList5.add(Integer.valueOf(i8 ^ ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        } else if (z10 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList6.add(Long.valueOf(j ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        } else {
            boolean z11 = obj instanceof byte[];
            if (z11 && (obj2 instanceof Byte)) {
                byte[] bArr2 = (byte[]) obj;
                ArrayList arrayList7 = new ArrayList(bArr2.length);
                for (byte b7 : bArr2) {
                    arrayList7.add(Byte.valueOf((byte) (b7 ^ ((Number) obj2).byteValue())));
                }
                return arrayList7.toArray(new Byte[0]);
            }
            boolean z12 = obj instanceof short[];
            if (z12 && (obj2 instanceof Short)) {
                short[] sArr2 = (short[]) obj;
                ArrayList arrayList8 = new ArrayList(sArr2.length);
                for (short s8 : sArr2) {
                    arrayList8.add(Short.valueOf((short) (s8 ^ ((Number) obj2).shortValue())));
                }
                return arrayList8.toArray(new Short[0]);
            }
            boolean z13 = obj instanceof int[];
            if (z13 && (obj2 instanceof Integer)) {
                int[] iArr2 = (int[]) obj;
                ArrayList arrayList9 = new ArrayList(iArr2.length);
                for (int i9 : iArr2) {
                    arrayList9.add(Integer.valueOf(i9 ^ ((Number) obj2).intValue()));
                }
                return arrayList9.toArray(new Integer[0]);
            }
            boolean z14 = obj instanceof long[];
            if (z14 && (obj2 instanceof Long)) {
                long[] jArr2 = (long[]) obj;
                ArrayList arrayList10 = new ArrayList(jArr2.length);
                for (long j8 : jArr2) {
                    arrayList10.add(Long.valueOf(j8 ^ ((Number) obj2).longValue()));
                }
                return arrayList10.toArray(new Long[0]);
            } else if (z11 && (obj2 instanceof byte[])) {
                byte[] bArr3 = (byte[]) obj;
                int length3 = bArr3.length;
                byte[] bArr4 = (byte[]) obj2;
                zzgw.zza(this, length3, bArr4.length);
                f E4 = android.support.v4.media.session.a.E(0, length3);
                ArrayList arrayList11 = new ArrayList(AbstractC1449j.M(E4));
                Iterator it = E4.iterator();
                while (((e) it).f406c) {
                    int a7 = ((e) it).a();
                    arrayList11.add(Byte.valueOf((byte) (bArr4[a7] ^ bArr3[a7])));
                }
                return arrayList11.toArray(new Byte[0]);
            } else if (z12 && (obj2 instanceof short[])) {
                short[] sArr3 = (short[]) obj;
                int length4 = sArr3.length;
                short[] sArr4 = (short[]) obj2;
                zzgw.zza(this, length4, sArr4.length);
                f E7 = android.support.v4.media.session.a.E(0, length4);
                ArrayList arrayList12 = new ArrayList(AbstractC1449j.M(E7));
                Iterator it2 = E7.iterator();
                while (((e) it2).f406c) {
                    int a8 = ((e) it2).a();
                    arrayList12.add(Short.valueOf((short) (sArr4[a8] ^ sArr3[a8])));
                }
                return arrayList12.toArray(new Short[0]);
            } else if (z13 && (obj2 instanceof int[])) {
                int[] iArr3 = (int[]) obj;
                int length5 = iArr3.length;
                int[] iArr4 = (int[]) obj2;
                zzgw.zza(this, length5, iArr4.length);
                f E8 = android.support.v4.media.session.a.E(0, length5);
                ArrayList arrayList13 = new ArrayList(AbstractC1449j.M(E8));
                Iterator it3 = E8.iterator();
                while (((e) it3).f406c) {
                    int a9 = ((e) it3).a();
                    arrayList13.add(Integer.valueOf(iArr4[a9] ^ iArr3[a9]));
                }
                return arrayList13.toArray(new Integer[0]);
            } else if (z14 && (obj2 instanceof long[])) {
                long[] jArr3 = (long[]) obj;
                int length6 = jArr3.length;
                long[] jArr4 = (long[]) obj2;
                zzgw.zza(this, length6, jArr4.length);
                f E9 = android.support.v4.media.session.a.E(0, length6);
                ArrayList arrayList14 = new ArrayList(AbstractC1449j.M(E9));
                Iterator it4 = E9.iterator();
                while (((e) it4).f406c) {
                    int a10 = ((e) it4).a();
                    arrayList14.add(Long.valueOf(jArr3[a10] ^ jArr4[a10]));
                }
                return arrayList14.toArray(new Long[0]);
            } else {
                throw new zzce(4, 5, null);
            }
        }
    }
}
