package lesson11;

import java.util.Iterator;

public class DefaultMyList implements MyList, ListIterable {
	private Object[] array = new Object[100];
	private int currentIndex = 0; // Сколько элементов в массиве активных

	private class IteratorImpl implements Iterator<Object> {
		private int lastRemove = -1; // Храним индекс последнего удаленого элемента
		private int index = 0; // индекс, где сейчас находится итератор

		public boolean hasNext() { // returns true if the iteration has more elements
			return index < currentIndex && array[index] != null;
		}

		public Object next() { // returns the next element in the iteration
			return array[index++];
		}

		public void remove() { // removes from the underlying collection the last element returned by this
								// iterator
			if (index == 0 || lastRemove == index)
				throw new IllegalStateException();
			DefaultMyList.this.remove(array[index]);
			lastRemove = index;
		}
	}

	public Iterator<Object> iterator() {

		return new IteratorImpl();
	}

	@Override
	public void add(Object e) {
		array[currentIndex] = e;
		currentIndex++;
	}

	public void add(Object e, int index) {
		array[index] = e;
	}

	@Override
	public void clear() {
		array = new Object[100];
		currentIndex = 0;
	}

	@Override
	public boolean remove(Object a) {
		for (int i = 0; i < currentIndex; i++) {
			if (array[i].toString() == a.toString()) {
				int k = i;
				while (k < currentIndex) {
					array[k] = array[k + 1];
					k++;
				}
				array[currentIndex] = null;
				currentIndex -= 1;
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		return array;
	}

	@Override
	public int size() {
		return currentIndex;
	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < currentIndex; i++) {
			if (array[i].toString() == o.toString())
				return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		int countMatch = 0;
		Object[] mas = this.toArray();
		Object[] mas1 = c.toArray();
		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < this.size(); j++) {
				if (mas[j].toString() == mas1[i].toString())
					countMatch++;
			}
		}
		if (countMatch >= c.size()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("{");
		for (int i = 0; i < currentIndex; i++) {
			if (i == currentIndex - 1) {
				s.append("[" + array[i].toString() + "]");
				break;
			}
			s.append("[" + array[i].toString() + "],");
		}
		s.append("}");
		return s.toString();
	}

	private class ListIteratorImpl extends IteratorImpl implements ListIterator {
		private int lastSet = -1;// Храним индекс последнего вставленого
		private int lastRemove = -1; // Храним индекс последнего удаленого элемента
		private int index = 0; // индекс, где сейчас находится итератор

		@Override
		public boolean hasNext() { // returns true if the iteration has more elements
			return index < currentIndex && array[index] != null;
		}

		@Override
		public Object next() { // returns the next element in the iteration
			return array[index++];
		}

		@Override
		public boolean hasPrevious() {
			return index - 1 >= 0 && array[index - 1] != null;
		}

		@Override
		public Object previous() {
			return array[--index];
		}

		@Override
		public void set(Object e) {
			if (index == 0 || lastSet == index)
				throw new IllegalStateException();
			DefaultMyList.this.add(e, index);
			lastSet = index;

		}

		@Override
		public void remove() { // removes from the underlying collection the last element returned by this
			// iterator
			if (index == 0 || lastRemove == index)
				throw new IllegalStateException();
			DefaultMyList.this.remove(array[index]);
			lastRemove = index;
		}
	}

	@Override
	public ListIterator listIterator() {
		return new ListIteratorImpl();
	}
}
