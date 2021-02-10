package iceberg1;

public class PointPageModel {

	private String name;
	private Object pointMessage;

	public void navigateToPointScreen() {
		System.out.println("Навигирането до проверката на точки в системата е успешно");
	}

	public void searchName(String name) {
		this.name = name;
	}

	public Object getPointMessage() {
		return pointMessage;
	}

	public void clickSearchButton() {
		pointMessage = PointService.pointChecker(name, null, null);
	}

}
