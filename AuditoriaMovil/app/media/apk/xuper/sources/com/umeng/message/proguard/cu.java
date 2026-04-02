package com.umeng.message.proguard;

import java.io.File;
import java.util.List;
/* loaded from: classes3.dex */
final class cu {

    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final File f11826a;

        public a(File file) {
            this.f11826a = file;
        }

        private static long a(List<File> list) {
            long j10 = 0;
            for (File file : list) {
                j10 += file.length();
            }
            return j10;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: all -> 0x00e2, TryCatch #3 {all -> 0x00e2, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0021, B:12:0x0027, B:14:0x0031, B:19:0x004c, B:30:0x0067, B:32:0x0074, B:34:0x007a, B:35:0x0085, B:36:0x0091, B:38:0x0097, B:49:0x00c2, B:51:0x00cc, B:44:0x00b7, B:25:0x0054), top: B:61:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[Catch: all -> 0x00e2, TryCatch #3 {all -> 0x00e2, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0021, B:12:0x0027, B:14:0x0031, B:19:0x004c, B:30:0x0067, B:32:0x0074, B:34:0x007a, B:35:0x0085, B:36:0x0091, B:38:0x0097, B:49:0x00c2, B:51:0x00cc, B:44:0x00b7, B:25:0x0054), top: B:61:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: all -> 0x00e2, TryCatch #3 {all -> 0x00e2, blocks: (B:6:0x0009, B:8:0x0010, B:10:0x0021, B:12:0x0027, B:14:0x0031, B:19:0x004c, B:30:0x0067, B:32:0x0074, B:34:0x007a, B:35:0x0085, B:36:0x0091, B:38:0x0097, B:49:0x00c2, B:51:0x00cc, B:44:0x00b7, B:25:0x0054), top: B:61:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00c2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0091 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.cu.a.run():void");
        }
    }

    public static void a(File file) {
        cb.b(new a(file));
    }
}
