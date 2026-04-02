package F5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1197a = d.class.getName().concat(".aot-shared-library-name");

    /* renamed from: b  reason: collision with root package name */
    public static final String f1198b = d.class.getName().concat(".vm-snapshot-data");

    /* renamed from: c  reason: collision with root package name */
    public static final String f1199c = d.class.getName().concat(".isolate-snapshot-data");

    /* renamed from: d  reason: collision with root package name */
    public static final String f1200d = d.class.getName().concat(".flutter-assets-dir");

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, D5.b] */
    public static D5.b a(Context context) {
        String string;
        String string2;
        int i7;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF);
            Bundle bundle = applicationInfo.metaData;
            String str = null;
            if (bundle == null) {
                string = null;
            } else {
                string = bundle.getString(f1197a, null);
            }
            Bundle bundle2 = applicationInfo.metaData;
            if (bundle2 != null) {
                bundle2.getString(f1198b, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            if (bundle3 != null) {
                bundle3.getString(f1199c, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            if (bundle4 == null) {
                string2 = null;
            } else {
                string2 = bundle4.getString(f1200d, null);
            }
            Bundle bundle5 = applicationInfo.metaData;
            boolean z7 = true;
            if (bundle5 != null && (i7 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i7);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                b(xml, jSONArray, false);
                            }
                        }
                    }
                    str = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str2 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            if (bundle6 != null) {
                z7 = bundle6.getBoolean("io.flutter.automatically-register-plugins", true);
            }
            ?? obj = new Object();
            if (string == null) {
                string = "libapp.so";
            }
            obj.f868b = string;
            if (string2 == null) {
                string2 = "flutter_assets";
            }
            obj.f869c = string2;
            obj.f871e = str2;
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            obj.f870d = str;
            obj.f867a = z7;
            return obj;
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void b(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z7) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z7);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() == 4) {
                        String trim = xmlResourceParser.getText().trim();
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(trim);
                        jSONArray2.put(attributeBooleanValue2);
                        jSONArray2.put(attributeBooleanValue);
                        jSONArray.put(jSONArray2);
                        xmlResourceParser.next();
                        if (xmlResourceParser.getEventType() != 3) {
                            throw new IllegalStateException("Expected end of domain tag");
                        }
                    } else {
                        throw new IllegalStateException("Expected text");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    b(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
