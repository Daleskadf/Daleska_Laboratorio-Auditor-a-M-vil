package org.apache.tika.utils;
/* loaded from: classes.dex */
public class FileProcessResult {
    String stderr = StringUtils.EMPTY;
    String stdout = StringUtils.EMPTY;
    int exitValue = -1;
    long processTimeMillis = -1;
    boolean isTimeout = false;
    long stdoutLength = -1;
    long stderrLength = -1;
    boolean stderrTruncated = false;
    boolean stdoutTruncated = false;

    public int getExitValue() {
        return this.exitValue;
    }

    public long getProcessTimeMillis() {
        return this.processTimeMillis;
    }

    public String getStderr() {
        return this.stderr;
    }

    public long getStderrLength() {
        return this.stderrLength;
    }

    public String getStdout() {
        return this.stdout;
    }

    public long getStdoutLength() {
        return this.stdoutLength;
    }

    public boolean isStderrTruncated() {
        return this.stderrTruncated;
    }

    public boolean isStdoutTruncated() {
        return this.stdoutTruncated;
    }

    public boolean isTimeout() {
        return this.isTimeout;
    }

    public void setExitValue(int i7) {
        this.exitValue = i7;
    }

    public void setProcessTimeMillis(long j) {
        this.processTimeMillis = j;
    }

    public void setStderr(String str) {
        this.stderr = str;
    }

    public void setStderrLength(long j) {
        this.stderrLength = j;
    }

    public void setStderrTruncated(boolean z7) {
        this.stderrTruncated = z7;
    }

    public void setStdout(String str) {
        this.stdout = str;
    }

    public void setStdoutLength(long j) {
        this.stdoutLength = j;
    }

    public void setStdoutTruncated(boolean z7) {
        this.stdoutTruncated = z7;
    }

    public void setTimeout(boolean z7) {
        this.isTimeout = z7;
    }

    public String toString() {
        String str = this.stderr;
        String str2 = this.stdout;
        int i7 = this.exitValue;
        long j = this.processTimeMillis;
        boolean z7 = this.isTimeout;
        long j8 = this.stdoutLength;
        long j9 = this.stderrLength;
        boolean z8 = this.stderrTruncated;
        boolean z9 = this.stdoutTruncated;
        StringBuilder l8 = io.flutter.plugins.pathprovider.b.l("FileProcessResult{stderr='", str, "', stdout='", str2, "', exitValue=");
        l8.append(i7);
        l8.append(", processTimeMillis=");
        l8.append(j);
        l8.append(", isTimeout=");
        l8.append(z7);
        l8.append(", stdoutLength=");
        l8.append(j8);
        l8.append(", stderrLength=");
        l8.append(j9);
        l8.append(", stderrTruncated=");
        l8.append(z8);
        l8.append(", stdoutTruncated=");
        l8.append(z9);
        l8.append("}");
        return l8.toString();
    }
}
