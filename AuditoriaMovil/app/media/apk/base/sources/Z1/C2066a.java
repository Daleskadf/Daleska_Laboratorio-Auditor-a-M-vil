package z1;

import H0.H;
import a.AbstractC0412a;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r3.AbstractC1740d;
import v1.C1881a;
import z3.h;
/* renamed from: z1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2066a extends AbstractC0412a {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f16866c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    public final CharsetDecoder f16867a = h.f16886c.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    public final CharsetDecoder f16868b = h.f16885b.newDecoder();

    @Override // a.AbstractC0412a
    public final H m(C1881a c1881a, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f16868b;
        CharsetDecoder charsetDecoder2 = this.f16867a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new H(new C2068c(bArr, null, null));
        }
        Matcher matcher = f16866c.matcher(str);
        String str3 = null;
        for (int i7 = 0; matcher.find(i7); i7 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String A7 = AbstractC1740d.A(group);
                A7.getClass();
                if (!A7.equals("streamurl")) {
                    if (A7.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new H(new C2068c(bArr, str2, str3));
    }
}
