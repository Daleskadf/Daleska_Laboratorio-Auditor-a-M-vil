package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import S.k;
import U3.h;
import io.flutter.plugins.pathprovider.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafm  reason: invalid package */
/* loaded from: classes.dex */
public final class zzafm {
    private static final Map<String, zzafl> zza = new k(0);
    private static final Map<String, List<WeakReference<zzafo>>> zzb = new k(0);

    private static String zza(String str, int i7, boolean z7) {
        if (z7) {
            return "http://[" + str + "]:" + i7 + "/";
        }
        return "http://" + str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + i7 + "/";
    }

    public static String zzb(String str) {
        zzafl zzaflVar;
        String str2;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            str2 = b.h(StringUtils.EMPTY, zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)));
        } else {
            str2 = "https://";
        }
        return AbstractC0059i.z(str2, "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzafl zzaflVar;
        String str2;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            str2 = b.h(StringUtils.EMPTY, zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)));
        } else {
            str2 = "https://";
        }
        return AbstractC0059i.z(str2, "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzafl zzaflVar;
        String str2;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            str2 = b.h(StringUtils.EMPTY, zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)));
        } else {
            str2 = "https://";
        }
        return AbstractC0059i.z(str2, "securetoken.googleapis.com/v1");
    }

    public static String zza(String str) {
        zzafl zzaflVar;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            return AbstractC0059i.z(zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzafo zzafoVar) {
        Map<String, List<WeakReference<zzafo>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzafoVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzafoVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(h hVar) {
        Map<String, zzafl> map = zza;
        hVar.a();
        return map.containsKey(hVar.f5751c.f5757a);
    }

    public static void zza(h hVar, String str, int i7) {
        hVar.a();
        String str2 = hVar.f5751c.f5757a;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            map.put(str2, new zzafl(str, i7));
        }
        Map<String, List<WeakReference<zzafo>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    boolean z7 = false;
                    for (WeakReference<zzafo> weakReference : map2.get(str2)) {
                        zzafo zzafoVar = weakReference.get();
                        if (zzafoVar != null) {
                            zzafoVar.zza();
                            z7 = true;
                        }
                    }
                    if (!z7) {
                        zza.remove(str2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
