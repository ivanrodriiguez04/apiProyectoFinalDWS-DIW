package Api.proyectoFinalDWSDIW.dtos;

public class RestablecerPasswordDto {
	//Atributos
	private String token;
    private String nuevaPassword;
    //Getters & Setters
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getNuevaPassword() {
		return nuevaPassword;
	}
	public void setNuevaPassword(String nuevaPassword) {
		this.nuevaPassword = nuevaPassword;
	}
    
}
