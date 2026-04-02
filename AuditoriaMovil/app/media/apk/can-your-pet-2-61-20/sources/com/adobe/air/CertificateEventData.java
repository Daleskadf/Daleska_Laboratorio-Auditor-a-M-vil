package com.adobe.air;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class CertificateEventData {
    private Condition m_condition;
    private Lock m_lock;
    private String m_message;
    private long m_nativeObject;
    private int m_result = -1;

    public CertificateEventData(long j, String str) {
        this.m_message = str;
        this.m_nativeObject = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.m_lock = reentrantLock;
        this.m_condition = reentrantLock.newCondition();
    }

    public String getMessage() {
        return this.m_message;
    }

    public long getNativeObject() {
        return this.m_nativeObject;
    }

    public void setResult(int i) {
        this.m_lock.lock();
        this.m_result = i;
        this.m_condition.signal();
        this.m_lock.unlock();
    }

    public int waitForResult() {
        this.m_lock.lock();
        try {
            if (this.m_result == -1) {
                this.m_condition.await();
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.m_lock.unlock();
            throw th;
        }
        this.m_lock.unlock();
        return this.m_result;
    }
}
