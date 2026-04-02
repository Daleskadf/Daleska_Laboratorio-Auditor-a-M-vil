package d1;

import G1.t;
import G1.v;
import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: e  reason: collision with root package name */
    public boolean f10199e;
    public UUID f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f10200g;

    @Override // d1.d
    public final Object b() {
        UUID uuid = this.f;
        byte[] a7 = t.a(uuid, null, this.f10200g);
        byte[] bArr = this.f10200g;
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < bArr.length; i7 += 2) {
            sb.append((char) bArr[i7]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        byte b5 = decode[0];
        decode[0] = decode[3];
        decode[3] = b5;
        byte b7 = decode[1];
        decode[1] = decode[2];
        decode[2] = b7;
        byte b8 = decode[4];
        decode[4] = decode[5];
        decode[5] = b8;
        byte b9 = decode[6];
        decode[6] = decode[7];
        decode[7] = b9;
        return new C0886a(uuid, a7, new v[]{new v(true, null, 8, decode, 0, 0, null)});
    }

    @Override // d1.d
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // d1.d
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f10199e = false;
        }
    }

    @Override // d1.d
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f10199e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f = UUID.fromString(attributeValue);
        }
    }

    @Override // d1.d
    public final void k(XmlPullParser xmlPullParser) {
        if (this.f10199e) {
            this.f10200g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
