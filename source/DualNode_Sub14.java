
public class DualNode_Sub14 extends DualNode {

	static Class8 aClass8_1644;
	public int[] anIntArray1645;
	public int[] anIntArray1646;
	public int anInt1647;
	public int anInt1648;

	static int method822(int var0) {
		Class5 var1 = (Class5) Class32.aMap359.get(Integer.valueOf(var0));
		return var1 == null ? 0 : var1.method73();
	}

	public boolean method823(int var1, int var2) {
		if (var2 >= 0 && var2 < this.anIntArray1646.length) {
			int var3 = this.anIntArray1646[var2];
			if (var1 >= var3 && var1 <= this.anIntArray1645[var2] + var3) {
				return true;
			}
		}

		return false;
	}

	DualNode_Sub14(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.anInt1647 = var1 * 995238023;
		this.anInt1648 = var2 * -1016231117;
		this.anIntArray1645 = var3;
		this.anIntArray1646 = var4;
	}
}
