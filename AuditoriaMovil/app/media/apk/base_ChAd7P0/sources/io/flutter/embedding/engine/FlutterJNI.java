package io.flutter.embedding.engine;

import B5.B;
import B5.C0042o;
import B5.EnumC0041n;
import B5.z;
import C5.b;
import C5.k;
import C5.l;
import D.AbstractC0059i;
import D5.c;
import D5.i;
import D5.j;
import E5.a;
import L5.e;
import L5.x;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.datastore.preferences.protobuf.Y;
import c1.RunnableC0626c;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f5.C0993a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.embedding.engine.renderer.n;
import io.flutter.plugin.platform.d;
import io.flutter.plugin.platform.o;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.g;
import io.flutter.view.h;
import io.flutter.view.v;
import io.flutter.view.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p.C1608t;
import p4.P;
import z2.C2069a;
@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static l asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private k accessibilityDelegate;
    private a deferredComponentManager;
    private M5.a localizationPlugin;
    private Long nativeShellHolderId;
    private j platformMessageHandler;
    private o platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<n> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j) {
        l lVar = asyncWaitForVsyncDelegate;
        if (lVar != null) {
            io.flutter.view.a aVar = (io.flutter.view.a) lVar;
            aVar.getClass();
            Choreographer choreographer = Choreographer.getInstance();
            w wVar = (w) aVar.f12430a;
            v vVar = wVar.f12532c;
            if (vVar != null) {
                vVar.f12527a = j;
                wVar.f12532c = null;
            } else {
                vVar = new v(wVar, j);
            }
            choreographer.postFrameCallback(vVar);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [C5.j] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: C5.j
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j, imageDecoder, imageInfo, source);
                    }
                });
                return decodeBitmap;
            } catch (IOException e7) {
                Log.e(TAG, "Failed to decode image", e7);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i7, ByteBuffer byteBuffer) {
        e eVar;
        j jVar = this.platformMessageHandler;
        if (jVar != null && (eVar = (e) ((i) jVar).f.remove(Integer.valueOf(i7))) != null) {
            try {
                eVar.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Error e7) {
                Thread currentThread = Thread.currentThread();
                if (currentThread.getUncaughtExceptionHandler() != null) {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e7);
                    return;
                }
                throw e7;
            } catch (Exception e8) {
                Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Size size;
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        imageDecoder.setTargetColorSpace(colorSpace);
        imageDecoder.setAllocator(1);
        size = imageInfo.getSize();
        nativeImageHeaderCallback(j, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j);

    private native void nativeDeferredComponentInstallFailure(int i7, String str, boolean z7);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i7);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i7, int i8);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i7);

    private native void nativeDispatchSemanticsAction(long j, int i7, int i8, ByteBuffer byteBuffer, int i9);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i7);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i7);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i7);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i7);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i7);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j, int i7, int i8);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i7);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i7, ByteBuffer byteBuffer, int i8);

    private native void nativeLoadDartDeferredLibrary(long j, int i7, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j8);

    private native void nativeNotifyLowMemoryWarning(long j);

    private native void nativeOnVsync(long j, long j8, long j9);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j, long j8, WeakReference<TextureRegistry$ImageConsumer> weakReference);

    private native void nativeRegisterTexture(long j, long j8, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager, List<String> list);

    private native void nativeScheduleFrame(long j);

    private native void nativeSetAccessibilityFeatures(long j, int i7);

    private native void nativeSetSemanticsEnabled(long j, boolean z7);

    private native void nativeSetViewportMetrics(long j, float f, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j, String str, String str2, String str3, List<String> list);

    private native void nativeSurfaceChanged(long j, int i7, int i8);

    private native void nativeSurfaceCreated(long j, Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface);

    private native void nativeUnregisterTexture(long j, long j8);

    private native void nativeUpdateDisplayMetrics(long j);

    private native void nativeUpdateJavaAssetManager(long j, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f);

    private void onPreEngineRestart() {
        for (b bVar : this.engineLifecycleListeners) {
            bVar.b();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        String str;
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            io.flutter.view.a aVar = (io.flutter.view.a) kVar;
            aVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.o oVar = (io.flutter.view.o) aVar.f12430a;
            oVar.getClass();
            while (byteBuffer.hasRemaining()) {
                h b5 = oVar.b(byteBuffer.getInt());
                b5.f12438c = byteBuffer.getInt();
                int i7 = byteBuffer.getInt();
                String str2 = null;
                if (i7 == -1) {
                    str = null;
                } else {
                    str = strArr[i7];
                }
                b5.f12439d = str;
                int i8 = byteBuffer.getInt();
                if (i8 != -1) {
                    str2 = strArr[i8];
                }
                b5.f12440e = str2;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((io.flutter.view.a) kVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(n nVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(nVar);
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j) {
        nativeCleanupMessageData(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0141, code lost:
        if (r4.hasNext() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0155, code lost:
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0158, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0160, code lost:
        if (r4.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0162, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0177, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:
        r10 = r3;
     */
    /* JADX WARN: Incorrect condition in loop: B:41:0x011a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [B5.o, java.lang.Object, io.flutter.plugin.platform.d] */
    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar != null) {
            oVar.getClass();
            ?? c0042o = new C0042o(oVar.f11719d.getContext(), oVar.f11719d.getWidth(), oVar.f11719d.getHeight(), EnumC0041n.overlay);
            c0042o.f11692e0 = oVar.f11722h;
            int i7 = oVar.f11728o;
            oVar.f11728o = i7 + 1;
            oVar.f11726m.put(i7, c0042o);
            return new FlutterOverlaySurface(i7, c0042o.getSurface());
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void deferredComponentInstallFailure(int i7, String str, boolean z7) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i7, str, z7);
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar != null) {
            oVar.c();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i7) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i7);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i7);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i7, int i8) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i7, i8);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i8);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i7) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i7);
    }

    public void dispatchSemanticsAction(int i7, g gVar) {
        dispatchSemanticsAction(i7, gVar, null);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            V2.k r0 = K5.v.f2743b
            java.lang.Object r1 = r0.f5966c
            K5.t r1 = (K5.t) r1
            java.lang.Object r2 = r0.f5965b
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            if (r1 != 0) goto L14
            java.lang.Object r1 = r2.poll()
            K5.t r1 = (K5.t) r1
            r0.f5966c = r1
        L14:
            java.lang.Object r1 = r0.f5966c
            K5.t r1 = (K5.t) r1
            if (r1 == 0) goto L27
            int r3 = r1.f2741a
            if (r3 >= r8) goto L27
            java.lang.Object r1 = r2.poll()
            K5.t r1 = (K5.t) r1
            r0.f5966c = r1
            goto L14
        L27:
            r2 = 0
            java.lang.String r3 = "Cannot find config with generation: "
            java.lang.String r4 = "SettingsChannel"
            if (r1 != 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.append(r1)
            java.lang.String r1 = ", after exhausting the queue."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L46:
            r1 = r2
            goto L72
        L48:
            int r5 = r1.f2741a
            if (r5 == r8) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r1.append(r3)
            java.lang.String r3 = ", the oldest config is now: "
            r1.append(r3)
            java.lang.Object r0 = r0.f5966c
            K5.t r0 = (K5.t) r0
            int r0 = r0.f2741a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0)
            goto L46
        L72:
            if (r1 != 0) goto L75
            goto L77
        L75:
            android.util.DisplayMetrics r2 = r1.f2742b
        L77:
            if (r2 != 0) goto L98
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "getScaledFontSize called with configurationId "
            r7.<init>(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ", which can't be found."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FlutterJNI"
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        L98:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r2)
            float r8 = r2.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i7, long j) {
        D5.e eVar;
        boolean z7;
        j jVar = this.platformMessageHandler;
        if (jVar != null) {
            i iVar = (i) jVar;
            synchronized (iVar.f891d) {
                try {
                    eVar = (D5.e) iVar.f889b.get(str);
                    if (iVar.f892e.get() && eVar == null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        if (!iVar.f890c.containsKey(str)) {
                            iVar.f890c.put(str, new LinkedList());
                        }
                        ((List) iVar.f890c.get(str)).add(new c(j, byteBuffer, i7));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z7) {
                iVar.a(str, eVar, byteBuffer, i7, j);
                return;
            }
            return;
        }
        nativeCleanupMessageData(j);
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i7) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i7);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i7);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i7, ByteBuffer byteBuffer, int i8) {
        if (byteBuffer.isDirect()) {
            this.shellHolderLock.readLock().lock();
            try {
                if (isAttached()) {
                    nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i7, byteBuffer, i8);
                } else {
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i7);
                }
                this.shellHolderLock.readLock().unlock();
                return;
            } catch (Throwable th) {
                this.shellHolderLock.readLock().unlock();
                throw th;
            }
        }
        throw new IllegalArgumentException("Expected a direct ByteBuffer.");
    }

    public boolean isAttached() {
        if (this.nativeShellHolderId != null) {
            return true;
        }
        return false;
    }

    public boolean isCodePointEmoji(int i7) {
        return nativeFlutterTextUtilsIsEmoji(i7);
    }

    public boolean isCodePointEmojiModifier(int i7) {
        return nativeFlutterTextUtilsIsEmojiModifier(i7);
    }

    public boolean isCodePointEmojiModifierBase(int i7) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i7);
    }

    public boolean isCodePointRegionalIndicator(int i7) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i7);
    }

    public boolean isCodePointVariantSelector(int i7) {
        return nativeFlutterTextUtilsIsVariationSelector(i7);
    }

    public void loadDartDeferredLibrary(int i7, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i7, strArr);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [p4.P, java.lang.Object] */
    public void loadLibrary(Context context) {
        C1608t c1608t;
        C1608t r7;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        char c8 = 0;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C0993a c0993a = new C0993a(24);
        e5.b bVar = new e5.b(24);
        ?? obj = new Object();
        obj.f15210a = new HashSet();
        obj.f15211b = c0993a;
        obj.f15212c = bVar;
        if (context != null) {
            P.n("Beginning load of %s...", "flutter");
            C0993a c0993a2 = (C0993a) obj.f15211b;
            HashSet hashSet = (HashSet) obj.f15210a;
            if (hashSet.contains("flutter")) {
                P.n("%s already loaded previously!", "flutter");
            } else {
                try {
                    c0993a2.getClass();
                    System.loadLibrary("flutter");
                    hashSet.add("flutter");
                    P.n("%s (%s) was loaded normally!", "flutter", null);
                } catch (UnsatisfiedLinkError e7) {
                    P.n("Loading the library normally failed: %s", Log.getStackTraceString(e7));
                    P.n("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                    File m7 = obj.m(context);
                    if (!m7.exists()) {
                        File dir = context.getDir("lib", 0);
                        File m8 = obj.m(context);
                        c0993a2.getClass();
                        File[] listFiles = dir.listFiles(new C2069a(System.mapLibraryName("flutter")));
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                if (!file.getAbsolutePath().equals(m8.getAbsolutePath())) {
                                    file.delete();
                                }
                            }
                        }
                        String[] strArr2 = Build.SUPPORTED_ABIS;
                        if (strArr2.length <= 0) {
                            String str = Build.CPU_ABI2;
                            if (str != null && str.length() != 0) {
                                strArr2 = new String[]{Build.CPU_ABI, str};
                            } else {
                                strArr2 = new String[]{Build.CPU_ABI};
                            }
                        }
                        String mapLibraryName = System.mapLibraryName("flutter");
                        ((e5.b) obj.f15212c).getClass();
                        try {
                            r7 = e5.b.r(context, strArr2, mapLibraryName, obj);
                        } catch (Throwable th) {
                            th = th;
                            c1608t = null;
                        }
                        try {
                            if (r7 != null) {
                                int i7 = 0;
                                while (true) {
                                    int i8 = i7 + 1;
                                    zipFile = (ZipFile) r7.f14880b;
                                    if (i7 < 5) {
                                        Object[] objArr = new Object[1];
                                        objArr[c8] = mapLibraryName;
                                        P.n("Found %s! Extracting...", objArr);
                                        try {
                                            if (m7.exists() || m7.createNewFile()) {
                                                try {
                                                    inputStream2 = zipFile.getInputStream((ZipEntry) r7.f14881c);
                                                    try {
                                                        fileOutputStream2 = new FileOutputStream(m7);
                                                    } catch (FileNotFoundException unused) {
                                                        fileOutputStream2 = null;
                                                        e5.b.m(inputStream2);
                                                        e5.b.m(fileOutputStream2);
                                                        i7 = i8;
                                                        c8 = 0;
                                                    } catch (IOException unused2) {
                                                        fileOutputStream2 = null;
                                                        e5.b.m(inputStream2);
                                                        e5.b.m(fileOutputStream2);
                                                        i7 = i8;
                                                        c8 = 0;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        inputStream = inputStream2;
                                                        fileOutputStream = null;
                                                        e5.b.m(inputStream);
                                                        e5.b.m(fileOutputStream);
                                                        throw th;
                                                    }
                                                    try {
                                                        byte[] bArr = new byte[RecognitionOptions.AZTEC];
                                                        long j = 0;
                                                        while (true) {
                                                            int read = inputStream2.read(bArr);
                                                            if (read == -1) {
                                                                break;
                                                            }
                                                            fileOutputStream2.write(bArr, 0, read);
                                                            j += read;
                                                        }
                                                        fileOutputStream2.flush();
                                                        fileOutputStream2.getFD().sync();
                                                        if (j != m7.length()) {
                                                            e5.b.m(inputStream2);
                                                            e5.b.m(fileOutputStream2);
                                                        } else {
                                                            e5.b.m(inputStream2);
                                                            e5.b.m(fileOutputStream2);
                                                            m7.setReadable(true, false);
                                                            m7.setExecutable(true, false);
                                                            m7.setWritable(true);
                                                            break;
                                                        }
                                                    } catch (FileNotFoundException unused3) {
                                                        e5.b.m(inputStream2);
                                                        e5.b.m(fileOutputStream2);
                                                        i7 = i8;
                                                        c8 = 0;
                                                    } catch (IOException unused4) {
                                                        e5.b.m(inputStream2);
                                                        e5.b.m(fileOutputStream2);
                                                        i7 = i8;
                                                        c8 = 0;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        inputStream = inputStream2;
                                                        fileOutputStream = fileOutputStream2;
                                                        e5.b.m(inputStream);
                                                        e5.b.m(fileOutputStream);
                                                        throw th;
                                                    }
                                                } catch (FileNotFoundException unused5) {
                                                    inputStream2 = null;
                                                } catch (IOException unused6) {
                                                    inputStream2 = null;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    inputStream = null;
                                                }
                                            }
                                        } catch (IOException unused7) {
                                        }
                                        i7 = i8;
                                        c8 = 0;
                                    }
                                }
                                try {
                                    zipFile.close();
                                } catch (IOException unused8) {
                                    String absolutePath = m7.getAbsolutePath();
                                    c0993a2.getClass();
                                    System.load(absolutePath);
                                    hashSet.add("flutter");
                                    P.n("%s (%s) was re-linked!", "flutter", null);
                                    loadLibraryCalled = true;
                                    return;
                                }
                            } else {
                                try {
                                    strArr = e5.b.t(context, mapLibraryName);
                                } catch (Exception e8) {
                                    strArr = new String[]{e8.toString()};
                                }
                                StringBuilder m9 = Y.m("Could not find '", mapLibraryName, "'. Looked for: ");
                                m9.append(Arrays.toString(strArr2));
                                m9.append(", but only found: ");
                                throw new RuntimeException(AbstractC0059i.D(m9, Arrays.toString(strArr), "."));
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c1608t = r7;
                            if (c1608t != null) {
                                try {
                                    ((ZipFile) c1608t.f14880b).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    }
                    String absolutePath2 = m7.getAbsolutePath();
                    c0993a2.getClass();
                    System.load(absolutePath2);
                    hashSet.add("flutter");
                    P.n("%s (%s) was re-linked!", "flutter", null);
                }
            }
            loadLibraryCalled = true;
            return;
        }
        throw new IllegalArgumentException("Given context is null");
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar != null) {
            oVar.f11731r.clear();
            oVar.f11732s.clear();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i7, int i8, int i9, int i10, int i11) {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar != null) {
            SparseArray sparseArray = oVar.f11726m;
            if (sparseArray.get(i7) != null) {
                oVar.h();
                View view = (d) sparseArray.get(i7);
                if (view.getParent() == null) {
                    oVar.f11719d.addView(view);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
                layoutParams.leftMargin = i8;
                layoutParams.topMargin = i9;
                view.setLayoutParams(layoutParams);
                view.setVisibility(0);
                view.bringToFront();
                oVar.f11731r.add(Integer.valueOf(i7));
                return;
            }
            throw new IllegalStateException(io.flutter.plugins.pathprovider.b.f("The overlay surface (id:", i7, ") doesn't exist"));
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(final int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        final o oVar = this.platformViewsController;
        if (oVar != null) {
            oVar.h();
            SparseArray sparseArray = oVar.f11724k;
            io.flutter.plugin.platform.g gVar = (io.flutter.plugin.platform.g) sparseArray.get(i7);
            if (gVar != null) {
                SparseArray sparseArray2 = oVar.f11725l;
                if (sparseArray2.get(i7) == null) {
                    View view = gVar.getView();
                    if (view != null) {
                        if (view.getParent() == null) {
                            Activity activity = oVar.f11718c;
                            G5.b bVar = new G5.b(activity, activity.getResources().getDisplayMetrics().density, oVar.f11717b);
                            bVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.k
                                @Override // android.view.View.OnFocusChangeListener
                                public final void onFocusChange(View view2, boolean z7) {
                                    o oVar2 = o.this;
                                    int i14 = i7;
                                    if (z7) {
                                        L5.r rVar = (L5.r) oVar2.f11721g.f10b;
                                        if (rVar != null) {
                                            rVar.a("viewFocused", Integer.valueOf(i14), null);
                                            return;
                                        }
                                        return;
                                    }
                                    io.flutter.plugin.editing.k kVar = oVar2.f;
                                    if (kVar != null) {
                                        kVar.b(i14);
                                    }
                                }
                            });
                            sparseArray2.put(i7, bVar);
                            view.setImportantForAccessibility(4);
                            bVar.addView(view);
                            oVar.f11719d.addView(bVar);
                        } else {
                            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                        }
                    } else {
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    }
                }
                G5.b bVar2 = (G5.b) sparseArray2.get(i7);
                bVar2.f1596a = flutterMutatorsStack;
                bVar2.f1598c = i8;
                bVar2.f1599d = i9;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
                layoutParams.leftMargin = i8;
                layoutParams.topMargin = i9;
                bVar2.setLayoutParams(layoutParams);
                bVar2.setWillNotDraw(false);
                bVar2.setVisibility(0);
                bVar2.bringToFront();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, i13);
                View view2 = ((io.flutter.plugin.platform.g) sparseArray.get(i7)).getView();
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams2);
                    view2.bringToFront();
                }
                oVar.f11732s.add(Integer.valueOf(i7));
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.o] */
    public void onEndFrame() {
        boolean z7;
        ?? r32;
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar != null) {
            boolean z8 = false;
            if (oVar.f11729p && oVar.f11732s.isEmpty()) {
                oVar.f11729p = false;
                B b5 = oVar.f11719d;
                RunnableC0626c runnableC0626c = new RunnableC0626c(oVar, 8);
                C0042o c0042o = b5.f291c;
                if (c0042o != null && (r32 = b5.f293e) != 0) {
                    b5.f292d = r32;
                    b5.f293e = null;
                    m mVar = b5.f295f0.f554b;
                    if (mVar == null) {
                        c0042o.d();
                        C0042o c0042o2 = b5.f291c;
                        if (c0042o2 != null) {
                            c0042o2.f371a.close();
                            b5.removeView(b5.f291c);
                            b5.f291c = null;
                        }
                        runnableC0626c.run();
                        return;
                    }
                    r32.e();
                    z zVar = new z(b5, mVar, runnableC0626c);
                    mVar.f11612a.addIsDisplayingFlutterUiListener(zVar);
                    if (mVar.f11615d) {
                        zVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (oVar.f11729p) {
                C0042o c0042o3 = oVar.f11719d.f291c;
                if (c0042o3 != null) {
                    z7 = c0042o3.a();
                } else {
                    z7 = false;
                }
                if (z7) {
                    z8 = true;
                }
            }
            oVar.e(z8);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (n nVar : this.flutterUiDisplayListeners) {
            nVar.b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (n nVar : this.flutterUiDisplayListeners) {
            nVar.a();
        }
    }

    public void onSurfaceChanged(int i7, int i8) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i7, i8);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j, long j8, long j9) {
        nativeOnVsync(j, j8, j9);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(textureRegistry$ImageConsumer));
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(n nVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(nVar);
    }

    public void requestDartDeferredLibrary(int i7) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(k kVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = kVar;
    }

    public void setAccessibilityFeatures(int i7) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i7);
        }
    }

    public void setAccessibilityFeaturesInNative(int i7) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i7);
    }

    public void setAsyncWaitForVsyncDelegate(l lVar) {
        asyncWaitForVsyncDelegate = lVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(M5.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(j jVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = jVar;
    }

    public void setPlatformViewsController(o oVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = oVar;
    }

    public void setRefreshRateFPS(float f) {
        refreshRateFPS = f;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z7) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z7);
        }
    }

    public void setSemanticsEnabledInNative(boolean z7) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z7);
    }

    public void setViewportMetrics(float f, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, iArr, iArr2, iArr3);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list) {
        boolean z7;
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list);
        Long l8 = nativeSpawn.nativeShellHolderId;
        if (l8 != null && l8.longValue() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updateDisplayMetrics(int i7, float f, float f4, float f8) {
        displayWidth = f;
        displayHeight = f4;
        displayDensity = f8;
        if (!loadLibraryCalled) {
            return;
        }
        nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (!loadLibraryCalled) {
            return;
        }
        nativeUpdateRefreshRate(refreshRateFPS);
    }

    public void dispatchSemanticsAction(int i7, g gVar, Object obj) {
        ByteBuffer byteBuffer;
        int i8;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = x.f3044a.a(obj);
            i8 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i8 = 0;
        }
        dispatchSemanticsAction(i7, gVar.value, byteBuffer, i8);
    }

    public void dispatchSemanticsAction(int i7, int i8, ByteBuffer byteBuffer, int i9) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i7, i8, byteBuffer, i9);
    }
}
