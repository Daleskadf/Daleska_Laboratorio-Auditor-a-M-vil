package a4;
/* loaded from: classes.dex */
public abstract class y {
    private static final Z2.a zza = new Z2.a("PhoneAuthProvider", new String[0]);

    public abstract void onCodeAutoRetrievalTimeOut(String str);

    public abstract void onCodeSent(String str, x xVar);

    public abstract void onVerificationCompleted(v vVar);

    public abstract void onVerificationFailed(U3.i iVar);
}
