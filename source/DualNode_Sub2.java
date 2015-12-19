import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DualNode_Sub2 extends DualNode {

	public static int anInt1457;
	static Class106 aClass106_1458 = new Class106(64);
	public int anInt1459 = 188525871;
	int[] anIntArray1460;
	short[] aShortArray1461;
	int[] anIntArray1462 = new int[] { -1, -1, -1, -1, -1 };
	short[] aShortArray1463;
	short[] aShortArray1464;
	short[] aShortArray1465;
	public boolean aBool1466 = false;
	static Node_Sub10 aNode_Sub10_1467;
	static Class87 aClass87_1468;

	public Entity_Sub1 method660() {
		if (this.anIntArray1460 == null) {
			return null;
		} else {
			Entity_Sub1[] var2 = new Entity_Sub1[this.anIntArray1460.length];

			for (int var3 = 0; var3 < this.anIntArray1460.length; ++var3) {
				var2[var3] = Entity_Sub1.method887(Class120.aClass87_805, this.anIntArray1460[var3], 0);
			}

			Entity_Sub1 var4;
			if (var2.length == 1) {
				var4 = var2[0];
			} else {
				var4 = new Entity_Sub1(var2, var2.length);
			}

			int var1;
			if (this.aShortArray1461 != null) {
				for (var1 = 0; var1 < this.aShortArray1461.length; ++var1) {
					var4.method895(this.aShortArray1461[var1], this.aShortArray1465[var1]);
				}
			}

			if (this.aShortArray1463 != null) {
				for (var1 = 0; var1 < this.aShortArray1463.length; ++var1) {
					var4.method896(this.aShortArray1463[var1], this.aShortArray1464[var1]);
				}
			}

			return var4;
		}
	}

	void method661(ByteBuf var1, int var2) {
		if (var2 == 1) {
			this.anInt1459 = var1.getUByte() * -188525871;
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.getUByte();
				this.anIntArray1460 = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.anIntArray1460[var4] = var1.getUShort();
				}
			} else if (var2 == 3) {
				this.aBool1466 = true;
			} else if (var2 == 40) {
				var3 = var1.getUByte();
				this.aShortArray1461 = new short[var3];
				this.aShortArray1465 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.aShortArray1461[var4] = (short) var1.getUShort();
					this.aShortArray1465[var4] = (short) var1.getUShort();
				}
			} else if (var2 == 41) {
				var3 = var1.getUByte();
				this.aShortArray1463 = new short[var3];
				this.aShortArray1464 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.aShortArray1463[var4] = (short) var1.getUShort();
					this.aShortArray1464[var4] = (short) var1.getUShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.anIntArray1462[var2 - 60] = var1.getUShort();
			}
		}

	}

	public boolean method662() {
		if (this.anIntArray1460 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.anIntArray1460.length; ++var2) {
				if (!Class120.aClass87_805.method388(this.anIntArray1460[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	public Entity_Sub1 method663() {
		Entity_Sub1[] var1 = new Entity_Sub1[5];
		int var4 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.anIntArray1462[var3] != -1) {
				var1[var4++] = Entity_Sub1.method887(Class120.aClass87_805, this.anIntArray1462[var3], 0);
			}
		}

		Entity_Sub1 var5 = new Entity_Sub1(var1, var4);
		int var2;
		if (this.aShortArray1461 != null) {
			for (var2 = 0; var2 < this.aShortArray1461.length; ++var2) {
				var5.method895(this.aShortArray1461[var2], this.aShortArray1465[var2]);
			}
		}

		if (this.aShortArray1463 != null) {
			for (var2 = 0; var2 < this.aShortArray1463.length; ++var2) {
				var5.method896(this.aShortArray1463[var2], this.aShortArray1464[var2]);
			}
		}

		return var5;
	}

	static final void decodeNpcFlags() {
		for (int index = 0; index < -143667549 * Client.pendingNpcFlagsCount; ++index) {
			int npcIndex = Client.pendingNpcFlagsIndices[index];
			Npc npc = Client.npcArray[npcIndex];
			int flags = Client.inBuffer.getUByte();
			if ((flags & 4) != 0) {
				npc.overheadText = Client.inBuffer.getString();
				npc.anInt1927 = -569035212;
			}

			if ((flags & 16) != 0) {
				npc.targetIndex = Client.inBuffer.getULEShort() * 1611414733;
				if (734924805 * npc.targetIndex == '\uffff') {
					npc.targetIndex = -1611414733;
				}
			}

			int var4;
			int var5;
			int var6;
			if ((flags & 1) != 0) {
				var5 = Client.inBuffer.getULEShortA();
				var4 = Client.inBuffer.getUShortA();
				var6 = npc.strictX * 1272643751
						- (var5 - 1426698711 * Node_Sub10.regionBaseX - Node_Sub10.regionBaseX * 1426698711) * 64;
				int var7 = npc.strictY * -1801433343
						- (var4 - 714823515 * Class28.regionBaseY - Class28.regionBaseY * 714823515) * 64;
				if (var6 != 0 || var7 != 0) {
					npc.anInt1931 = ((int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 2047) * -316267887;
				}
			}

			if ((flags & 64) != 0) {
				var5 = Client.inBuffer.getUByteS();
				var4 = Client.inBuffer.getUByteA();
				npc.method1018(var5, var4, -1040073859 * Client.engineCycle);
				npc.healthBarCycle = 568824035 * Client.engineCycle + -1453430444;
				npc.hitpoints = Client.inBuffer.getULEShort() * -182432293;
				npc.maxHitpoints = Client.inBuffer.getUShort() * 119158941;
			}

			if ((flags & 128) != 0) {
				npc.anInt1938 = Client.inBuffer.getULEShortA() * -1738418729;
				var5 = Client.inBuffer.getInt();
				npc.anInt1920 = (var5 >> 16) * 878509897;
				npc.anInt1941 = 1621235571 * (Client.engineCycle * -1040073859 + (var5 & '\uffff'));
				npc.anInt1925 = 0;
				npc.anInt1940 = 0;
				if (489022907 * npc.anInt1941 > -1040073859 * Client.engineCycle) {
					npc.anInt1925 = -1825378913;
				}

				if (1631645159 * npc.anInt1938 == '\uffff') {
					npc.anInt1938 = 1738418729;
				}
			}

			if ((flags & 32) != 0) {
				var5 = Client.inBuffer.getUByteC();
				var4 = Client.inBuffer.getUByte();
				npc.method1018(var5, var4, -1040073859 * Client.engineCycle);
				npc.healthBarCycle = -1453430444 + 568824035 * Client.engineCycle;
				npc.hitpoints = Client.inBuffer.getULEShort() * -182432293;
				npc.maxHitpoints = Client.inBuffer.getULEShort() * 119158941;
			}

			if ((flags & 8) != 0) {
				npc.definition = DualNode_Sub11.getNpcDefinition(Client.inBuffer.getULEShortA());
				npc.anInt1915 = npc.definition.anInt1589 * 1447916577;
				npc.orientation = npc.definition.anInt1599 * 506128019;
				npc.anInt1918 = -147360311 * npc.definition.anInt1585;
				npc.anInt1952 = npc.definition.anInt1584 * 404950129;
				npc.anInt1913 = 1055000573 * npc.definition.anInt1587;
				npc.anInt1939 = 985741173 * npc.definition.anInt1588;
				npc.anInt1959 = 1706784279 * npc.definition.anInt1601;
				npc.anInt1916 = npc.definition.anInt1583 * -1634865443;
				npc.anInt1917 = 118379263 * npc.definition.anInt1591;
			}

			if ((flags & 2) != 0) {
				var5 = Client.inBuffer.getUShort();
				if (var5 == '\uffff') {
					var5 = -1;
				}

				var4 = Client.inBuffer.getUByteA();
				if (-922607859 * npc.animation == var5 && var5 != -1) {
					var6 = Node_Sub6.method540(var5, -1164132528).anInt1486 * 972933669;
					if (var6 == 1) {
						npc.anInt1934 = 0;
						npc.anInt1935 = 0;
						npc.anInt1936 = 1583839217 * var4;
						npc.anInt1958 = 0;
					}

					if (var6 == 2) {
						npc.anInt1958 = 0;
					}
				} else if (var5 == -1 || npc.animation * -922607859 == -1
						|| Node_Sub6.method540(var5, -1128772943).anInt1480
								* -610992485 >= Node_Sub6.method540(-922607859 * npc.animation, -1033165080).anInt1480
										* -610992485) {
					npc.animation = -1587034171 * var5;
					npc.anInt1934 = 0;
					npc.anInt1935 = 0;
					npc.anInt1936 = 1583839217 * var4;
					npc.anInt1958 = 0;
					npc.anInt1957 = -2078876897 * npc.queueSize;
				}
			}
		}

	}

	void method665(ByteBuf var1, int var2) {
		while (true) {
			int var3 = var1.getUByte();
			if (var3 == 0) {
				return;
			}

			this.method661(var1, var3);
		}
	}

	public static boolean method666(int var0) {
		if (Widget.aBoolArray1123[var0]) {
			return true;
		} else if (!Widget.aClass87_1124.method395(var0)) {
			return false;
		} else {
			int var1 = Widget.aClass87_1124.method380(var0);
			if (var1 == 0) {
				Widget.aBoolArray1123[var0] = true;
				return true;
			} else {
				if (Widget.interfaces[var0] == null) {
					Widget.interfaces[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (Widget.interfaces[var0][var2] == null) {
						byte[] var3 = Widget.aClass87_1124.method391(var0, var2);
						if (var3 != null) {
							Widget.interfaces[var0][var2] = new Widget();
							Widget.interfaces[var0][var2].anInt1129 = ((var0 << 16) + var2) * 1463664765;
							if (var3[0] == -1) {
								Widget.interfaces[var0][var2].method486(new ByteBuf(var3));
							} else {
								Widget.interfaces[var0][var2].method496(new ByteBuf(var3));
							}
						}
					}
				}

				Widget.aBoolArray1123[var0] = true;
				return true;
			}
		}
	}

	static final boolean method667(Widget var0) {
		int var1 = -179718399 * var0.contentType;
		if (var1 == 205) {
			Client.anInt2045 = -453788862;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.aPlayerConfig2138.method264(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.aPlayerConfig2138.method263(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.aPlayerConfig2138.method265(false);
			}

			if (var1 == 325) {
				Client.aPlayerConfig2138.method265(true);
			}

			if (var1 == 326) {
				Client.outBuffer.putHeader(136);
				Client.aPlayerConfig2138.method266(Client.outBuffer);
				return true;
			} else {
				return false;
			}
		}
	}

	static final void method668(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < -580551879 * Client.anInt2168; ++var4) {
			if (Client.anIntArray2175[var4] + Client.anIntArray2173[var4] > var0
					&& Client.anIntArray2173[var4] < var0 + var2
					&& Client.anIntArray2176[var4] + Client.anIntArray2174[var4] > var1
					&& Client.anIntArray2174[var4] < var1 + var3) {
				Client.aBoolArray2118[var4] = true;
			}
		}

	}

	public boolean method669() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.anIntArray1462[var2] != -1 && !Class120.aClass87_805.method388(this.anIntArray1462[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	public static int method670(int var0, int var1, int var2) {
		var2 &= 3;
		return var2 != 0 ? (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 : 7 - var1)) : var0;
	}

	public static void method671(ByteBuf var0, int var1, int var2) {
		Node_Sub16 var3 = new Node_Sub16();
		var3.anInt1419 = var0.getUByte() * 669809141;
		var3.anInt1426 = var0.getInt() * 554885847;
		var3.anIntArray1420 = new int[var3.anInt1419 * -707810723];
		var3.anIntArray1421 = new int[var3.anInt1419 * -707810723];
		var3.aFieldArray1422 = new Field[-707810723 * var3.anInt1419];
		var3.anIntArray1423 = new int[-707810723 * var3.anInt1419];
		var3.aMethodArray1424 = new Method[-707810723 * var3.anInt1419];
		var3.aByteArrayArrayArray1425 = new byte[-707810723 * var3.anInt1419][][];

		for (int var4 = 0; var4 < -707810723 * var3.anInt1419; ++var4) {
			try {
				int var5 = var0.getUByte();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = var0.getString();
						var7 = var0.getString();
						var8 = var0.getUByte();
						String[] var9 = new String[var8];

						for (int var10 = 0; var10 < var8; ++var10) {
							var9[var10] = var0.getString();
						}

						String var26 = var0.getString();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; ++var12) {
								var13 = var0.getInt();
								var11[var12] = new byte[var13];
								var0.getBytes(var11[var12], 0, var13);
							}
						}

						var3.anIntArray1420[var4] = var5;
						Class[] var27 = new Class[var8];

						for (var13 = 0; var13 < var8; ++var13) {
							var27[var13] = Class59.method294(var9[var13]);
						}

						Class var28 = Class59.method294(var26);
						if (Class59.method294(var6).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = Class59.method294(var6).getDeclaredMethods();
						Method[] var15 = var14;

						for (int var16 = 0; var16 < var15.length; ++var16) {
							Method var17 = var15[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var27.length == var18.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var27.length; ++var20) {
										if (var27[var20] != var18[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var28 == var17.getReturnType()) {
										var3.aMethodArray1424[var4] = var17;
									}
								}
							}
						}

						var3.aByteArrayArrayArray1425[var4] = var11;
					}
				} else {
					var6 = var0.getString();
					var7 = var0.getString();
					var8 = 0;
					if (var5 == 1) {
						var8 = var0.getInt();
					}

					var3.anIntArray1420[var4] = var5;
					var3.anIntArray1423[var4] = var8;
					if (Class59.method294(var6).getClassLoader() == null) {
						throw new SecurityException();
					}

					var3.aFieldArray1422[var4] = Class59.method294(var6).getDeclaredField(var7);
				}
			} catch (ClassNotFoundException var21) {
				var3.anIntArray1421[var4] = -1;
			} catch (SecurityException var22) {
				var3.anIntArray1421[var4] = -2;
			} catch (NullPointerException var23) {
				var3.anIntArray1421[var4] = -3;
			} catch (Exception var24) {
				var3.anIntArray1421[var4] = -4;
			} catch (Throwable var25) {
				var3.anIntArray1421[var4] = -5;
			}
		}

		Class119.aClass103_804.method419(var3);
	}

	static void method672() {
		if (Client.spellSelected) {
			Widget var0 = Class20.method146(DualNode_Sub3.anInt1488 * -1195336111, 1149825709 * Client.anInt2128);
			if (var0 != null && var0.anObjectArray1178 != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.aWidget1430 = var0;
				var1.args = var0.anObjectArray1178;
				Class96_Sub1.method504(var1);
			}

			Client.spellSelected = false;
			Class68.method326(var0);
		}
	}
}
