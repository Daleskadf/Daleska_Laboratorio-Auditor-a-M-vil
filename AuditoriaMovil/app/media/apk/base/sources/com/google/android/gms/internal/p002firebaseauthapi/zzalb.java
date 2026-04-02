package com.google.android.gms.internal.p002firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzalb implements zzamf {
    private static final zzalk zza = new zzala();
    private final zzalk zzb;

    public zzalb() {
        this(new zzalc(zzakh.zza(), zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamf
    public final <T> zzamc<T> zza(Class<T> cls) {
        zzajx<?> zzajxVar;
        zzame.zza((Class<?>) cls);
        zzall zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzalt.zza(zzame.zza(), zzajz.zza(), zza2.zza());
        }
        zzalv zza3 = zzalx.zza();
        zzakx zza4 = zzakz.zza();
        zzamv<?, ?> zza5 = zzame.zza();
        if (zzald.zza[zza2.zzb().ordinal()] != 1) {
            zzajxVar = zzajz.zza();
        } else {
            zzajxVar = null;
        }
        return zzalr.zza(cls, zza2, zza3, zza4, zza5, zzajxVar, zzali.zza());
    }

    private zzalb(zzalk zzalkVar) {
        this.zzb = (zzalk) zzaki.zza(zzalkVar, "messageInfoFactory");
    }
}
