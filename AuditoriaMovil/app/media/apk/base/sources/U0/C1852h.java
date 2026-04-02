package u0;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: u0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1852h {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f15919i = new Object();
    public static volatile C1852h j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f15920a;

    /* renamed from: b  reason: collision with root package name */
    public final S.g f15921b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f15922c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f15923d;

    /* renamed from: e  reason: collision with root package name */
    public final C1849e f15924e;
    public final InterfaceC1851g f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15925g;

    /* renamed from: h  reason: collision with root package name */
    public final C1847c f15926h;

    public C1852h(C1858n c1858n) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f15920a = reentrantReadWriteLock;
        this.f15922c = 3;
        InterfaceC1851g interfaceC1851g = c1858n.f15944a;
        this.f = interfaceC1851g;
        int i7 = c1858n.f15945b;
        this.f15925g = i7;
        this.f15926h = c1858n.f15946c;
        this.f15923d = new Handler(Looper.getMainLooper());
        this.f15921b = new S.g(0);
        C1849e c1849e = new C1849e(this);
        this.f15924e = c1849e;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f15922c = 0;
            } catch (Throwable th) {
                this.f15920a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC1851g.a(new C1848d(c1849e));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static C1852h a() {
        C1852h c1852h;
        boolean z7;
        synchronized (f15919i) {
            c1852h = j;
            if (c1852h != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            g0.c.g("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", z7);
        }
        return c1852h;
    }

    public final int b() {
        this.f15920a.readLock().lock();
        try {
            return this.f15922c;
        } finally {
            this.f15920a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z7;
        if (this.f15925g == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z7);
        if (b() == 1) {
            return;
        }
        this.f15920a.writeLock().lock();
        try {
            if (this.f15922c == 0) {
                return;
            }
            this.f15922c = 0;
            this.f15920a.writeLock().unlock();
            C1849e c1849e = this.f15924e;
            C1852h c1852h = c1849e.f15916a;
            try {
                c1852h.f.a(new C1848d(c1849e));
            } catch (Throwable th) {
                c1852h.d(th);
            }
        } finally {
            this.f15920a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f15920a.writeLock().lock();
        try {
            this.f15922c = 2;
            arrayList.addAll(this.f15921b);
            this.f15921b.clear();
            this.f15920a.writeLock().unlock();
            this.f15923d.post(new S4.c(arrayList, this.f15922c, th));
        } catch (Throwable th2) {
            this.f15920a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:44:0x0086, B:46:0x0090, B:48:0x0093, B:50:0x0097, B:52:0x00a7, B:53:0x00aa, B:55:0x00b7, B:58:0x00bf, B:63:0x00de, B:69:0x00ea, B:72:0x00f8, B:73:0x0102, B:74:0x0113, B:76:0x011a, B:77:0x011f, B:79:0x012a, B:81:0x0131, B:83:0x0135, B:85:0x013d, B:87:0x0141, B:90:0x0149, B:93:0x0157, B:94:0x015c, B:96:0x016c, B:42:0x007c), top: B:113:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0157 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:44:0x0086, B:46:0x0090, B:48:0x0093, B:50:0x0097, B:52:0x00a7, B:53:0x00aa, B:55:0x00b7, B:58:0x00bf, B:63:0x00de, B:69:0x00ea, B:72:0x00f8, B:73:0x0102, B:74:0x0113, B:76:0x011a, B:77:0x011f, B:79:0x012a, B:81:0x0131, B:83:0x0135, B:85:0x013d, B:87:0x0141, B:90:0x0149, B:93:0x0157, B:94:0x015c, B:96:0x016c, B:42:0x007c), top: B:113:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016c A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:44:0x0086, B:46:0x0090, B:48:0x0093, B:50:0x0097, B:52:0x00a7, B:53:0x00aa, B:55:0x00b7, B:58:0x00bf, B:63:0x00de, B:69:0x00ea, B:72:0x00f8, B:73:0x0102, B:74:0x0113, B:76:0x011a, B:77:0x011f, B:79:0x012a, B:81:0x0131, B:83:0x0135, B:85:0x013d, B:87:0x0141, B:90:0x0149, B:93:0x0157, B:94:0x015c, B:96:0x016c, B:42:0x007c), top: B:113:0x005d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C1852h.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(AbstractC1850f abstractC1850f) {
        g0.c.f(abstractC1850f, "initCallback cannot be null");
        this.f15920a.writeLock().lock();
        try {
            if (this.f15922c != 1 && this.f15922c != 2) {
                this.f15921b.add(abstractC1850f);
                this.f15920a.writeLock().unlock();
            }
            this.f15923d.post(new S4.c(Arrays.asList(abstractC1850f), this.f15922c, (Throwable) null));
            this.f15920a.writeLock().unlock();
        } catch (Throwable th) {
            this.f15920a.writeLock().unlock();
            throw th;
        }
    }
}
