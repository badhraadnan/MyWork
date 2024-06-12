package userexception;

public class color {
	private String colorname;

	public String getColorname() {
		return colorname;
	}
	
	public void setColorname(String colorname) {
		try {
		if(colorname=="red" || colorname=="white" || colorname=="green")
		{
			this.colorname = colorname;
		}
		else 
		{
			throw new colorException();
			
		}
	}catch(colorException cp){
		System.out.println("wrong color pick "+cp.getMessage());
	}
	}
	

	@Override
	public String toString() {
		return "color [colorname=" + colorname + "]";
	}
	

}
