package getLandEstate.pojos.api_pojos.LogController;

import java.io.Serializable;

public class PageablePojo implements Serializable {
	private int offset;
	private SortPojo sort;
	private int pageNumber;
	private boolean paged;
	private boolean unpaged;
	private int pageSize;

	public PageablePojo() {
	}

	public PageablePojo(int offset, SortPojo sort, int pageNumber, boolean paged, boolean unpaged, int pageSize) {
		this.offset = offset;
		this.sort = sort;
		this.pageNumber = pageNumber;
		this.paged = paged;
		this.unpaged = unpaged;
		this.pageSize = pageSize;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setSort(SortPojo sort){
		this.sort = sort;
	}

	public SortPojo getSort(){
		return sort;
	}

	public void setPageNumber(int pageNumber){
		this.pageNumber = pageNumber;
	}

	public int getPageNumber(){
		return pageNumber;
	}

	public void setPaged(boolean paged){
		this.paged = paged;
	}

	public boolean isPaged(){
		return paged;
	}

	public void setUnpaged(boolean unpaged){
		this.unpaged = unpaged;
	}

	public boolean isUnpaged(){
		return unpaged;
	}

	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}

	public int getPageSize(){
		return pageSize;
	}

	@Override
 	public String toString(){
		return 
			"PageablePojo{" + 
			"offset = '" + offset + '\'' + 
			",sort = '" + sort + '\'' + 
			",pageNumber = '" + pageNumber + '\'' + 
			",paged = '" + paged + '\'' + 
			",unpaged = '" + unpaged + '\'' + 
			",pageSize = '" + pageSize + '\'' + 
			"}";
		}
}