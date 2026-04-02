package org.apache.tika.mime;

import T6.d;
import W6.h;
import java.io.IOException;
import org.apache.tika.detect.MagicDetector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
class MagicMatch implements Clause {
    private MagicDetector detector = null;
    private final String mask;
    private final MediaType mediaType;
    private final String offset;
    private final String type;
    private final String value;

    public MagicMatch(MediaType mediaType, String str, String str2, String str3, String str4) {
        this.mediaType = mediaType;
        this.type = str;
        this.offset = str2;
        this.value = str3;
        this.mask = str4;
    }

    private synchronized MagicDetector getDetector() {
        try {
            if (this.detector == null) {
                this.detector = MagicDetector.parse(this.mediaType, this.type, this.offset, this.value, this.mask);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.detector;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [W6.g, T6.d] */
    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        try {
            MagicDetector detector = getDetector();
            int i7 = h.f6230e;
            ?? dVar = new d();
            dVar.M(bArr);
            if (detector.detect(dVar.L(), new Metadata()) == MediaType.OCTET_STREAM) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        return getDetector().getLength();
    }

    public String toString() {
        String mediaType = this.mediaType.toString();
        String str = this.type;
        String str2 = this.offset;
        String str3 = this.value;
        String str4 = this.mask;
        return mediaType + StringUtils.SPACE + str + StringUtils.SPACE + str2 + StringUtils.SPACE + str3 + StringUtils.SPACE + str4;
    }
}
