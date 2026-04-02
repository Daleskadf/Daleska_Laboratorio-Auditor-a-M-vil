package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmi  reason: invalid package */
/* loaded from: classes.dex */
public final class zzmi {
    private static final Object zza = new Object();
    private static final String zzb = "zzmi";
    private zzbx zzc;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmi$zza */
    /* loaded from: classes.dex */
    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzbe zze = null;
        private boolean zzf = true;
        private zzbp zzg = null;
        private zzwf zzh = null;
        private zzbx zzi;

        private static zzbx zza(byte[] bArr) {
            return zzbx.zza(zzce.zza(zzbd.zza(bArr), zzbl.zza()));
        }

        private final zzbe zzb() {
            zzmi.zzd();
            zzmn zzmnVar = new zzmn();
            try {
                boolean zzc = zzmn.zzc(this.zzd);
                try {
                    return zzmnVar.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e7) {
                    if (zzc) {
                        Log.w(zzmi.zzb, "cannot use Android Keystore, it'll be disabled", e7);
                        return null;
                    }
                    throw new KeyStoreException(AbstractC0059i.M("the master key ", this.zzd, " exists but is unusable"), e7);
                }
            } catch (GeneralSecurityException | ProviderException e8) {
                Log.w(zzmi.zzb, "cannot use Android Keystore, it'll be disabled", e8);
                return null;
            }
        }

        public final zza zza(zzwf zzwfVar) {
            this.zzh = zzwfVar;
            return this;
        }

        public final zza zza(String str) {
            if (str.startsWith("android-keystore://")) {
                if (this.zzf) {
                    this.zzd = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public final zza zza(Context context, String str, String str2) {
            if (context != null) {
                this.zza = context;
                this.zzb = str;
                this.zzc = str2;
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public final synchronized zzmi zza() {
            zzmi zzmiVar;
            try {
                if (this.zzb != null) {
                    zzwf zzwfVar = this.zzh;
                    if (zzwfVar != null && this.zzg == null) {
                        this.zzg = zzbp.zza(zzco.zza(zzwfVar.zzk()));
                    }
                    synchronized (zzmi.zza) {
                        byte[] zzb = zzb(this.zza, this.zzb, this.zzc);
                        if (zzb == null) {
                            if (this.zzd != null) {
                                this.zze = zzb();
                            }
                            zzbp zzbpVar = this.zzg;
                            if (zzbpVar != null) {
                                zzbs zza = zzbs.zza(zzbpVar);
                                zzmi.zza(zza, new zzmp(this.zza, this.zzb, this.zzc), this.zze);
                                this.zzi = zzbx.zza(zza);
                            } else {
                                throw new GeneralSecurityException("cannot read or generate keyset");
                            }
                        } else if (this.zzd != null) {
                            zzmi.zzd();
                            this.zzi = zzb(zzb);
                        } else {
                            this.zzi = zza(zzb);
                        }
                        zzmiVar = new zzmi(this);
                    }
                } else {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
            } catch (Throwable th) {
                throw th;
            }
            return zzmiVar;
        }

        private final zzbx zzb(byte[] bArr) {
            try {
                this.zze = new zzmn().zza(this.zzd);
                try {
                    return zzbx.zza(zzbs.zza(zzbd.zza(bArr), this.zze, new byte[0]));
                } catch (IOException | GeneralSecurityException e7) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e7;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e8) {
                try {
                    zzbx zza = zza(bArr);
                    Log.w(zzmi.zzb, "cannot use Android Keystore, it'll be disabled", e8);
                    return zza;
                } catch (IOException unused2) {
                    throw e8;
                }
            }
        }

        private static byte[] zzb(Context context, String str, String str2) {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, null);
                    if (string == null) {
                        return null;
                    }
                    return zzza.zza(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(AbstractC0059i.M("can't read keyset; the pref value ", str, " is not a valid hex string"));
                }
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbs zza() {
        return this.zzc.zza();
    }

    private zzmi(zza zzaVar) {
        new zzmp(zzaVar.zza, zzaVar.zzb, zzaVar.zzc);
        this.zzc = zzaVar.zzi;
    }

    public static /* synthetic */ void zza(zzbs zzbsVar, zzbz zzbzVar, zzbe zzbeVar) {
        try {
            if (zzbeVar != null) {
                zzbsVar.zza(zzbzVar, zzbeVar, new byte[0]);
            } else {
                zzce.zza(zzbsVar, zzbzVar, zzbl.zza());
            }
        } catch (IOException e7) {
            throw new GeneralSecurityException(e7);
        }
    }
}
