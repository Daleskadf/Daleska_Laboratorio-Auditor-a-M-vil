package org.apache.tika.io;

import android.app.NotificationChannel;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ boolean C(Process process, TimeUnit timeUnit) {
        return process.waitFor(500L, timeUnit);
    }

    public static /* synthetic */ NotificationChannel a(String str) {
        return new NotificationChannel("geolocator_channel_01", str, 0);
    }

    public static /* bridge */ /* synthetic */ Path e(Object obj) {
        return (Path) obj;
    }

    public static /* bridge */ /* synthetic */ Path f(Path path) {
        return path.getParent();
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ void l(ProcessBuilder processBuilder, File file) {
        processBuilder.redirectOutput(file);
    }

    public static /* bridge */ /* synthetic */ void n(Path path, FileAttribute[] fileAttributeArr) {
        Files.createDirectories(path, fileAttributeArr);
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj) {
        return obj instanceof Path;
    }

    public static /* bridge */ /* synthetic */ boolean s(Process process, long j, TimeUnit timeUnit) {
        return process.waitFor(j, timeUnit);
    }
}
