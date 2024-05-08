package getLandEstate.pojos.api_pojos.LogController;

import java.io.Serializable;
import java.util.List;

public class LogPojo implements Serializable {
	private int totalPages;
	private int totalElements;
	private int size;
	private List<ContentPojo> content;
	private int number;
	private SortPojo sort;
	private int numberOfElements;
	private PageablePojo pageable;
	private boolean first;
	private boolean last;
	private boolean empty;

	public LogPojo() {
	}

	public LogPojo(int totalPages, int totalElements, int size, List<ContentPojo> content, int number, SortPojo sort, int numberOfElements, PageablePojo pageable, boolean first, boolean last, boolean empty) {
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.size = size;
		this.content = content;
		this.number = number;
		this.sort = sort;
		this.numberOfElements = numberOfElements;
		this.pageable = pageable;
		this.first = first;
		this.last = last;
		this.empty = empty;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setTotalElements(int totalElements){
		this.totalElements = totalElements;
	}

	public int getTotalElements(){
		return totalElements;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setContent(List<ContentPojo> content){
		this.content = content;
	}

	public List<ContentPojo> getContent(){
		return content;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
	}

	public void setSort(SortPojo sort){
		this.sort = sort;
	}

	public SortPojo getSort(){
		return sort;
	}

	public void setNumberOfElements(int numberOfElements){
		this.numberOfElements = numberOfElements;
	}

	public int getNumberOfElements(){
		return numberOfElements;
	}

	public void setPageable(PageablePojo pageable){
		this.pageable = pageable;
	}

	public PageablePojo getPageable(){
		return pageable;
	}

	public void setFirst(boolean first){
		this.first = first;
	}

	public boolean isFirst(){
		return first;
	}

	public void setLast(boolean last){
		this.last = last;
	}

	public boolean isLast(){
		return last;
	}

	public void setEmpty(boolean empty){
		this.empty = empty;
	}

	public boolean isEmpty(){
		return empty;
	}

	@Override
 	public String toString(){
		return 
			"LogPojo{" + 
			"totalPages = '" + totalPages + '\'' + 
			",totalElements = '" + totalElements + '\'' + 
			",size = '" + size + '\'' + 
			",content = '" + content + '\'' + 
			",number = '" + number + '\'' + 
			",sort = '" + sort + '\'' + 
			",numberOfElements = '" + numberOfElements + '\'' + 
			",pageable = '" + pageable + '\'' + 
			",first = '" + first + '\'' + 
			",last = '" + last + '\'' + 
			",empty = '" + empty + '\'' + 
			"}";
		}
}