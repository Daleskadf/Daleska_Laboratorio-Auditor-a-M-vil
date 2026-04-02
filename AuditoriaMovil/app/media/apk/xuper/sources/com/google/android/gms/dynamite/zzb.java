package com.google.android.gms.dynamite;

import android.os.Looper;
/* loaded from: classes.dex */
public final class zzb {
    private static volatile ClassLoader zza;
    private static volatile Thread zzb;

    public static synchronized ClassLoader zza() {
        ClassLoader classLoader;
        synchronized (zzb.class) {
            if (zza == null) {
                zza = zzb();
            }
            classLoader = zza;
        }
        return classLoader;
    }

    private static synchronized ClassLoader zzb() {
        synchronized (zzb.class) {
            ClassLoader classLoader = null;
            if (zzb == null) {
                zzb = zzc();
                if (zzb == null) {
                    return null;
                }
            }
            synchronized (zzb) {
                try {
                    classLoader = zzb.getContextClassLoader();
                } catch (SecurityException e10) {
                    String message = e10.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get thread context classloader ");
                    sb.append(message);
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread zzc() {
        SecurityException e10;
        zza zzaVar;
        zza zzaVar2;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < activeGroupCount) {
                            threadGroup = threadGroupArr[i11];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            i11++;
                        } else {
                            threadGroup = null;
                            break;
                        }
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 < activeCount) {
                            zzaVar2 = threadArr[i10];
                            if ("GmsDynamite".equals(zzaVar2.getName())) {
                                break;
                            }
                            i10++;
                        } else {
                            zzaVar2 = null;
                            break;
                        }
                    }
                } catch (SecurityException e11) {
                    e10 = e11;
                    zzaVar = null;
                }
                if (zzaVar2 == null) {
                    try {
                        zzaVar = new zza(threadGroup, "GmsDynamite");
                        try {
                            zzaVar.setContextClassLoader(null);
                            zzaVar.start();
                        } catch (SecurityException e12) {
                            e10 = e12;
                            String message = e10.getMessage();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to enumerate thread/threadgroup ");
                            sb.append(message);
                            zzaVar2 = zzaVar;
                            return zzaVar2;
                        }
                    } catch (SecurityException e13) {
                        e10 = e13;
                        zzaVar = zzaVar2;
                    }
                    zzaVar2 = zzaVar;
                }
            }
            return zzaVar2;
        }
    }
}
