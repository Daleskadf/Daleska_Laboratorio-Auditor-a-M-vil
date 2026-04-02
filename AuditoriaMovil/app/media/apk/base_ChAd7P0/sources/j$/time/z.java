package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z extends ZoneId {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f12801d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b  reason: collision with root package name */
    private final String f12802b;

    /* renamed from: c  reason: collision with root package name */
    private final transient j$.time.zone.f f12803c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z X(String str, boolean z7) {
        j$.time.zone.f fVar;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = str.charAt(i7);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i7 == 0) && ((charAt < '0' || charAt > '9' || i7 == 0) && ((charAt != '~' || i7 == 0) && ((charAt != '.' || i7 == 0) && ((charAt != '_' || i7 == 0) && ((charAt != '+' || i7 == 0) && (charAt != '-' || i7 == 0))))))))) {
                    throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVar = j$.time.zone.j.b(str, true);
            } catch (j$.time.zone.g e7) {
                if (z7) {
                    throw e7;
                }
                fVar = null;
            }
            return new z(str, fVar);
        }
        throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(String str, j$.time.zone.f fVar) {
        this.f12802b = str;
        this.f12803c = fVar;
    }

    @Override // j$.time.ZoneId
    public final String n() {
        return this.f12802b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f S() {
        j$.time.zone.f fVar = this.f12803c;
        return fVar != null ? fVar : j$.time.zone.j.b(this.f12802b, false);
    }

    private Object writeReplace() {
        return new u((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.ZoneId
    public final void W(ObjectOutput objectOutput) {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f12802b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Y(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f12802b);
    }
}
