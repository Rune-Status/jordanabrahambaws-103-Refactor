import java.awt.Image;
import java.io.EOFException;
import java.io.IOException;

public final class Class62 {

	int anInt567 = 566364424;
	Class121 aClass121_568 = null;
	int anInt569;
	public static Class20 aClass20_570;
	static byte[] aByteArray571 = new byte[520];
	protected static Image anImage572;
	Class121 aClass121_573 = null;

	public byte[] method302(int var1) {
		Class121 var2 = this.aClass121_573;
		synchronized (var2) {
			try {
				if (this.aClass121_568.method450() < (long) (var1 * 6 + 6)) {
					return null;
				} else {
					this.aClass121_568.seek((long) (var1 * 6));
					this.aClass121_568.method443(aByteArray571, 0, 6);
					int var3 = (aByteArray571[2] & 255) + ((aByteArray571[1] & 255) << 8)
							+ ((aByteArray571[0] & 255) << 16);
					int var4 = (aByteArray571[5] & 255) + ((aByteArray571[4] & 255) << 8)
							+ ((aByteArray571[3] & 255) << 16);
					if (var3 < 0 || var3 > -1757028579 * this.anInt567) {
						return null;
					} else if (var4 <= 0 || (long) var4 > this.aClass121_573.method450() / 520L) {
						return null;
					} else {
						byte[] var5 = new byte[var3];
						int var6 = 0;

						for (int var7 = 0; var6 < var3; ++var7) {
							if (var4 == 0) {
								return null;
							}

							this.aClass121_573.seek((long) (520 * var4));
							int var8 = var3 - var6;
							if (var8 > 512) {
								var8 = 512;
							}

							this.aClass121_573.method443(aByteArray571, 0, 8 + var8);
							int var9 = (aByteArray571[1] & 255) + ((aByteArray571[0] & 255) << 8);
							int var10 = (aByteArray571[3] & 255) + ((aByteArray571[2] & 255) << 8);
							int var11 = ((aByteArray571[5] & 255) << 8) + ((aByteArray571[4] & 255) << 16)
									+ (aByteArray571[6] & 255);
							int var12 = aByteArray571[7] & 255;
							if (var9 != var1 || var7 != var10 || 1928833099 * this.anInt569 != var12) {
								return null;
							}

							if (var11 < 0 || (long) var11 > this.aClass121_573.method450() / 520L) {
								return null;
							}

							for (int var13 = 0; var13 < var8; ++var13) {
								var5[var6++] = aByteArray571[var13 + 8];
							}

							var4 = var11;
						}

						byte[] var10000 = var5;
						return var10000;
					}
				}
			} catch (IOException var15) {
				return null;
			}
		}
	}

	public boolean method303(int var1, byte[] var2, int var3) {
		Class121 var4 = this.aClass121_573;
		synchronized (var4) {
			if (var3 >= 0 && var3 <= -1757028579 * this.anInt567) {
				boolean var5 = this.method305(var1, var2, var3, true);
				if (!var5) {
					var5 = this.method305(var1, var2, var3, false);
				}

				return var5;
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	static final int method304(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
		return var3;
	}

	public Class62(int var1, Class121 var2, Class121 var3, int var4) {
		this.anInt569 = -1410277021 * var1;
		this.aClass121_573 = var2;
		this.aClass121_568 = var3;
		this.anInt567 = 1952963381 * var4;
	}

	boolean method305(int var1, byte[] var2, int var3, boolean var4) {
		Class121 var5 = this.aClass121_573;
		synchronized (var5) {
			boolean var10000;
			try {
				int var6;
				if (var4) {
					if (this.aClass121_568.method450() < (long) (6 + var1 * 6)) {
						return false;
					}

					this.aClass121_568.seek((long) (6 * var1));
					this.aClass121_568.method443(aByteArray571, 0, 6);
					var6 = (aByteArray571[5] & 255) + ((aByteArray571[4] & 255) << 8)
							+ ((aByteArray571[3] & 255) << 16);
					if (var6 <= 0 || (long) var6 > this.aClass121_573.method450() / 520L) {
						return false;
					}
				} else {
					var6 = (int) ((this.aClass121_573.method450() + 519L) / 520L);
					if (var6 == 0) {
						var6 = 1;
					}
				}

				aByteArray571[0] = (byte) (var3 >> 16);
				aByteArray571[1] = (byte) (var3 >> 8);
				aByteArray571[2] = (byte) var3;
				aByteArray571[3] = (byte) (var6 >> 16);
				aByteArray571[4] = (byte) (var6 >> 8);
				aByteArray571[5] = (byte) var6;
				this.aClass121_568.seek((long) (6 * var1));
				this.aClass121_568.write(aByteArray571, 0, 6);
				int var7 = 0;

				for (int var8 = 0; var7 < var3; ++var8) {
					int var9 = 0;
					int var10;
					if (var4) {
						this.aClass121_573.seek((long) (520 * var6));

						try {
							this.aClass121_573.method443(aByteArray571, 0, 8);
						} catch (EOFException var14) {
							break;
						}

						var10 = ((aByteArray571[0] & 255) << 8) + (aByteArray571[1] & 255);
						int var11 = ((aByteArray571[2] & 255) << 8) + (aByteArray571[3] & 255);
						var9 = (aByteArray571[6] & 255) + ((aByteArray571[4] & 255) << 16)
								+ ((aByteArray571[5] & 255) << 8);
						int var12 = aByteArray571[7] & 255;
						if (var1 != var10 || var11 != var8 || this.anInt569 * 1928833099 != var12) {
							return false;
						}

						if (var9 < 0 || (long) var9 > this.aClass121_573.method450() / 520L) {
							return false;
						}
					}

					if (var9 == 0) {
						var4 = false;
						var9 = (int) ((this.aClass121_573.method450() + 519L) / 520L);
						if (var9 == 0) {
							++var9;
						}

						if (var9 == var6) {
							++var9;
						}
					}

					if (var3 - var7 <= 512) {
						var9 = 0;
					}

					aByteArray571[0] = (byte) (var1 >> 8);
					aByteArray571[1] = (byte) var1;
					aByteArray571[2] = (byte) (var8 >> 8);
					aByteArray571[3] = (byte) var8;
					aByteArray571[4] = (byte) (var9 >> 16);
					aByteArray571[5] = (byte) (var9 >> 8);
					aByteArray571[6] = (byte) var9;
					aByteArray571[7] = (byte) (this.anInt569 * 1928833099);
					this.aClass121_573.seek((long) (var6 * 520));
					this.aClass121_573.write(aByteArray571, 0, 8);
					var10 = var3 - var7;
					if (var10 > 512) {
						var10 = 512;
					}

					this.aClass121_573.write(var2, var7, var10);
					var7 += var10;
					var6 = var9;
				}

				var10000 = true;
			} catch (IOException var15) {
				return false;
			}

			return var10000;
		}
	}

	public static DualNode_Sub13_Sub2 method306(Class87 var0, int var1) {
		byte[] var2 = var0.method378(var1);
		boolean var3;
		if (var2 != null) {
			Player.method1042(var2);
			var3 = true;
		} else {
			var3 = false;
		}

		return !var3 ? null : BoundaryStub.method153();
	}
}