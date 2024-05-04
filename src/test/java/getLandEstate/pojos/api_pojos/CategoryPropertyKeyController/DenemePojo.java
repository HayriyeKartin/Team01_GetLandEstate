package getLandEstate.pojos.api_pojos.CategoryPropertyKeyController;

import java.io.Serializable;

public class DenemePojo implements Serializable {
	private int id;
	private String name;
	private String keyType;
	private Object prefix;
	private String suffix;
	private boolean builtIn;

	public DenemePojo() {
	}

	public DenemePojo(int id, String name, String keyType, Object prefix, String suffix, boolean builtIn) {
		this.id = id;
		this.name = name;
		this.keyType = keyType;
		this.prefix = prefix;
		this.suffix = suffix;
		this.builtIn = builtIn;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setKeyType(String keyType){
		this.keyType = keyType;
	}

	public String getKeyType(){
		return keyType;
	}

	public void setPrefix(Object prefix){
		this.prefix = prefix;
	}

	public Object getPrefix(){
		return prefix;
	}

	public void setSuffix(String suffix){
		this.suffix = suffix;
	}

	public String getSuffix(){
		return suffix;
	}

	public void setBuiltIn(boolean builtIn){
		this.builtIn = builtIn;
	}

	public boolean isBuiltIn(){
		return builtIn;
	}

	@Override
 	public String toString(){
		return 
			"DenemePojo{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",keyType = '" + keyType + '\'' + 
			",prefix = '" + prefix + '\'' + 
			",suffix = '" + suffix + '\'' + 
			",builtIn = '" + builtIn + '\'' + 
			"}";
		}
}