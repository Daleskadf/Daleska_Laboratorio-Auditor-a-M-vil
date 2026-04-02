package com.adobe.air;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes.dex */
public class AndroidMediaStream {
    private static final int ERROR = -2;
    private BufferedInputStream mBufferedStream = null;
    private int mBufferSize = 0;
    private Uri mContentURI = null;

    public boolean loadContentURI(String str) {
        this.mContentURI = Uri.parse(str);
        if (this.mBufferedStream == null) {
            try {
                this.mBufferedStream = new BufferedInputStream(AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getContentResolver().openInputStream(this.mContentURI));
                return true;
            } catch (FileNotFoundException | Exception unused) {
                return false;
            }
        }
        return true;
    }

    public int Read(byte[] bArr, int i) {
        try {
            return this.mBufferedStream.read(bArr, 0, i);
        } catch (IOException unused) {
            return -2;
        }
    }

    public void Close() {
        BufferedInputStream bufferedInputStream = this.mBufferedStream;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (Exception unused) {
            }
            this.mBufferedStream = null;
        }
    }
}
