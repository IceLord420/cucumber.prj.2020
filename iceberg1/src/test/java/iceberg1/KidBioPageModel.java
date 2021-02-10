package iceberg1;

public class KidBioPageModel {

	private String name;
	private String age;
	private Boolean disable;
	private Boolean twin;
	private Boolean subling;
	private Object kidBioMessage;

	public void navigateToKidBioPage() {
		System.out.println("Навигирането до информация за детето е успешно");	
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setDisability(Boolean disable) {
		this.disable = disable;
	}

	public void setTwins(Boolean twin) {
		this.twin = twin;
	}

	public void setSublings(Boolean subling) {
		this.subling = subling;
	}

	public void clickRegisterButton() {
		kidBioMessage = KidBioService.bio(name,age,disable,twin,subling);
	}

	public Object getKidBioMessage() {
		return kidBioMessage;
	}

}
