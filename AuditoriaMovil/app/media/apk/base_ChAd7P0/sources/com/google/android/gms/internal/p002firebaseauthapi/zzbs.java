package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import com.google.android.gms.internal.p002firebaseauthapi.zzwl;
import io.flutter.plugins.pathprovider.b;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbs */
/* loaded from: classes.dex */
public final class zzbs {
    private final zzwl zza;
    private final List<zzbv> zzb;
    private final zznr zzc;

    public static /* synthetic */ zzwl.zza zza(zzbo zzboVar, zzbq zzbqVar, int i7) {
        return zzb(zzboVar, zzbqVar, i7);
    }

    public static /* synthetic */ void zzb(zzwl zzwlVar) {
        zzd(zzwlVar);
    }

    private static List<zzbv> zzc(zzwl zzwlVar) {
        boolean z7;
        ArrayList arrayList = new ArrayList(zzwlVar.zza());
        for (zzwl.zza zzaVar : zzwlVar.zze()) {
            int zza = zzaVar.zza();
            try {
                zzbo zza2 = zza(zzaVar);
                zzbq zza3 = zza(zzaVar.zzc());
                if (zza == zzwlVar.zzb()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                arrayList.add(new zzbv(zza2, zza3, zza, z7));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static void zzd(zzwl zzwlVar) {
        if (zzwlVar != null && zzwlVar.zza() > 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final String toString() {
        return zzcn.zza(this.zza).toString();
    }

    private zzbs(zzwl zzwlVar, List<zzbv> list) {
        this.zza = zzwlVar;
        this.zzb = list;
        this.zzc = zznr.zza;
    }

    private static zzbo zza(zzwl.zza zzaVar) {
        zzpn zza = zzpn.zza(zzaVar.zzb().zzf(), zzaVar.zzb().zze(), zzaVar.zzb().zzb(), zzaVar.zzf(), zzaVar.zzf() == zzxd.RAW ? null : Integer.valueOf(zzaVar.zza()));
        zzom zza2 = zzom.zza();
        zzcm zza3 = zzcm.zza();
        if (!zza2.zzb(zza)) {
            return new zznn(zza, zza3);
        }
        return zza2.zza((zzom) zza, zza3);
    }

    public static zzwl.zza zzb(zzbo zzboVar, zzbq zzbqVar, int i7) {
        zzwc zzwcVar;
        zzpn zzpnVar = (zzpn) zzom.zza().zza(zzboVar, zzpn.class, zzcm.zza());
        Integer zze = zzpnVar.zze();
        if (zze != null && zze.intValue() != i7) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (zzbq.zza.equals(zzbqVar)) {
            zzwcVar = zzwc.ENABLED;
        } else if (zzbq.zzb.equals(zzbqVar)) {
            zzwcVar = zzwc.DISABLED;
        } else if (zzbq.zzc.equals(zzbqVar)) {
            zzwcVar = zzwc.DESTROYED;
        } else {
            throw new IllegalStateException("Unknown key status");
        }
        return (zzwl.zza) ((zzakg) zzwl.zza.zzd().zza(zzwb.zza().zza(zzpnVar.zzf()).zza(zzpnVar.zzd()).zza(zzpnVar.zza())).zza(zzwcVar).zza(i7).zza(zzpnVar.zzc()).zze());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzbs(zzwl zzwlVar, List<zzbv> list, zznr zznrVar) {
        this.zza = zzwlVar;
        this.zzb = list;
        this.zzc = zznrVar;
    }

    private static zzbq zza(zzwc zzwcVar) {
        int i7 = zzbr.zza[zzwcVar.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    return zzbq.zzc;
                }
                throw new GeneralSecurityException("Unknown key status");
            }
            return zzbq.zzb;
        }
        return zzbq.zza;
    }

    public static final zzbs zza(zzwl zzwlVar) {
        zzd(zzwlVar);
        return new zzbs(zzwlVar, zzc(zzwlVar));
    }

    public static final zzbs zza(zzbp zzbpVar) {
        return new zzbu().zza(new zzbt(zzbpVar.zza()).zzb().zza()).zza();
    }

    public final zzwl zzb() {
        return this.zza;
    }

    public final zzbs zza() {
        zzwl.zza zzaVar;
        zzbv zzbvVar;
        if (this.zza != null) {
            zzwl.zzb zzc = zzwl.zzc();
            ArrayList arrayList = new ArrayList(this.zzb.size());
            int i7 = 0;
            for (zzbv zzbvVar2 : this.zzb) {
                if (zzbvVar2 != null && (zzbvVar2.zzb() instanceof zzcf)) {
                    zzbo zzb = ((zzcf) zzbvVar2.zzb()).zzb();
                    zzbvVar = new zzbv(zzb, zzbvVar2.zzc(), zzbvVar2.zza(), zzbvVar2.zzd());
                    zzaVar = zzb(zzb, zzbvVar2.zzc(), zzbvVar2.zza());
                } else {
                    zzwl.zza zza = this.zza.zza(i7);
                    zzwb zzb2 = zza.zzb();
                    if (zzb2.zzb() == zzwb.zza.ASYMMETRIC_PRIVATE) {
                        zzaVar = (zzwl.zza) ((zzakg) zza.zzn().zza(zzcj.zza(zzb2.zzf(), zzb2.zze())).zze());
                        try {
                            zzbo zza2 = zza(zzaVar);
                            int zza3 = zzaVar.zza();
                            zzbvVar = new zzbv(zza2, zza(zzaVar.zzc()), zza3, zza3 == this.zza.zzb());
                        } catch (GeneralSecurityException unused) {
                            zzbvVar = null;
                        }
                    } else {
                        throw new GeneralSecurityException("The keyset contains a non-private key");
                    }
                }
                zzc.zza(zzaVar);
                arrayList.add(zzbvVar);
                i7++;
            }
            zzc.zza(this.zza.zzb());
            return new zzbs((zzwl) ((zzakg) zzc.zze()), arrayList, this.zzc);
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    @Deprecated
    public static final zzbs zza(zzca zzcaVar, zzbe zzbeVar, byte[] bArr) {
        zzuz zza = zzcaVar.zza();
        if (zza != null && zza.zzc().zzb() != 0) {
            return zza(zza(zza, zzbeVar, bArr));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static zzwl zza(zzuz zzuzVar, zzbe zzbeVar, byte[] bArr) {
        try {
            zzwl zza = zzwl.zza(zzbeVar.zza(zzuzVar.zzc().zzd(), bArr), zzajv.zza());
            zzd(zza);
            return zza;
        } catch (zzakm unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final <P> P zza(zzbf zzbfVar, Class<P> cls) {
        if (zzbfVar instanceof zzmz) {
            zzmz zzmzVar = (zzmz) zzbfVar;
            Class<?> zza = zzmzVar.zza((Class<?>) cls);
            if (zza != null) {
                return (P) zza(zzmzVar, cls, zza);
            }
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <B, P> P zza(zzmz zzmzVar, Class<P> cls, Class<B> cls2) {
        zzcn.zzb(this.zza);
        zzpj zza = zzpg.zza(cls2);
        zza.zza(this.zzc);
        for (int i7 = 0; i7 < this.zzb.size(); i7++) {
            zzwl.zza zza2 = this.zza.zza(i7);
            if (zza2.zzc().equals(zzwc.ENABLED)) {
                zzbv zzbvVar = this.zzb.get(i7);
                if (zzbvVar != null) {
                    zzbo zzb = zzbvVar.zzb();
                    try {
                        Object zza3 = zzmzVar.zza(zzb, cls2);
                        if (zza2.zza() == this.zza.zzb()) {
                            zza.zzb(zza3, zzb, zza2);
                        } else {
                            zza.zza(zza3, zzb, zza2);
                        }
                    } catch (GeneralSecurityException e7) {
                        throw new GeneralSecurityException(b.j("Unable to get primitive ", String.valueOf(cls2), " for key of type ", zza2.zzb().zzf(), ", see https://developers.google.com/tink/faq/registration_errors"), e7);
                    }
                } else {
                    String zzf = zza2.zzb().zzf();
                    throw new GeneralSecurityException("Key parsing of key with index " + i7 + " and type_url " + zzf + " failed, unable to get primitive");
                }
            }
        }
        return (P) zzmzVar.zza(zza.zza(), cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0010  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.p002firebaseauthapi.zzbz r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.firebase-auth-api.zzwl r0 = r4.zza
            java.util.List r0 = r0.zze()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza r1 = (com.google.android.gms.internal.p002firebaseauthapi.zzwl.zza) r1
            com.google.android.gms.internal.firebase-auth-api.zzwb r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r3 = com.google.android.gms.internal.p002firebaseauthapi.zzwb.zza.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L3b
            com.google.android.gms.internal.firebase-auth-api.zzwb r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r3 = com.google.android.gms.internal.p002firebaseauthapi.zzwb.zza.SYMMETRIC
            if (r2 == r3) goto L3b
            com.google.android.gms.internal.firebase-auth-api.zzwb r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r3 = com.google.android.gms.internal.p002firebaseauthapi.zzwb.zza.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L3b
            goto La
        L3b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            com.google.android.gms.internal.firebase-auth-api.zzwb r0 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r0 = r0.zzb()
            java.lang.String r0 = r0.name()
            com.google.android.gms.internal.firebase-auth-api.zzwb r1 = r1.zzb()
            java.lang.String r1 = r1.zzf()
            java.lang.String r2 = "keyset contains key material of type "
            java.lang.String r3 = " for type url "
            java.lang.String r0 = io.flutter.plugins.pathprovider.b.i(r2, r0, r3, r1)
            r5.<init>(r0)
            throw r5
        L5d:
            com.google.android.gms.internal.firebase-auth-api.zzwl r0 = r4.zza
            r5.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbs.zza(com.google.android.gms.internal.firebase-auth-api.zzbz):void");
    }

    @Deprecated
    public final void zza(zzbz zzbzVar, zzbe zzbeVar, byte[] bArr) {
        zzwl zzwlVar = this.zza;
        zzbzVar.zza((zzuz) ((zzakg) zzuz.zza().zza(zzaiw.zza(zzbeVar.zzb(zzwlVar.zzk(), bArr))).zza(zzcn.zza(zzwlVar)).zze()));
    }
}
