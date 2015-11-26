public class Calculator{
	/**
	результат обчислення
	*/
	private int result;
	
	/**
	додаємо аргументи
	@param params аргументи сумування
	*/
	
	public void add(int ... params){
		for(Integer param : params){
			this.result += param;
		}
	}
	
	/**
	одержати результат
	@return результат обчислення
	*/
	public int getResult(){
		return this.result;
	}
	/**
	очистити результат обчислення
	*/
	public void cleanResult(){
		this.result = 0;
	}

}