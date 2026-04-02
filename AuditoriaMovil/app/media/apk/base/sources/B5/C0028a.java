package B5;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.PriorityQueue;
/* renamed from: B5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028a {
    public static final Matrix f = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.m f343a;

    /* renamed from: b  reason: collision with root package name */
    public final A.f f344b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f345c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f346d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public int f347e;

    public C0028a(io.flutter.embedding.engine.renderer.m mVar, boolean z7) {
        this.f343a = mVar;
        if (A.f.f8d == null) {
            A.f.f8d = new A.f();
        }
        this.f344b = A.f.f8d;
        this.f345c = z7;
    }

    public static int b(int i7) {
        if (i7 == 0) {
            return 4;
        }
        if (i7 == 1) {
            return 6;
        }
        if (i7 == 5) {
            return 4;
        }
        if (i7 == 6) {
            return 6;
        }
        if (i7 == 2) {
            return 5;
        }
        if (i7 == 7) {
            return 3;
        }
        if (i7 == 3) {
            return 0;
        }
        if (i7 == 8) {
            return 3;
        }
        return -1;
    }

    public final void a(MotionEvent motionEvent, int i7, int i8, int i9, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i10;
        int i11;
        long j;
        int i12;
        long j8;
        int i13;
        float[] fArr;
        double d7;
        double d8;
        MotionEvent motionEvent2;
        double d9;
        double d10;
        double d11;
        C0028a c0028a;
        float c8;
        float c9;
        float scaledHorizontalScrollFactor;
        InputDevice.MotionRange motionRange;
        if (i8 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i7);
        int toolType = motionEvent.getToolType(i7);
        if (toolType != 1) {
            if (toolType != 2) {
                i10 = 3;
                if (toolType != 3) {
                    if (toolType != 4) {
                        i10 = 5;
                    }
                } else {
                    i10 = 1;
                }
            } else {
                i10 = 2;
            }
        } else {
            i10 = 0;
        }
        float[] fArr2 = {motionEvent.getX(i7), motionEvent.getY(i7)};
        matrix.mapPoints(fArr2);
        HashMap hashMap = this.f346d;
        if (i10 == 1) {
            j = motionEvent.getButtonState() & 31;
            if (j == 0 && motionEvent.getSource() == 8194) {
                i11 = 4;
                if (i8 == 4) {
                    hashMap.put(Integer.valueOf(pointerId), fArr2);
                }
            } else {
                i11 = 4;
            }
        } else {
            i11 = 4;
            j = i10 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            if (i8 == i11) {
                i12 = 7;
            } else if (i8 == 5) {
                i12 = 8;
            } else if (i8 != 6 && i8 != 0) {
                i12 = -1;
            } else {
                i12 = 9;
            }
            if (i12 == -1) {
                return;
            }
        } else {
            i12 = -1;
        }
        if (this.f345c) {
            A.f fVar = this.f344b;
            fVar.getClass();
            j8 = V.f341b.incrementAndGet();
            ((LongSparseArray) fVar.f10b).put(j8, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) fVar.f11c).add(Long.valueOf(j8));
        } else {
            j8 = 0;
        }
        if (motionEvent.getActionMasked() == 8) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        long j9 = j;
        byteBuffer.putLong(j8);
        byteBuffer.putLong(motionEvent.getEventTime() * 1000);
        if (containsKey) {
            byteBuffer.putLong(i12);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i8);
            byteBuffer.putLong(i10);
        }
        byteBuffer.putLong(i13);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr3[0]);
            byteBuffer.putDouble(fArr3[1]);
        } else {
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j9);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i7));
        if (motionEvent.getDevice() != null && (motionRange = motionEvent.getDevice().getMotionRange(2)) != null) {
            d7 = motionRange.getMin();
            fArr = fArr2;
            d8 = motionRange.getMax();
        } else {
            fArr = fArr2;
            d7 = 0.0d;
            d8 = 1.0d;
        }
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(d8);
        if (i10 == 2) {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, i7));
            byteBuffer.putDouble(0.0d);
        } else {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i7));
        byteBuffer.putDouble(motionEvent.getToolMajor(i7));
        byteBuffer.putDouble(motionEvent.getToolMinor(i7));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, i7));
        if (i10 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, i7));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(i9);
        if (i13 == 1) {
            if (context != null) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 26) {
                    scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c8 = scaledHorizontalScrollFactor;
                    c0028a = this;
                } else {
                    c0028a = this;
                    c8 = c0028a.c(context);
                }
                d10 = c8;
                if (i14 >= 26) {
                    c9 = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
                } else {
                    c9 = c0028a.c(context);
                }
                d11 = c9;
            } else {
                d10 = 48.0d;
                d11 = 48.0d;
            }
            byteBuffer.putDouble(d10 * (-motionEvent2.getAxisValue(10, i7)));
            byteBuffer.putDouble(d11 * (-motionEvent2.getAxisValue(9, i7)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr4 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr4[0]);
            byteBuffer.putDouble(fArr[1] - fArr4[1]);
            d9 = 0.0d;
        } else {
            d9 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d9);
        byteBuffer.putLong(0L);
        if (containsKey && i12 == 9) {
            hashMap.remove(Integer.valueOf(pointerId));
        }
    }

    public final int c(Context context) {
        if (this.f347e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 48;
            }
            this.f347e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f347e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r4 != 4) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.MotionEvent r16, android.graphics.Matrix r17) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.C0028a.d(android.view.MotionEvent, android.graphics.Matrix):void");
    }
}
