package com.adobe.air;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.security.KeyStore;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public final class JavaTrustStoreHelper {
    private static final String LOG_TAG = "JavaTrustStoreHelper";
    private static SystemKeyStoreManager mSystemKeyStoreMgr = initSystemKeyStoreMgr();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface SystemKeyStoreManager {
        KeyStore getKeyStore();

        long getTimestamp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SystemKeyStoreManager_stub implements SystemKeyStoreManager {
        @Override // com.adobe.air.JavaTrustStoreHelper.SystemKeyStoreManager
        public KeyStore getKeyStore() {
            return null;
        }

        @Override // com.adobe.air.JavaTrustStoreHelper.SystemKeyStoreManager
        public long getTimestamp() {
            return 0L;
        }

        private SystemKeyStoreManager_stub() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SystemKeyStoreManager_sysprop implements SystemKeyStoreManager {
        private static final String kTheProp = "javax.net.ssl.trustStore";

        private SystemKeyStoreManager_sysprop() {
        }

        public static boolean isValid() {
            return System.getProperty(kTheProp) != null;
        }

        @Override // com.adobe.air.JavaTrustStoreHelper.SystemKeyStoreManager
        public KeyStore getKeyStore() {
            try {
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                String property = System.getProperty(kTheProp);
                if (property == null) {
                    return null;
                }
                keyStore.load(new FileInputStream(new File(property)), null);
                return keyStore;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.adobe.air.JavaTrustStoreHelper.SystemKeyStoreManager
        public long getTimestamp() {
            return new File(System.getProperty(kTheProp)).lastModified();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SystemKeyStoreManager_files implements SystemKeyStoreManager {
        private static final String kDirectoryPath = "/system/etc/security/cacerts";
        private int mNumFilesWhenCreated;

        private SystemKeyStoreManager_files() {
            this.mNumFilesWhenCreated = -1;
        }

        public static boolean isValid() {
            return new File(kDirectoryPath).exists();
        }

        @Override // com.adobe.air.JavaTrustStoreHelper.SystemKeyStoreManager
        public long getTimestamp() {
            String[] fileListing = getFileListing();
            int i = this.mNumFilesWhenCreated;
            if (i == -1 || fileListing.length == i) {
                long j = 0;
                for (int i2 = 0; i2 < fileListing.length; i2++) {
                    j = Math.max(new File("/system/etc/security/cacerts/" + fileListing[i2]).lastModified(), j);
                }
                return j;
            }
            return Long.MAX_VALUE;
        }

        private static String[] getFileListing() {
            return new File(kDirectoryPath).list();
        }

        @Override // com.adobe.air.JavaTrustStoreHelper.SystemKeyStoreManager
        public KeyStore getKeyStore() {
            try {
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null);
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                String[] fileListing = getFileListing();
                this.mNumFilesWhenCreated = fileListing.length;
                for (int i = 0; i < fileListing.length; i++) {
                    String str = fileListing[i];
                    keyStore.setCertificateEntry(String.valueOf(i), certificateFactory.generateCertificate(new FileInputStream(new File("/system/etc/security/cacerts/" + str))));
                }
                return keyStore;
            } catch (Exception unused) {
                this.mNumFilesWhenCreated = -1;
                return null;
            }
        }
    }

    private static boolean isAirCertBundleStale(String str) {
        File file = new File(str);
        return !file.exists() || mSystemKeyStoreMgr.getTimestamp() > file.lastModified();
    }

    private static SystemKeyStoreManager initSystemKeyStoreMgr() {
        if (SystemKeyStoreManager_sysprop.isValid()) {
            return new SystemKeyStoreManager_sysprop();
        }
        if (SystemKeyStoreManager_files.isValid()) {
            return new SystemKeyStoreManager_files();
        }
        return new SystemKeyStoreManager_stub();
    }

    private static long getTrustStoreTimestamp() {
        return mSystemKeyStoreMgr.getTimestamp();
    }

    private static TrustManagerFactory getX509TrustManagerFactory() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init(mSystemKeyStoreMgr.getKeyStore());
            return trustManagerFactory;
        } catch (Exception unused) {
            return null;
        }
    }

    private static X509TrustManager getX509TrustManager() {
        TrustManager[] trustManagers;
        TrustManagerFactory x509TrustManagerFactory = getX509TrustManagerFactory();
        if (x509TrustManagerFactory != null) {
            for (TrustManager trustManager : x509TrustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
        }
        return null;
    }

    public static void copyTimestamp(String str, String str2) {
        try {
            new File(str2).setLastModified(new File(str).lastModified());
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    private static int dumpAcceptedIssuersToFile(X509TrustManager x509TrustManager, RandomAccessFile randomAccessFile) throws CertificateEncodingException, IOException, SyncFailedException {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        for (X509Certificate x509Certificate : acceptedIssuers) {
            byte[] encoded = x509Certificate.getEncoded();
            randomAccessFile.writeInt(encoded.length);
            randomAccessFile.write(encoded);
        }
        randomAccessFile.getFD().sync();
        return acceptedIssuers.length;
    }

    public static boolean enumerateRootCAs(String str, String str2) {
        X509TrustManager x509TrustManager;
        if (isAirCertBundleStale(str) && (x509TrustManager = getX509TrustManager()) != null) {
            try {
                File file = new File(str2);
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength(0L);
                dumpAcceptedIssuersToFile(x509TrustManager, randomAccessFile);
                file.setLastModified(getTrustStoreTimestamp());
                randomAccessFile.close();
                return true;
            } catch (FileNotFoundException | IOException | IllegalArgumentException | SecurityException | CertificateEncodingException unused) {
                return false;
            }
        }
        return false;
    }
}
