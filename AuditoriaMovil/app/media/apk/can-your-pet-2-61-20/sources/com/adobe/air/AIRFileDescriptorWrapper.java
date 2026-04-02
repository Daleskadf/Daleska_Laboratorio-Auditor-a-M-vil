package com.adobe.air;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;
/* loaded from: classes.dex */
public class AIRFileDescriptorWrapper {
    private boolean m_debug = AIRFileUtils.isDebugging();
    private ParcelFileDescriptor m_fd;
    private FileInputStream m_in;
    private int m_lastError;
    private String m_mode;
    private FileOutputStream m_out;
    private long m_position;
    private Uri m_uri;

    public AIRFileDescriptorWrapper(ParcelFileDescriptor parcelFileDescriptor, String str, Uri uri) {
        this.m_fd = parcelFileDescriptor;
        this.m_mode = str;
        this.m_uri = uri;
        this.m_lastError = 0;
        if (str.indexOf(119) >= 0) {
            this.m_out = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
            if (this.m_debug) {
                Log.d("AdobeAIR", "Creating file output stream, mode is " + this.m_mode);
            }
            try {
                if (this.m_mode.equals("wt")) {
                    this.m_out.getChannel().truncate(0L);
                }
                if (this.m_mode.equals("rw")) {
                    this.m_out.getChannel().position(0L);
                }
            } catch (IOException e) {
                Log.w("AdobeAIR", "Error initialising file: " + e.toString());
                this.m_lastError = 2030;
            }
        }
        if (this.m_mode.indexOf(114) >= 0) {
            this.m_in = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        }
        this.m_position = 0L;
        if (this.m_mode.equals("wa")) {
            this.m_position = parcelFileDescriptor.getStatSize();
        }
    }

    long Read(byte[] bArr) {
        this.m_lastError = 0;
        long length = bArr.length;
        long j = -1;
        try {
            long available = this.m_in.available();
            if (available < length) {
                length = available;
            }
            j = this.m_in.read(bArr, 0, (int) length);
            this.m_position += j;
            return j;
        } catch (Exception e) {
            Log.w("AdobeAIR", "Failure in reading file: " + e.toString());
            this.m_lastError = 2030;
            return j;
        }
    }

    boolean Write(byte[] bArr) {
        boolean z = false;
        this.m_lastError = 0;
        if (this.m_mode.equals("r")) {
            this.m_lastError = 3008;
            return false;
        }
        try {
            this.m_lastError = 0;
            if (this.m_out == null) {
                this.m_out = new FileOutputStream(this.m_fd.getFileDescriptor());
            }
            this.m_out.write(bArr);
            z = true;
            this.m_position += bArr.length;
            return true;
        } catch (Exception e) {
            Log.w("AdobeAIR", "Failed in writing data to file: " + e.toString());
            this.m_lastError = 2030;
            return z;
        }
    }

    String Gets(int i) {
        this.m_lastError = 0;
        try {
            StringBuilder sb = new StringBuilder();
            int available = this.m_in.available();
            if (available < i) {
                i = available;
            }
            for (int i2 = 0; i2 < i; i2++) {
                int read = this.m_in.read();
                if (read < 0) {
                    break;
                }
                this.m_position++;
                if (read >= 128) {
                    Log.w("AdobeAIR", "'gets' called on non-ascii input file");
                }
                sb.append((char) (read & WorkQueueKt.MASK));
                if (read == 13) {
                    break;
                }
            }
            return sb.toString();
        } catch (Exception e) {
            Log.w("AdobeAIR", "Failed to get string from file: " + e.toString());
            this.m_lastError = 2030;
            return null;
        }
    }

    boolean Flush() {
        this.m_lastError = 0;
        try {
            this.m_out.flush();
        } catch (Exception unused) {
            this.m_lastError = 2030;
        }
        return this.m_lastError == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long Size() {
        this.m_lastError = 0;
        return this.m_fd.getStatSize();
    }

    boolean Truncate() {
        this.m_lastError = 0;
        try {
            this.m_out.getChannel().truncate(0L);
            this.m_position = 0L;
        } catch (Exception unused) {
            this.m_lastError = 2030;
        }
        return this.m_lastError == 0;
    }

    long Seek(long j, int i) {
        this.m_lastError = 0;
        try {
            FileOutputStream fileOutputStream = this.m_out;
            if (fileOutputStream != null && this.m_position != fileOutputStream.getChannel().position() && this.m_debug) {
                Log.d("AdobeAIR", "Warning: file position mismatch in output: expected " + this.m_position + ", got " + this.m_out.getChannel().position());
            }
            FileInputStream fileInputStream = this.m_in;
            if (fileInputStream != null && this.m_position != fileInputStream.getChannel().position() && this.m_debug) {
                Log.d("AdobeAIR", "Warning: file position mismatch in input: expected " + this.m_position + ", got " + this.m_in.getChannel().position());
            }
        } catch (IOException unused) {
        }
        try {
            if (i == 0) {
                this.m_position += j;
            } else if (i == 1) {
                this.m_position = j;
            } else if (i == 2) {
                this.m_position = this.m_fd.getStatSize();
            }
            FileOutputStream fileOutputStream2 = this.m_out;
            if (fileOutputStream2 != null) {
                fileOutputStream2.getChannel().position(this.m_position);
            }
            FileInputStream fileInputStream2 = this.m_in;
            if (fileInputStream2 != null) {
                fileInputStream2.getChannel().position(this.m_position);
            }
        } catch (IOException e) {
            Log.d("AdobeAIR", "Seek failed: " + e.toString());
            this.m_lastError = 2030;
            this.m_position = -1L;
        }
        return this.m_position;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Close() {
        this.m_lastError = 0;
        try {
            FileOutputStream fileOutputStream = this.m_out;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            FileInputStream fileInputStream = this.m_in;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.m_fd.close();
            return true;
        } catch (IOException e) {
            Log.w("AdobeAIR", "Failure when closing a file handle - " + e.toString());
            this.m_lastError = 3005;
            return false;
        }
    }

    boolean Delete() {
        Close();
        return AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getContentResolver().delete(this.m_uri, null, null) > 0;
    }

    int LastError() {
        return this.m_lastError;
    }
}
