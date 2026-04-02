package androidx.datastore.preferences.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public class C extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7749a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.C] */
    public static C a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.B, java.io.IOException] */
    public static B b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.C] */
    public static C c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.C] */
    public static C d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.C] */
    public static C e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
