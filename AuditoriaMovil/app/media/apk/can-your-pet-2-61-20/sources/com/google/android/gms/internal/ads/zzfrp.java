package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfrp {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfqw zze;
    private boolean zzf;

    public zzfrp(Context context, zzazh zzazhVar, zzfqw zzfqwVar, boolean z) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(zzazhVar.zza());
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfqwVar;
        this.zzf = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzazk zzazkVar) {
        zzazm zze = zzazn.zze();
        zze.zze(zzazkVar.zzd().zzk());
        zze.zza(zzazkVar.zzd().zzj());
        zze.zzb(zzazkVar.zzd().zza());
        zze.zzd(zzazkVar.zzd().zzd());
        zze.zzc(zzazkVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzazn) zze.zzbr()).zzaV());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i, long j) {
        this.zze.zza(i, j);
    }

    private final void zzj(int i, long j, String str) {
        this.zze.zzb(i, j, str);
    }

    private final zzazn zzk(int i) {
        String string;
        zzgzf zzb;
        if (i == 1) {
            string = this.zzc.getString(zzh(), null);
        } else {
            string = this.zzc.getString(zzg(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgyj zzgyjVar = zzgyj.zzb;
            zzgyj zzv = zzgyj.zzv(stringToBytes, 0, stringToBytes.length);
            if (this.zzf) {
                zzb = zzgzf.zza();
            } else {
                zzb = zzgzf.zzb();
            }
            return zzazn.zzi(zzv, zzb);
        } catch (zzhak unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzazk zzazkVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfrj.zze(new File(zze(zzazkVar.zzd().zzk()), "pcbc"), zzazkVar.zze().zzB())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzf = zzf(zzazkVar);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean zzb(zzazk zzazkVar, zzfro zzfroVar) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzazn zzk = zzk(1);
            String zzk2 = zzazkVar.zzd().zzk();
            if (zzk == null || !zzk.zzk().equals(zzk2)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File zze = zze(zzk2);
                if (zze.exists()) {
                    zzj(4023, currentTimeMillis2, "d:" + (true != zze.isDirectory() ? "0" : "1") + ",f:" + (true != zze.isFile() ? "0" : "1"));
                    zzi(4015, currentTimeMillis2);
                } else if (!zze.mkdirs()) {
                    zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? "0" : "1"));
                    zzi(4015, currentTimeMillis2);
                    return false;
                }
                File zze2 = zze(zzk2);
                File file = new File(zze2, "pcam.jar");
                File file2 = new File(zze2, "pcbc");
                if (!zzfrj.zze(file, zzazkVar.zzf().zzB())) {
                    zzi(4016, currentTimeMillis);
                    return false;
                } else if (!zzfrj.zze(file2, zzazkVar.zze().zzB())) {
                    zzi(4017, currentTimeMillis);
                    return false;
                } else if (zzfroVar == null || zzfroVar.zza(file)) {
                    String zzf = zzf(zzazkVar);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String string = this.zzc.getString(zzh(), null);
                    SharedPreferences.Editor edit = this.zzc.edit();
                    edit.putString(zzh(), zzf);
                    if (string != null) {
                        edit.putString(zzg(), string);
                    }
                    if (edit.commit()) {
                        HashSet hashSet = new HashSet();
                        zzazn zzk3 = zzk(1);
                        if (zzk3 != null) {
                            hashSet.add(zzk3.zzk());
                        }
                        zzazn zzk4 = zzk(2);
                        if (zzk4 != null) {
                            hashSet.add(zzk4.zzk());
                        }
                        for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                            if (!hashSet.contains(file3.getName())) {
                                zzfrj.zzd(file3);
                            }
                        }
                        zzi(5014, currentTimeMillis);
                        return true;
                    }
                    zzi(4019, currentTimeMillis3);
                    return false;
                } else {
                    zzi(4018, currentTimeMillis);
                    zzfrj.zzd(zze2);
                    return false;
                }
            }
            zzi(4014, currentTimeMillis);
            return false;
        }
    }

    public final zzfrh zzc(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzazn zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zzk());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfrh(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzazn zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zzk());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            } else if (!new File(zze, "pcbc").exists()) {
                zzi(4027, currentTimeMillis);
                return false;
            } else {
                zzi(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
