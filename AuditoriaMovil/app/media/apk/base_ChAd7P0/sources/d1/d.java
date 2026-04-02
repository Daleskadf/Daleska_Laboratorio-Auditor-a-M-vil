package d1;

import H0.J;
import android.util.Pair;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f10195a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10196b;

    /* renamed from: c  reason: collision with root package name */
    public final d f10197c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedList f10198d = new LinkedList();

    public d(d dVar, String str, String str2) {
        this.f10197c = dVar;
        this.f10195a = str;
        this.f10196b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e7) {
                throw J.b(null, e7);
            }
        }
        return -1;
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e7) {
                throw J.b(null, e7);
            }
        }
        return j;
    }

    public static int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e7) {
                throw J.b(null, e7);
            }
        }
        throw new e(str, 0);
    }

    public abstract Object b();

    public final Object c(String str) {
        int i7 = 0;
        while (true) {
            LinkedList linkedList = this.f10198d;
            if (i7 < linkedList.size()) {
                Pair pair = (Pair) linkedList.get(i7);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
                i7++;
            } else {
                d dVar = this.f10197c;
                if (dVar == null) {
                    return null;
                }
                return dVar.c(str);
            }
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) {
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType != 2) {
                if (eventType != 3) {
                    if (eventType == 4 && z7 && i7 == 0) {
                        k(xmlPullParser);
                    }
                } else if (!z7) {
                    continue;
                } else if (i7 > 0) {
                    i7--;
                } else {
                    String name = xmlPullParser.getName();
                    f(xmlPullParser);
                    if (!d(name)) {
                        return b();
                    }
                }
            } else {
                String name2 = xmlPullParser.getName();
                if (this.f10196b.equals(name2)) {
                    j(xmlPullParser);
                    z7 = true;
                } else if (z7) {
                    if (i7 > 0) {
                        i7++;
                    } else if (d(name2)) {
                        j(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name2);
                        String str = this.f10195a;
                        if (equals) {
                            dVar = new d(this, str, "QualityLevel");
                        } else if ("Protection".equals(name2)) {
                            dVar = new d(this, str, "Protection");
                        } else if ("StreamIndex".equals(name2)) {
                            dVar = new i(this, str);
                        }
                        if (dVar == null) {
                            i7 = 1;
                        } else {
                            a(dVar.e(xmlPullParser));
                        }
                    }
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public final void l(Object obj, String str) {
        this.f10198d.add(Pair.create(str, obj));
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
