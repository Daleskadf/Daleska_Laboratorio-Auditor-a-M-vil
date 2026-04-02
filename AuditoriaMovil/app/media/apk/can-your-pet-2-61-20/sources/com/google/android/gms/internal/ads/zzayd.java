package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzayd extends zzazd {
    private static final zzaze zzi = new zzaze();
    private final Context zzj;

    public zzayd(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2, Context context, zzasr zzasrVar) {
        super(zzaxpVar, "iz9pI8M74OdFMOjBXhk6CVKK/c29GtinDT3TfbuphLdYOSnoV+Rg8WuW9whaa7rD", "AMztxBQmasdCMrU1nlH2RhtlfSPsjcYFxTHFmKvCDYM=", zzataVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaud zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzar()) {
                return null;
            }
            return zzc.zzi();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        zzasw zzaswVar;
        zzava zzavaVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzava zzavaVar2 = (zzava) zza.get();
            if (zzavaVar2 == null || zzaxs.zzd(zzavaVar2.zza) || zzavaVar2.zza.equals("E") || zzavaVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzaxs.zzd(null)) {
                    if (zzaxs.zzd(null)) {
                        bool = false;
                    } else {
                        bool = false;
                    }
                    bool.booleanValue();
                    zzaswVar = zzasw.ENUM_SIGNAL_SOURCE_ADSHIELD;
                } else {
                    zzaswVar = zzasw.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                }
                Boolean valueOf = Boolean.valueOf(zzaswVar == zzasw.ENUM_SIGNAL_SOURCE_ADSHIELD);
                Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcp);
                String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzco)).booleanValue() ? zzb() : null;
                if (bool2.booleanValue() && this.zzb.zzp() && zzaxs.zzd(zzb)) {
                    zzb = zzc();
                }
                zzava zzavaVar3 = new zzava((String) this.zzf.invoke(null, this.zzj, valueOf, zzb));
                if (zzaxs.zzd(zzavaVar3.zza) || zzavaVar3.zza.equals("E")) {
                    int ordinal = zzaswVar.ordinal();
                    if (ordinal == 3) {
                        String zzc = zzc();
                        if (!zzaxs.zzd(zzc)) {
                            zzavaVar3.zza = zzc;
                        }
                    } else if (ordinal == 4) {
                        throw null;
                    }
                }
                zza.set(zzavaVar3);
            }
            zzavaVar = (zzava) zza.get();
        }
        synchronized (this.zze) {
            if (zzavaVar != null) {
                this.zze.zzz(zzavaVar.zza);
                this.zze.zzae(zzavaVar.zzb);
                this.zze.zzag(zzavaVar.zzc);
                this.zze.zzj(zzavaVar.zzd);
                this.zze.zzy(zzavaVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzaxs.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcq));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzaxs.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcr)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                final zzgex zze = zzgex.zze();
                context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzazf
                    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                    public final void onChecksumsReady(List list) {
                        int type;
                        byte[] value;
                        zzgex zzgexVar = zzgex.this;
                        if (list == null) {
                            zzgexVar.zzc(null);
                            return;
                        }
                        try {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                ApkChecksum m = AIRFileUtils$$ExternalSyntheticApiModelOutline2.m(list.get(i));
                                type = m.getType();
                                if (type == 8) {
                                    value = m.getValue();
                                    zzgexVar.zzc(zzaxs.zzb(value));
                                    return;
                                }
                            }
                            zzgexVar.zzc(null);
                        } catch (Throwable unused) {
                            zzgexVar.zzc(null);
                        }
                    }
                });
                return (String) zze.get();
            }
            return null;
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
