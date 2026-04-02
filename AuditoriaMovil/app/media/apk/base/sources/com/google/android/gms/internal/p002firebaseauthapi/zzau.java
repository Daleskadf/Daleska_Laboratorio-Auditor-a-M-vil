package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Map;
import org.apache.tika.fork.ForkServer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzau  reason: invalid package */
/* loaded from: classes.dex */
public final class zzau<K, V> extends zzan<K, V> {
    private static final zzan<Object, Object> zza = new zzau(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzau(Object obj, Object[] objArr, int i7) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.zzb
            java.lang.Object[] r1 = r8.zzc
            int r2 = r8.zzd
            r3 = 0
            if (r9 != 0) goto Lc
        L9:
            r9 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            j$.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L9
            r9 = r1[r4]
            j$.util.Objects.requireNonNull(r9)
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L50
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaf.zza(r0)
        L37:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L9
        L40:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L4d:
            int r0 = r0 + 1
            goto L37
        L50:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7c
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaf.zza(r0)
        L62:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L9
        L6c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L79:
            int r0 = r0 + 1
            goto L62
        L7c:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzaf.zza(r5)
        L88:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L9
        L90:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r3
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzau.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final zzai<V> zza() {
        return new zzay(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final zzas<Map.Entry<K, V>> zzb() {
        return new zzat(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final zzas<K> zzc() {
        return new zzav(this, new zzay(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    public static <K, V> zzau<K, V> zza(int i7, Object[] objArr, zzaq<K, V> zzaqVar) {
        int i8;
        short[] sArr;
        char c8;
        char c9;
        byte[] bArr;
        byte[] bArr2;
        int i9 = i7;
        Object[] objArr2 = objArr;
        if (i9 == 0) {
            return (zzau) zza;
        }
        Object obj = null;
        int i10 = 1;
        if (i9 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzag.zza(obj2, obj3);
            return new zzau<>(null, objArr2, 1);
        }
        zzw.zzb(i9, objArr2.length >> 1);
        int max = Math.max(i9, 2);
        if (max < 751619276) {
            i8 = Integer.highestOneBit(max - 1) << 1;
            while (i8 * 0.7d < max) {
                i8 <<= 1;
            }
        } else {
            i8 = 1073741824;
            if (!(max < 1073741824)) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i9 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzag.zza(obj4, obj5);
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
                    int i14 = i12 * 2;
                    int i15 = i13 * 2;
                    Object obj6 = objArr2[i14];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i14 ^ i10];
                    Objects.requireNonNull(obj7);
                    zzag.zza(obj6, obj7);
                    int zza2 = zzaf.zza(obj6.hashCode());
                    while (true) {
                        int i16 = zza2 & i11;
                        int i17 = bArr3[i16] & ForkServer.ERROR;
                        if (i17 == 255) {
                            bArr3[i16] = (byte) i15;
                            if (i13 < i12) {
                                objArr2[i15] = obj6;
                                objArr2[i15 ^ 1] = obj7;
                            }
                            i13++;
                        } else if (obj6.equals(objArr2[i17])) {
                            int i18 = i17 ^ 1;
                            Object obj8 = objArr2[i18];
                            Objects.requireNonNull(obj8);
                            obj = new zzap(obj6, obj7, obj8);
                            objArr2[i18] = obj7;
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
                    c9 = 2;
                    bArr2 = bArr;
                    c8 = 1;
                    obj = bArr2;
                } else {
                    bArr2 = new Object[]{bArr3, Integer.valueOf(i13), obj};
                    c9 = 2;
                    c8 = 1;
                    obj = bArr2;
                }
            } else {
                if (i8 <= 32768) {
                    sArr = new short[i8];
                    Arrays.fill(sArr, (short) -1);
                    int i19 = 0;
                    for (int i20 = 0; i20 < i9; i20++) {
                        int i21 = i20 * 2;
                        int i22 = i19 * 2;
                        Object obj9 = objArr2[i21];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr2[i21 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzag.zza(obj9, obj10);
                        int zza3 = zzaf.zza(obj9.hashCode());
                        while (true) {
                            int i23 = zza3 & i11;
                            int i24 = sArr[i23] & 65535;
                            if (i24 == 65535) {
                                sArr[i23] = (short) i22;
                                if (i19 < i20) {
                                    objArr2[i22] = obj9;
                                    objArr2[i22 ^ 1] = obj10;
                                }
                                i19++;
                            } else if (obj9.equals(objArr2[i24])) {
                                int i25 = i24 ^ 1;
                                Object obj11 = objArr2[i25];
                                Objects.requireNonNull(obj11);
                                obj = new zzap(obj9, obj10, obj11);
                                objArr2[i25] = obj10;
                                break;
                            } else {
                                zza3 = i23 + 1;
                            }
                        }
                    }
                    if (i19 != i9) {
                        c9 = 2;
                        bArr2 = new Object[]{sArr, Integer.valueOf(i19), obj};
                        c8 = 1;
                        obj = bArr2;
                    }
                } else {
                    sArr = new int[i8];
                    Arrays.fill((int[]) sArr, -1);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < i9) {
                        int i28 = i26 * 2;
                        int i29 = i27 * 2;
                        Object obj12 = objArr2[i28];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i28 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzag.zza(obj12, obj13);
                        int zza4 = zzaf.zza(obj12.hashCode());
                        while (true) {
                            int i30 = zza4 & i11;
                            ?? r15 = sArr[i30];
                            if (r15 == c10) {
                                sArr[i30] = i29;
                                if (i27 < i26) {
                                    objArr2[i29] = obj12;
                                    objArr2[i29 ^ 1] = obj13;
                                }
                                i27++;
                            } else if (obj12.equals(objArr2[r15])) {
                                int i31 = r15 ^ 1;
                                Object obj14 = objArr2[i31];
                                Objects.requireNonNull(obj14);
                                obj = new zzap(obj12, obj13, obj14);
                                objArr2[i31] = obj13;
                                break;
                            } else {
                                zza4 = i30 + 1;
                                c10 = 65535;
                            }
                        }
                        i26++;
                        c10 = 65535;
                    }
                    if (i27 != i9) {
                        c8 = 1;
                        c9 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i27), obj};
                    }
                }
                bArr = sArr;
                c9 = 2;
                bArr2 = bArr;
                c8 = 1;
                obj = bArr2;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzap zzapVar = (zzap) objArr3[c9];
            if (zzaqVar != null) {
                zzaqVar.zza = zzapVar;
                Object obj15 = objArr3[0];
                int intValue = ((Integer) objArr3[c8]).intValue();
                objArr2 = Arrays.copyOf(objArr2, intValue << 1);
                obj = obj15;
                i9 = intValue;
            } else {
                throw zzapVar.zza();
            }
        }
        return new zzau<>(obj, objArr2, i9);
    }
}
