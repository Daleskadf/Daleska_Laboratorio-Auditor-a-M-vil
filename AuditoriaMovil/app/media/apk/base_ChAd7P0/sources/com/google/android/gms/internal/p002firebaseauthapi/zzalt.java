package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalt  reason: invalid package */
/* loaded from: classes.dex */
final class zzalt<T> implements zzamc<T> {
    private final zzaln zza;
    private final zzamv<?, ?> zzb;
    private final boolean zzc;
    private final zzajx<?> zzd;

    private zzalt(zzamv<?, ?> zzamvVar, zzajx<?> zzajxVar, zzaln zzalnVar) {
        this.zzb = zzamvVar;
        this.zzc = zzajxVar.zza(zzalnVar);
        this.zzd = zzajxVar;
        this.zza = zzalnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final int zza(T t7) {
        zzamv<?, ?> zzamvVar = this.zzb;
        int zzb = zzamvVar.zzb(zzamvVar.zzd(t7));
        return this.zzc ? zzb + this.zzd.zza(t7).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final int zzb(T t7) {
        int hashCode = this.zzb.zzd(t7).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t7).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zzd(T t7) {
        this.zzb.zzf(t7);
        this.zzd.zzc(t7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final boolean zze(T t7) {
        return this.zzd.zza(t7).zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final boolean zzb(T t7, T t8) {
        if (this.zzb.zzd(t7).equals(this.zzb.zzd(t8))) {
            if (this.zzc) {
                return this.zzd.zza(t7).equals(this.zzd.zza(t8));
            }
            return true;
        }
        return false;
    }

    public static <T> zzalt<T> zza(zzamv<?, ?> zzamvVar, zzajx<?> zzajxVar, zzaln zzalnVar) {
        return new zzalt<>(zzamvVar, zzajxVar, zzalnVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final T zza() {
        zzaln zzalnVar = this.zza;
        if (zzalnVar instanceof zzakg) {
            return (T) ((zzakg) zzalnVar).zzo();
        }
        return (T) zzalnVar.zzq().zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(T t7, T t8) {
        zzame.zza(this.zzb, t7, t8);
        if (this.zzc) {
            zzame.zza(this.zzd, t7, t8);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(T t7, zzamd zzamdVar, zzajv zzajvVar) {
        boolean z7;
        zzamv<?, ?> zzamvVar = this.zzb;
        zzajx<?> zzajxVar = this.zzd;
        Object zzc = zzamvVar.zzc(t7);
        zzajy<?> zzb = zzajxVar.zzb(t7);
        do {
            try {
                if (zzamdVar.zzc() == Integer.MAX_VALUE) {
                    zzamvVar.zzb((Object) t7, (T) zzc);
                    return;
                }
                int zzd = zzamdVar.zzd();
                int i7 = 0;
                if (zzd == 11) {
                    Object obj = null;
                    zzaiw zzaiwVar = null;
                    while (zzamdVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzamdVar.zzd();
                        if (zzd2 != 16) {
                            if (zzd2 != 26) {
                                if (zzd2 == 12 || !zzamdVar.zzt()) {
                                    break;
                                }
                            } else if (obj != null) {
                                zzajxVar.zza(zzamdVar, obj, zzajvVar, zzb);
                            } else {
                                zzaiwVar = zzamdVar.zzp();
                            }
                        } else {
                            i7 = zzamdVar.zzj();
                            obj = zzajxVar.zza(zzajvVar, this.zza, i7);
                        }
                    }
                    if (zzamdVar.zzd() != 12) {
                        throw zzakm.zzb();
                    } else if (zzaiwVar != null) {
                        if (obj != null) {
                            zzajxVar.zza(zzaiwVar, obj, zzajvVar, zzb);
                        } else {
                            zzamvVar.zza((zzamv<?, ?>) zzc, i7, zzaiwVar);
                        }
                    }
                } else if ((zzd & 7) == 2) {
                    Object zza = zzajxVar.zza(zzajvVar, this.zza, zzd >>> 3);
                    if (zza != null) {
                        zzajxVar.zza(zzamdVar, zza, zzajvVar, zzb);
                    } else {
                        z7 = zzamvVar.zza((zzamv<?, ?>) zzc, zzamdVar, 0);
                        continue;
                    }
                } else {
                    z7 = zzamdVar.zzt();
                    continue;
                }
                z7 = true;
                continue;
            } catch (Throwable th) {
                zzamvVar.zzb((Object) t7, (T) zzc);
                throw th;
            }
        } while (z7);
        zzamvVar.zzb((Object) t7, (T) zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.p002firebaseauthapi.zzaiv r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase-auth-api.zzakg r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzakg) r0
            com.google.android.gms.internal.firebase-auth-api.zzamy r1 = r0.zzb
            com.google.android.gms.internal.firebase-auth-api.zzamy r2 = com.google.android.gms.internal.p002firebaseauthapi.zzamy.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.firebase-auth-api.zzamy r1 = com.google.android.gms.internal.p002firebaseauthapi.zzamy.zzd()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.firebase-auth-api.zzakg$zzd r10 = (com.google.android.gms.internal.p002firebaseauthapi.zzakg.zzd) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzais.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.firebase-auth-api.zzajx<?> r12 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzajv r0 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaln r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzakg$zzf r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzakg.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzais.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.p002firebaseauthapi.zzaly.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzais.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzais.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzais.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.firebase-auth-api.zzaiw r2 = (com.google.android.gms.internal.p002firebaseauthapi.zzaiw) r2
            goto L53
        L72:
            com.google.android.gms.internal.p002firebaseauthapi.zzaly.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzais.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.firebase-auth-api.zzajx<?> r0 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzajv r5 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaln r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase-auth-api.zzakg$zzf r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzakg.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzais.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.firebase-auth-api.zzakm r10 = com.google.android.gms.internal.p002firebaseauthapi.zzakm.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalt.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzaiv):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(T t7, zzanm zzanmVar) {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t7).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzaka zzakaVar = (zzaka) next.getKey();
            if (zzakaVar.zzc() == zzank.MESSAGE && !zzakaVar.zze() && !zzakaVar.zzd()) {
                if (next instanceof zzakq) {
                    zzanmVar.zza(zzakaVar.zza(), (Object) ((zzakq) next).zza().zzb());
                } else {
                    zzanmVar.zza(zzakaVar.zza(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzamv<?, ?> zzamvVar = this.zzb;
        zzamvVar.zza((zzamv<?, ?>) zzamvVar.zzd(t7), zzanmVar);
    }
}
