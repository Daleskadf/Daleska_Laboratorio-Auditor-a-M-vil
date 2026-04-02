package com.google.android.recaptcha.internal;

import B6.a;
import B6.b;
import E6.m;
import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import m6.AbstractC1447h;
import m6.AbstractC1449j;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (m.e0(file.getName(), this.zzb)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) {
        a aVar = new a('A', 'z');
        ArrayList arrayList = new ArrayList(AbstractC1449j.M(aVar));
        Iterator it = aVar.iterator();
        while (((b) it).f399c) {
            b bVar = (b) it;
            int i7 = bVar.f400d;
            if (i7 == bVar.f398b) {
                if (bVar.f399c) {
                    bVar.f399c = false;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                bVar.f400d = bVar.f397a + i7;
            }
            arrayList.add(Character.valueOf((char) i7));
        }
        ArrayList a02 = AbstractC1447h.a0(arrayList);
        Collections.shuffle(a02);
        String R7 = AbstractC1447h.R(a02.subList(0, 8), StringUtils.EMPTY, null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(R7));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    File file2 = listFiles[i7];
                    if (j.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i7++;
                }
            }
            if (file == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
