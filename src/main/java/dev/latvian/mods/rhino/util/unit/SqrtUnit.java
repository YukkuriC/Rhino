package dev.latvian.mods.rhino.util.unit;

public class SqrtUnit extends Func1Unit {
	public SqrtUnit(Unit u) {
		super(u);
	}

	@Override
	public float get() {
		return (float) Math.sqrt(unit.get());
	}

	@Override
	public String toString() {
		return fString("sqrt", unit);
	}
}