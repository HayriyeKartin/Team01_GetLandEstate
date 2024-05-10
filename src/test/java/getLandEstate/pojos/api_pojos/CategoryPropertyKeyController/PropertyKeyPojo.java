package getLandEstate.pojos.api_pojos.CategoryPropertyKeyController;

import java.io.Serializable;

public class PropertyKeyPojo implements Serializable {
	private String name;
	private String keyType;
	private String prefix;
	private String suffix;

	public PropertyKeyPojo() {
	}

	public PropertyKeyPojo(String name, String keyType, String prefix, String suffix) {
		this.name = name;
		this.keyType = keyType;
		this.prefix = prefix;
		this.suffix = suffix;
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

	public void setPrefix(String prefix){
		this.prefix = prefix;
	}

	public String getPrefix(){
		return prefix;
	}

	public void setSuffix(String suffix){
		this.suffix = suffix;
	}

	public String getSuffix(){
		return suffix;
	}

	@Override
 	public String toString(){
		return 
			"PropertyKeyPojo{" + 
			"name = '" + name + '\'' + 
			",keyType = '" + keyType + '\'' + 
			",prefix = '" + prefix + '\'' + 
			",suffix = '" + suffix + '\'' + 
			"}";
		}
}