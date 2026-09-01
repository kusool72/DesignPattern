package pa09_FactoryMethod;

public abstract class Factory {
	public Item create(String name) {
		boolean bCreatable = this.isCreatable(name);
		if(bCreatable) {
			Item item = this.createItem(name);
			postprocessItem(name);
			return item;
		}
		
		return null;
	}

	protected abstract boolean isCreatable(String name);
	protected abstract Item createItem(String name);
	protected abstract void postprocessItem(String name);
}
