package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes2.dex */
public final class DoubleMath {
    @VisibleForTesting
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    private static final double LN_2 = Math.log(2.0d);
    @VisibleForTesting
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: com.google.common.math.DoubleMath$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private DoubleMath() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    private static double checkFinite(double d10) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d10));
        return d10;
    }

    public static double factorial(int i10) {
        MathPreconditions.checkNonNegative("n", i10);
        if (i10 > MAX_FACTORIAL) {
            return Double.POSITIVE_INFINITY;
        }
        double d10 = 1.0d;
        for (int i11 = (i10 & (-16)) + 1; i11 <= i10; i11++) {
            double d11 = i11;
            Double.isNaN(d11);
            d10 *= d11;
        }
        return d10 * everySixteenthFactorial[i10 >> 4];
    }

    public static int fuzzyCompare(double d10, double d11, double d12) {
        if (fuzzyEquals(d10, d11, d12)) {
            return 0;
        }
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        return Booleans.compare(Double.isNaN(d10), Double.isNaN(d11));
    }

    public static boolean fuzzyEquals(double d10, double d11, double d12) {
        MathPreconditions.checkNonNegative("tolerance", d12);
        if (Math.copySign(d10 - d11, 1.0d) > d12 && d10 != d11 && (!Double.isNaN(d10) || !Double.isNaN(d11))) {
            return false;
        }
        return true;
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double d10) {
        if (DoubleUtils.isFinite(d10) && (d10 == LN_2 || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(d10)) <= Math.getExponent(d10))) {
            return true;
        }
        return false;
    }

    @GwtIncompatible
    public static boolean isPowerOfTwo(double d10) {
        if (d10 <= LN_2 || !DoubleUtils.isFinite(d10)) {
            return false;
        }
        long significand = DoubleUtils.getSignificand(d10);
        if ((significand & (significand - 1)) != 0) {
            return false;
        }
        return true;
    }

    public static double log2(double d10) {
        return Math.log(d10) / LN_2;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double checkFinite = checkFinite(dArr[0]);
        long j10 = 1;
        for (int i10 = 1; i10 < dArr.length; i10++) {
            checkFinite(dArr[i10]);
            j10++;
            double d10 = j10;
            Double.isNaN(d10);
            checkFinite += (dArr[i10] - checkFinite) / d10;
        }
        return checkFinite;
    }

    @GwtIncompatible
    public static double roundIntermediate(double d10, RoundingMode roundingMode) {
        int i10;
        if (DoubleUtils.isFinite(d10)) {
            switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
                case 1:
                    MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(d10));
                    return d10;
                case 2:
                    if (d10 < LN_2 && !isMathematicalInteger(d10)) {
                        return ((long) d10) - 1;
                    }
                    return d10;
                case 3:
                    if (d10 > LN_2 && !isMathematicalInteger(d10)) {
                        return ((long) d10) + 1;
                    }
                    return d10;
                case 4:
                    return d10;
                case 5:
                    if (isMathematicalInteger(d10)) {
                        return d10;
                    }
                    long j10 = (long) d10;
                    if (d10 > LN_2) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    return j10 + i10;
                case 6:
                    return Math.rint(d10);
                case 7:
                    double rint = Math.rint(d10);
                    if (Math.abs(d10 - rint) == 0.5d) {
                        return d10 + Math.copySign(0.5d, d10);
                    }
                    return rint;
                case 8:
                    double rint2 = Math.rint(d10);
                    if (Math.abs(d10 - rint2) == 0.5d) {
                        return d10;
                    }
                    return rint2;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    @GwtIncompatible
    public static BigInteger roundToBigInteger(double d10, RoundingMode roundingMode) {
        boolean z10;
        double roundIntermediate = roundIntermediate(d10, roundingMode);
        boolean z11 = true;
        if (MIN_LONG_AS_DOUBLE - roundIntermediate < 1.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (roundIntermediate >= MAX_LONG_AS_DOUBLE_PLUS_ONE) {
            z11 = false;
        }
        if (z11 & z10) {
            return BigInteger.valueOf((long) roundIntermediate);
        }
        BigInteger shiftLeft = BigInteger.valueOf(DoubleUtils.getSignificand(roundIntermediate)).shiftLeft(Math.getExponent(roundIntermediate) - 52);
        if (roundIntermediate < LN_2) {
            return shiftLeft.negate();
        }
        return shiftLeft;
    }

    @GwtIncompatible
    public static int roundToInt(double d10, RoundingMode roundingMode) {
        boolean z10;
        double roundIntermediate = roundIntermediate(d10, roundingMode);
        boolean z11 = true;
        if (roundIntermediate > -2.147483649E9d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (roundIntermediate >= 2.147483648E9d) {
            z11 = false;
        }
        MathPreconditions.checkInRangeForRoundingInputs(z10 & z11, d10, roundingMode);
        return (int) roundIntermediate;
    }

    @GwtIncompatible
    public static long roundToLong(double d10, RoundingMode roundingMode) {
        boolean z10;
        double roundIntermediate = roundIntermediate(d10, roundingMode);
        boolean z11 = true;
        if (MIN_LONG_AS_DOUBLE - roundIntermediate < 1.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (roundIntermediate >= MAX_LONG_AS_DOUBLE_PLUS_ONE) {
            z11 = false;
        }
        MathPreconditions.checkInRangeForRoundingInputs(z10 & z11, d10, roundingMode);
        return (long) roundIntermediate;
    }

    @GwtIncompatible
    public static int log2(double d10, RoundingMode roundingMode) {
        boolean isPowerOfTwo;
        Preconditions.checkArgument(d10 > LN_2 && DoubleUtils.isFinite(d10), "x must be positive and finite");
        int exponent = Math.getExponent(d10);
        if (!DoubleUtils.isNormal(d10)) {
            return log2(d10 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(d10));
                break;
            case 2:
                break;
            case 3:
                r2 = !isPowerOfTwo(d10);
                break;
            case 4:
                r2 = exponent < 0;
                isPowerOfTwo = isPowerOfTwo(d10);
                r2 &= !isPowerOfTwo;
                break;
            case 5:
                r2 = exponent >= 0;
                isPowerOfTwo = isPowerOfTwo(d10);
                r2 &= !isPowerOfTwo;
                break;
            case 6:
            case 7:
            case 8:
                double scaleNormalize = DoubleUtils.scaleNormalize(d10);
                if (scaleNormalize * scaleNormalize > 2.0d) {
                    r2 = true;
                    break;
                }
                break;
            default:
                throw new AssertionError();
        }
        return r2 ? exponent + 1 : exponent;
    }

    @Deprecated
    public static double mean(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j10 = 0;
        for (int i10 : iArr) {
            j10 += i10;
        }
        double d10 = j10;
        double length = iArr.length;
        Double.isNaN(d10);
        Double.isNaN(length);
        return d10 / length;
    }

    @Deprecated
    public static double mean(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d10 = jArr[0];
        long j10 = 1;
        for (int i10 = 1; i10 < jArr.length; i10++) {
            j10++;
            double d11 = jArr[i10];
            Double.isNaN(d11);
            double d12 = j10;
            Double.isNaN(d12);
            d10 += (d11 - d10) / d12;
        }
        return d10;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
        return mean(iterable.iterator());
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext(), "Cannot take mean of 0 values");
        double checkFinite = checkFinite(it.next().doubleValue());
        long j10 = 1;
        while (it.hasNext()) {
            j10++;
            double d10 = j10;
            Double.isNaN(d10);
            checkFinite += (checkFinite(it.next().doubleValue()) - checkFinite) / d10;
        }
        return checkFinite;
    }
}
