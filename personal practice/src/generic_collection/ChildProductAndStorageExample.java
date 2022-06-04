package generic_collection;

class Product<T, M>{
	private T kind;
	private M model;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}

class ChildProduct<T, M, C> extends Product<T, M>{
	private C company;
	public C getCompany() {
		return company;
	}
	
	public void setCompany(C company) {
		this.company = company;
	}
}

interface Storage<T>{
	public void add(T item, int idx);
	public T get(int idx);
}

class StorageImpl<T> implements Storage<T>{
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}
	
	@Override
	public void add(T item, int idx) {
		array[idx] = item;
	}
	
	@Override
	public T get(int idx) {
		return array[idx];
	}
}

class Tv{
	
}

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTv");
		product.setCompany("Samsung");
		
		Storage<Tv> storage = new StorageImpl<>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
	}
}
