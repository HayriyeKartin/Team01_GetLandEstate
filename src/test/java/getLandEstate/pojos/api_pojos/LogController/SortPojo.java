package getLandEstate.pojos.api_pojos.LogController;

import java.io.Serializable;

public class SortPojo implements Serializable {
	private boolean empty;
	private boolean unsorted;
	private boolean sorted;

	public SortPojo() {
	}

	public SortPojo(boolean empty, boolean unsorted, boolean sorted) {
		this.empty = empty;
		this.unsorted = unsorted;
		this.sorted = sorted;
	}

	public void setEmpty(boolean empty){
		this.empty = empty;
	}

	public boolean isEmpty(){
		return empty;
	}

	public void setUnsorted(boolean unsorted){
		this.unsorted = unsorted;
	}

	public boolean isUnsorted(){
		return unsorted;
	}

	public void setSorted(boolean sorted){
		this.sorted = sorted;
	}

	public boolean isSorted(){
		return sorted;
	}

	@Override
 	public String toString(){
		return 
			"SortPojo{" + 
			"empty = '" + empty + '\'' + 
			",unsorted = '" + unsorted + '\'' + 
			",sorted = '" + sorted + '\'' + 
			"}";
		}
}