package K5;

import H4.e1;
import H4.p1;
import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import org.apache.tika.utils.XMLReaderUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2745a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2746b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2747c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2748d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2749e;
    public final y f;

    /* renamed from: g  reason: collision with root package name */
    public final x f2750g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f2751h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2752i;
    public final E.e j;

    /* renamed from: k  reason: collision with root package name */
    public final String[] f2753k;

    /* renamed from: l  reason: collision with root package name */
    public final w[] f2754l;

    public w(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, y yVar, x xVar, Integer num, String str, E.e eVar, String[] strArr, w[] wVarArr) {
        this.f2745a = z7;
        this.f2746b = z8;
        this.f2747c = z9;
        this.f2748d = z10;
        this.f2749e = z11;
        this.f = yVar;
        this.f2750g = xVar;
        this.f2751h = num;
        this.f2752i = str;
        this.j = eVar;
        this.f2753k = strArr;
        this.f2754l = wVarArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static w a(JSONObject jSONObject) {
        Object obj;
        Object obj2;
        int i7;
        w[] wVarArr;
        char c8;
        Integer num;
        JSONArray jSONArray;
        String string;
        x xVar;
        E.e eVar;
        Object obj3;
        Object obj4;
        String str;
        char c9;
        char c10;
        String str2 = "password";
        String string2 = jSONObject.getString("inputAction");
        if (string2 != null) {
            String str3 = null;
            if (jSONObject.isNull("fields")) {
                obj = "newPassword";
                obj2 = "creditCardExpirationMonth";
                i7 = 1;
                wVarArr = null;
            } else {
                JSONArray jSONArray2 = jSONObject.getJSONArray("fields");
                int length = jSONArray2.length();
                obj2 = "creditCardExpirationMonth";
                w[] wVarArr2 = new w[length];
                obj = "newPassword";
                for (int i8 = 0; i8 < length; i8++) {
                    wVarArr2[i8] = a(jSONArray2.getJSONObject(i8));
                }
                i7 = 1;
                wVarArr = wVarArr2;
            }
            int valueOf = Integer.valueOf(i7);
            switch (string2.hashCode()) {
                case -737377923:
                    if (string2.equals("TextInputAction.done")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -737089298:
                    if (string2.equals("TextInputAction.next")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -737080013:
                    if (string2.equals("TextInputAction.none")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -736940669:
                    if (string2.equals("TextInputAction.send")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 469250275:
                    if (string2.equals("TextInputAction.search")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1241689507:
                    if (string2.equals("TextInputAction.go")) {
                        c8 = 5;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1539450297:
                    if (string2.equals("TextInputAction.newline")) {
                        c8 = 6;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2110497650:
                    if (string2.equals("TextInputAction.previous")) {
                        c8 = 7;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
                case 0:
                    valueOf = 6;
                    num = valueOf;
                    break;
                case 1:
                    valueOf = 5;
                    num = valueOf;
                    break;
                case 2:
                case 6:
                    num = valueOf;
                    break;
                case 3:
                    valueOf = 4;
                    num = valueOf;
                    break;
                case 4:
                    valueOf = 3;
                    num = valueOf;
                    break;
                case 5:
                    valueOf = 2;
                    num = valueOf;
                    break;
                case 7:
                    valueOf = 7;
                    num = valueOf;
                    break;
                default:
                    num = 0;
                    break;
            }
            ArrayList arrayList = new ArrayList();
            if (jSONObject.isNull("contentCommitMimeTypes")) {
                jSONArray = null;
            } else {
                jSONArray = jSONObject.getJSONArray("contentCommitMimeTypes");
            }
            if (jSONArray != null) {
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    arrayList.add(jSONArray.optString(i9));
                }
            }
            boolean optBoolean = jSONObject.optBoolean("obscureText");
            boolean optBoolean2 = jSONObject.optBoolean("autocorrect", true);
            boolean optBoolean3 = jSONObject.optBoolean("enableSuggestions");
            boolean optBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
            boolean optBoolean5 = jSONObject.optBoolean("enableDeltaModel");
            y a7 = y.a(jSONObject.getString("textCapitalization"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("inputType");
            int i10 = 0;
            Object obj5 = "creditCardSecurityCode";
            x xVar2 = new x(A.a(jSONObject2.getString("name")), jSONObject2.optBoolean("signed", false), jSONObject2.optBoolean("decimal", false));
            if (jSONObject.isNull("actionLabel")) {
                string = null;
            } else {
                string = jSONObject.getString("actionLabel");
            }
            if (jSONObject.isNull("autofill")) {
                xVar = xVar2;
                eVar = null;
            } else {
                JSONObject jSONObject3 = jSONObject.getJSONObject("autofill");
                String string3 = jSONObject3.getString("uniqueIdentifier");
                JSONArray jSONArray3 = jSONObject3.getJSONArray("hints");
                if (!jSONObject3.isNull("hintText")) {
                    str3 = jSONObject3.getString("hintText");
                }
                String str4 = str3;
                JSONObject jSONObject4 = jSONObject3.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray3.length()];
                xVar = xVar2;
                while (i10 < jSONArray3.length()) {
                    String string4 = jSONArray3.getString(i10);
                    JSONArray jSONArray4 = jSONArray3;
                    String str5 = string3;
                    if (Build.VERSION.SDK_INT < 26) {
                        obj3 = obj5;
                        obj4 = obj;
                        str = str2;
                    } else {
                        string4.getClass();
                        switch (string4.hashCode()) {
                            case -2058889126:
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                if (string4.equals("birthdayYear")) {
                                    c9 = 0;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case -1917283616:
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                if (string4.equals("oneTimeCode")) {
                                    c9 = 1;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case -1844815832:
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                Object obj6 = obj2;
                                if (!string4.equals(obj6)) {
                                    obj2 = obj6;
                                    c9 = 65535;
                                    break;
                                } else {
                                    obj2 = obj6;
                                    c9 = 2;
                                    break;
                                }
                            case -1825589953:
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                if (string4.equals("telephoneNumberNational")) {
                                    c9 = 3;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case -1821235109:
                                obj3 = obj5;
                                obj4 = obj;
                                if (string4.equals(obj4)) {
                                    str = str2;
                                    c9 = 4;
                                    break;
                                }
                                str = str2;
                                c9 = 65535;
                                break;
                            case -1757573738:
                                obj3 = obj5;
                                str = str2;
                                if (!string4.equals(obj3)) {
                                    obj4 = obj;
                                    c9 = 65535;
                                    break;
                                } else {
                                    c9 = 5;
                                    obj4 = obj;
                                    break;
                                }
                            case -1682373820:
                                if (string4.equals("creditCardExpirationDay")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c9 = 6;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -1658955742:
                                if (string4.equals("fullStreetAddress")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c9 = 7;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -1567118045:
                                if (string4.equals("telephoneNumberDevice")) {
                                    c10 = '\b';
                                    obj4 = obj;
                                    Object obj7 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj7;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -1476752575:
                                if (string4.equals("countryName")) {
                                    c10 = '\t';
                                    obj4 = obj;
                                    Object obj72 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj72;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -1413737489:
                                if (string4.equals("middleInitial")) {
                                    c10 = '\n';
                                    obj4 = obj;
                                    Object obj722 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj722;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -1377792129:
                                if (string4.equals("addressCity")) {
                                    c10 = 11;
                                    obj4 = obj;
                                    Object obj7222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj7222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -1249512767:
                                if (string4.equals("gender")) {
                                    c10 = '\f';
                                    obj4 = obj;
                                    Object obj72222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj72222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -1186060294:
                                if (string4.equals("postalAddressExtendedPostalCode")) {
                                    c10 = '\r';
                                    obj4 = obj;
                                    Object obj722222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj722222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -1151034798:
                                if (string4.equals("creditCardNumber")) {
                                    c10 = 14;
                                    obj4 = obj;
                                    Object obj7222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj7222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -835992323:
                                if (string4.equals("namePrefix")) {
                                    c10 = 15;
                                    obj4 = obj;
                                    Object obj72222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj72222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -818219584:
                                if (string4.equals("middleName")) {
                                    c10 = 16;
                                    obj4 = obj;
                                    Object obj722222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj722222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -747304516:
                                if (string4.equals("nameSuffix")) {
                                    c10 = 17;
                                    obj4 = obj;
                                    Object obj7222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj7222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -613980922:
                                if (string4.equals("creditCardExpirationDate")) {
                                    c10 = 18;
                                    obj4 = obj;
                                    Object obj72222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj72222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -613352043:
                                if (string4.equals("creditCardExpirationYear")) {
                                    c10 = 19;
                                    obj4 = obj;
                                    Object obj722222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj722222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -549230602:
                                if (string4.equals("telephoneNumberCountryCode")) {
                                    c10 = 20;
                                    obj4 = obj;
                                    Object obj7222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj7222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case -265713450:
                                if (string4.equals("username")) {
                                    c10 = 21;
                                    obj4 = obj;
                                    Object obj72222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj72222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 3373707:
                                if (string4.equals("name")) {
                                    c10 = 22;
                                    obj4 = obj;
                                    Object obj722222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj722222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 96619420:
                                if (string4.equals("email")) {
                                    c10 = 23;
                                    obj4 = obj;
                                    Object obj7222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj7222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 253202685:
                                if (string4.equals("addressState")) {
                                    c10 = 24;
                                    obj4 = obj;
                                    Object obj72222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj72222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 588174851:
                                if (string4.equals("birthdayMonth")) {
                                    c10 = 25;
                                    obj4 = obj;
                                    Object obj722222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj722222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 798554127:
                                if (string4.equals("familyName")) {
                                    obj3 = obj5;
                                    str = str2;
                                    c9 = 26;
                                    obj4 = obj;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 892233837:
                                if (string4.equals("telephoneNumber")) {
                                    c10 = 27;
                                    obj4 = obj;
                                    Object obj7222222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj7222222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 991032982:
                                if (string4.equals("newUsername")) {
                                    c10 = 28;
                                    obj4 = obj;
                                    Object obj72222222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj72222222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 1069376125:
                                if (string4.equals("birthday")) {
                                    c10 = 29;
                                    obj4 = obj;
                                    Object obj722222222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj722222222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 1216985755:
                                if (string4.equals(str2)) {
                                    c10 = 30;
                                    obj4 = obj;
                                    Object obj7222222222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj7222222222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 1469046696:
                                if (string4.equals("givenName")) {
                                    c10 = 31;
                                    obj4 = obj;
                                    Object obj72222222222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj72222222222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 1662667945:
                                if (string4.equals("postalAddress")) {
                                    c10 = ' ';
                                    obj4 = obj;
                                    Object obj722222222222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj722222222222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 1921869058:
                                if (string4.equals("postalAddressExtended")) {
                                    c10 = '!';
                                    obj4 = obj;
                                    Object obj7222222222222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj7222222222222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 2011152728:
                                if (string4.equals("postalCode")) {
                                    c10 = '\"';
                                    obj4 = obj;
                                    Object obj72222222222222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj72222222222222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            case 2011773919:
                                if (string4.equals("birthdayDay")) {
                                    c10 = '#';
                                    obj4 = obj;
                                    Object obj722222222222222222222222222 = obj5;
                                    str = str2;
                                    c9 = c10;
                                    obj3 = obj722222222222222222222222222;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                            default:
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c9 = 65535;
                                break;
                        }
                        switch (c9) {
                            case 0:
                                string4 = "birthDateYear";
                                continue;
                            case 1:
                                string4 = "smsOTPCode";
                                continue;
                            case 2:
                                string4 = obj2;
                                continue;
                            case 3:
                                string4 = "phoneNational";
                                continue;
                            case 4:
                                string4 = obj4;
                                continue;
                            case 5:
                                string4 = obj3;
                                continue;
                            case 6:
                                string4 = "creditCardExpirationDay";
                                continue;
                            case 7:
                                string4 = "streetAddress";
                                continue;
                            case '\b':
                                string4 = "phoneNumberDevice";
                                continue;
                            case '\t':
                                string4 = "addressCountry";
                                continue;
                            case '\n':
                                string4 = "personMiddleInitial";
                                continue;
                            case 11:
                                string4 = "addressLocality";
                                continue;
                            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                string4 = "gender";
                                continue;
                            case '\r':
                                string4 = "extendedPostalCode";
                                continue;
                            case 14:
                                string4 = "creditCardNumber";
                                continue;
                            case 15:
                                string4 = "personNamePrefix";
                                continue;
                            case RecognitionOptions.DATA_MATRIX /* 16 */:
                                string4 = "personMiddleName";
                                continue;
                            case 17:
                                string4 = "personNameSuffix";
                                continue;
                            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                string4 = "creditCardExpirationDate";
                                continue;
                            case 19:
                                string4 = "creditCardExpirationYear";
                                continue;
                            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                                string4 = "phoneCountryCode";
                                continue;
                            case 21:
                                string4 = "username";
                                continue;
                            case 22:
                                string4 = "personName";
                                continue;
                            case 23:
                                string4 = "emailAddress";
                                continue;
                            case 24:
                                string4 = "addressRegion";
                                continue;
                            case 25:
                                string4 = "birthDateMonth";
                                continue;
                            case 26:
                                string4 = "personFamilyName";
                                continue;
                            case 27:
                                string4 = "phoneNumber";
                                continue;
                            case 28:
                                string4 = "newUsername";
                                continue;
                            case 29:
                                string4 = "birthDateFull";
                                continue;
                            case 30:
                                string4 = str;
                                continue;
                            case 31:
                                string4 = "personGivenName";
                                continue;
                            case RecognitionOptions.EAN_13 /* 32 */:
                                string4 = "postalAddress";
                                continue;
                            case '!':
                                string4 = "extendedAddress";
                                continue;
                            case '\"':
                                string4 = "postalCode";
                                continue;
                            case '#':
                                string4 = "birthDateDay";
                                continue;
                        }
                    }
                    strArr[i10] = string4;
                    i10++;
                    obj = obj4;
                    str2 = str;
                    string3 = str5;
                    obj5 = obj3;
                    jSONArray3 = jSONArray4;
                }
                eVar = new E.e(string3, strArr, str4, z.a(jSONObject4));
            }
            return new w(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, a7, xVar, num, string, eVar, (String[]) arrayList.toArray(new String[arrayList.size()]), wVarArr);
        }
        throw new JSONException("Configuration JSON missing 'inputAction' property.");
    }
}
