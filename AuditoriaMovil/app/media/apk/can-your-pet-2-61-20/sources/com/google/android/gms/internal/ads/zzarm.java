package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzarm implements zzaqa {
    private final zzarl zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzarm(zzarl zzarlVar, int i) {
        this.zzc = zzarlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(zzark zzarkVar) throws IOException {
        return new String(zzm(zzarkVar, zzf(zzarkVar)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzark zzarkVar, long j) throws IOException {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        long zza = zzarkVar.zza();
        if (i >= 0 && j <= zza) {
            int i2 = (int) j;
            if (i2 == j) {
                byte[] bArr = new byte[i2];
                new DataInputStream(zzarkVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + zza);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzarj zzarjVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzarjVar.zza - ((zzarj) this.zza.get(str)).zza;
        } else {
            this.zzb += zzarjVar.zza;
        }
        this.zza.put(str, zzarjVar);
    }

    private final void zzp(String str) {
        zzarj zzarjVar = (zzarj) this.zza.remove(str);
        if (zzarjVar != null) {
            this.zzb -= zzarjVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final synchronized zzapz zza(String str) {
        zzarj zzarjVar = (zzarj) this.zza.get(str);
        if (zzarjVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzark zzarkVar = new zzark(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzarj zza = zzarj.zza(zzarkVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzarc.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzarkVar, zzarkVar.zza());
                zzapz zzapzVar = new zzapz();
                zzapzVar.zza = zzm;
                zzapzVar.zzb = zzarjVar.zzc;
                zzapzVar.zzc = zzarjVar.zzd;
                zzapzVar.zzd = zzarjVar.zze;
                zzapzVar.zze = zzarjVar.zzf;
                zzapzVar.zzf = zzarjVar.zzg;
                List<zzaqi> list = zzarjVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaqi zzaqiVar : list) {
                    treeMap.put(zzaqiVar.zza(), zzaqiVar.zzb());
                }
                zzapzVar.zzg = treeMap;
                zzapzVar.zzh = Collections.unmodifiableList(zzarjVar.zzh);
                return zzapzVar;
            } finally {
                zzarkVar.close();
            }
        } catch (IOException e) {
            zzarc.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final synchronized void zzb() {
        File zza = this.zzc.zza();
        if (!zza.exists()) {
            if (!zza.mkdirs()) {
                zzarc.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
            }
        } else {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        zzark zzarkVar = new zzark(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzarj zza2 = zzarj.zza(zzarkVar);
                            zza2.zza = length;
                            zzo(zza2.zzb, zza2);
                            zzarkVar.close();
                        } catch (Throwable th) {
                            zzarkVar.close();
                            throw th;
                            break;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final synchronized void zzc(String str, boolean z) {
        zzapz zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final synchronized void zzd(String str, zzapz zzapzVar) {
        long j;
        long j2 = this.zzb;
        int length = zzapzVar.zza.length;
        long j3 = j2 + length;
        int i = this.zzd;
        if (j3 <= i || length <= i * 0.9f) {
            File zzg = zzg(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                zzarj zzarjVar = new zzarj(str, zzapzVar);
                try {
                    zzj(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzarjVar.zzb);
                    String str2 = zzarjVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzk(bufferedOutputStream, zzarjVar.zzd);
                    zzk(bufferedOutputStream, zzarjVar.zze);
                    zzk(bufferedOutputStream, zzarjVar.zzf);
                    zzk(bufferedOutputStream, zzarjVar.zzg);
                    List<zzaqi> list = zzarjVar.zzh;
                    if (list != null) {
                        zzj(bufferedOutputStream, list.size());
                        for (zzaqi zzaqiVar : list) {
                            zzl(bufferedOutputStream, zzaqiVar.zza());
                            zzl(bufferedOutputStream, zzaqiVar.zzb());
                        }
                    } else {
                        zzj(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzapzVar.zza);
                    bufferedOutputStream.close();
                    zzarjVar.zza = zzg.length();
                    zzo(str, zzarjVar);
                    if (this.zzb >= this.zzd) {
                        if (zzarc.zzb) {
                            zzarc.zzd("Pruning old cache entries.", new Object[0]);
                        }
                        long j4 = this.zzb;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                j = elapsedRealtime;
                                break;
                            }
                            zzarj zzarjVar2 = (zzarj) ((Map.Entry) it.next()).getValue();
                            if (zzg(zzarjVar2.zzb).delete()) {
                                j = elapsedRealtime;
                                this.zzb -= zzarjVar2.zza;
                            } else {
                                j = elapsedRealtime;
                                String str3 = zzarjVar2.zzb;
                                zzarc.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i2++;
                            if (((float) this.zzb) < this.zzd * 0.9f) {
                                break;
                            }
                            elapsedRealtime = j;
                        }
                        if (zzarc.zzb) {
                            zzarc.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j4), Long.valueOf(SystemClock.elapsedRealtime() - j));
                        }
                    }
                } catch (IOException e) {
                    zzarc.zza("%s", e.toString());
                    bufferedOutputStream.close();
                    zzarc.zza("Failed to write header for %s", zzg.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!zzg.delete()) {
                    zzarc.zza("Could not clean up file %s", zzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzarc.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                }
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (delete) {
            return;
        }
        zzarc.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzarm(File file, int i) {
        this.zzc = new zzari(this, file);
    }
}
