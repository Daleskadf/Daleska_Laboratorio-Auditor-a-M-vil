package com.adobe.air;

import android.app.Activity;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES10;
import android.os.Build;
import android.view.SurfaceView;
import com.adobe.flashruntime.air.VideoViewAIR;
import java.util.Scanner;
/* loaded from: classes.dex */
public class FlashEGL14 implements FlashEGL {
    private static int EGL_BUFFER_DESTROYED = 12437;
    private static int EGL_BUFFER_PRESERVED = 12436;
    private static int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static int EGL_COVERAGE_BUFFERS_NV = 12512;
    private static int EGL_COVERAGE_SAMPLES_NV = 12513;
    private static int EGL_OPENGL_ES2_BIT = 4;
    private static int EGL_SWAP_BEHAVIOR = 12435;
    private static final int MAX_CONFIGS = 100;
    private static String TAG = "FlashEGL14";
    private static int[] cfgAttrs = {12339, -1, 12325, -1, 12326, -1, 12352, 4, 12344};
    private static int[] fbWindowSurfaceOnAttrs = {12435, 12436, 12344};
    private static int[] fbWindowSurfaceOffAttrs = {12435, 12437, 12344};
    private static int[] fbWindowSurfaceDefAttrs = {12344};
    private static int[] fbPBufferSurfaceAttrs = {12375, 64, 12374, 64, 12344};
    private int kSurfaceTypes = 0;
    private int kConfigId = 1;
    private int kRedBits = 2;
    private int kGreenBits = 3;
    private int kBlueBits = 4;
    private int kAlphaBits = 5;
    private int kColorBits = 6;
    private int kDepthBits = 7;
    private int kStencilBits = 8;
    private int kMsaaSamp = 9;
    private int kCsaaSamp = 10;
    private int kSwapPreserve = 11;
    private int kNumElements = 12;
    private int kSwapPreserveDefault = 0;
    private int kSwapPreserveOn = 1;
    private int kSwapPreserveOff = 2;
    private EGL14 mEgl = null;
    private EGLDisplay mEglDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLSurface mEglSurface = EGL14.EGL_NO_SURFACE;
    private EGLSurface mEglWindowSurface = EGL14.EGL_NO_SURFACE;
    private EGLSurface mEglPbufferSurface = EGL14.EGL_NO_SURFACE;
    private EGLConfig mEglConfig = null;
    private EGLConfig[] mEglConfigList = null;
    private int[] mEglVersion = null;
    private int mEglConfigCount = 0;
    private int mWindowConfigCount = 0;
    private int mPixmapConfigCount = 0;
    private int mPbufferConfigCount = 0;
    volatile EGLContext mEglContext = EGL14.EGL_NO_CONTEXT;
    private boolean mIsARGBSurface = false;
    private boolean mIsGPUOOM = false;
    private boolean mIsBufferPreserve = false;
    private boolean mIsES3Device = false;

    public void FlashEGL14() {
        this.mEgl = null;
        this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEglConfig = null;
        this.mEglContext = EGL14.EGL_NO_CONTEXT;
        this.mEglSurface = EGL14.EGL_NO_SURFACE;
        this.mEglWindowSurface = EGL14.EGL_NO_SURFACE;
        this.mEglPbufferSurface = EGL14.EGL_NO_SURFACE;
        this.mIsARGBSurface = false;
    }

    private int XX(int i, int i2) {
        return (i * this.kNumElements) + i2;
    }

    @Override // com.adobe.air.FlashEGL
    public boolean HasGLContext() {
        return this.mEglContext != EGL14.EGL_NO_CONTEXT;
    }

    @Override // com.adobe.air.FlashEGL
    public int GetSurfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // com.adobe.air.FlashEGL
    public int GetSurfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // com.adobe.air.FlashEGL
    public boolean IsEmulator() {
        return Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic");
    }

