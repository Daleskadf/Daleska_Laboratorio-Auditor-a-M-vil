package d2;

import a.AbstractC0412a;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
/* renamed from: d2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0887a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f10221a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f10222b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f10223c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f10224d = {16842755, 16843781, 16844062};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f10225e = {16843161};
    public static final int[] f = {16842755, 16843213};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f10226g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f10227h = {16843490};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f10228i = {16843486, 16843487, 16843488, 16843489};
    public static final int[] j = {16842788, 16843073, 16843488, 16843992};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f10229k = {16843489, 16843781, 16843892, 16843893};

    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a4, code lost:
        if (r31 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03a6, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a8, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b7, code lost:
        if (r3.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b9, code lost:
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03c5, code lost:
        if (r32 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03c7, code lost:
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03cb, code lost:
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03ce, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.AbstractC0887a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* JADX WARN: Type inference failed for: r11v26, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.animation.TypeEvaluator, java.lang.Object] */
    public static PropertyValuesHolder b(TypedArray typedArray, int i7, int i8, int i9, String str) {
        boolean z7;
        int i10;
        boolean z8;
        int i11;
        boolean z9;
        C0893g c0893g;
        int i12;
        int i13;
        int i14;
        float f4;
        PropertyValuesHolder ofFloat;
        float f8;
        float f9;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i8);
        if (peekValue != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            i10 = peekValue.type;
        } else {
            i10 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i9);
        if (peekValue2 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i11 = peekValue2.type;
        } else {
            i11 = 0;
        }
        if (i7 == 4) {
            if ((z7 && c(i10)) || (z8 && c(i11))) {
                i7 = 3;
            } else {
                i7 = 0;
            }
        }
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i7 == 2) {
            String string = typedArray.getString(i8);
            String string2 = typedArray.getString(i9);
            Z.e[] k2 = AbstractC0412a.k(string);
            Z.e[] k8 = AbstractC0412a.k(string2);
            if (k2 == null && k8 == null) {
                return null;
            }
            if (k2 != null) {
                ?? obj = new Object();
                if (k8 != null) {
                    if (AbstractC0412a.c(k2, k8)) {
                        ofObject = PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, k2, k8);
                    } else {
                        throw new InflateException(io.flutter.plugins.pathprovider.b.i(" Can't morph from ", string, " to ", string2));
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, k2);
                }
                return ofObject;
            } else if (k8 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), k8);
            }
        }
        if (i7 == 3) {
            c0893g = C0893g.f10241a;
        } else {
            c0893g = null;
        }
        if (z9) {
            if (z7) {
                if (i10 == 5) {
                    f8 = typedArray.getDimension(i8, 0.0f);
                } else {
                    f8 = typedArray.getFloat(i8, 0.0f);
                }
                if (z8) {
                    if (i11 == 5) {
                        f9 = typedArray.getDimension(i9, 0.0f);
                    } else {
                        f9 = typedArray.getFloat(i9, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f8, f9);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f8);
                }
            } else {
                if (i11 == 5) {
                    f4 = typedArray.getDimension(i9, 0.0f);
                } else {
                    f4 = typedArray.getFloat(i9, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f4);
            }
            propertyValuesHolder = ofFloat;
        } else if (z7) {
            if (i10 == 5) {
                i13 = (int) typedArray.getDimension(i8, 0.0f);
            } else if (c(i10)) {
                i13 = typedArray.getColor(i8, 0);
            } else {
                i13 = typedArray.getInt(i8, 0);
            }
            if (z8) {
                if (i11 == 5) {
                    i14 = (int) typedArray.getDimension(i9, 0.0f);
                } else if (c(i11)) {
                    i14 = typedArray.getColor(i9, 0);
                } else {
                    i14 = typedArray.getInt(i9, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i13, i14);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i13);
            }
        } else if (z8) {
            if (i11 == 5) {
                i12 = (int) typedArray.getDimension(i9, 0.0f);
            } else if (c(i11)) {
                i12 = typedArray.getColor(i9, 0);
            } else {
                i12 = typedArray.getInt(i9, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i12);
        }
        if (propertyValuesHolder != null && c0893g != null) {
            propertyValuesHolder.setEvaluator(c0893g);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i7) {
        if (i7 >= 28 && i7 <= 31) {
            return true;
        }
        return false;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        int i7;
        int i8;
        int i9;
        int i10;
        ValueAnimator valueAnimator2;
        int i11;
        TypedArray typedArray;
        TypedArray typedArray2;
        int resourceId;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z7;
        int i12;
        boolean z8;
        int i13;
        TypedArray h8 = Y.b.h(resources, theme, attributeSet, f10226g);
        TypedArray h9 = Y.b.h(resources, theme, attributeSet, f10229k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        int i14 = 300;
        if (Y.b.e(xmlResourceParser, "duration")) {
            i14 = h8.getInt(1, 300);
        }
        long j8 = i14;
        if (!Y.b.e(xmlResourceParser, "startOffset")) {
            i7 = 0;
        } else {
            i7 = h8.getInt(2, 0);
        }
        long j9 = i7;
        if (!Y.b.e(xmlResourceParser, "valueType")) {
            i8 = 4;
        } else {
            i8 = h8.getInt(7, 4);
        }
        if (Y.b.e(xmlResourceParser, "valueFrom") && Y.b.e(xmlResourceParser, "valueTo")) {
            if (i8 == 4) {
                TypedValue peekValue = h8.peekValue(5);
                if (peekValue != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    i12 = peekValue.type;
                } else {
                    i12 = 0;
                }
                TypedValue peekValue2 = h8.peekValue(6);
                if (peekValue2 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i13 = peekValue2.type;
                } else {
                    i13 = 0;
                }
                if ((z7 && c(i12)) || (z8 && c(i13))) {
                    i8 = 3;
                } else {
                    i8 = 0;
                }
            }
            PropertyValuesHolder b5 = b(h8, i8, 5, 6, StringUtils.EMPTY);
            if (b5 != null) {
                valueAnimator.setValues(b5);
            }
        }
        valueAnimator.setDuration(j8);
        valueAnimator.setStartDelay(j9);
        if (!Y.b.e(xmlResourceParser, "repeatCount")) {
            i9 = 0;
        } else {
            i9 = h8.getInt(3, 0);
        }
        valueAnimator.setRepeatCount(i9);
        if (!Y.b.e(xmlResourceParser, "repeatMode")) {
            i10 = 1;
        } else {
            i10 = h8.getInt(4, 1);
        }
        valueAnimator.setRepeatMode(i10);
        if (h9 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String c8 = Y.b.c(h9, xmlResourceParser, "pathData", 1);
            if (c8 != null) {
                String c9 = Y.b.c(h9, xmlResourceParser, "propertyXName", 2);
                String c10 = Y.b.c(h9, xmlResourceParser, "propertyYName", 3);
                if (c9 == null && c10 == null) {
                    throw new InflateException(h9.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    Z.e.b(AbstractC0412a.k(c8), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float f4 = 0.0f;
                    while (true) {
                        f4 += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(f4));
                        if (!pathMeasure.nextContour()) {
                            break;
                        }
                        valueAnimator = valueAnimator;
                    }
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int min = Math.min(100, ((int) (f4 / 0.5f)) + 1);
                    float[] fArr = new float[min];
                    float[] fArr2 = new float[min];
                    float[] fArr3 = new float[2];
                    float f8 = f4 / (min - 1);
                    valueAnimator2 = valueAnimator;
                    typedArray = h8;
                    int i15 = 0;
                    int i16 = 0;
                    float f9 = 0.0f;
                    while (true) {
                        propertyValuesHolder = null;
                        if (i16 >= min) {
                            break;
                        }
                        int i17 = min;
                        pathMeasure2.getPosTan(f9 - ((Float) arrayList.get(i15)).floatValue(), fArr3, null);
                        fArr[i16] = fArr3[0];
                        fArr2[i16] = fArr3[1];
                        f9 += f8;
                        int i18 = i15 + 1;
                        if (i18 < arrayList.size() && f9 > ((Float) arrayList.get(i18)).floatValue()) {
                            pathMeasure2.nextContour();
                            i15 = i18;
                        }
                        i16++;
                        min = i17;
                    }
                    if (c9 != null) {
                        propertyValuesHolder2 = PropertyValuesHolder.ofFloat(c9, fArr);
                    } else {
                        propertyValuesHolder2 = null;
                    }
                    if (c10 != null) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(c10, fArr2);
                    }
                    if (propertyValuesHolder2 == null) {
                        objectAnimator2.setValues(propertyValuesHolder);
                    } else if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                    i11 = 0;
                } catch (RuntimeException e7) {
                    throw new RuntimeException("Error in parsing ".concat(c8), e7);
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = h8;
                i11 = 0;
                objectAnimator2.setPropertyName(Y.b.c(h9, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            i11 = 0;
            typedArray = h8;
        }
        if (!Y.b.e(xmlResourceParser, "interpolator")) {
            resourceId = i11;
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(i11, i11);
        }
        if (resourceId > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (h9 != null) {
            h9.recycle();
        }
        return valueAnimator3;
    }
}
