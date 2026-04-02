package com.google.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public class X extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10037a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.protobuf.X] */
    public static X a() {
        return new IOException("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.protobuf.X] */
    public static X b() {
        return new IOException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.protobuf.X] */
    public static X c() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.protobuf.W] */
    public static W d() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.protobuf.X] */
    public static X e() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.protobuf.X] */
    public static X f() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.protobuf.X] */
    public static X g() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.protobuf.X] */
    public static X h() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