    public boolean ChooseConfig(EGLDisplay eGLDisplay, int[] iArr, EGLConfig[] eGLConfigArr, int i, int[] iArr2) {
        if (!IsEmulator()) {
            return EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, i, iArr2, 0);
        }
        int[] iArr3 = new int[1];
        EGL14.eglGetConfigs(eGLDisplay, null, 0, 0, iArr3, 0);
        int i2 = iArr3[0];
        EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
        EGL14.eglGetConfigs(eGLDisplay, eGLConfigArr2, 0, i2, iArr3, 0);
        int length = iArr.length;
        if (iArr.length % 2 != 0) {
            length = iArr.length - 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            while (i5 < length) {
                int i6 = i5 + 1;
                if (iArr[i6] != -1) {
                    int[] iArr4 = new int[1];
                    EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfigArr2[i4], iArr[i5], iArr4, 0);
                    int i7 = iArr4[0];
                    int i8 = iArr[i6];
                    if ((i7 & i8) != i8) {
                        break;
                    }
                }
                i5 += 2;
            }
            if (i5 == length) {
                if (eGLConfigArr != null && i3 < i) {
                    eGLConfigArr[i3] = eGLConfigArr2[i4];
                }
                i3++;
            }
        }
        iArr2[0] = i3;
        return true;
    }

    @Override // com.adobe.air.FlashEGL
    public int[] GetNumConfigs() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[100];
        ChooseConfig(this.mEglDisplay, cfgAttrs, eGLConfigArr, 100, iArr);
        int i = iArr[0];
        this.mEglConfigCount = i;
        int[] iArr2 = cfgAttrs;
        iArr2[1] = 4;
        ChooseConfig(this.mEglDisplay, iArr2, eGLConfigArr, 100, iArr);
        int i2 = iArr[0];
        this.mWindowConfigCount = i2;
        int[] iArr3 = cfgAttrs;
        iArr3[1] = 2;
        ChooseConfig(this.mEglDisplay, iArr3, eGLConfigArr, 100, iArr);
        int i3 = iArr[0];
        this.mPixmapConfigCount = i3;
        int[] iArr4 = cfgAttrs;
        iArr4[1] = 1;
        ChooseConfig(this.mEglDisplay, iArr4, eGLConfigArr, 100, iArr);
        int i4 = iArr[0];
        int[] iArr5 = {i, i2, i3, i4};
        this.mPbufferConfigCount = i4;
        cfgAttrs[1] = -1;
        return iArr5;
    }

    @Override // com.adobe.air.FlashEGL
    public int[] GetConfigs(boolean z, boolean z2) {
        int i = this.mEglConfigCount;
        int[] iArr = new int[this.kNumElements * i];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        this.mEglConfigList = new EGLConfig[i];
        checkEglError("Before eglChooseConfig");
        ChooseConfig(this.mEglDisplay, cfgAttrs, this.mEglConfigList, this.mEglConfigCount, iArr2);
        checkEglError("After eglChooseConfig");
        int i2 = iArr2[0];
        this.mEglConfigCount = i2;
        for (int i3 = 0; i3 < i2; i3++) {
            EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfigList[i3], 12339, iArr3, 0);
            iArr[XX(i3, this.kSurfaceTypes)] = iArr3[0];
            iArr[XX(i3, this.kConfigId)] = i3;
            EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfigList[i3], 12324, iArr3, 0);
            iArr[XX(i3, this.kRedBits)] = iArr3[0];
            EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfigList[i3], 12323, iArr3, 0);
            iArr[XX(i3, this.kGreenBits)] = iArr3[0];
            EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfigList[i3], 12322, iArr3, 0);
            iArr[XX(i3, this.kBlueBits)] = iArr3[0];
            EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfigList[i3], 12321, iArr3, 0);
            iArr[XX(i3, this.kAlphaBits)] = iArr3[0];
            EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfigList[i3], 12320, iArr3, 0);
            iArr[XX(i3, this.kColorBits)] = iArr3[0];
            EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfigList[i3], 12325, iArr3, 0);
            iArr[XX(i3, this.kDepthBits)] = iArr3[0];
            EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfigList[i3], 12326, iArr3, 0);
            iArr[XX(i3, this.kStencilBits)] = iArr3[0];
            iArr[XX(i3, this.kCsaaSamp)] = 0;
            iArr[XX(i3, this.kMsaaSamp)] = 0;
            if (z) {
                EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfigList[i3], EGL_COVERAGE_SAMPLES_NV, iArr3, 0);
                if (iArr3[0] != 1) {
                    iArr[XX(i3, this.kCsaaSamp)] = iArr3[0];
                }
            } else {
                EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfigList[i3], 12337, iArr3, 0);
                if (iArr3[0] != 1) {
                    iArr[XX(i3, this.kMsaaSamp)] = iArr3[0];
                }
            }
            if (z2) {
                int XX = XX(i3, this.kSwapPreserve);
                int[] iArr4 = this.mEglVersion;
                iArr[XX] = ((iArr4[0] > 1 || iArr4[1] > 3) && (iArr[XX(i3, this.kSurfaceTypes)] & EGL_BUFFER_PRESERVED) != 0) ? 1 : 0;
            } else {
                iArr[XX(i3, this.kSwapPreserve)] = 0;
            }
        }
        return iArr;
    }

    @Override // com.adobe.air.FlashEGL
    public void SetConfig(int i) {
        EGLConfig eGLConfig = this.mEglConfigList[i];
        this.mEglConfig = eGLConfig;
        int[] iArr = new int[1];
        EGL14.eglGetConfigAttrib(this.mEglDisplay, eGLConfig, 12324, iArr, 0);
        int i2 = iArr[0];
        EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfig, 12323, iArr, 0);
        int i3 = iArr[0];
        EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfig, 12322, iArr, 0);
        int i4 = iArr[0];
        EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfig, 12321, iArr, 0);
        int i5 = iArr[0];
        EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfig, 12325, iArr, 0);
        int i6 = iArr[0];
        EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfig, 12326, iArr, 0);
        int i7 = iArr[0];
        EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfig, 12337, iArr, 0);
        int i8 = iArr[0];
        EGL14.eglGetConfigAttrib(this.mEglDisplay, this.mEglConfig, 12338, iArr, 0);
        int i9 = iArr[0];
    }

    @Override // com.adobe.air.FlashEGL
    public int CreateDummySurfaceAndContext() {
        int i;
        if (this.mEglDisplay == EGL14.EGL_NO_DISPLAY) {
            return 12296;
        }
        if (this.mEglContext != EGL14.EGL_NO_CONTEXT) {
            if (this.mEglWindowSurface != EGL14.EGL_NO_SURFACE) {
                EGLDisplay eGLDisplay = this.mEglDisplay;
                EGLSurface eGLSurface = this.mEglWindowSurface;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEglContext);
                return 12288;
            } else if (this.mEglPbufferSurface != EGL14.EGL_NO_SURFACE) {
                EGLDisplay eGLDisplay2 = this.mEglDisplay;
                EGLSurface eGLSurface2 = this.mEglPbufferSurface;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.mEglContext);
                return 12288;
            } else {
                EGL14.eglMakeCurrent(this.mEglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
                this.mEglContext = EGL14.EGL_NO_CONTEXT;
            }
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = cfgAttrs;
        iArr2[1] = 1;
        ChooseConfig(this.mEglDisplay, iArr2, eGLConfigArr, 1, iArr);
        cfgAttrs[1] = -1;
        if (iArr[0] == 0) {
            return 12294;
        }
        int[] iArr3 = {EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
        this.mEglContext = EGL14.eglCreateContext(this.mEglDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, iArr3, 0);
        if (this.mEglContext == EGL14.EGL_NO_CONTEXT) {
            return 12294;
        }
        checkEglError("After creating dummy context for checking gl version");
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.mEglDisplay, eGLConfigArr[0], fbPBufferSurfaceAttrs, 0);
        checkEglError("After eglCreatePbufferSurface for checking gl version");
        if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
            return 12294;
        }
        EGL14.eglMakeCurrent(this.mEglDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, this.mEglContext);
        checkEglError("After eglMakeCurrent for checking gl version");
        String glGetString = GLES10.glGetString(7938);
        if (glGetString != null) {
            Scanner scanner = new Scanner(glGetString);
            scanner.useDelimiter("[^\\w']+");
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    i = scanner.nextInt();
                    break;
                } else if (scanner.hasNext()) {
                    scanner.next();
                }
            }
        }
        i = 0;
        boolean z = i >= 3;
        EGL14.eglMakeCurrent(this.mEglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.mEglDisplay, eglCreatePbufferSurface);
        EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
        this.mEglContext = EGL14.EGL_NO_CONTEXT;
        if (z) {
            iArr3[1] = 3;
            checkEglError("Before eglCreateContext es3");
            this.mEglContext = EGL14.eglCreateContext(this.mEglDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, iArr3, 0);
            checkEglError("After eglCreateContext es3");
            if (this.mEglContext != EGL14.EGL_NO_CONTEXT) {
                this.mIsES3Device = true;
            }
        }
        if (this.mEglContext == EGL14.EGL_NO_CONTEXT) {
            iArr3[1] = 2;
            checkEglError("Before eglCreateContext es2");
            this.mEglContext = EGL14.eglCreateContext(this.mEglDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, iArr3, 0);
            checkEglError("After eglCreateContext es2");
            if (this.mEglContext == EGL14.EGL_NO_CONTEXT) {
                return 12294;
            }
        }
        checkEglError("Before eglCreatePbufferSurface");
        this.mEglPbufferSurface = EGL14.eglCreatePbufferSurface(this.mEglDisplay, eGLConfigArr[0], fbPBufferSurfaceAttrs, 0);
        checkEglError("After eglCreatePbufferSurface");
        if (this.mEglPbufferSurface == EGL14.EGL_NO_SURFACE) {
            return 12294;
        }
        checkEglError("Before eglMakeCurrent");
        EGLDisplay eGLDisplay3 = this.mEglDisplay;
        EGLSurface eGLSurface3 = this.mEglPbufferSurface;
        EGL14.eglMakeCurrent(eGLDisplay3, eGLSurface3, eGLSurface3, this.mEglContext);
        checkEglError("After eglMakeCurrent");
        return 12288;
    }

    @Override // com.adobe.air.FlashEGL
    public int InitEGL() {
        if (this.mEglContext != EGL14.EGL_NO_CONTEXT) {
            return 12288;
        }
        this.mEgl = new EGL14();
        checkEglError("Before eglGetDisplay");
        this.mEglDisplay = EGL14.eglGetDisplay(0);
        int checkEglError = checkEglError("After eglGetDisplay");
        if (12288 != checkEglError) {
            return checkEglError;
        }
        this.mEglVersion = new int[2];
        checkEglError("Before eglInitialize");
        EGLDisplay eGLDisplay = this.mEglDisplay;
        int[] iArr = this.mEglVersion;
        EGL14.eglInitialize(eGLDisplay, iArr, 0, iArr, 1);
        int checkEglError2 = checkEglError("After eglInitialize");
        if (12288 != checkEglError2) {
            return checkEglError2;
        }
        return 12288;
    }

    @Override // com.adobe.air.FlashEGL
    public boolean DestroyGLContext() {
        if (this.mEglContext == EGL14.EGL_NO_CONTEXT || this.mEglDisplay == EGL14.EGL_NO_DISPLAY) {
            return false;
        }
        checkEglError("DestroyGLContext: Before eglMakeCurrent for noSurface");
        EGL14.eglMakeCurrent(this.mEglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        checkEglError("DestroyGLContext: After eglMakeCurrent");
        if (this.mEglPbufferSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.mEglDisplay, this.mEglPbufferSurface);
            this.mEglPbufferSurface = EGL14.EGL_NO_SURFACE;
        }
        checkEglError("Before eglDestroyContext");
        boolean eglDestroyContext = EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
        checkEglError("After eglDestroyContext");
        this.mEglContext = EGL14.EGL_NO_CONTEXT;
        return eglDestroyContext;
    }

    @Override // com.adobe.air.FlashEGL
    public int CreateGLContext(boolean z) {
        if (this.mEglConfig == null) {
            return 12293;
        }
        if (this.mEglContext == EGL14.EGL_NO_CONTEXT || z) {
            int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, this.mIsES3Device ? 3 : 2, 12344};
            if (z) {
                EGLContext eGLContext = this.mEglContext;
                checkEglError("Before eglCreateContext");
                this.mEglContext = EGL14.eglCreateContext(this.mEglDisplay, this.mEglConfig, eGLContext, iArr, 0);
                checkEglError("After eglCreateContext");
                EGL14.eglDestroyContext(this.mEglDisplay, eGLContext);
                checkEglError("After eglDestroyContext");
            } else {
                checkEglError("Before eglCreateContext");
                this.mEglContext = EGL14.eglCreateContext(this.mEglDisplay, this.mEglConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                checkEglError("After eglCreateContext");
            }
            if (this.mEglContext == EGL14.EGL_NO_CONTEXT) {
                return 12294;
            }
            if (EGL14.EGL_NO_SURFACE == this.mEglPbufferSurface) {
                checkEglError("Before eglCreatePbufferSurface");
                this.mEglPbufferSurface = EGL14.eglCreatePbufferSurface(this.mEglDisplay, this.mEglConfig, fbPBufferSurfaceAttrs, 0);
                checkEglError("After eglCreatePbufferSurface");
            }
            return 12288;
        }
        return 12288;
    }

    @Override // com.adobe.air.FlashEGL
    public void TerminateEGL() {
        if (this.mEgl != null && this.mEglDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglTerminate(this.mEglDisplay);
        }
        this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
    }

    @Override // com.adobe.air.FlashEGL
    public void ReleaseGPUResources() {
        if (this.mEglContext == EGL14.EGL_NO_CONTEXT) {
            return;
        }
        checkEglError("Before eglMakeCurrent");
        EGL14.eglMakeCurrent(this.mEglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        checkEglError("After eglMakeCurrent");
        synchronized (this.mEgl) {
            checkEglError("Before eglDestroySurface");
            if (this.mEglWindowSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.mEglDisplay, this.mEglWindowSurface);
                this.mEglWindowSurface = EGL14.EGL_NO_SURFACE;
            }
            checkEglError("After eglDestroySurface (window)");
        }
        if (this.mEglPbufferSurface != EGL14.EGL_NO_SURFACE) {
            checkEglError("Before eglDestroySurface (pbuffer)");
            EGL14.eglDestroySurface(this.mEglDisplay, this.mEglPbufferSurface);
            checkEglError("After eglDestroySurface (pbuffer)");
            this.mEglPbufferSurface = EGL14.EGL_NO_SURFACE;
        }
        checkEglError("Before eglDestroyContext");
        EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
        checkEglError("After eglDestroyContext");
        this.mEglContext = EGL14.EGL_NO_CONTEXT;
        this.mEglSurface = EGL14.EGL_NO_SURFACE;
    }

    @Override // com.adobe.air.FlashEGL
    public void SwapEGLBuffers() {
        if (12288 != MakeGLCurrent()) {
            return;
        }
        checkEglError("Before eglSwapBuffers");
        EGL14.eglSwapBuffers(this.mEglDisplay, this.mEglSurface);
        checkEglError("After eglSwapBuffers");
    }

    @Override // com.adobe.air.FlashEGL
    public int MakeGLCurrent() {
        if (this.mEglContext == EGL14.EGL_NO_CONTEXT) {
            return 12294;
        }
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return 12301;
        }
        if (this.mEglDisplay == EGL14.EGL_NO_DISPLAY) {
            return 12296;
        }
        checkEglError("Before eglMakeCurrent");
        EGLDisplay eGLDisplay = this.mEglDisplay;
        EGLSurface eGLSurface = this.mEglSurface;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEglContext);
        return checkEglError("After eglMakeCurrent");
    }

    @Override // com.adobe.air.FlashEGL
    public int CreateWindowSurface(SurfaceView surfaceView, int i) {
        boolean z;
        if (this.mIsGPUOOM) {
            return 12291;
        }
        boolean z2 = surfaceView instanceof AIRWindowSurfaceView;
        if ((surfaceView instanceof VideoViewAIR) || (surfaceView instanceof AIRStage3DSurfaceView) || z2) {
            if (this.mEglWindowSurface != EGL14.EGL_NO_SURFACE) {
                this.mEglSurface = this.mEglWindowSurface;
                return MakeGLCurrent();
            }
            if (i == this.kSwapPreserveOn) {
                checkEglError("Before eglCreateWindowSurface");
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.mEglDisplay, this.mEglConfig, surfaceView.getHolder(), fbWindowSurfaceOnAttrs, 0);
                this.mEglWindowSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                    checkEglError("After eglCreateWindowSurface");
                    z = false;
                }
                z = true;
            } else {
                if (i == this.kSwapPreserveOff) {
                    checkEglError("Before eglCreateWindowSurface");
                    EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.mEglDisplay, this.mEglConfig, surfaceView.getHolder(), fbWindowSurfaceOffAttrs, 0);
                    this.mEglWindowSurface = eglCreateWindowSurface2;
                    if (eglCreateWindowSurface2 == EGL14.EGL_NO_SURFACE) {
                        checkEglError("After eglCreateWindowSurface");
                        z = false;
                    }
                }
                z = true;
            }
            if (this.mEglWindowSurface == EGL14.EGL_NO_SURFACE) {
                checkEglError("Before eglCreateWindowSurface");
                this.mEglWindowSurface = EGL14.eglCreateWindowSurface(this.mEglDisplay, this.mEglConfig, surfaceView.getHolder(), fbWindowSurfaceDefAttrs, 0);
                int checkEglError = checkEglError("After eglCreateWindowSurface");
                if (checkEglError != 12288) {
                    return checkEglError;
                }
                z = true;
            }
            if (this.mEglWindowSurface == EGL14.EGL_NO_SURFACE) {
                return 12301;
            }
            this.mEglSurface = this.mEglWindowSurface;
            if (z2) {
                AIRWindowSurfaceView aIRWindowSurfaceView = (AIRWindowSurfaceView) surfaceView;
                aIRWindowSurfaceView.setFlashEGL(this);
                Activity activity = aIRWindowSurfaceView.getActivityWrapper().getActivity();
                if (activity != null) {
                    activity.getWindow().setSoftInputMode(34);
                }
            }
            int[] iArr = {0};
            this.mIsBufferPreserve = false;
            if (z && EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, EGL_SWAP_BEHAVIOR, iArr, 0)) {
                this.mIsBufferPreserve = iArr[0] == EGL_BUFFER_PRESERVED;
            }
            return MakeGLCurrent();
        }
        return 12301;
    }

    @Override // com.adobe.air.FlashEGL
    public boolean DestroyWindowSurface() {
        if (this.mEglWindowSurface != EGL14.EGL_NO_SURFACE) {
            checkEglError("Before eglMakeCurrent");
            EGL14.eglMakeCurrent(this.mEglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            if (12288 != checkEglError("After eglMakeCurrent")) {
                return false;
            }
            checkEglError("Before eglDestroySurface (window)");
            EGL14.eglDestroySurface(this.mEglDisplay, this.mEglWindowSurface);
            if (12288 != checkEglError("After eglDestroySurface (window)")) {
                return false;
            }
            if (this.mEglSurface == this.mEglWindowSurface) {
                this.mEglSurface = EGL14.EGL_NO_SURFACE;
            }
            this.mEglWindowSurface = EGL14.EGL_NO_SURFACE;
            if (this.mEglPbufferSurface == EGL14.EGL_NO_SURFACE || this.mEglContext == EGL14.EGL_NO_CONTEXT) {
                return true;
            }
            EGLSurface eGLSurface = this.mEglPbufferSurface;
            this.mEglSurface = eGLSurface;
            EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext);
            return 12288 == checkEglError("After eglMakeCurrent");
        }
        return false;
    }

    @Override // com.adobe.air.FlashEGL
    public boolean IsARGBSurface() {
        return this.mIsARGBSurface;
    }

    @Override // com.adobe.air.FlashEGL
    public boolean IsBufferPreserve() {
        return this.mIsBufferPreserve;
    }

    private int checkEglError(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288 && !this.mIsGPUOOM && eglGetError == 12291) {
            if (this.mEglWindowSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.mEglDisplay, this.mEglWindowSurface);
                EGL14.eglGetError();
                this.mEglWindowSurface = EGL14.EGL_NO_SURFACE;
                this.mEglSurface = EGL14.EGL_NO_SURFACE;
                this.mEglWindowSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(this.mEglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                EGL14.eglGetError();
            }
            if (this.mEglPbufferSurface != EGL14.EGL_NO_SURFACE && this.mEglContext != EGL14.EGL_NO_CONTEXT) {
                EGLSurface eGLSurface = this.mEglPbufferSurface;
                this.mEglSurface = eGLSurface;
                EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext);
                EGL14.eglGetError();
            }
            this.mIsGPUOOM = true;
        }
        return eglGetError;
    }
}
