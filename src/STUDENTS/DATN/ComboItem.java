package DATN;

public class ComboItem {
	private String value;

	public String getValue() {
		return value;
	}

	public String getText() {
		return text;
	}

	private String text;

	public ComboItem(String value, String text) {
		this.value = value;
		this.text = text;
	}

	public ComboItem(String text) {
		this.text = text;
		this.value = null;
	}

	public String toString() {
		return text;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ComboItem)) {
			return false;
		}
		ComboItem item = (ComboItem) obj;

		return item.getText().equals(text);
	}
}
