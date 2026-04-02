package com.adobe.air.microphone;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.microphone.MobileAEC;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class AIRMicrophoneRecorder implements Runnable {
    public static final String[] BLACKLIST = {"Nexus 9", "Nexus 10", "ONE A2005", "D6503"};
    private ByteBuffer mBuffer_toWrite;
    private byte[] mMicBuffer;
    private int m_audioFormat;
    private int m_audioSource;
    private int m_bufferSize;
    private int m_channelConfiguration;
    private volatile boolean m_isPaused;
    private volatile boolean m_isRecording;
    private AudioRecord m_recorder;
    private int m_sampleRate;
    private AcousticEchoCanceler echoCanceler = null;
    private NoiseSuppressor noiseSuppressor = null;
    private final Object mutex = new Object();
    public boolean m_isEnhancedMicrophone = false;
    public volatile boolean mKeepAlive = true;
    private long t_render = 0;
    private long t_analyze = 0;
    private long t_process = 0;
    private long t_capture = 0;
    public short m_delay = 0;
    private boolean hardwareAEC = false;

    public AIRMicrophoneRecorder(int i, int i2, int i3, int i4, int i5) {
        this.m_audioSource = 0;
        this.m_sampleRate = 0;
        this.m_channelConfiguration = 0;
        this.m_audioFormat = 0;
        this.m_bufferSize = 0;
        this.m_audioSource = i;
        this.m_sampleRate = i2;
        this.m_channelConfiguration = i3;
        this.m_audioFormat = i4;
        this.m_bufferSize = i5;
        this.mMicBuffer = new byte[i5];
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.mutex) {
            while (!isRecording()) {
                try {
                    this.mutex.wait();
                } catch (InterruptedException e) {
                    throw new IllegalStateException("Wait interrupted", e);
                }
            }
        }
        Process.setThreadPriority(-19);
        if (this.m_recorder != null) {
            try {
                if (this.m_isEnhancedMicrophone) {
                    ((AudioManager) AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getSystemService("audio")).setMode(3);
                    int audioSessionId = this.m_recorder.getAudioSessionId();
                    if (AcousticEchoCanceler.isAvailable() && NoiseSuppressor.isAvailable()) {
                        this.hardwareAEC = true;
                    } else {
                        this.hardwareAEC = false;
                    }
                    if (this.hardwareAEC) {
                        AcousticEchoCanceler create = AcousticEchoCanceler.create(audioSessionId);
                        this.echoCanceler = create;
                        if (create != null) {
                            create.setEnabled(true);
                        }
                        Log.d("AJAudioRecord", "IS Hardware NoiseSuppressor enabled " + NoiseSuppressor.isAvailable());
                        NoiseSuppressor create2 = NoiseSuppressor.create(audioSessionId);
                        this.noiseSuppressor = create2;
                        if (create2 != null) {
                            create2.setEnabled(true);
                        }
                    }
                }
                this.m_recorder.startRecording();
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[Catch: IllegalArgumentException -> 0x0060, TryCatch #0 {IllegalArgumentException -> 0x0060, blocks: (B:15:0x0027, B:17:0x002b, B:18:0x003b), top: B:30:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: IllegalArgumentException -> 0x0060, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0060, blocks: (B:15:0x0027, B:17:0x002b, B:18:0x003b), top: B:30:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean Open() {
        /*
            r8 = this;
            int r0 = r8.m_sampleRate
            int r1 = r8.m_channelConfiguration
            int r2 = r8.m_audioFormat
            int r0 = android.media.AudioRecord.getMinBufferSize(r0, r1, r2)
            boolean r1 = r8.m_isEnhancedMicrophone
            if (r1 == 0) goto L1d
            int r1 = r8.m_bufferSize
            if (r1 <= r0) goto L14
            r0 = r1
            goto L16
        L14:
            int r0 = r0 * 2
        L16:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            r8.mBuffer_toWrite = r1
            goto L25
        L1d:
            int r1 = r8.m_bufferSize
            if (r1 <= r0) goto L23
            r6 = r1
            goto L26
        L23:
            int r0 = r0 * 2
        L25:
            r6 = r0
        L26:
            r0 = 0
            boolean r1 = r8.m_isEnhancedMicrophone     // Catch: java.lang.IllegalArgumentException -> L60
            if (r1 == 0) goto L3b
            android.media.AudioRecord r7 = new android.media.AudioRecord     // Catch: java.lang.IllegalArgumentException -> L60
            r2 = 7
            int r3 = r8.m_sampleRate     // Catch: java.lang.IllegalArgumentException -> L60
            int r4 = r8.m_channelConfiguration     // Catch: java.lang.IllegalArgumentException -> L60
            int r5 = r8.m_audioFormat     // Catch: java.lang.IllegalArgumentException -> L60
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L60
            r8.m_recorder = r7     // Catch: java.lang.IllegalArgumentException -> L60
            goto L4b
        L3b:
            android.media.AudioRecord r7 = new android.media.AudioRecord     // Catch: java.lang.IllegalArgumentException -> L60
            int r2 = r8.m_audioSource     // Catch: java.lang.IllegalArgumentException -> L60
            int r3 = r8.m_sampleRate     // Catch: java.lang.IllegalArgumentException -> L60
            int r4 = r8.m_channelConfiguration     // Catch: java.lang.IllegalArgumentException -> L60
            int r5 = r8.m_audioFormat     // Catch: java.lang.IllegalArgumentException -> L60
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L60
            r8.m_recorder = r7     // Catch: java.lang.IllegalArgumentException -> L60
        L4b:
            android.media.AudioRecord r1 = r8.m_recorder
            if (r1 == 0) goto L5b
            int r1 = r1.getState()
            r2 = 1
            if (r1 != r2) goto L5b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L5b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L60:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.microphone.AIRMicrophoneRecorder.Open():java.lang.Boolean");
    }

    public byte[] getBuffer() {
        this.t_capture = System.currentTimeMillis();
        this.m_recorder.read(this.mMicBuffer, 0, this.m_bufferSize);
        if (this.m_isEnhancedMicrophone && (!this.hardwareAEC || deviceIsBlackListed())) {
            this.t_render = System.currentTimeMillis();
            if (doAECM()) {
                this.mMicBuffer = Arrays.copyOf(this.mBuffer_toWrite.array(), this.m_bufferSize);
            }
        }
        return this.mMicBuffer;
    }

    public void setRecording(boolean z) {
        synchronized (this.mutex) {
            this.m_isRecording = z;
            if (this.m_isRecording) {
                this.mutex.notify();
            } else {
                if (this.m_recorder.getState() == 1) {
                    this.m_recorder.stop();
                }
                this.m_recorder.release();
            }
        }
    }

    private boolean doAECM() {
        try {
            MobileAEC mobileAEC = new MobileAEC(null);
            mobileAEC.setAecmMode(MobileAEC.AggressiveMode.MOST_AGGRESSIVE).prepare();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.mMicBuffer);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.mBuffer_toWrite.capacity());
            byte[] bArr = new byte[320];
            while (byteArrayInputStream.read(bArr, 0, 320) != -1) {
                short[] sArr = new short[160];
                short[] sArr2 = new short[160];
                ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
                this.t_analyze = System.currentTimeMillis();
                mobileAEC.farendBuffer(sArr, 160);
                this.t_process = System.currentTimeMillis();
                this.m_delay = (short) 200;
                mobileAEC.echoCancellation(sArr, null, sArr2, (short) 160, (short) 200);
                byte[] bArr2 = new byte[320];
                ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(sArr2);
                byteArrayOutputStream.write(bArr2, 0, 320);
            }
            this.mBuffer_toWrite.clear();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
            this.mBuffer_toWrite = allocateDirect;
            allocateDirect.put(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
            byteArrayInputStream.close();
            mobileAEC.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isRecording() {
        boolean z;
        synchronized (this.mutex) {
            z = this.m_isRecording;
        }
        return z;
    }

    public void setIsEnhanced(boolean z) {
        this.m_isEnhancedMicrophone = z;
    }

    public static List<String> getBlackListedModels() {
        return Arrays.asList(BLACKLIST);
    }

    public static boolean deviceIsBlackListed() {
        return Arrays.asList(BLACKLIST).contains(Build.MODEL);
    }
}
