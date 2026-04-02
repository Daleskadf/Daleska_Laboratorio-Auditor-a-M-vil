package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i.AbstractC1091a;
import java.io.IOException;
import o.MenuC1545i;
import org.xmlpull.v1.XmlPullParserException;
import p.O;
/* renamed from: n.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1457d extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f14122e;
    public static final Class[] f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f14123a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f14124b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f14125c;

    /* renamed from: d  reason: collision with root package name */
    public Object f14126d;

    static {
        Class[] clsArr = {Context.class};
        f14122e = clsArr;
        f = clsArr;
    }

    public C1457d(Context context) {
        super(context);
        this.f14125c = context;
        Object[] objArr = {context};
        this.f14123a = objArr;
        this.f14124b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        int i7;
        boolean z7;
        char charAt;
        char charAt2;
        boolean z8;
        ColorStateList colorStateList;
        int resourceId;
        C1456c c1456c = new C1456c(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i7 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        while (!z9) {
            if (eventType != r42) {
                if (eventType != i7) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z10 && name2.equals(str)) {
                            z7 = r42;
                            z10 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            r42 = z7;
                            i7 = 2;
                            z10 = z10;
                        } else if (name2.equals("group")) {
                            c1456c.f14099b = 0;
                            c1456c.f14100c = 0;
                            c1456c.f14101d = 0;
                            c1456c.f14102e = 0;
                            c1456c.f = r42;
                            c1456c.f14103g = r42;
                        } else if (name2.equals("item")) {
                            if (!c1456c.f14104h) {
                                c1456c.f14104h = r42;
                                c1456c.b(c1456c.f14098a.add(c1456c.f14099b, c1456c.f14105i, c1456c.j, c1456c.f14106k));
                            }
                        } else if (name2.equals("menu")) {
                            z7 = r42;
                            z9 = z7;
                        }
                    }
                    z7 = r42;
                } else {
                    if (!z10) {
                        String name3 = xmlResourceParser.getName();
                        boolean equals = name3.equals("group");
                        C1457d c1457d = c1456c.f14097D;
                        if (equals) {
                            TypedArray obtainStyledAttributes = c1457d.f14125c.obtainStyledAttributes(attributeSet, AbstractC1091a.f11360l);
                            c1456c.f14099b = obtainStyledAttributes.getResourceId(r42, 0);
                            c1456c.f14100c = obtainStyledAttributes.getInt(3, 0);
                            c1456c.f14101d = obtainStyledAttributes.getInt(4, 0);
                            c1456c.f14102e = obtainStyledAttributes.getInt(5, 0);
                            c1456c.f = obtainStyledAttributes.getBoolean(2, r42);
                            c1456c.f14103g = obtainStyledAttributes.getBoolean(0, r42);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                Context context = c1457d.f14125c;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1091a.f11361m);
                                c1456c.f14105i = obtainStyledAttributes2.getResourceId(2, 0);
                                c1456c.j = (obtainStyledAttributes2.getInt(5, c1456c.f14100c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c1456c.f14101d) & 65535);
                                c1456c.f14106k = obtainStyledAttributes2.getText(7);
                                c1456c.f14107l = obtainStyledAttributes2.getText(8);
                                c1456c.f14108m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                c1456c.f14109n = charAt;
                                c1456c.f14110o = obtainStyledAttributes2.getInt(16, RecognitionOptions.AZTEC);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                c1456c.f14111p = charAt2;
                                c1456c.f14112q = obtainStyledAttributes2.getInt(20, RecognitionOptions.AZTEC);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    c1456c.f14113r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    c1456c.f14113r = c1456c.f14102e;
                                }
                                c1456c.f14114s = obtainStyledAttributes2.getBoolean(3, false);
                                c1456c.f14115t = obtainStyledAttributes2.getBoolean(4, c1456c.f);
                                c1456c.f14116u = obtainStyledAttributes2.getBoolean(1, c1456c.f14103g);
                                c1456c.f14117v = obtainStyledAttributes2.getInt(21, -1);
                                c1456c.f14120y = obtainStyledAttributes2.getString(12);
                                c1456c.f14118w = obtainStyledAttributes2.getResourceId(13, 0);
                                c1456c.f14119x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8 && c1456c.f14118w == 0 && c1456c.f14119x == null) {
                                    if (c1456c.a(string3, f, c1457d.f14124b) != null) {
                                        throw new ClassCastException();
                                    }
                                } else if (z8) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c1456c.f14121z = obtainStyledAttributes2.getText(17);
                                c1456c.f14094A = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    c1456c.f14096C = O.c(obtainStyledAttributes2.getInt(19, -1), c1456c.f14096C);
                                } else {
                                    c1456c.f14096C = null;
                                }
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = X.d.getColorStateList(context, resourceId)) == null) {
                                        colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                    }
                                    c1456c.f14095B = colorStateList;
                                } else {
                                    c1456c.f14095B = null;
                                }
                                obtainStyledAttributes2.recycle();
                                c1456c.f14104h = false;
                                z7 = true;
                            } else if (name3.equals("menu")) {
                                z7 = true;
                                c1456c.f14104h = true;
                                SubMenu addSubMenu = c1456c.f14098a.addSubMenu(c1456c.f14099b, c1456c.f14105i, c1456c.j, c1456c.f14106k);
                                c1456c.b(addSubMenu.getItem());
                                b(xmlResourceParser, attributeSet, addSubMenu);
                            } else {
                                z7 = true;
                                str = name3;
                                z10 = true;
                            }
                            eventType = xmlResourceParser.next();
                            r42 = z7;
                            i7 = 2;
                            z10 = z10;
                        }
                    }
                    z7 = r42;
                }
                eventType = xmlResourceParser.next();
                r42 = z7;
                i7 = 2;
                z10 = z10;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof MenuC1545i)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f14125c.getResources().getLayout(i7);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
