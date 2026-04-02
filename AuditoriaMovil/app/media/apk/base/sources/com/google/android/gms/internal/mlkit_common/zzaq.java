package com.google.android.gms.internal.mlkit_common;

import j$.util.Objects;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(Object obj, Object[] objArr, int i7) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzaq zzg(int i7, Object[] objArr, zzah zzahVar) {
        int i8;
        short[] sArr;
        char c8;
        char c9;
        byte[] bArr;
        byte[] bArr2;
        int i9 = i7;
        Object[] objArr2 = objArr;
        if (i9 == 0) {
            return (zzaq) zza;
        }
        Object obj = null;
        int i10 = 1;
        if (i9 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzw.zza(obj2, obj3);
            return new zzaq(null, objArr2, 1);
        }
        zzt.zzb(i9, objArr2.length >> 1, "index");
        int max = Math.max(i9, 2);
        if (max < 751619276) {
            i8 = Integer.highestOneBit(max - 1);
            do {
                i8 += i8;
            } while (i8 * 0.7d < max);
        } else {
            i8 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i9 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzw.zza(obj4, obj5);
            i9 = 1;
            c8 = 1;
            c9 = 2;
        } else {
            int i11 = i8 - 1;
            char c10 = 65535;
            if (i8 <= 128) {
                byte[] bArr3 = new byte[i8];
                Arrays.fill(bArr3, (byte) -1);
                int i12 = 0;
                int i13 = 0;
                while (i12 < i9) {
                    int i14 = i13 + i13;
                    int i15 = i12 + i12;
                    Object obj6 = objArr2[i15];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i15 ^ i10];
                    Objects.requireNonNull(obj7);
                    zzw.zza(obj6, obj7);
                    int zza2 = zzy.zza(obj6.hashCode());
                    while (true) {
                        int i16 = zza2 & i11;
                        int i17 = bArr3[i16] & ForkServer.ERROR;
                        if (i17 == 255) {
                            bArr3[i16] = (byte) i14;
                            if (i13 < i12) {
                                objArr2[i14] = obj6;
                                objArr2[i14 ^ 1] = obj7;
                            }
                            i13++;
                        } else if (obj6.equals(objArr2[i17])) {
                            int i18 = i17 ^ 1;
                            Object obj8 = objArr2[i18];
                            Objects.requireNonNull(obj8);
                            zzag zzagVar = new zzag(obj6, obj7, obj8);
                            objArr2[i18] = obj7;
                            obj = zzagVar;
                            break;
                        } else {
                            zza2 = i16 + 1;
                        }
                    }
                    i12++;
                    i10 = 1;
                }
                if (i13 == i9) {
                    bArr = bArr3;
                } else {
                    bArr2 = new Object[]{bArr3, Integer.valueOf(i13), obj};
                    c9 = 2;
                    c8 = 1;
                    obj = bArr2;
                }
            } else if (i8 <= 32768) {
                sArr = new short[i8];
                Arrays.fill(sArr, (short) -1);
                int i19 = 0;
                for (int i20 = 0; i20 < i9; i20++) {
                    int i21 = i19 + i19;
                    int i22 = i20 + i20;
                    Object obj9 = objArr2[i22];
                    Objects.requireNonNull(obj9);
                    Object obj10 = objArr2[i22 ^ 1];
                    Objects.requireNonNull(obj10);
                    zzw.zza(obj9, obj10);
                    int zza3 = zzy.zza(obj9.hashCode());
                    while (true) {
                        int i23 = zza3 & i11;
                        char c11 = (char) sArr[i23];
                        if (c11 == 65535) {
                            sArr[i23] = (short) i21;
                            if (i19 < i20) {
                                objArr2[i21] = obj9;
                                objArr2[i21 ^ 1] = obj10;
                            }
                            i19++;
                        } else if (obj9.equals(objArr2[c11])) {
                            int i24 = c11 ^ 1;
                            Object obj11 = objArr2[i24];
                            Objects.requireNonNull(obj11);
                            zzag zzagVar2 = new zzag(obj9, obj10, obj11);
                            objArr2[i24] = obj10;
                            obj = zzagVar2;
                            break;
                        } else {
                            zza3 = i23 + 1;
                        }
                    }
                }
                if (i19 != i9) {
                    c9 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i19), obj};
                    c8 = 1;
                }
                bArr = sArr;
            } else {
                int i25 = 1;
                sArr = new int[i8];
                Arrays.fill((int[]) sArr, -1);
                int i26 = 0;
                int i27 = 0;
                while (i26 < i9) {
                    int i28 = i27 + i27;
                    int i29 = i26 + i26;
                    Object obj12 = objArr2[i29];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArr2[i29 ^ i25];
                    Objects.requireNonNull(obj13);
                    zzw.zza(obj12, obj13);
                    int zza4 = zzy.zza(obj12.hashCode());
                    while (true) {
                        int i30 = zza4 & i11;
                        ?? r15 = sArr[i30];
                        if (r15 == c10) {
                            sArr[i30] = i28;
                            if (i27 < i26) {
                                objArr2[i28] = obj12;
                                objArr2[i28 ^ 1] = obj13;
                            }
                            i27++;
                        } else if (obj12.equals(objArr2[r15])) {
                            int i31 = r15 ^ 1;
                            Object obj14 = objArr2[i31];
                            Objects.requireNonNull(obj14);
                            zzag zzagVar3 = new zzag(obj12, obj13, obj14);
                            objArr2[i31] = obj13;
                            obj = zzagVar3;
                            break;
                        } else {
                            zza4 = i30 + 1;
                            c10 = 65535;
                        }
                    }
                    i26++;
                    i25 = 1;
                    c10 = 65535;
                }
                if (i27 != i9) {
                    c8 = 1;
                    c9 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i27), obj};
                }
                bArr = sArr;
            }
            c9 = 2;
            bArr2 = bArr;
            c8 = 1;
            obj = bArr2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzag zzagVar4 = (zzag) objArr3[c9];
            if (zzahVar != null) {
                zzahVar.zzc = zzagVar4;
                Object obj15 = objArr3[0];
                int intValue = ((Integer) objArr3[c8]).intValue();
                objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                obj = obj15;
                i9 = intValue;
            } else {
                throw zzagVar4.zza();
            }
        }
        return new zzaq(obj, objArr2, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            j$.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            j$.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.mlkit_common.zzy.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.mlkit_common.zzy.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.mlkit_common.zzy.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzaq.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzab zza() {
        return new zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzaj zzd() {
        return new zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzaj zze() {
        return new zzao(this, new zzap(this.zzb, 0, this.zzd));
    }
}
