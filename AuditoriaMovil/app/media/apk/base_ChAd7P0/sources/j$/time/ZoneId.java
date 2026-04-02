package j$.time;

import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f12584a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f S();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void W(ObjectOutput objectOutput);

    public abstract String n();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.g("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.g("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.g("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.g("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.g("AST", "America/Anchorage"), j$.com.android.tools.r8.a.g("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.g("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.g("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.g("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.g("CST", "America/Chicago"), j$.com.android.tools.r8.a.g("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.g("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.g("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.g("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.g("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.g("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.g("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.g("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.g("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.g("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.g("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.g("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.g("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.g("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.g("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.g("EST", "-05:00"), j$.com.android.tools.r8.a.g("MST", "-07:00"), j$.com.android.tools.r8.a.g("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i7 = 0; i7 < 28; i7++) {
            Map.Entry entry = entryArr[i7];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        f12584a = Collections.unmodifiableMap(hashMap);
    }

    public static ZoneId of(String str) {
        return T(str, true);
    }

    public static ZoneId U(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.Z() != 0) {
            str = str.concat(zoneOffset.n());
        }
        return new z(str, j$.time.zone.f.h(zoneOffset));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneId T(String str, boolean z7) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.a0(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return V(str, 3, z7);
        }
        if (str.startsWith("UT")) {
            return V(str, 2, z7);
        }
        return z.X(str, z7);
    }

    private static ZoneId V(String str, int i7, boolean z7) {
        String substring = str.substring(0, i7);
        if (str.length() == i7) {
            return U(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i7) != '+' && str.charAt(i7) != '-') {
            return z.X(str, z7);
        }
        try {
            ZoneOffset a02 = ZoneOffset.a0(str.substring(i7));
            if (a02 == ZoneOffset.UTC) {
                return U(substring, a02);
            }
            return U(substring, a02);
        } catch (c e7) {
            throw new RuntimeException("Invalid ID for offset-based ZoneId: ".concat(str), e7);
        }
    }

    public static ZoneId R(Temporal temporal) {
        ZoneId zoneId = (ZoneId) temporal.B(j$.time.temporal.l.j());
        if (zoneId != null) {
            return zoneId;
        }
        String name = temporal.getClass().getName();
        throw new RuntimeException("Unable to obtain ZoneId from TemporalAccessor: " + temporal + " of type " + name);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != z.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return n().equals(((ZoneId) obj).n());
        }
        return false;
    }

    public int hashCode() {
        return n().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return n();
    }

    private Object writeReplace() {
        return new u((byte) 7, this);
    }
}
