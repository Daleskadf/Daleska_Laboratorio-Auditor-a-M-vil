package org.apache.tika.utils;

import D.AbstractC0059i;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ProcessUtils {
    private static final ConcurrentHashMap<String, Process> PROCESS_MAP = new ConcurrentHashMap<>();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new org.apache.tika.parser.a(1)));
    }

    public static String escapeCommandLine(String str) {
        if (str == null) {
            return str;
        }
        if (str.contains(StringUtils.SPACE) && SystemUtils.IS_OS_WINDOWS && !str.startsWith("\"") && !str.endsWith("\"")) {
            return AbstractC0059i.M("\"", str, "\"");
        }
        return str;
    }

    public static FileProcessResult execute(ProcessBuilder processBuilder, long j, int i7, int i8) {
        String str;
        Process start;
        int i9;
        boolean waitFor;
        Process process = null;
        String str2 = null;
        try {
            start = processBuilder.start();
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        try {
            str2 = register(start);
            long currentTimeMillis = System.currentTimeMillis();
            StreamGobbler streamGobbler = new StreamGobbler(start.getInputStream(), i7);
            StreamGobbler streamGobbler2 = new StreamGobbler(start.getErrorStream(), i8);
            Thread thread = new Thread(streamGobbler);
            thread.start();
            Thread thread2 = new Thread(streamGobbler2);
            thread2.start();
            boolean z7 = false;
            long j8 = -1;
            try {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                z7 = start.waitFor(j, timeUnit);
                j8 = System.currentTimeMillis() - currentTimeMillis;
                if (!z7) {
                    start.destroyForcibly();
                    thread.join(1000L);
                    thread2.join(1000L);
                    waitFor = start.waitFor(500L, timeUnit);
                    if (waitFor) {
                        try {
                            i9 = start.exitValue();
                        } catch (IllegalThreadStateException unused) {
                        }
                    }
                    i9 = -1;
                } else {
                    i9 = start.exitValue();
                    thread.join(1000L);
                    thread2.join(1000L);
                }
                thread.interrupt();
                thread2.interrupt();
            } catch (InterruptedException unused2) {
                thread.interrupt();
                thread2.interrupt();
                i9 = -1000;
            } catch (Throwable th2) {
                thread.interrupt();
                thread2.interrupt();
                throw th2;
            }
            FileProcessResult fileProcessResult = new FileProcessResult();
            fileProcessResult.processTimeMillis = j8;
            fileProcessResult.stderrLength = streamGobbler2.getStreamLength();
            fileProcessResult.stdoutLength = streamGobbler.getStreamLength();
            fileProcessResult.isTimeout = !z7;
            fileProcessResult.exitValue = i9;
            fileProcessResult.stdout = StringUtils.joinWith("\n", streamGobbler.getLines());
            fileProcessResult.stderr = StringUtils.joinWith("\n", streamGobbler2.getLines());
            fileProcessResult.stdoutTruncated = streamGobbler.getIsTruncated();
            fileProcessResult.stderrTruncated = streamGobbler2.getIsTruncated();
            start.destroyForcibly();
            if (str2 != null) {
                release(str2);
            }
            return fileProcessResult;
        } catch (Throwable th3) {
            th = th3;
            String str3 = str2;
            process = start;
            str = str3;
            if (process != null) {
                process.destroyForcibly();
            }
            if (str != null) {
                release(str);
            }
            throw th;
        }
    }

    public static /* synthetic */ void lambda$static$0() {
        PROCESS_MAP.forEachValue(1L, new org.apache.tika.mime.a(2));
    }

    private static String register(Process process) {
        String uuid = UUID.randomUUID().toString();
        PROCESS_MAP.put(uuid, process);
        return uuid;
    }

    private static Process release(String str) {
        return PROCESS_MAP.remove(str);
    }

    public static String unescapeCommandLine(String str) {
        if (str.contains(StringUtils.SPACE) && SystemUtils.IS_OS_WINDOWS && str.startsWith("\"") && str.endsWith("\"")) {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }

    public static FileProcessResult execute(ProcessBuilder processBuilder, long j, Path path, int i7) {
        Path parent;
        boolean isDirectory;
        File file;
        String str;
        boolean z7;
        int i8;
        long size;
        Path parent2;
        parent = path.getParent();
        isDirectory = Files.isDirectory(parent, new LinkOption[0]);
        if (!isDirectory) {
            parent2 = path.getParent();
            Files.createDirectories(parent2, new FileAttribute[0]);
        }
        file = path.toFile();
        processBuilder.redirectOutput(file);
        Process process = null;
        String str2 = null;
        try {
            Process start = processBuilder.start();
            try {
                str2 = register(start);
                long currentTimeMillis = System.currentTimeMillis();
                StreamGobbler streamGobbler = new StreamGobbler(start.getErrorStream(), i7);
                Thread thread = new Thread(streamGobbler);
                thread.start();
                long j8 = -1;
                try {
                    z7 = start.waitFor(j, TimeUnit.MILLISECONDS);
                    try {
                        j8 = System.currentTimeMillis() - currentTimeMillis;
                        if (!z7) {
                            start.destroyForcibly();
                            thread.join(1000L);
                            i8 = -1;
                        } else {
                            i8 = start.exitValue();
                            thread.join(1000L);
                        }
                    } catch (InterruptedException unused) {
                        i8 = -1000;
                        FileProcessResult fileProcessResult = new FileProcessResult();
                        fileProcessResult.processTimeMillis = j8;
                        fileProcessResult.stderrLength = streamGobbler.getStreamLength();
                        size = Files.size(path);
                        fileProcessResult.stdoutLength = size;
                        fileProcessResult.isTimeout = !z7;
                        fileProcessResult.exitValue = i8;
                        fileProcessResult.stdout = StringUtils.EMPTY;
                        fileProcessResult.stderr = StringUtils.joinWith("\n", streamGobbler.getLines());
                        fileProcessResult.stdoutTruncated = false;
                        fileProcessResult.stderrTruncated = streamGobbler.getIsTruncated();
                        start.destroyForcibly();
                        release(str2);
                        return fileProcessResult;
                    }
                } catch (InterruptedException unused2) {
                    z7 = false;
                }
                FileProcessResult fileProcessResult2 = new FileProcessResult();
                fileProcessResult2.processTimeMillis = j8;
                fileProcessResult2.stderrLength = streamGobbler.getStreamLength();
                size = Files.size(path);
                fileProcessResult2.stdoutLength = size;
                fileProcessResult2.isTimeout = !z7;
                fileProcessResult2.exitValue = i8;
                fileProcessResult2.stdout = StringUtils.EMPTY;
                fileProcessResult2.stderr = StringUtils.joinWith("\n", streamGobbler.getLines());
                fileProcessResult2.stdoutTruncated = false;
                fileProcessResult2.stderrTruncated = streamGobbler.getIsTruncated();
                start.destroyForcibly();
                release(str2);
                return fileProcessResult2;
            } catch (Throwable th) {
                th = th;
                String str3 = str2;
                process = start;
                str = str3;
                if (process != null) {
                    process.destroyForcibly();
                }
                release(str);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
    }
}
