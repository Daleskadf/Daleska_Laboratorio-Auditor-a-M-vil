package O;

import D.AbstractC0059i;
import D.D;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3469a = {12344};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3470b = {12445, 13632, 12344};

    /* renamed from: c  reason: collision with root package name */
    public static final String f3471c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f3472d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f3473e;
    public static final d f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f3474g;

    /* renamed from: h  reason: collision with root package name */
    public static final FloatBuffer f3475h;

    /* renamed from: i  reason: collision with root package name */
    public static final FloatBuffer f3476i;
    public static final c j;

    static {
        Locale locale = Locale.US;
        f3471c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f3472d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f3473e = new d(0);
        f = new d(1);
        f3474g = new d(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        f3475h = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        f3476i = asFloatBuffer2;
        j = new c(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(glGetError));
    }

    public static void c(Thread thread) {
        boolean z7;
        if (thread == Thread.currentThread()) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g("Method call must be called on the GL thread.", z7);
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z7) {
        boolean z8;
        String str;
        if (z7 == atomicBoolean.get()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        g0.c.g(str, z8);
    }

    public static void e(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalStateException(AbstractC0059i.M("Unable to locate '", str, "' in program"));
    }

    public static int[] f(String str, D d7) {
        int[] iArr = f3469a;
        if (d7.f612a == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f3470b;
            }
            org.slf4j.helpers.i.O("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
            return iArr;
        }
        return iArr;
    }

    public static HashMap g(D d7, Map map) {
        f[] values;
        Object hVar;
        f fVar;
        boolean z7;
        HashMap hashMap = new HashMap();
        for (f fVar2 : f.values()) {
            d dVar = (d) map.get(fVar2);
            if (dVar != null) {
                hVar = new h(d7, dVar);
            } else if (fVar2 != f.YUV && fVar2 != (fVar = f.DEFAULT)) {
                if (fVar2 == f.UNKNOWN) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                g0.c.g("Unhandled input format: " + fVar2, z7);
                if (d7.a()) {
                    hVar = new g("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    d dVar2 = (d) map.get(fVar);
                    if (dVar2 != null) {
                        hVar = new h(d7, dVar2);
                    } else {
                        hVar = new h(d7, fVar);
                    }
                }
            } else {
                hVar = new h(d7, fVar2);
            }
            Log.d("GLUtils", "Shader program for input format " + fVar2 + " created: " + hVar);
            hashMap.put(fVar2, hVar);
        }
        return hashMap;
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i7 = iArr[0];
        GLES20.glBindTexture(36197, i7);
        b("glBindTexture " + i7);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i7;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            return AbstractC0059i.A(group, ".", group2);
        }
        return "0.0";
    }

    public static int k(int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        b("glCreateShader type=" + i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        org.slf4j.helpers.i.O("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Could not compile shader type ", i7, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        k2.append(GLES20.glGetShaderInfoLog(glCreateShader));
        throw new IllegalStateException(k2.toString());
    }
}
