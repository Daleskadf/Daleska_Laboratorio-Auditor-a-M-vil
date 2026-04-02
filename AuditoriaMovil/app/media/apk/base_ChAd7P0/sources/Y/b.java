package Y;

import A3.N;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import e0.C0930e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.metadata.Font;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f6552a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f6553b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f6554c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    public static final float[][] f6555d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int a(Context context, int i7, int i8) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i7, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i7;
        }
        return i8;
    }

    public static N b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7) {
        N n7;
        if (e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i8 = typedValue.type;
            if (i8 >= 28 && i8 <= 31) {
                return new N((Object) null, typedValue.data, 6, (Object) null);
            }
            try {
                n7 = N.e(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme);
            } catch (Exception e7) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e7);
                n7 = null;
            }
            if (n7 != null) {
                return n7;
            }
        }
        return new N((Object) null, 0, 6, (Object) null);
    }

    public static String c(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i7) {
        if (!e(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i7);
    }

    public static String d(TypedArray typedArray, int i7, int i8) {
        String string = typedArray.getString(i7);
        if (string == null) {
            return typedArray.getString(i8);
        }
        return string;
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int f(float f) {
        float f4;
        boolean z7;
        float f8;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f9 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            f4 = f9 * f9 * f9;
        } else {
            f4 = f / 903.2963f;
        }
        float f10 = f9 * f9 * f9;
        if (f10 > 0.008856452f) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            f8 = f10;
        } else {
            f8 = ((f9 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z7) {
            f10 = ((f9 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f6554c;
        return Z.a.a(f8 * fArr[0], f4 * fArr[1], f10 * fArr[2]);
    }

    public static float g(int i7) {
        float pow;
        float f = i7 / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static d i(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i7;
        boolean z7;
        int i8;
        int i9;
        C0930e c0930e;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), V.a.f5788b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(5);
                String string3 = obtainAttributes.getString(6);
                String string4 = obtainAttributes.getString(2);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(3, 1);
                int integer2 = obtainAttributes.getInteger(4, 500);
                String string5 = obtainAttributes.getString(7);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        k(xmlResourceParser);
                    }
                    List j = j(resources, resourceId);
                    if (string4 != null) {
                        c0930e = new C0930e(string, string2, string4, j);
                    } else {
                        c0930e = null;
                    }
                    return new g(new C0930e(string, string2, string3, j), c0930e, integer, integer2, string5);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals(Font.PREFIX_FONT_META)) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), V.a.f5789c);
                            int i10 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i10 = 1;
                            }
                            int i11 = obtainAttributes2.getInt(i10, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i7 = 6;
                            } else {
                                i7 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i7, 0)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            int i12 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i12 = 3;
                            }
                            if (obtainAttributes2.hasValue(7)) {
                                i8 = 7;
                            } else {
                                i8 = 4;
                            }
                            String string6 = obtainAttributes2.getString(i8);
                            int i13 = obtainAttributes2.getInt(i12, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i9 = 5;
                            } else {
                                i9 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i9, 0);
                            String string7 = obtainAttributes2.getString(i9);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                k(xmlResourceParser);
                            }
                            arrayList.add(new f(i11, i13, resourceId2, string7, string6, z7));
                        } else {
                            k(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new e((f[]) arrayList.toArray(new f[0]));
                }
            } else {
                k(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List j(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i7);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void k(XmlResourceParser xmlResourceParser) {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i7--;
                }
            } else {
                i7++;
            }
        }
    }

    public static float l() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
